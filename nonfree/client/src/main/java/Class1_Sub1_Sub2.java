import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public abstract class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "[I")
	public static int[] anIntArray272 = new int[32];

	@OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
	public int anInt2285 = 1000;

	static {
		@Pc(16) int local16 = 2;
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			anIntArray272[local18] = local16 - 1;
			local16 += local16;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 method1415() {
		return null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub1_Sub2_Sub6 local7 = this.method1415();
		if (local7 != null) {
			this.anInt2285 = local7.anInt2285;
			local7.method1418(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
