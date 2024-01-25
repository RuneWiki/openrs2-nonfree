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

public final class Static188 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
	public static int anInt3896;

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIZBI)V")
	public static void method3088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(18) long local18 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(24) Class4_Sub30 local24 = (Class4_Sub30) Static259.aClass221_16.method5075(local18);
		if (local24 == null) {
			local24 = new Class4_Sub30();
			Static259.aClass221_16.method5073(local24, local18);
		}
		if (local24.anIntArray329.length <= arg4) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray329.length; local52++) {
				local45[local52] = local24.anIntArray329[local52];
				local50[local52] = local24.anIntArray328[local52];
			}
			for (@Pc(82) int local82 = local24.anIntArray329.length; local82 < arg4; local82++) {
				local45[local82] = -1;
				local50[local82] = 0;
			}
			local24.anIntArray328 = local50;
			local24.anIntArray329 = local45;
		}
		local24.anIntArray329[arg4] = arg1;
		local24.anIntArray328[arg4] = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	public static void method3089() {
		Static343.anInt6623 = 0;
		@Pc(11) int local11 = Static549.aClass4_Sub13_Sub2_2.method7054();
		@Pc(15) int local15 = Static549.aClass4_Sub13_Sub2_2.method7005();
		@Pc(26) boolean local26 = Static549.aClass4_Sub13_Sub2_2.method6987() == 1;
		@Pc(30) int local30 = Static549.aClass4_Sub13_Sub2_2.method6995();
		Static325.method5024();
		Static278.method4469(local15);
		@Pc(43) int local43 = (Static488.anInt9250 - Static549.aClass4_Sub13_Sub2_2.anInt9170) / 16;
		Static366.anIntArrayArray36 = new int[local43][4];
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static366.anIntArrayArray36[local49][local53] = Static549.aClass4_Sub13_Sub2_2.method6990();
			}
		}
		Static72.aByteArrayArray7 = null;
		Static466.aByteArrayArray26 = new byte[local43][];
		Static238.anIntArray272 = null;
		Static286.aByteArrayArray21 = new byte[local43][];
		Static106.aByteArrayArray10 = new byte[local43][];
		Static322.anIntArray351 = new int[local43];
		Static470.anIntArray520 = new int[local43];
		Static33.aByteArrayArray1 = new byte[local43][];
		Static154.anIntArray163 = new int[local43];
		Static151.anIntArray158 = new int[local43];
		Static559.anIntArray589 = new int[local43];
		local43 = 0;
		for (local53 = (local11 - (Static338.anInt6508 >> 4)) / 8; local53 <= ((Static338.anInt6508 >> 4) + local11) / 8; local53++) {
			for (@Pc(133) int local133 = (local30 - (Static390.anInt7654 >> 4)) / 8; local133 <= (local30 + (Static390.anInt7654 >> 4)) / 8; local133++) {
				Static322.anIntArray351[local43] = (local53 << 8) + local133;
				Static151.anIntArray158[local43] = Static46.aClass348_22.method7966("m" + local53 + "_" + local133);
				Static154.anIntArray163[local43] = Static46.aClass348_22.method7966("l" + local53 + "_" + local133);
				Static559.anIntArray589[local43] = Static46.aClass348_22.method7966("um" + local53 + "_" + local133);
				Static470.anIntArray520[local43] = Static46.aClass348_22.method7966("ul" + local53 + "_" + local133);
				local43++;
			}
		}
		Static564.method7994(11, local26, local30, local11);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)Z")
	public static boolean method3091(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!sj;)V")
	public static void method3092(@OriginalArg(1) Class4_Sub13_Sub2 arg0) {
		@Pc(10) Class4_Sub10 local10 = (Class4_Sub10) Static438.aClass22_55.method895();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt2313; local17++) {
			if (local10.aClass316Array2[local17] != null) {
				if (local10.aClass316Array2[local17].anInt9478 == 2) {
					local10.anIntArray111[local17] = -5;
				}
				if (local10.aClass316Array2[local17].anInt9478 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass316Array1[local17] != null) {
				if (local10.aClass316Array1[local17].anInt9478 == 2) {
					local10.anIntArray111[local17] = -6;
				}
				if (local10.aClass316Array1[local17].anInt9478 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(87) int local87 = arg0.anInt9170;
		arg0.method7032(local10.anInt2312);
		for (@Pc(99) int local99 = 0; local99 < local10.anInt2313; local99++) {
			if (local10.anIntArray111[local99] == 0) {
				try {
					@Pc(123) int local123 = local10.anIntArray112[local99];
					@Pc(140) Field local140;
					@Pc(143) int local143;
					if (local123 == 0) {
						local140 = (Field) local10.aClass316Array2[local99].anObject136;
						local143 = local140.getInt(null);
						arg0.method7052(0);
						arg0.method7032(local143);
					} else if (local123 == 1) {
						local140 = (Field) local10.aClass316Array2[local99].anObject136;
						local140.setInt(null, local10.anIntArray110[local99]);
						arg0.method7052(0);
					} else if (local123 == 2) {
						local140 = (Field) local10.aClass316Array2[local99].anObject136;
						local143 = local140.getModifiers();
						arg0.method7052(0);
						arg0.method7032(local143);
					}
					@Pc(202) Method local202;
					if (local123 == 3) {
						local202 = (Method) local10.aClass316Array1[local99].anObject136;
						@Pc(207) byte[][] local207 = local10.aByteArrayArrayArray1[local99];
						@Pc(211) Object[] local211 = new Object[local207.length];
						for (@Pc(213) int local213 = 0; local213 < local207.length; local213++) {
							@Pc(225) ObjectInputStream local225 = new ObjectInputStream(new ByteArrayInputStream(local207[local213]));
							local211[local213] = local225.readObject();
						}
						@Pc(240) Object local240 = local202.invoke(null, local211);
						if (local240 == null) {
							arg0.method7052(0);
						} else if (local240 instanceof Number) {
							arg0.method7052(1);
							arg0.method7020(((Number) local240).longValue());
						} else if (local240 instanceof String) {
							arg0.method7052(2);
							arg0.method7002((String) local240);
						} else {
							arg0.method7052(4);
						}
					} else if (local123 == 4) {
						local202 = (Method) local10.aClass316Array1[local99].anObject136;
						local143 = local202.getModifiers();
						arg0.method7052(0);
						arg0.method7032(local143);
					}
				} catch (@Pc(306) ClassNotFoundException local306) {
					arg0.method7052(-10);
				} catch (@Pc(312) InvalidClassException local312) {
					arg0.method7052(-11);
				} catch (@Pc(318) StreamCorruptedException local318) {
					arg0.method7052(-12);
				} catch (@Pc(324) OptionalDataException local324) {
					arg0.method7052(-13);
				} catch (@Pc(330) IllegalAccessException local330) {
					arg0.method7052(-14);
				} catch (@Pc(336) IllegalArgumentException local336) {
					arg0.method7052(-15);
				} catch (@Pc(342) InvocationTargetException local342) {
					arg0.method7052(-16);
				} catch (@Pc(348) SecurityException local348) {
					arg0.method7052(-17);
				} catch (@Pc(354) IOException local354) {
					arg0.method7052(-18);
				} catch (@Pc(360) NullPointerException local360) {
					arg0.method7052(-19);
				} catch (@Pc(366) Exception local366) {
					arg0.method7052(-20);
				} catch (@Pc(372) Throwable local372) {
					arg0.method7052(-21);
				}
			} else {
				arg0.method7052(local10.anIntArray111[local99]);
			}
		}
		arg0.method7039(local87);
		local10.method8193();
	}

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "(II)V")
	public static void method3094() {
		Static158.aClass167_9.method3964(50);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3095(@OriginalArg(0) String arg0) {
		return Static331.method7986(ofa.class, arg0);
	}
}
