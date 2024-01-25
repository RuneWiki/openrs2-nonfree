import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!tda", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
	public static void method7917() {
		if (Static528.aClass3_Sub4_Sub1_1 != null) {
			Static528.aClass3_Sub4_Sub1_1 = null;
			Static423.method6625(Static312.anInt5897, Static261.anInt4795, Static416.anInt7575, Static107.anInt2316);
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method7918(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static232.aClass5_8 = arg0;
		Static502.anInt8651 = arg1;
		Static557.aBoolean669 = Static502.anInt8651 > 1 && Static232.aClass5_8.method7549();
		Static308.anInt5834 = 9;
		Static384.anInt7200 = 0x1 << Static308.anInt5834;
		Static161.anInt3180 = Static384.anInt7200 >> 1;
		Math.sqrt((double) (Static161.anInt3180 * Static161.anInt3180 + Static161.anInt3180 * Static161.anInt3180));
		Static442.anInt7929 = 4;
		Static569.anInt9425 = arg2;
		Static293.anInt5181 = arg3;
		Static468.anInt10228 = arg4;
		Static263.aClass183_1 = Static261.method4322();
		Static243.method3991();
		Static68.aClass77ArrayArrayArray1 = new Class77[4][Static569.anInt9425][Static293.anInt5181];
		Static559.aClass51Array4 = new Class51[4];
		if (arg5) {
			Static307.anIntArrayArray38 = new int[Static569.anInt9425][Static293.anInt5181];
			Static241.aByteArrayArray12 = new byte[Static569.anInt9425][Static293.anInt5181];
			Static503.aShortArrayArray15 = new short[Static569.anInt9425][Static293.anInt5181];
			Static338.aClass77ArrayArrayArray3 = new Class77[1][Static569.anInt9425][Static293.anInt5181];
			Static2.aClass51Array1 = new Class51[1];
		} else {
			Static307.anIntArrayArray38 = null;
			Static241.aByteArrayArray12 = null;
			Static503.aShortArrayArray15 = null;
			Static338.aClass77ArrayArrayArray3 = null;
			Static2.aClass51Array1 = null;
		}
		if (arg6) {
			Static207.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static89.aClass206Array1 = new Class206[65535];
			Static303.aBooleanArray16 = new boolean[65535];
			Static99.anInt2252 = 0;
		} else {
			Static207.aLongArrayArrayArray1 = null;
			Static89.aClass206Array1 = null;
			Static303.aBooleanArray16 = null;
			Static99.anInt2252 = 0;
		}
		Static48.method1421(false);
		Static276.aClass4_Sub1ArrayArray1 = new Class4_Sub1[2][];
		Static276.aClass4_Sub1ArrayArray1[0] = new Class4_Sub1[Static35.anIntArray28[0]];
		Static276.aClass4_Sub1ArrayArray1[1] = new Class4_Sub1[Static35.anIntArray28[1]];
		Static93.anIntArray83 = new int[2];
		Static368.aClass4_Sub1ArrayArray2 = new Class4_Sub1[2][];
		Static368.aClass4_Sub1ArrayArray2[0] = new Class4_Sub1[Static591.anIntArray628[0]];
		Static368.aClass4_Sub1ArrayArray2[1] = new Class4_Sub1[Static591.anIntArray628[1]];
		Static62.anIntArray650 = new int[2];
		Static491.aClass4_Sub1ArrayArray3 = new Class4_Sub1[2][];
		Static491.aClass4_Sub1ArrayArray3[0] = new Class4_Sub1[Static455.anIntArray500[0]];
		Static491.aClass4_Sub1ArrayArray3[1] = new Class4_Sub1[Static455.anIntArray500[1]];
		Static582.anIntArray612 = new int[2];
		Static68.aClass4_Sub1Array1 = new Class4_Sub1[10000];
		Static309.anInt5850 = 0;
		Static225.aClass4_Sub1Array3 = new Class4_Sub1[5000];
		Static115.anInt2494 = 0;
		Static290.aClass4_Sub1_Sub2Array1 = new Class4_Sub1_Sub2[5000];
		Static270.anInt4932 = 0;
		Static579.aBooleanArrayArray7 = new boolean[Static468.anInt10228 + Static468.anInt10228 + 1][Static468.anInt10228 + Static468.anInt10228 + 1];
		Static358.aBooleanArrayArray5 = new boolean[Static468.anInt10228 + Static468.anInt10228 + 2][Static468.anInt10228 + Static468.anInt10228 + 2];
		Static246.anIntArray240 = new int[Static468.anInt10228 + Static468.anInt10228 + 2];
		Static374.aClass301_3 = Static374.aClass301_2;
		if (Static557.aBoolean669) {
			Static251.aBooleanArrayArrayArray1 = new boolean[4][Static468.anInt10228 + Static468.anInt10228 + 1][Static468.anInt10228 + Static468.anInt10228 + 1];
			Static563.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static597.aClass33Array1 != null) {
				Static64.method7842();
			}
			Static597.aClass33Array1 = new Class33[Static502.anInt8651];
			Static232.aClass5_8.method7510(Static597.aClass33Array1.length + 1);
			Static232.aClass5_8.method7502(0);
			for (@Pc(256) int local256 = 0; local256 < Static597.aClass33Array1.length; local256++) {
				Static597.aClass33Array1[local256] = new Class33(local256 + 1, Static232.aClass5_8);
				(new Thread(Static597.aClass33Array1[local256], "wr" + local256)).start();
			}
			@Pc(291) byte local291;
			if (Static502.anInt8651 == 2) {
				local291 = 4;
				Static57.anInt1567 = 2;
			} else if (Static502.anInt8651 == 3) {
				local291 = 6;
				Static57.anInt1567 = 3;
			} else {
				local291 = 8;
				Static57.anInt1567 = 4;
			}
			Static280.aClass291Array1 = new Class291[local291];
			for (@Pc(311) int local311 = 0; local311 < local291; local311++) {
				Static280.aClass291Array1[local311] = new Class291(Static238.aStringArrayArray1[Static502.anInt8651 - 2][local311]);
			}
		} else {
			Static57.anInt1567 = 1;
		}
		Static89.anIntArray77 = new int[Static57.anInt1567 - 1];
		Static511.anIntArray547 = new int[Static57.anInt1567 - 1];
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!hga;ILjava/lang/String;I)Lclient!sca;")
	public static Class304 method7919(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method3575(arg2);
		}
		@Pc(38) Class304 local38;
		if (arg1 == 1) {
			try {
				Static646.method3054(Static504.anApplet2, new Object[] { (new URL(Static504.anApplet2.getCodeBase(), arg2)).toString() }, "openjs");
				local38 = new Class304();
				local38.anInt8838 = 1;
				return local38;
			} catch (@Pc(44) Throwable local44) {
				local38 = new Class304();
				local38.anInt8838 = 2;
				return local38;
			}
		} else if (arg1 == 2) {
			try {
				Static504.anApplet2.getAppletContext().showDocument(new URL(Static504.anApplet2.getCodeBase(), arg2), "_blank");
				local38 = new Class304();
				local38.anInt8838 = 1;
				return local38;
			} catch (@Pc(76) Exception local76) {
				local38 = new Class304();
				local38.anInt8838 = 2;
				return local38;
			}
		} else if (arg1 == 3) {
			try {
				Static646.method3052(Static504.anApplet2, "loggedout");
			} catch (@Pc(100) Throwable local100) {
			}
			try {
				Static504.anApplet2.getAppletContext().showDocument(new URL(Static504.anApplet2.getCodeBase(), arg2), "_top");
				local38 = new Class304();
				local38.anInt8838 = 1;
				return local38;
			} catch (@Pc(120) Exception local120) {
				local38 = new Class304();
				local38.anInt8838 = 2;
				return local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
