import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!wm;")
	public static Class390 aClass390_110;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
	public static int anInt9087;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
	public static int anInt9088;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "Lclient!qu;")
	public static Class295 aClass295_2;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!kka;")
	public static final Class198 aClass198_4 = new Class198();

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray52 = new String[100];

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	public static final int anInt9093 = 1409;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "Lclient!efa;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method7713() {
		Static31.anInt483 = 0;
		@Pc(9) int local9 = Static474.aClass5_Sub41_Sub2_2.method7838();
		@Pc(20) boolean local20 = Static474.aClass5_Sub41_Sub2_2.method7799() == 1;
		@Pc(24) int local24 = Static474.aClass5_Sub41_Sub2_2.method7799();
		@Pc(28) int local28 = Static474.aClass5_Sub41_Sub2_2.method7796();
		Static470.method6770();
		Static240.method3769(local24);
		@Pc(41) int local41 = (Static630.anInt10261 - Static474.aClass5_Sub41_Sub2_2.anInt9230) / 16;
		Static278.anIntArrayArray25 = new int[local41][4];
		@Pc(50) int local50;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local50 = 0; local50 < 4; local50++) {
				Static278.anIntArrayArray25[local47][local50] = Static474.aClass5_Sub41_Sub2_2.method7804();
			}
		}
		Static72.aByteArrayArray3 = new byte[local41][];
		Static62.aByteArrayArray2 = null;
		Static490.anIntArray460 = new int[local41];
		Static592.anIntArray537 = new int[local41];
		Static267.anIntArray285 = new int[local41];
		Static220.aByteArrayArray13 = new byte[local41][];
		Static457.aByteArrayArray25 = new byte[local41][];
		Static51.anIntArray37 = new int[local41];
		Static367.aByteArrayArray20 = new byte[local41][];
		Static611.anIntArray552 = new int[local41];
		Static200.anIntArray188 = null;
		local41 = 0;
		for (local50 = (local9 - (Static201.anInt3834 >> 4)) / 8; local50 <= (local9 + (Static201.anInt3834 >> 4)) / 8; local50++) {
			for (@Pc(125) int local125 = (local28 - (Static626.anInt10238 >> 4)) / 8; local125 <= (local28 + (Static626.anInt10238 >> 4)) / 8; local125++) {
				Static611.anIntArray552[local41] = local125 + (local50 << 8);
				Static267.anIntArray285[local41] = Static260.aClass390_61.method8910("m" + local50 + "_" + local125);
				Static592.anIntArray537[local41] = Static260.aClass390_61.method8910("l" + local50 + "_" + local125);
				Static490.anIntArray460[local41] = Static260.aClass390_61.method8910("um" + local50 + "_" + local125);
				Static51.anIntArray37[local41] = Static260.aClass390_61.method8910("ul" + local50 + "_" + local125);
				local41++;
			}
		}
		Static393.method5767(local9, local20, local28, 11);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BZII[BIIII)V")
	public static void method7714(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = -(arg4 >> 2);
		@Pc(13) int local13 = -(arg4 & 0x3);
		for (@Pc(21) int local21 = -arg2; local21 < 0; local21++) {
			@Pc(27) int local27;
			for (@Pc(24) int local24 = local8; local24 < 0; local24++) {
				local27 = arg7++;
				arg3[local27] += arg0[arg5++];
				@Pc(39) int local39 = arg7++;
				arg3[local39] += arg0[arg5++];
				@Pc(51) int local51 = arg7++;
				arg3[local51] += arg0[arg5++];
				@Pc(63) int local63 = arg7++;
				arg3[local63] += arg0[arg5++];
			}
			for (@Pc(78) int local78 = local13; local78 < 0; local78++) {
				local27 = arg7++;
				arg3[local27] += arg0[arg5++];
			}
			arg5 += arg1;
			arg7 += arg6;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(DI)V")
	public static void method7715(@OriginalArg(0) double arg0) {
		if (arg0 == Static305.aDouble10) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(26) int local26 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static333.anIntArray347[local15] = local26 > 255 ? 255 : local26;
		}
		Static305.aDouble10 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	public static void method7716(@OriginalArg(1) int arg0) {
		Static463.anInt7832 = arg0;
		@Pc(7) Class340 local7 = Static483.aClass340_45;
		synchronized (Static483.aClass340_45) {
			Static483.aClass340_45.method7987();
		}
	}
}
