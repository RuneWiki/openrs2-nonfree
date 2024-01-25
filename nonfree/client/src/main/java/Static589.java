import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!tka", name = "C", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray13 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!tka", name = "y", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[6][];

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method8390(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static554.aClass144_12 = arg0;
		Static419.anInt10673 = arg1;
		Static326.aBoolean408 = Static419.anInt10673 > 1 && Static554.aClass144_12.method6924();
		Static110.anInt1858 = 9;
		Static391.anInt6813 = 0x1 << Static110.anInt1858;
		Static193.anInt9749 = Static391.anInt6813 >> 1;
		Math.sqrt((double) (Static193.anInt9749 * Static193.anInt9749 + Static193.anInt9749 * Static193.anInt9749));
		Static59.anInt987 = 4;
		Static654.anInt10715 = arg2;
		Static180.anInt2928 = arg3;
		Static459.anInt10513 = arg4;
		Static515.aClass29_1 = Static512.method9097();
		Static206.method3080();
		Static501.aClass89ArrayArrayArray3 = new Class89[4][Static654.anInt10715][Static180.anInt2928];
		Static445.aClass159Array3 = new Class159[4];
		if (arg5) {
			Static200.anIntArrayArray59 = new int[Static654.anInt10715][Static180.anInt2928];
			Static690.aByteArrayArray33 = new byte[Static654.anInt10715][Static180.anInt2928];
			Static587.aShortArrayArray4 = new short[Static654.anInt10715][Static180.anInt2928];
			Static389.aClass89ArrayArrayArray2 = new Class89[1][Static654.anInt10715][Static180.anInt2928];
			Static346.aClass159Array2 = new Class159[1];
		} else {
			Static200.anIntArrayArray59 = null;
			Static690.aByteArrayArray33 = null;
			Static587.aShortArrayArray4 = null;
			Static389.aClass89ArrayArrayArray2 = null;
			Static346.aClass159Array2 = null;
		}
		if (arg6) {
			Static378.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static351.aClass275Array5 = new Class275[65535];
			Static178.aBooleanArray5 = new boolean[65535];
			Static306.anInt6132 = 0;
		} else {
			Static378.aLongArrayArrayArray1 = null;
			Static351.aClass275Array5 = null;
			Static178.aBooleanArray5 = null;
			Static306.anInt6132 = 0;
		}
		Static303.method6870(false);
		Static664.aClass4_Sub3Array5 = new Class4_Sub3[2];
		Static111.aClass4_Sub3Array2 = new Class4_Sub3[2];
		Static170.aClass4_Sub3Array3 = new Class4_Sub3[2];
		Static91.aClass4_Sub3Array1 = new Class4_Sub3[10000];
		Static383.anInt6725 = 0;
		Static482.aClass4_Sub3Array4 = new Class4_Sub3[5000];
		Static521.anInt8910 = 0;
		Static95.aClass4_Sub3_Sub3Array1 = new Class4_Sub3_Sub3[5000];
		Static380.anInt6702 = 0;
		Static18.aBooleanArrayArray1 = new boolean[Static459.anInt10513 + Static459.anInt10513 + 1][Static459.anInt10513 + Static459.anInt10513 + 1];
		Static208.aBooleanArrayArray12 = new boolean[Static459.anInt10513 + Static459.anInt10513 + 2][Static459.anInt10513 + Static459.anInt10513 + 2];
		Static77.anIntArray72 = new int[Static459.anInt10513 + Static459.anInt10513 + 2];
		Static603.aClass307_3 = Static603.aClass307_4;
		if (Static326.aBoolean408) {
			Static684.aBooleanArrayArrayArray2 = new boolean[4][Static459.anInt10513 + Static459.anInt10513 + 1][Static459.anInt10513 + Static459.anInt10513 + 1];
			Static218.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static156.aClass143Array1 != null) {
				Static256.method4311();
			}
			Static156.aClass143Array1 = new Class143[Static419.anInt10673];
			Static554.aClass144_12.method6913(Static156.aClass143Array1.length + 1);
			Static554.aClass144_12.method6900(0);
			for (@Pc(214) int local214 = 0; local214 < Static156.aClass143Array1.length; local214++) {
				Static156.aClass143Array1[local214] = new Class143(local214 + 1, Static554.aClass144_12);
				(new Thread(Static156.aClass143Array1[local214], "wr" + local214)).start();
			}
			@Pc(253) byte local253;
			if (Static419.anInt10673 == 2) {
				local253 = 4;
				Static496.anInt8374 = 2;
			} else if (Static419.anInt10673 == 3) {
				local253 = 6;
				Static496.anInt8374 = 3;
			} else {
				local253 = 8;
				Static496.anInt8374 = 4;
			}
			Static100.aClass399Array1 = new Class399[local253];
			for (@Pc(273) int local273 = 0; local273 < local253; local273++) {
				Static100.aClass399Array1[local273] = new Class399(Static70.aStringArrayArray1[Static419.anInt10673 - 2][local273]);
			}
		} else {
			Static496.anInt8374 = 1;
		}
		Static634.anIntArray557 = new int[Static496.anInt8374 - 1];
		Static510.anIntArray460 = new int[Static496.anInt8374 - 1];
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(Z)Z")
	public static boolean method8391() {
		if (Static571.aBoolean654) {
			try {
				Static698.method8237(Static531.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(15) Throwable local15) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method8392(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static379.method5836(arg1.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!tka", name = "d", descriptor = "(I)V")
	public static void method8393() {
		for (@Pc(17) Class14_Sub27 local17 = (Class14_Sub27) Static445.aClass125_30.method2633(); local17 != null; local17 = (Class14_Sub27) Static445.aClass125_30.method2627()) {
			if (local17.aClass147_Sub1_1.method5253()) {
				Static687.method9464(local17.anInt6684);
			} else {
				local17.aClass147_Sub1_1.method5259();
				try {
					local17.aClass147_Sub1_1.method5244();
				} catch (@Pc(44) Exception local44) {
					Static629.method8829("TV: " + local17.anInt6684, local44);
					Static687.method9464(local17.anInt6684);
				}
				if (!local17.aBoolean475 && !local17.aBoolean476) {
					@Pc(74) Class14_Sub4_Sub2 local74 = local17.aClass147_Sub1_1.method5242();
					if (local74 != null) {
						@Pc(80) Class14_Sub1_Sub5 local80 = local74.method2439();
						if (local80 != null) {
							local80.method9323(local17.anInt6682);
							Static196.aClass14_Sub1_Sub2_1.method1805(local80);
							local17.aBoolean475 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tka", name = "b", descriptor = "(Z)V")
	public static void method8394() {
		if (Static103.aClass144_3.method6922()) {
			Static103.aClass144_3.method6893(Static626.aCanvas12);
			Static522.method7762();
			if (Static656.aBoolean741) {
				Static476.method7128(Static626.aCanvas12);
			} else {
				@Pc(18) Dimension local18 = Static626.aCanvas12.getSize();
				Static103.aClass144_3.method6917(Static626.aCanvas12, local18.width, local18.height);
			}
			Static103.aClass144_3.method6909(Static626.aCanvas12);
		} else {
			Static459.method8986(false, Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801());
		}
		Static438.method6532();
		Static282.aBoolean384 = true;
	}
}
