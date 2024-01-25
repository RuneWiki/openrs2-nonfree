import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!qq", name = "Hc", descriptor = "Lclient!ga;")
	public static Class111 aClass111_102;

	@OriginalMember(owner = "client!qq", name = "ud", descriptor = "[[Lclient!wv;")
	public static Class365[][] aClass365ArrayArray4;

	@OriginalMember(owner = "client!qq", name = "qb", descriptor = "I")
	public static final int anInt7395 = 1337;

	@OriginalMember(owner = "client!qq", name = "Db", descriptor = "[I")
	public static final int[] anIntArray502 = new int[1000];

	@OriginalMember(owner = "client!qq", name = "oc", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "(I)[Lclient!nv;")
	public static Class232[] method6211() {
		return new Class232[] { Static189.aClass232_1, Static189.aClass232_2, Static189.aClass232_3, Static189.aClass232_4, Static189.aClass232_5, Static189.aClass232_6, Static189.aClass232_7, Static189.aClass232_8, Static189.aClass232_9, Static189.aClass232_10, Static189.aClass232_11, Static189.aClass232_12, Static189.aClass232_13, Static189.aClass232_14 };
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([BIIB)Ljava/lang/String;")
	public static String method6212(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg1; local20++) {
			@Pc(30) int local30 = arg0[arg2 + local20] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(49) char local49 = Static355.aCharArray6[local30 - 128];
					if (local49 == '\u0000') {
						local49 = '?';
					}
					local30 = local49;
				}
				local8[local10++] = (char) local30;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZIIZI)V")
	public static void method6221(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static12.method208(arg2, arg0, arg3, arg1, 0, Static161.aClass208_Sub1Array1.length - 1);
		Static393.anInt6805 = 0;
		Static232.aClass1_Sub45_1 = null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method6264(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static136.aClass12_8 = Static447.method6466(Static479.aClass1_Sub7_Sub1_1.anInt3105 * 2, Static26.aCanvas3, Static446.aClass111_105, 0, Static478.anInterface5_11);
			if (arg1 != null) {
				Static136.aClass12_8.ja(0);
				@Pc(162) Class13 local162 = Static584.method7820(Static474.anInt1074, Static530.aClass111_114);
				@Pc(171) Class35 local171 = Static136.aClass12_8.method6457(local162, Static604.method7068(Static141.aClass111_32, Static474.anInt1074));
				Static548.method7475();
				Static471.method6665(local162, Static136.aClass12_8, true, arg1, local171);
			}
		} else {
			@Pc(12) Class12 local12 = null;
			@Pc(31) Class13 local31;
			@Pc(40) Class35 local40;
			if (arg1 != null) {
				local12 = Static447.method6466(0, Static26.aCanvas3, Static446.aClass111_105, 0, Static478.anInterface5_11);
				local12.ja(0);
				local31 = Static584.method7820(Static474.anInt1074, Static530.aClass111_114);
				local40 = local12.method6457(local31, Static604.method7068(Static141.aClass111_32, Static474.anInt1074));
				Static548.method7475();
				Static471.method6665(local31, local12, true, arg1, local40);
			}
			try {
				Static136.aClass12_8 = Static447.method6466(Static479.aClass1_Sub7_Sub1_1.anInt3105 * 2, Static26.aCanvas3, Static446.aClass111_105, arg0, Static478.anInterface5_11);
				if (arg1 != null) {
					local12.ja(0);
					local31 = Static584.method7820(Static474.anInt1074, Static530.aClass111_114);
					local40 = local12.method6457(local31, Static604.method7068(Static141.aClass111_32, Static474.anInt1074));
					Static548.method7475();
					Static471.method6665(local31, local12, true, arg1, local40);
				}
				if (Static136.aClass12_8.method6408()) {
					@Pc(94) boolean local94 = true;
					try {
						local94 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(104) Throwable local104) {
					}
					@Pc(110) Class1_Sub11 local110;
					if (local94) {
						local110 = Static136.aClass12_8.method6403(146800640);
					} else {
						local110 = Static136.aClass12_8.method6403(104857600);
					}
					Static136.aClass12_8.method6422(local110);
				}
			} catch (@Pc(121) Throwable local121) {
				Static136.aClass12_8 = Static447.method6466(0, Static26.aCanvas3, Static446.aClass111_105, 0, Static478.anInterface5_11);
				arg0 = 0;
			}
			if (local12 != null) {
				try {
					local12.method6465();
				} catch (@Pc(138) Throwable local138) {
				}
			}
		}
		Static375.anInt6609 = arg0;
		Static587.method7840();
		Static136.aClass12_8.va(32);
		Static583.aClass209_6 = Static136.aClass12_8.method6410();
		Static22.aClass209_1 = Static136.aClass12_8.method6410();
		Static377.method5473();
		Static136.aClass12_8.method6398(!Static479.aClass1_Sub7_Sub1_1.aBoolean219);
		if (Static136.aClass12_8.method6439()) {
			Static412.method5783(Static479.aClass1_Sub7_Sub1_1.aBoolean232);
		}
		Static69.method1447(Static136.aClass12_8, Static500.anInt6888 >> 3, Static573.anInt9325 >> 3);
		Static224.method3681();
		Static344.aBoolean436 = true;
		Static392.aBoolean493 = false;
		Static243.aClass360Array1 = null;
	}
}
