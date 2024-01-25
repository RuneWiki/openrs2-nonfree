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

public final class Static303 {

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray151;

	@OriginalMember(owner = "client!pg", name = "O", descriptor = "Lclient!bs;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
	public static int anInt5383 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BILclient!a;)V")
	public static void method4334(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1 arg1) {
		while (true) {
			@Pc(18) Class1_Sub34 local18 = (Class1_Sub34) Static152.aClass266_19.method6000();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt5002; local25++) {
				if (local18.aClass100Array1[local25] != null) {
					if (local18.aClass100Array1[local25].anInt2365 == 2) {
						local18.anIntArray404[local25] = -5;
					}
					if (local18.aClass100Array1[local25].anInt2365 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass100Array2[local25] != null) {
					if (local18.aClass100Array2[local25].anInt2365 == 2) {
						local18.anIntArray404[local25] = -6;
					}
					if (local18.aClass100Array2[local25].anInt2365 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg1.method149(arg0);
			arg1.method4115(0);
			@Pc(99) int local99 = arg1.anInt5056;
			arg1.method4105(local18.anInt5004);
			for (@Pc(106) int local106 = 0; local106 < local18.anInt5002; local106++) {
				if (local18.anIntArray404[local106] == 0) {
					try {
						@Pc(130) int local130 = local18.anIntArray403[local106];
						@Pc(142) Field local142;
						@Pc(168) int local168;
						if (local130 == 0) {
							local142 = (Field) local18.aClass100Array1[local106].anObject4;
							local168 = local142.getInt(null);
							arg1.method4115(0);
							arg1.method4105(local168);
						} else if (local130 == 1) {
							local142 = (Field) local18.aClass100Array1[local106].anObject4;
							local142.setInt(null, local18.anIntArray402[local106]);
							arg1.method4115(0);
						} else if (local130 == 2) {
							local142 = (Field) local18.aClass100Array1[local106].anObject4;
							local168 = local142.getModifiers();
							arg1.method4115(0);
							arg1.method4105(local168);
						}
						@Pc(212) Method local212;
						if (local130 == 3) {
							local212 = (Method) local18.aClass100Array2[local106].anObject4;
							@Pc(237) byte[][] local237 = local18.aByteArrayArrayArray16[local106];
							@Pc(241) Object[] local241 = new Object[local237.length];
							for (@Pc(243) int local243 = 0; local243 < local237.length; local243++) {
								@Pc(255) ObjectInputStream local255 = new ObjectInputStream(new ByteArrayInputStream(local237[local243]));
								local241[local243] = local255.readObject();
							}
							@Pc(270) Object local270 = local212.invoke(null, local241);
							if (local270 == null) {
								arg1.method4115(0);
							} else if (local270 instanceof Number) {
								arg1.method4115(1);
								arg1.method4107(((Number) local270).longValue());
							} else if (local270 instanceof String) {
								arg1.method4115(2);
								arg1.method4104((String) local270);
							} else {
								arg1.method4115(4);
							}
						} else if (local130 == 4) {
							local212 = (Method) local18.aClass100Array2[local106].anObject4;
							local168 = local212.getModifiers();
							arg1.method4115(0);
							arg1.method4105(local168);
						}
					} catch (@Pc(313) ClassNotFoundException local313) {
						arg1.method4115(-10);
					} catch (@Pc(319) InvalidClassException local319) {
						arg1.method4115(-11);
					} catch (@Pc(325) StreamCorruptedException local325) {
						arg1.method4115(-12);
					} catch (@Pc(331) OptionalDataException local331) {
						arg1.method4115(-13);
					} catch (@Pc(337) IllegalAccessException local337) {
						arg1.method4115(-14);
					} catch (@Pc(343) IllegalArgumentException local343) {
						arg1.method4115(-15);
					} catch (@Pc(349) InvocationTargetException local349) {
						arg1.method4115(-16);
					} catch (@Pc(355) SecurityException local355) {
						arg1.method4115(-17);
					} catch (@Pc(361) IOException local361) {
						arg1.method4115(-18);
					} catch (@Pc(367) NullPointerException local367) {
						arg1.method4115(-19);
					} catch (@Pc(373) Exception local373) {
						arg1.method4115(-20);
					} catch (@Pc(379) Throwable local379) {
						arg1.method4115(-21);
					}
				} else {
					arg1.method4115(local18.anIntArray404[local106]);
				}
			}
			arg1.method4135(local99);
			arg1.method4138(arg1.anInt5056 - local99);
			local18.method6071();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	public static void method4335() {
		if (Static304.anIntArray422 != null) {
			return;
		}
		Static304.anIntArray422 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(88) float local88 = local59 * (1.0F - local50);
				@Pc(96) float local96 = local59 * (1.0F - local82 * local50);
				@Pc(107) float local107 = (1.0F - (1.0F - local82) * local50) * local59;
				if (local76 == 0) {
					local61 = local59;
					local63 = local107;
					local65 = local88;
				} else if (local76 == 1) {
					local63 = local59;
					local61 = local96;
					local65 = local88;
				} else if (local76 == 2) {
					local61 = local88;
					local65 = local107;
					local63 = local59;
				} else if (local76 == 3) {
					local63 = local96;
					local61 = local88;
					local65 = local59;
				} else if (local76 == 4) {
					local61 = local107;
					local63 = local88;
					local65 = local59;
				} else if (local76 == 5) {
					local61 = local59;
					local63 = local88;
					local65 = local96;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(202) int local202 = (int) (local61 * 256.0F);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(224) int local224 = local212 + (local202 << 16) + (local207 << 8) - 16777216;
				Static304.anIntArray422[local26++] = local224;
			}
		}
	}
}
