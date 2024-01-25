import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!li", name = "A", descriptor = "Lclient!ea;")
	public static Class73 aClass73_107;

	@OriginalMember(owner = "client!li", name = "I", descriptor = "[Lclient!kia;")
	public static Class169[] aClass169Array2;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!kt;")
	public static final Class178 aClass178_7 = new Class178(1);

	@OriginalMember(owner = "client!li", name = "E", descriptor = "[F")
	public static final float[] aFloatArray59 = new float[16];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZLclient!gv;)V")
	public static void method5334(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class9_Sub4_Sub2_Sub1_Sub2 arg1) {
		if (Static611.anInt10324 >= 400) {
			return;
		}
		if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 != arg1) {
			@Pc(163) String local163;
			if (arg1.anInt4387 == 0) {
				@Pc(62) boolean local62 = true;
				if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4383 != -1 && arg1.anInt4383 != -1) {
					@Pc(83) int local83 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4383 >= arg1.anInt4383 ? arg1.anInt4383 : Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4383;
					@Pc(89) int local89 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369 - arg1.anInt4369;
					if (local89 < 0) {
						local89 = -local89;
					}
					if (local89 > local83) {
						local62 = false;
					}
				}
				@Pc(115) String local115 = Static8.aClass290_1 == Static25.aClass290_5 ? Static536.aClass316_32.method7577(Static638.anInt10709) : Static536.aClass316_30.method7577(Static638.anInt10709);
				if (arg1.anInt4369 < arg1.anInt4398) {
					local163 = arg1.method3642() + (local62 ? Static196.method3569(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369, arg1.anInt4369) : "<col=ffffff>") + " (" + local115 + arg1.anInt4369 + "+" + (arg1.anInt4398 - arg1.anInt4369) + ")";
				} else {
					local163 = arg1.method3642() + (local62 ? Static196.method3569(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369, arg1.anInt4369) : "<col=ffffff>") + " (" + local115 + arg1.anInt4369 + ")";
				}
			} else if (arg1.anInt4387 == -1) {
				local163 = arg1.method3642();
			} else {
				local163 = arg1.method3642() + " (" + Static536.aClass316_31.method7577(Static638.anInt10709) + arg1.anInt4387 + ")";
			}
			if (Static141.aBoolean262 && !arg0 && (Static38.anInt1411 & 0x8) != 0) {
				Static513.method7357(true, (long) arg1.anInt4299, Static574.anInt9810, 0, Static275.aString109 + " -> <col=ffffff>" + local163, false, 0, 5, (long) arg1.anInt4299, -1, false, Static381.aString72);
			}
			if (arg0) {
				Static513.method7357(false, 0L, -1, 0, "", false, 0, -1, (long) arg1.anInt4299, 0, true, "<col=cccccc>" + local163);
			} else {
				for (@Pc(273) int local273 = 7; local273 >= 0; local273--) {
					if (Static473.aStringArray29[local273] != null) {
						@Pc(281) short local281 = 0;
						if (Static406.aClass290_34 == Static8.aClass290_1 && Static473.aStringArray29[local273].equalsIgnoreCase(Static536.aClass316_25.method7577(Static638.anInt10709))) {
							if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369 < arg1.anInt4369) {
								local281 = 2000;
							}
							if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4377 != 0 && arg1.anInt4377 != 0) {
								if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4377 == arg1.anInt4377) {
									local281 = 2000;
								} else {
									local281 = 0;
								}
							}
						} else if (Static326.aBooleanArray14[local273]) {
							local281 = 2000;
						}
						@Pc(343) short local343 = (short) (local281 + Static41.aShortArray20[local273]);
						@Pc(354) int local354 = Static643.anIntArray573[local273] == -1 ? Static197.anInt6051 : Static643.anIntArray573[local273];
						Static513.method7357(true, (long) arg1.anInt4299, local354, 0, "<col=ffffff>" + local163, false, 0, local343, (long) arg1.anInt4299, -1, false, Static473.aStringArray29[local273]);
					}
				}
			}
			if (!arg0) {
				for (@Pc(421) Class6_Sub5_Sub9 local421 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4966(); local421 != null; local421 = (Class6_Sub5_Sub9) Static68.aClass163_14.method4965()) {
					if (local421.anInt3240 == 6) {
						local421.aString24 = "<col=ffffff>" + local163;
						return;
					}
				}
			}
		} else if (Static141.aBoolean262 && (Static38.anInt1411 & 0x10) != 0) {
			Static513.method7357(true, 0L, Static574.anInt9810, 0, Static275.aString109 + " -> <col=ffffff>" + Static536.aClass316_39.method7577(Static638.anInt10709), false, 0, 57, (long) arg1.anInt4299, -1, false, Static381.aString72);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/io/File;Z)V")
	public static void method5342(@OriginalArg(1) File arg0) {
		if (Static380.anObject15 == null) {
			Static579.method8041();
		}
		try {
			@Pc(10) Class local10 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(34) Method local34 = local10.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local34.invoke(Static380.anObject15, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(54) Exception local54) {
			System.out.println("HeapDump error:");
			local54.printStackTrace();
		}
	}
}
