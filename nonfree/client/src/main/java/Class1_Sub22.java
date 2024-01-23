import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	public int anInt3563;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(II)V")
	public Class1_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3563 = arg1;
		this.anInt3570 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Z")
	public boolean method3054() {
		return (this.anInt3570 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Z")
	public boolean method3055() {
		return (this.anInt3570 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Z")
	public boolean method3056() {
		return (this.anInt3570 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
	public boolean method3057(@OriginalArg(0) int arg0) {
		return (this.anInt3570 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)I")
	public int method3058() {
		return this.anInt3570 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)I")
	public int method3059() {
		return Static168.method2850(this.anInt3570);
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)Z")
	public boolean method3061() {
		return (this.anInt3570 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)Z")
	public boolean method3062() {
		return (this.anInt3570 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)Z")
	public boolean method3063() {
		return (this.anInt3570 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)Z")
	public boolean method3065() {
		return (this.anInt3570 >> 22 & 0x1) != 0;
	}
}
