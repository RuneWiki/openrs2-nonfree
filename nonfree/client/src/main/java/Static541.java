import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "Z")
	public static boolean aBoolean700 = false;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	public static void method8224() {
		Static427.aClass20_29 = null;
		Static414.aClass20_26 = null;
		Static567.aClass20_35 = null;
		Static65.aClass20_3 = null;
		Static464.aClass20_31 = null;
		Static543.aClass20_32 = null;
		Static425.aClass20_27 = null;
		Static135.aClass20Array3 = null;
		Static426.aClass20_28 = null;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!js;B)V")
	public static void method8225(@OriginalArg(0) Class14_Sub29_Sub1 arg0) {
		arg0.method5861(Static592.aClass386_21.method9218());
		arg0.method5861(Static118.aClass386_28.method9218());
		arg0.method5861(Static634.aClass386_134.method9218());
		arg0.method5861(Static635.aClass386_136.method9218());
		arg0.method5861(Static391.aClass386_88.method9218());
		arg0.method5861(Static227.aClass386_126.method9218());
		arg0.method5861(Static40.aClass386_19.method9218());
		arg0.method5861(Static577.aClass386_122.method9218());
		arg0.method5861(Static666.aClass386_141.method9218());
		arg0.method5861(Static665.aClass386_61.method9218());
		arg0.method5861(Static339.aClass386_81.method9218());
		arg0.method5861(Static204.aClass386_118.method9218());
		arg0.method5861(Static366.aClass386_85.method9218());
		arg0.method5861(Static329.aClass386_78.method9218());
		arg0.method5861(Static479.aClass386_106.method9218());
		arg0.method5861(Static570.aClass386_121.method9218());
		arg0.method5861(Static52.aClass386_15.method9218());
		arg0.method5861(Static345.aClass386_83.method9218());
		arg0.method5861(Static598.aClass386_124.method9218());
		arg0.method5861(Static134.aClass386_56.method9218());
		arg0.method5861(Static29.aClass386_6.method9218());
		arg0.method5861(Static76.aClass386_18.method9218());
		arg0.method5861(Static14.aClass386_3.method9218());
		arg0.method5861(Static298.aClass386_71.method9218());
		arg0.method5861(Static376.aClass386_87.method9218());
		arg0.method5861(Static172.aClass386_40.method9218());
		arg0.method5861(Static224.aClass386_52.method9218());
		arg0.method5861(Static475.aClass386_103.method9218());
		arg0.method5861(Static510.aClass386_111.method9218());
		arg0.method5861(Static624.aClass386_132.method9218());
		arg0.method5861(Static92.aClass386_23.method9218());
		arg0.method5861(Static55.aClass386_16.method9218());
		arg0.method5861(Static444.method6497());
		arg0.method5861(Static457.method6585());
		arg0.method5861(Static497.aClass386_129.method9218());
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method8227(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(22) int local22 = arg0[arg1 + local12] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(41) char local41 = Static571.aCharArray5[local22 - 128];
					if (local41 == '\u0000') {
						local41 = '?';
					}
					local22 = local41;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V")
	public static void method8228() {
		Static333.anInt6302 = (int) ((double) Static26.anInt462 * 34.46D);
		Static290.anInt5130 = 200;
		Static333.anInt6302 <<= 0x2;
		if (Static677.aClass137_47.method7924()) {
			Static333.anInt6302 += 512;
		}
		Static331.method5193(false);
	}
}
