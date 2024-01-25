import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class6_Sub22 extends Class6 {

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	public int anInt3914 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
	public int anInt3917 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public int anInt3913 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
	public int anInt3919 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	public int anInt3911 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
	public int anInt3921 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
	public int anInt3916 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
	public int anInt3924 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!bv;")
	public final Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class6_Sub22(@OriginalArg(0) Class6_Sub7 arg0) {
		this.aClass6_Sub7_1 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)Z")
	public boolean method3489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3919 <= arg1 && this.anInt3914 >= arg1 && this.anInt3917 <= arg0 && arg0 <= this.anInt3916) {
			return true;
		} else {
			return arg1 >= this.anInt3924 && arg1 <= this.anInt3911 && this.anInt3921 <= arg0 && arg0 <= this.anInt3913;
		}
	}
}
