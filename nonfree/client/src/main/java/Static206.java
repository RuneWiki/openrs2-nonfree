import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!tga;")
	public static Class83_Sub1 aClass83_Sub1_2;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public static int anInt3779;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public static void method3226(@OriginalArg(0) int arg0) {
		if (arg0 == Static82.anInt1653) {
			return;
		}
		if (arg0 == 13) {
			if (Static111.aString13 == null) {
				Static4.method75(Static550.anInt9147, Static465.aString71, Static265.aString40);
			} else {
				Static97.method1654(Static550.anInt9147);
			}
		}
		if (arg0 != 13 && Static589.aClass197_2 != null) {
			Static589.aClass197_2.method5188();
			Static589.aClass197_2 = null;
		}
		if (arg0 == 3) {
			Static284.method4611(Static528.anInt8950 != Static154.anInt3151);
		}
		if (arg0 == 7) {
			Static220.method3849(Static528.anInt8950 != Static408.anInt7195);
		}
		if (arg0 == 5) {
			if (Static111.aString13 == null) {
				Static536.method7773(Static265.aString40, Static465.aString71);
			} else {
				Static290.method4747();
			}
		} else if (arg0 == 6) {
			if (Static111.aString13 == null) {
				Static4.method75(Static550.anInt9147, Static465.aString71, Static265.aString40);
			} else {
				Static97.method1654(Static550.anInt9147);
			}
		} else if (arg0 == 9) {
			if (Static111.aString13 == null) {
				Static4.method75(Static550.anInt9147, Static465.aString71, Static265.aString40);
			} else {
				Static97.method1654(Static550.anInt9147);
			}
		} else if (arg0 == 12) {
			if (Static111.aString13 == null) {
				Static536.method7773(Static265.aString40, Static465.aString71);
			} else {
				Static290.method4747();
			}
		}
		if (Static259.method4338(Static82.anInt1653)) {
			Static605.aClass343_260.anInt9505 = 2;
			Static258.aClass343_131.anInt9505 = 2;
			Static202.aClass343_101.anInt9505 = 2;
			Static632.aClass343_268.anInt9505 = 2;
			Static509.aClass343_220.anInt9505 = 2;
			Static93.aClass343_52.anInt9505 = 2;
			Static128.aClass343_48.anInt9505 = 2;
		}
		if (Static259.method4338(arg0)) {
			Static486.anInt8252 = 0;
			Static149.anInt3034 = 0;
			Static491.anInt8357 = 1;
			Static179.anInt3440 = 1;
			Static586.anInt9503 = 0;
			Static412.method6389(true);
			Static605.aClass343_260.anInt9505 = 1;
			Static258.aClass343_131.anInt9505 = 1;
			Static202.aClass343_101.anInt9505 = 1;
			Static632.aClass343_268.anInt9505 = 1;
			Static509.aClass343_220.anInt9505 = 1;
			Static93.aClass343_52.anInt9505 = 1;
			Static128.aClass343_48.anInt9505 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static292.method4814();
		}
		@Pc(220) boolean local220 = arg0 == 2 || Static87.method1479(arg0) || Static311.method5226(arg0);
		@Pc(242) boolean local242 = Static82.anInt1653 == 2 || Static87.method1479(Static82.anInt1653) || Static311.method5226(Static82.anInt1653);
		if (local242 != local220) {
			if (local220) {
				Static573.anInt6752 = Static384.anInt6926;
				if (Static32.aClass3_Sub41_3.aClass7_Sub15_4.method5663() == 0) {
					Static551.method7858();
				} else {
					Static367.method5866(Static32.aClass3_Sub41_3.aClass7_Sub15_4.method5663(), Static384.anInt6926, Static521.aClass343_238);
					Static612.method8364();
				}
				Static186.aClass323_1.method7833(false);
			} else {
				Static551.method7858();
				Static186.aClass323_1.method7833(true);
			}
		}
		if (Static259.method4338(arg0) || arg0 == 13) {
			Static266.aClass82_8.method6153();
		}
		Static82.anInt1653 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method3227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg1;
		@Pc(21) int local21 = -arg1;
		@Pc(23) int local23 = -1;
		Static82.method1400(arg3, arg0 - arg1, arg1 + arg0, Static71.anIntArrayArray5[arg2]);
		while (local16 < local18) {
			local23 += 2;
			local21 += local23;
			local16++;
			if (local21 >= 0) {
				local18--;
				local21 -= local18 << 1;
				@Pc(63) int[] local63 = Static71.anIntArrayArray5[arg2 + local18];
				@Pc(70) int[] local70 = Static71.anIntArrayArray5[arg2 - local18];
				@Pc(74) int local74 = local16 + arg0;
				@Pc(79) int local79 = arg0 - local16;
				Static82.method1400(arg3, local79, local74, local63);
				Static82.method1400(arg3, local79, local74, local70);
			}
			@Pc(96) int local96 = arg0 + local18;
			@Pc(101) int local101 = arg0 - local18;
			@Pc(107) int[] local107 = Static71.anIntArrayArray5[arg2 + local16];
			@Pc(114) int[] local114 = Static71.anIntArrayArray5[arg2 - local16];
			Static82.method1400(arg3, local101, local96, local107);
			Static82.method1400(arg3, local101, local96, local114);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[BIIII[BI)V")
	public static void method3229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg5++;
				arg2[local28] += arg6[arg0++];
				@Pc(40) int local40 = arg5++;
				arg2[local40] += arg6[arg0++];
				@Pc(52) int local52 = arg5++;
				arg2[local52] += arg6[arg0++];
				@Pc(64) int local64 = arg5++;
				arg2[local64] += arg6[arg0++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local28 = arg5++;
				arg2[local28] += arg6[arg0++];
			}
			arg5 += arg1;
			arg0 += arg4;
		}
	}
}
