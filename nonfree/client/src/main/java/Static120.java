import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!td;")
	public static Class24 aClass24_3;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_18 = new Class102(64);

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BII[BIIIII)V")
	public static void method2419(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg0[local26] += arg3[arg7++];
				@Pc(38) int local38 = arg1++;
				arg0[local38] += arg3[arg7++];
				@Pc(50) int local50 = arg1++;
				arg0[local50] += arg3[arg7++];
				@Pc(62) int local62 = arg1++;
				arg0[local62] += arg3[arg7++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg1++;
				arg0[local26] += arg3[arg7++];
			}
			arg7 += arg6;
			arg1 += arg2;
		}
	}
}
