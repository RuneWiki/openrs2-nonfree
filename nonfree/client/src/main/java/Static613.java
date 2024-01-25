import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "J")
	public static long aLong266;

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "Lclient!cw;")
	public static Class61 aClass61_34;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
	public static int anInt9883 = 1;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method8239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) int local20;
		if (Static221.method3025(arg0)) {
			local20 = 0;
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			if (Static319.aBoolean356) {
				local41 = Static112.anInt2056;
				local39 = Static22.anInt552;
				local37 = Static638.anInt7975;
				local20 = Static491.anInt8079;
				local35 = Static71.anInt1260;
				Static112.anInt2056 = 1;
			}
			if (Static8.aClass261ArrayArray1[arg0] == null) {
				Static636.method8556(Static559.aClass261ArrayArray2[arg0], arg3, arg2, arg1, arg5, -1, arg6, arg7, arg1 < 0, arg4);
			} else {
				Static636.method8556(Static8.aClass261ArrayArray1[arg0], arg3, arg2, arg1, arg5, -1, arg6, arg7, arg1 < 0, arg4);
			}
			if (Static319.aBoolean356) {
				if (arg1 >= 0 && Static112.anInt2056 == 2) {
					Static170.method7976(Static638.anInt7975, Static22.anInt552, Static491.anInt8079, Static71.anInt1260);
				}
				Static22.anInt552 = local39;
				Static71.anInt1260 = local35;
				Static112.anInt2056 = local41;
				Static491.anInt8079 = local20;
				Static638.anInt7975 = local37;
			}
		} else if (arg1 == -1) {
			for (local20 = 0; local20 < 100; local20++) {
				Static69.aBooleanArray25[local20] = true;
			}
		} else {
			Static69.aBooleanArray25[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public static void method8240() {
		Static81.aClass105Array1 = new Class105[50];
		Static270.anInt4355 = 0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!wn;)V")
	public static void method8241(@OriginalArg(1) Class2_Sub22_Sub2 arg0) {
		arg0.method8552(Static450.aClass380_104.method8629());
		arg0.method8552(Static6.aClass380_3.method8629());
		arg0.method8552(Static576.aClass380_128.method8629());
		arg0.method8552(Static82.aClass380_25.method8629());
		arg0.method8552(Static319.aClass380_76.method8629());
		arg0.method8552(Static280.aClass380_67.method8629());
		arg0.method8552(Static539.aClass380_121.method8629());
		arg0.method8552(Static519.aClass380_116.method8629());
		arg0.method8552(Static79.aClass380_22.method8629());
		arg0.method8552(Static107.aClass380_34.method8629());
		arg0.method8552(Static262.aClass380_85.method8629());
		arg0.method8552(Static428.aClass380_100.method8629());
		arg0.method8552(Static210.aClass380_53.method8629());
		arg0.method8552(Static141.aClass380_39.method8629());
		arg0.method8552(Static404.aClass380_98.method8629());
		arg0.method8552(Static312.aClass380_74.method8629());
		arg0.method8552(Static247.aClass380_64.method8629());
		arg0.method8552(Static39.aClass380_14.method8629());
		arg0.method8552(Static531.aClass380_119.method8629());
		arg0.method8552(Static194.aClass380_126.method8629());
		arg0.method8552(Static3.aClass380_135.method8629());
		arg0.method8552(Static438.aClass380_102.method8629());
		arg0.method8552(Static488.aClass380_110.method8629());
		arg0.method8552(Static416.aClass380_99.method8629());
		arg0.method8552(Static607.aClass380_131.method8629());
		arg0.method8552(Static57.aClass380_15.method8629());
		arg0.method8552(Static535.aClass380_120.method8629());
		arg0.method8552(Static125.aClass380_37.method8629());
		arg0.method8552(Static92.aClass380_30.method8629());
		arg0.method8552(Static469.aClass380_10.method8629());
		arg0.method8552(Static260.aClass380_65.method8629());
		arg0.method8552(Static525.aClass380_94.method8629());
		arg0.method8552(Static566.method7760());
		arg0.method8552(Static510.method7183());
		arg0.method8552(Static342.aClass380_83.method8629());
	}
}
