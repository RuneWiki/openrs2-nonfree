import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ps", name = "C", descriptor = "[I")
	public static int[] anIntArray454;

	@OriginalMember(owner = "client!ps", name = "Tb", descriptor = "[S")
	public static short[] aShortArray66;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "J")
	public static long aLong142 = 0L;

	@OriginalMember(owner = "client!ps", name = "sb", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!ps", name = "dc", descriptor = "Ljava/lang/String;")
	public static String aString191 = null;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public static void method4329() {
		while (true) {
			if (Static142.aClass1_Sub21_Sub2_1.method5755(Static237.anInt4904) >= 27) {
				@Pc(18) int local18 = Static142.aClass1_Sub21_Sub2_1.method5756(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static178.aClass10_Sub1_Sub2_Sub1Array1[local18] == null) {
						Static178.aClass10_Sub1_Sub2_Sub1Array1[local18] = new Class10_Sub1_Sub2_Sub1();
						local23 = true;
						Static178.aClass10_Sub1_Sub2_Sub1Array1[local18].anInt4036 = local18;
					}
					@Pc(44) Class10_Sub1_Sub2_Sub1 local44 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local18];
					Static79.anIntArray672[Static271.anInt5578++] = local18;
					local44.anInt4071 = Static282.anInt3516;
					if (local44.aClass60_1 != null && local44.aClass60_1.method1272()) {
						Static60.method1145(local44);
					}
					@Pc(73) int local73 = Static125.anIntArray254[Static142.aClass1_Sub21_Sub2_1.method5756(3)];
					@Pc(78) int local78 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
					if (local78 == 1) {
						Static312.anIntArray623[Static62.anInt6674++] = local18;
					}
					local44.method677(Static68.method1219(Static142.aClass1_Sub21_Sub2_1.method5756(14)));
					@Pc(103) int local103 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
					@Pc(108) int local108 = Static142.aClass1_Sub21_Sub2_1.method5756(5);
					if (local108 > 15) {
						local108 -= 32;
					}
					@Pc(117) int local117 = Static142.aClass1_Sub21_Sub2_1.method5756(5);
					local44.method3404(local44.aClass60_1.anInt1504);
					if (local117 > 15) {
						local117 -= 32;
					}
					local44.anInt4011 = local44.aClass60_1.anInt1531 << 3;
					if (local44.anInt4011 == 0) {
						local44.method3415(0);
					} else if (local23) {
						local44.method3415(local73);
					}
					local44.method3401(local103 == 1, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] + local117, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] + local108, local44.method3402(), Static127.anInt2487);
					if (local44.aClass60_1.method1272()) {
						Static147.method2608(Static127.anInt2487, local44.anIntArray388[0], 0, local44.anIntArray387[0], null, null, local44);
					}
					continue;
				}
			}
			Static142.aClass1_Sub21_Sub2_1.method5759();
			return;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
	public static void method4330(@OriginalArg(1) int arg0) {
		Static131.anInt2596 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!cd;I[I[I[I)V")
	public static void method4331(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(15) int local15 = arg2[local3];
			@Pc(19) int local19 = arg1[local3];
			@Pc(23) int local23 = arg3[local3];
			@Pc(25) int local25 = 0;
			while (local19 != 0 && arg0.aClass138Array3.length > local25) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg0.aClass138Array3[local25] = null;
					} else {
						@Pc(42) Class177 local42 = Static354.method5863(local15);
						@Pc(45) int local45 = local42.anInt5420;
						@Pc(50) Class138 local50 = arg0.aClass138Array3[local25];
						if (local50 != null) {
							if (local50.anInt3779 == local15) {
								if (local45 == 0) {
									local50 = arg0.aClass138Array3[local25] = null;
								} else if (local45 == 1) {
									local50.anInt3780 = local23;
									local50.anInt3771 = 0;
									local50.anInt3777 = 1;
									local50.anInt3778 = 0;
									local50.anInt3781 = 0;
									Static351.method3417(arg0.anInt6726, false, arg0.anInt6728, 0, local42);
								} else if (local45 == 2) {
									local50.anInt3781 = 0;
								}
							} else if (local42.anInt5417 >= Static354.method5863(local50.anInt3779).anInt5417) {
								local50 = arg0.aClass138Array3[local25] = null;
							}
						}
						if (local50 == null) {
							local50 = arg0.aClass138Array3[local25] = new Class138();
							local50.anInt3780 = local23;
							local50.anInt3781 = 0;
							local50.anInt3778 = 0;
							local50.anInt3779 = local15;
							local50.anInt3777 = 1;
							local50.anInt3771 = 0;
							Static351.method3417(arg0.anInt6726, false, arg0.anInt6728, 0, local42);
						}
					}
				}
				local25++;
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(JB)V")
	public static void method4340(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!nj;)V")
	public static void method4341(@OriginalArg(1) Class1_Sub21 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static8.aClass171_1 != null) {
			@Pc(20) int local20;
			try {
				Static8.aClass171_1.method4501(0L);
				Static8.aClass171_1.method4494(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5729(24, local8);
	}
}
