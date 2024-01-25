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

public final class Static75 {

	@OriginalMember(owner = "client!cha", name = "f", descriptor = "[S")
	private static final short[] aShortArray6 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cha", name = "n", descriptor = "[S")
	private static final short[] aShortArray7 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!cha", name = "o", descriptor = "[S")
	public static final short[] aShortArray8 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!cha", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { aShortArray7, aShortArray8, aShortArray6 };

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(BZI)V")
	public static void method1101(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static348.method6679(arg0, Static49.aClass42_12.method730(Static259.anInt4113), arg1);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IZ)I")
	public static int method1102(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(50) double local50 = local12;
		if (local12 < local21) {
			local50 = local21;
		}
		if (local50 < local28) {
			local50 = local28;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local30 + local50) / 2.0D;
		if (local50 != local30) {
			if (local72 < 0.5D) {
				local66 = (local50 - local30) / (local30 + local50);
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local30) / (2.0D - local50 - local30);
			}
			if (local12 == local50) {
				local64 = (local21 - local28) / (local50 - local30);
			} else if (local21 == local50) {
				local64 = (local28 - local12) / (-local30 + local50) + 2.0D;
			} else if (local28 == local50) {
				local64 = (local12 - local21) / (-local30 + local50) + 4.0D;
			}
		}
		local64 /= 6.0D;
		@Pc(160) int local160 = (int) (local64 * 256.0D);
		@Pc(165) int local165 = (int) (local66 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		@Pc(185) int local185 = (int) (local72 * 256.0D);
		if (local185 < 0) {
			local185 = 0;
		} else if (local185 > 255) {
			local185 = 255;
		}
		if (local185 > 243) {
			local165 >>= 0x4;
		} else if (local185 > 217) {
			local165 >>= 0x3;
		} else if (local185 > 192) {
			local165 >>= 0x2;
		} else if (local185 > 179) {
			local165 >>= 0x1;
		}
		return (local185 >> 1) + (local165 >> 5 << 7) + ((local160 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!iw;I)V")
	public static void method1103(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		@Pc(10) Class5_Sub52 local10 = (Class5_Sub52) Static608.aClass124_98.method2572();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt9816; local17++) {
			if (local10.aClass297Array1[local17] != null) {
				if (local10.aClass297Array1[local17].anInt8459 == 2) {
					local10.anIntArray559[local17] = -5;
				}
				if (local10.aClass297Array1[local17].anInt8459 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass297Array2[local17] != null) {
				if (local10.aClass297Array2[local17].anInt8459 == 2) {
					local10.anIntArray559[local17] = -6;
				}
				if (local10.aClass297Array2[local17].anInt8459 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(92) int local92 = arg0.anInt4144;
		arg0.method3679(local10.anInt9815);
		for (@Pc(99) int local99 = 0; local99 < local10.anInt9816; local99++) {
			if (local10.anIntArray559[local99] == 0) {
				try {
					@Pc(120) int local120 = local10.anIntArray558[local99];
					@Pc(138) Field local138;
					@Pc(141) int local141;
					if (local120 == 0) {
						local138 = (Field) local10.aClass297Array1[local99].anObject15;
						local141 = local138.getInt((Object) null);
						arg0.method3651(0);
						arg0.method3679(local141);
					} else if (local120 == 1) {
						local138 = (Field) local10.aClass297Array1[local99].anObject15;
						local138.setInt((Object) null, local10.anIntArray560[local99]);
						arg0.method3651(0);
					} else if (local120 == 2) {
						local138 = (Field) local10.aClass297Array1[local99].anObject15;
						local141 = local138.getModifiers();
						arg0.method3651(0);
						arg0.method3679(local141);
					}
					@Pc(207) Method local207;
					if (local120 == 3) {
						local207 = (Method) local10.aClass297Array2[local99].anObject15;
						@Pc(232) byte[][] local232 = local10.aByteArrayArrayArray17[local99];
						@Pc(236) Object[] local236 = new Object[local232.length];
						for (@Pc(238) int local238 = 0; local238 < local232.length; local238++) {
							@Pc(250) ObjectInputStream local250 = new ObjectInputStream(new ByteArrayInputStream(local232[local238]));
							local236[local238] = local250.readObject();
						}
						@Pc(269) Object local269 = local207.invoke((Object) null, local236);
						if (local269 == null) {
							arg0.method3651(0);
						} else if (local269 instanceof Number) {
							arg0.method3651(1);
							arg0.method3648(((Number) local269).longValue());
						} else if (local269 instanceof String) {
							arg0.method3651(2);
							arg0.method3680((String) local269);
						} else {
							arg0.method3651(4);
						}
					} else if (local120 == 4) {
						local207 = (Method) local10.aClass297Array2[local99].anObject15;
						local141 = local207.getModifiers();
						arg0.method3651(0);
						arg0.method3679(local141);
					}
				} catch (@Pc(312) ClassNotFoundException local312) {
					arg0.method3651(-10);
				} catch (@Pc(318) InvalidClassException local318) {
					arg0.method3651(-11);
				} catch (@Pc(324) StreamCorruptedException local324) {
					arg0.method3651(-12);
				} catch (@Pc(330) OptionalDataException local330) {
					arg0.method3651(-13);
				} catch (@Pc(336) IllegalAccessException local336) {
					arg0.method3651(-14);
				} catch (@Pc(342) IllegalArgumentException local342) {
					arg0.method3651(-15);
				} catch (@Pc(348) InvocationTargetException local348) {
					arg0.method3651(-16);
				} catch (@Pc(354) SecurityException local354) {
					arg0.method3651(-17);
				} catch (@Pc(360) IOException local360) {
					arg0.method3651(-18);
				} catch (@Pc(366) NullPointerException local366) {
					arg0.method3651(-19);
				} catch (@Pc(372) Exception local372) {
					arg0.method3651(-20);
				} catch (@Pc(378) Throwable local378) {
					arg0.method3651(-21);
				}
			} else {
				arg0.method3651(local10.anIntArray559[local99]);
			}
		}
		arg0.method3695(local92);
		local10.method8829();
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class40 local13 = local7.aClass40_3; local13 != null; local13 = local13.aClass40_1) {
			@Pc(17) Class41_Sub1_Sub1 local17 = local13.aClass41_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort109 == arg1 && local17.aShort108 == arg2) {
				Static243.method3479(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILclient!rv;)V")
	public static void method1106(@OriginalArg(1) Class5_Sub15 arg0) {
		for (@Pc(1) int local1 = 0; local1 < Static236.anInt3827; local1++) {
			@Pc(6) int local6 = arg0.method3690();
			@Pc(10) int local10 = arg0.method3698();
			if (local10 == 65535) {
				local10 = -1;
			}
			if (Static166.aClass160_Sub1Array1[local6] != null) {
				Static166.aClass160_Sub1Array1[local6].anInt3879 = local10;
			}
		}
	}
}
