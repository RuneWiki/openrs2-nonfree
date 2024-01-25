import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "Lclient!de;")
	public static final Class61 aClass61_6 = new Class61();

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
	public static int anInt5358 = -1;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
	public static final int anInt5359 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static298.method5521(arg4, 0, arg0, arg1, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
	public static void method4786(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		Static150.aBoolean190 = arg1;
		Static459.aString91 = arg2;
		Static286.aString63 = arg0;
		if (!Static150.aBoolean190 && (Static459.aString91.equals("") || Static286.aString63.equals(""))) {
			Static319.method5323(3);
			return;
		}
		if (Static155.anInt2829 != 1) {
			Static525.anInt9140 = 0;
			Static442.anInt7972 = -1;
		}
		Static243.aBoolean343 = false;
		Static319.method5323(-3);
		Static369.anInt6804 = 0;
		Static572.anInt9602 = 1;
		Static623.anInt10264 = 0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!vt;)V")
	public static void method4787(@OriginalArg(1) Class6_Sub40_Sub2 arg0) {
		arg0.method8554(Static485.aClass353_90.method8395());
		arg0.method8554(Static646.aClass353_63.method8395());
		arg0.method8554(Static648.aClass353_138.method8395());
		arg0.method8554(Static619.aClass353_136.method8395());
		arg0.method8554(Static323.aClass353_55.method8395());
		arg0.method8554(Static503.aClass353_102.method8395());
		arg0.method8554(Static364.aClass353_60.method8395());
		arg0.method8554(Static70.aClass353_13.method8395());
		arg0.method8554(Static540.aClass353_110.method8395());
		arg0.method8554(Static194.aClass353_38.method8395());
		arg0.method8554(Static399.aClass353_73.method8395());
		arg0.method8554(Static292.aClass353_51.method8395());
		arg0.method8554(Static98.aClass353_20.method8395());
		arg0.method8554(Static483.aClass353_89.method8395());
		arg0.method8554(Static237.aClass353_44.method8395());
		arg0.method8554(Static517.aClass353_105.method8395());
		arg0.method8554(Static390.aClass353_78.method8395());
		arg0.method8554(Static335.aClass353_56.method8395());
		arg0.method8554(Static496.aClass353_99.method8395());
		arg0.method8554(Static428.aClass353_79.method8395());
		arg0.method8554(Static278.aClass353_50.method8395());
		arg0.method8554(Static608.aClass353_131.method8395());
		arg0.method8554(Static583.aClass353_123.method8395());
		arg0.method8554(Static446.aClass353_82.method8395());
		arg0.method8554(Static554.aClass353_16.method8395());
		arg0.method8554(Static264.aClass353_48.method8395());
		arg0.method8554(Static40.aClass353_4.method8395());
		arg0.method8554(Static139.aClass353_27.method8395());
		arg0.method8554(Static493.aClass353_96.method8395());
		arg0.method8554(Static396.aClass353_69.method8395());
		arg0.method8554(Static336.aClass353_57.method8395());
		arg0.method8554(Static383.aClass353_64.method8395());
		arg0.method8554(Static452.method6946());
		arg0.method8554(Static477.method7171());
		arg0.method8554(Static114.aClass353_21.method8395());
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ha;ILclient!su;IB)V")
	public static void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class312 arg3, @OriginalArg(4) int arg4) {
		@Pc(9) Class246 local9 = Static592.aClass304_4.method7759(arg3.anInt9222);
		if (local9.anInt7561 == -1) {
			return;
		}
		if (arg3.aBoolean624) {
			@Pc(23) int local23 = arg2 + arg3.anInt9201;
			arg2 = local23 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class32 local39 = local9.method6524(arg1, arg2, arg3.aBoolean620);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg3.anInt9244;
		@Pc(48) int local48 = arg3.anInt9235;
		if ((arg2 & 0x1) == 1) {
			local45 = arg3.anInt9235;
			local48 = arg3.anInt9244;
		}
		@Pc(62) int local62 = local39.method5080();
		@Pc(65) int local65 = local39.method5079();
		if (local9.aBoolean507) {
			local62 = local45 * 4;
			local65 = local48 * 4;
		}
		if (local9.anInt7565 == 0) {
			local39.method5090(arg4, arg0 + 4 - local48 * 4, local62, local65);
		} else {
			local39.method5076(arg4, arg0 - (local48 - 1) * 4, local62, local65, 0, local9.anInt7565 | 0xFF000000, 1);
		}
	}
}
