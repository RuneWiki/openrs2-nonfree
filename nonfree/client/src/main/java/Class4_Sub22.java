import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	public int anInt3271;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
	public int anInt3270;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(II)V")
	public Class4_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3271 = arg0;
		this.anInt3270 = arg1;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)Z")
	public boolean method2562() {
		return (this.anInt3271 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z")
	public boolean method2563(@OriginalArg(1) int arg0) {
		return (this.anInt3271 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)Z")
	public boolean method2564() {
		return (this.anInt3271 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)Z")
	public boolean method2566() {
		return (this.anInt3271 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)Z")
	public boolean method2567() {
		return (this.anInt3271 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)Z")
	public boolean method2572() {
		return (this.anInt3271 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(Z)I")
	public int method2574() {
		return this.anInt3271 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)Z")
	public boolean method2575() {
		return (this.anInt3271 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(B)Z")
	public boolean method2576() {
		return (this.anInt3271 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(B)I")
	public int method2577() {
		return Static90.method3970(this.anInt3271);
	}
}
