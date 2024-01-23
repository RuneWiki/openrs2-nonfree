import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
	public int anInt3558;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public int anInt3559;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(II)V")
	public Class4_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3558 = arg0;
		this.anInt3559 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I")
	public int method2826() {
		return this.anInt3558 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)Z")
	public boolean method2829() {
		return (this.anInt3558 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)Z")
	public boolean method2830() {
		return (this.anInt3558 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Z")
	public boolean method2831() {
		return (this.anInt3558 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)Z")
	public boolean method2832() {
		return (this.anInt3558 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Z")
	public boolean method2833(@OriginalArg(0) int arg0) {
		return (this.anInt3558 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)I")
	public int method2834() {
		return Static14.method1604(this.anInt3558);
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)Z")
	public boolean method2836() {
		return (this.anInt3558 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "(I)Z")
	public boolean method2839() {
		return (this.anInt3558 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "(B)Z")
	public boolean method2840() {
		return (this.anInt3558 >> 21 & 0x1) != 0;
	}
}
