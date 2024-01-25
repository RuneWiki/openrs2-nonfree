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

public final class Static279 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!hh;")
	public static Class109 aClass109_97;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray12 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
	public static final int[] anIntArray570 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qf;IZ)V")
	public static void method5835(@OriginalArg(0) Class1_Sub14_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) Class1_Sub39 local15 = (Class1_Sub39) Static50.aClass142_9.method3199();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt6555; local22++) {
				if (local15.aClass159Array2[local22] != null) {
					if (local15.aClass159Array2[local22].anInt4271 == 2) {
						local15.anIntArray481[local22] = -5;
					}
					if (local15.aClass159Array2[local22].anInt4271 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass159Array1[local22] != null) {
					if (local15.aClass159Array1[local22].anInt4271 == 2) {
						local15.anIntArray481[local22] = -6;
					}
					if (local15.aClass159Array1[local22].anInt4271 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method4562(arg1);
			arg0.method4553(0);
			@Pc(104) int local104 = arg0.anInt5695;
			arg0.method4522(local15.anInt6554);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt6555; local111++) {
				if (local15.anIntArray481[local111] == 0) {
					try {
						@Pc(132) int local132 = local15.anIntArray482[local111];
						@Pc(144) Field local144;
						@Pc(148) int local148;
						if (local132 == 0) {
							local144 = (Field) local15.aClass159Array2[local111].anObject8;
							local148 = local144.getInt(null);
							arg0.method4553(0);
							arg0.method4522(local148);
						} else if (local132 == 1) {
							local144 = (Field) local15.aClass159Array2[local111].anObject8;
							local144.setInt(null, local15.anIntArray480[local111]);
							arg0.method4553(0);
						} else if (local132 == 2) {
							local144 = (Field) local15.aClass159Array2[local111].anObject8;
							local148 = local144.getModifiers();
							arg0.method4553(0);
							arg0.method4522(local148);
						}
						@Pc(216) Method local216;
						if (local132 == 3) {
							local216 = (Method) local15.aClass159Array1[local111].anObject8;
							@Pc(221) byte[][] local221 = local15.aByteArrayArrayArray16[local111];
							@Pc(225) Object[] local225 = new Object[local221.length];
							for (@Pc(227) int local227 = 0; local227 < local221.length; local227++) {
								@Pc(239) ObjectInputStream local239 = new ObjectInputStream(new ByteArrayInputStream(local221[local227]));
								local225[local227] = local239.readObject();
							}
							@Pc(258) Object local258 = local216.invoke(null, local225);
							if (local258 == null) {
								arg0.method4553(0);
							} else if (local258 instanceof Number) {
								arg0.method4553(1);
								arg0.method4502(((Number) local258).longValue());
							} else if (local258 instanceof String) {
								arg0.method4553(2);
								arg0.method4512((String) local258);
							} else {
								arg0.method4553(4);
							}
						} else if (local132 == 4) {
							local216 = (Method) local15.aClass159Array1[local111].anObject8;
							local148 = local216.getModifiers();
							arg0.method4553(0);
							arg0.method4522(local148);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method4553(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method4553(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method4553(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method4553(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method4553(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method4553(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method4553(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method4553(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method4553(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method4553(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method4553(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method4553(-21);
					}
				} else {
					arg0.method4553(local15.anIntArray481[local111]);
				}
			}
			arg0.method4534(local104);
			arg0.method4527(arg0.anInt5695 - local104);
			local15.method5965();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public static int method5836(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qf;B)V")
	public static void method5851(@OriginalArg(0) Class1_Sub14_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method4567();
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static97.anInt1902; local12++) {
			local18 = Static105.anIntArray107[local12];
			if ((Static32.aByteArray2[local18] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static32.aByteArray2[local18] = (byte) (Static32.aByteArray2[local18] | 0x2);
				} else {
					local46 = arg0.method4557(1);
					if (local46 == 0) {
						local7 = Static113.method1793(arg0);
						Static32.aByteArray2[local18] = (byte) (Static32.aByteArray2[local18] | 0x2);
					} else {
						Static327.method4735(local18, arg0);
					}
				}
			}
		}
		arg0.method4559();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method4567();
		@Pc(133) int local133;
		for (local18 = 0; local18 < Static97.anInt1902; local18++) {
			local46 = Static105.anIntArray107[local18];
			if ((Static32.aByteArray2[local46] & 0x1) != 0) {
				if (local7 > 0) {
					Static32.aByteArray2[local46] = (byte) (Static32.aByteArray2[local46] | 0x2);
					local7--;
				} else {
					local133 = arg0.method4557(1);
					if (local133 == 0) {
						local7 = Static113.method1793(arg0);
						Static32.aByteArray2[local46] = (byte) (Static32.aByteArray2[local46] | 0x2);
					} else {
						Static327.method4735(local46, arg0);
					}
				}
			}
		}
		arg0.method4559();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method4567();
		@Pc(214) int local214;
		for (local46 = 0; local46 < Static323.anInt5633; local46++) {
			local133 = Static367.anIntArray495[local46];
			if ((Static32.aByteArray2[local133] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static32.aByteArray2[local133] = (byte) (Static32.aByteArray2[local133] | 0x2);
				} else {
					local214 = arg0.method4557(1);
					if (local214 == 0) {
						local7 = Static113.method1793(arg0);
						Static32.aByteArray2[local133] = (byte) (Static32.aByteArray2[local133] | 0x2);
					} else if (Static180.method3094(local133, arg0)) {
						Static32.aByteArray2[local133] = (byte) (Static32.aByteArray2[local133] | 0x2);
					}
				}
			}
		}
		arg0.method4559();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method4567();
		@Pc(288) int local288;
		for (local214 = 0; local214 < Static323.anInt5633; local214++) {
			local288 = Static367.anIntArray495[local214];
			if ((Static32.aByteArray2[local288] & 0x1) == 0) {
				if (local7 > 0) {
					Static32.aByteArray2[local288] = (byte) (Static32.aByteArray2[local288] | 0x2);
					local7--;
				} else {
					@Pc(316) int local316 = arg0.method4557(1);
					if (local316 == 0) {
						local7 = Static113.method1793(arg0);
						Static32.aByteArray2[local288] = (byte) (Static32.aByteArray2[local288] | 0x2);
					} else if (Static180.method3094(local288, arg0)) {
						Static32.aByteArray2[local288] = (byte) (Static32.aByteArray2[local288] | 0x2);
					}
				}
			}
		}
		arg0.method4559();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static97.anInt1902 = 0;
		Static323.anInt5633 = 0;
		for (local288 = 1; local288 < 2048; local288++) {
			Static32.aByteArray2[local288] = (byte) (Static32.aByteArray2[local288] >> 1);
			@Pc(388) Class47_Sub1_Sub5_Sub2 local388 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local288];
			if (local388 == null) {
				Static367.anIntArray495[Static323.anInt5633++] = local288;
			} else {
				Static105.anIntArray107[Static97.anInt1902++] = local288;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIII)V")
	public static void method5853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static190.method3007(arg1, 4);
		local12.method32();
		local12.anInt35 = arg0;
		local12.anInt32 = arg2;
		local12.anInt39 = arg3;
	}
}
