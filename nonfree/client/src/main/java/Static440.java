import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Z")
	public static boolean aBoolean607;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_32 = new Class218(8);

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
	public static int anInt7152 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Lclient!sh;")
	public static Class2_Sub51 method6370() {
		if (Static90.aClass60_65 == null || Static346.aClass190_1 == null) {
			return null;
		}
		Static346.aClass190_1.method4063(Static90.aClass60_65);
		@Pc(36) Class2_Sub51 local36 = (Class2_Sub51) Static346.aClass190_1.method4065();
		if (local36 == null) {
			return null;
		} else {
			@Pc(47) Class259 local47 = Static90.aClass196_3.method4194(local36.anInt9158);
			return local47 != null && local47.aBoolean584 && local47.method6247(Static90.anInterface26_2) ? local36 : Static221.method3095();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!d;BIILjava/awt/Canvas;)Lclient!ha;")
	public static Class145 method6372(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "([BIIIIIII[B)V")
	public static void method6373(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg7[local26] += arg0[arg5++];
				@Pc(38) int local38 = arg6++;
				arg7[local38] += arg0[arg5++];
				@Pc(50) int local50 = arg6++;
				arg7[local50] += arg0[arg5++];
				@Pc(62) int local62 = arg6++;
				arg7[local62] += arg0[arg5++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local26 = arg6++;
				arg7[local26] += arg0[arg5++];
			}
			arg6 += arg2;
			arg5 += arg4;
		}
	}
}
