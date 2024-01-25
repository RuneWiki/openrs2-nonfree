import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!fka", name = "s", descriptor = "I")
	public int anInt3455 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fka", name = "m", descriptor = "I")
	public int anInt3457 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fka", name = "q", descriptor = "I")
	public int anInt3454 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fka", name = "p", descriptor = "I")
	public int anInt3459 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fka", name = "k", descriptor = "I")
	public int anInt3456 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fka", name = "l", descriptor = "I")
	public int anInt3461 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fka", name = "n", descriptor = "I")
	public int anInt3463 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fka", name = "j", descriptor = "I")
	public int anInt3460 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fka", name = "u", descriptor = "Lclient!iga;")
	public final Class6_Sub24 aClass6_Sub24_1;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!iga;)V")
	public Class6_Sub20(@OriginalArg(0) Class6_Sub24 arg0) {
		this.aClass6_Sub24_1 = arg0;
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(III)Z")
	public boolean method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3460 <= arg0 && this.anInt3457 >= arg0 && arg1 >= this.anInt3455 && this.anInt3463 >= arg1) {
			return true;
		} else {
			return arg0 >= this.anInt3454 && this.anInt3461 >= arg0 && arg1 >= this.anInt3456 && arg1 <= this.anInt3459;
		}
	}
}
