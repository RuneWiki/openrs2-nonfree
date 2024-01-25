import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	public static int anInt2251;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray11 = new int[2][][];

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "J")
	public static long aLong82 = 0L;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "[Lclient!wh;")
	public static final Class246[] aClass246Array2 = new Class246[29];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!ck;)V")
	public static void method1892(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub5_Sub1 arg1) {
		while (true) {
			@Pc(17) Class3_Sub39 local17 = (Class3_Sub39) Static331.aClass138_40.method3051();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt5761; local24++) {
				if (local17.aClass133Array1[local24] != null) {
					if (local17.aClass133Array1[local24].anInt3257 == 2) {
						local17.anIntArray625[local24] = -5;
					}
					if (local17.aClass133Array1[local24].anInt3257 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass133Array2[local24] != null) {
					if (local17.aClass133Array2[local24].anInt3257 == 2) {
						local17.anIntArray625[local24] = -6;
					}
					if (local17.aClass133Array2[local24].anInt3257 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg1.method856(arg0);
			arg1.method2791(0);
			@Pc(98) int local98 = arg1.anInt3121;
			arg1.method2782(local17.anInt5763);
			for (@Pc(105) int local105 = 0; local105 < local17.anInt5761; local105++) {
				if (local17.anIntArray625[local105] == 0) {
					try {
						@Pc(126) int local126 = local17.anIntArray626[local105];
						@Pc(135) Field local135;
						@Pc(139) int local139;
						if (local126 == 0) {
							local135 = (Field) local17.aClass133Array1[local105].anObject3;
							local139 = local135.getInt(null);
							arg1.method2791(0);
							arg1.method2782(local139);
						} else if (local126 == 1) {
							local135 = (Field) local17.aClass133Array1[local105].anObject3;
							local135.setInt(null, local17.anIntArray624[local105]);
							arg1.method2791(0);
						} else if (local126 == 2) {
							local135 = (Field) local17.aClass133Array1[local105].anObject3;
							local139 = local135.getModifiers();
							arg1.method2791(0);
							arg1.method2782(local139);
						}
						@Pc(203) Method local203;
						if (local126 == 3) {
							local203 = (Method) local17.aClass133Array2[local105].anObject3;
							@Pc(208) byte[][] local208 = local17.aByteArrayArrayArray19[local105];
							@Pc(212) Object[] local212 = new Object[local208.length];
							for (@Pc(214) int local214 = 0; local214 < local208.length; local214++) {
								@Pc(226) ObjectInputStream local226 = new ObjectInputStream(new ByteArrayInputStream(local208[local214]));
								local212[local214] = local226.readObject();
							}
							@Pc(245) Object local245 = local203.invoke(null, local212);
							if (local245 == null) {
								arg1.method2791(0);
							} else if (local245 instanceof Number) {
								arg1.method2791(1);
								arg1.method2760(((Number) local245).longValue());
							} else if (local245 instanceof String) {
								arg1.method2791(2);
								arg1.method2768((String) local245);
							} else {
								arg1.method2791(4);
							}
						} else if (local126 == 4) {
							local203 = (Method) local17.aClass133Array2[local105].anObject3;
							local139 = local203.getModifiers();
							arg1.method2791(0);
							arg1.method2782(local139);
						}
					} catch (@Pc(313) ClassNotFoundException local313) {
						arg1.method2791(-10);
					} catch (@Pc(319) InvalidClassException local319) {
						arg1.method2791(-11);
					} catch (@Pc(325) StreamCorruptedException local325) {
						arg1.method2791(-12);
					} catch (@Pc(331) OptionalDataException local331) {
						arg1.method2791(-13);
					} catch (@Pc(337) IllegalAccessException local337) {
						arg1.method2791(-14);
					} catch (@Pc(343) IllegalArgumentException local343) {
						arg1.method2791(-15);
					} catch (@Pc(349) InvocationTargetException local349) {
						arg1.method2791(-16);
					} catch (@Pc(355) SecurityException local355) {
						arg1.method2791(-17);
					} catch (@Pc(361) IOException local361) {
						arg1.method2791(-18);
					} catch (@Pc(367) NullPointerException local367) {
						arg1.method2791(-19);
					} catch (@Pc(373) Exception local373) {
						arg1.method2791(-20);
					} catch (@Pc(379) Throwable local379) {
						arg1.method2791(-21);
					}
				} else {
					arg1.method2791(local17.anIntArray625[local105]);
				}
			}
			arg1.method2775(local98);
			arg1.method2771(arg1.anInt3121 - local98);
			local17.method5700();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!ck;I)Z")
	public static boolean method1893(@OriginalArg(1) Class3_Sub5_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method859(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (local8 == 0) {
			if (arg0.method859(1) != 0) {
				method1893(arg0, arg1);
			}
			local28 = arg0.method859(6);
			local33 = arg0.method859(6);
			@Pc(45) boolean local45 = arg0.method859(1) == 1;
			if (local45) {
				Static231.anIntArray441[Static20.anInt242++] = arg1;
			}
			if (Static308.aClass28_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(72) Class28_Sub1_Sub1_Sub2 local72 = Static308.aClass28_Sub1_Sub1_Sub2Array1[arg1] = new Class28_Sub1_Sub1_Sub2();
			local72.anInt4373 = arg1;
			if (Static192.aClass3_Sub5Array1[arg1] != null) {
				local72.method4030(Static192.aClass3_Sub5Array1[arg1]);
			}
			local72.method4005(Static186.anIntArray372[arg1]);
			local72.anInt4347 = Static109.anIntArray212[arg1];
			local100 = Static166.anIntArray674[arg1];
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			local114 = local100 & 0xFF;
			local72.aByteArray56[0] = Static338.aByteArray81[arg1];
			local72.aByte73 = (byte) local104;
			local72.method4023(local33 + (local114 << 6) - Static103.anInt2044, -Static21.anInt265 + (local110 << 6) + local28);
			local72.aBoolean343 = false;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method859(2);
			local33 = Static166.anIntArray674[arg1];
			Static166.anIntArray674[arg1] = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(198) int local198;
			@Pc(202) int local202;
			if (local8 != 2) {
				local28 = arg0.method859(18);
				local33 = local28 >> 16;
				local198 = local28 >> 8 & 0xFF;
				local202 = local28 & 0xFF;
				local100 = Static166.anIntArray674[arg1];
				local104 = local33 + (local100 >> 28) & 0x3;
				local110 = local198 + (local100 >> 14) & 0xFF;
				local114 = local100 + local202 & 0xFF;
				Static166.anIntArray674[arg1] = (local104 << 28) - (-(local110 << 14) - local114);
				return false;
			}
			local28 = arg0.method859(5);
			local33 = local28 >> 3;
			local198 = local28 & 0x7;
			local202 = Static166.anIntArray674[arg1];
			local100 = local33 + (local202 >> 28) & 0x3;
			local104 = local202 >> 14 & 0xFF;
			local110 = local202 & 0xFF;
			if (local198 == 0) {
				local110--;
				local104--;
			}
			if (local198 == 1) {
				local110--;
			}
			if (local198 == 2) {
				local104++;
				local110--;
			}
			if (local198 == 3) {
				local104--;
			}
			if (local198 == 4) {
				local104++;
			}
			if (local198 == 5) {
				local104--;
				local110++;
			}
			if (local198 == 6) {
				local110++;
			}
			if (local198 == 7) {
				local110++;
				local104++;
			}
			Static166.anIntArray674[arg1] = local110 + (local104 << 14) + (local100 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static212.method3305(arg4)) {
			return;
		}
		if (Static181.aClass62ArrayArray1[arg4] == null) {
			Static48.method912(Static375.aClass62ArrayArray2[arg4], -1, arg2, arg8, arg0, arg7, arg5, arg3, arg1, arg6);
		} else {
			Static48.method912(Static181.aClass62ArrayArray1[arg4], -1, arg2, arg8, arg0, arg7, arg5, arg3, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
	public static int method1895(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
