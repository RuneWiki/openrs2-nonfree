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

public final class Static262 {

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!sg;")
	public static Class5_Sub5_Sub19 aClass5_Sub5_Sub19_4;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Lclient!da;")
	public static Class80 aClass80_9;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "[F")
	public static float[] aFloatArray90 = new float[4];

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(II)V")
	public static void method7568(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub5_Sub6 local16 = Static478.method6972((long) arg0, 9);
		local16.method2686();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ha;IIIII)Lclient!ka;")
	public static Class164 method7570(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20 = (long) arg4;
		@Pc(26) Class164 local26 = (Class164) Static405.aClass391_35.method9275(local20);
		if (local26 == null) {
			@Pc(36) Class192 local36 = Static213.method3061(Static635.aClass208_143, arg4);
			if (local36 == null) {
				return null;
			}
			if (local36.anInt5087 < 13) {
				local36.method4319();
			}
			local26 = arg1.method7700(local36, 2055, Static411.anInt7153, 64, 768);
			Static405.aClass391_35.method9273(local20, local26, 1);
		}
		local26 = local26.method9072((byte) 2, 2055, true);
		if (arg2 != 0) {
			local26.a(arg2);
		}
		if (arg0 != 0) {
			local26.FA(arg0);
		}
		if (arg5 != 0) {
			local26.VA(arg5);
		}
		if (arg3 != 0) {
			local26.H(0, arg3, 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method7571(@OriginalArg(1) Class5_Sub23_Sub2 arg0) {
		@Pc(10) Class5_Sub32 local10 = (Class5_Sub32) Static608.aClass102_71.method1916();
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local10.anInt5872; local18++) {
			if (local10.aClass366Array2[local18] != null) {
				if (local10.aClass366Array2[local18].anInt10206 == 2) {
					local10.anIntArray327[local18] = -5;
				}
				if (local10.aClass366Array2[local18].anInt10206 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass366Array1[local18] != null) {
				if (local10.aClass366Array1[local18].anInt10206 == 2) {
					local10.anIntArray327[local18] = -6;
				}
				if (local10.aClass366Array1[local18].anInt10206 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(101) int local101 = arg0.anInt9869;
		arg0.method8486(local10.anInt5871);
		for (@Pc(108) int local108 = 0; local108 < local10.anInt5872; local108++) {
			if (local10.anIntArray327[local108] == 0) {
				try {
					@Pc(133) int local133 = local10.anIntArray326[local108];
					@Pc(142) Field local142;
					@Pc(146) int local146;
					if (local133 == 0) {
						local142 = (Field) local10.aClass366Array2[local108].anObject18;
						local146 = local142.getInt((Object) null);
						arg0.method8502(0);
						arg0.method8486(local146);
					} else if (local133 == 1) {
						local142 = (Field) local10.aClass366Array2[local108].anObject18;
						local142.setInt((Object) null, local10.anIntArray325[local108]);
						arg0.method8502(0);
					} else if (local133 == 2) {
						local142 = (Field) local10.aClass366Array2[local108].anObject18;
						local146 = local142.getModifiers();
						arg0.method8502(0);
						arg0.method8486(local146);
					}
					@Pc(221) Method local221;
					if (local133 == 3) {
						local221 = (Method) local10.aClass366Array1[local108].anObject18;
						@Pc(246) byte[][] local246 = local10.aByteArrayArrayArray16[local108];
						@Pc(250) Object[] local250 = new Object[local246.length];
						for (@Pc(252) int local252 = 0; local252 < local246.length; local252++) {
							@Pc(264) ObjectInputStream local264 = new ObjectInputStream(new ByteArrayInputStream(local246[local252]));
							local250[local252] = local264.readObject();
						}
						@Pc(279) Object local279 = local221.invoke((Object) null, local250);
						if (local279 == null) {
							arg0.method8502(0);
						} else if (local279 instanceof Number) {
							arg0.method8502(1);
							arg0.method8517(((Number) local279).longValue());
						} else if (local279 instanceof String) {
							arg0.method8502(2);
							arg0.method8538((String) local279);
						} else {
							arg0.method8502(4);
						}
					} else if (local133 == 4) {
						local221 = (Method) local10.aClass366Array1[local108].anObject18;
						local146 = local221.getModifiers();
						arg0.method8502(0);
						arg0.method8486(local146);
					}
				} catch (@Pc(332) ClassNotFoundException local332) {
					arg0.method8502(-10);
				} catch (@Pc(338) InvalidClassException local338) {
					arg0.method8502(-11);
				} catch (@Pc(344) StreamCorruptedException local344) {
					arg0.method8502(-12);
				} catch (@Pc(350) OptionalDataException local350) {
					arg0.method8502(-13);
				} catch (@Pc(356) IllegalAccessException local356) {
					arg0.method8502(-14);
				} catch (@Pc(362) IllegalArgumentException local362) {
					arg0.method8502(-15);
				} catch (@Pc(368) InvocationTargetException local368) {
					arg0.method8502(-16);
				} catch (@Pc(374) SecurityException local374) {
					arg0.method8502(-17);
				} catch (@Pc(380) IOException local380) {
					arg0.method8502(-18);
				} catch (@Pc(386) NullPointerException local386) {
					arg0.method8502(-19);
				} catch (@Pc(392) Exception local392) {
					arg0.method8502(-20);
				} catch (@Pc(398) Throwable local398) {
					arg0.method8502(-21);
				}
			} else {
				arg0.method8502(local10.anIntArray327[local108]);
			}
		}
		arg0.method8485(local101);
		local10.method9327(1);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIILclient!hs;ILclient!ka;IIIILclient!ha;III)Lclient!ka;")
	public static Class164 method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class164 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class57 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg5 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg3 != null) {
			local12 = arg3.method3393(arg13 - 1149679514, -1, arg1, false) | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(51) long local51 = ((long) arg6 << 32) + (long) ((arg2 << 24) + (arg9 << 16) + arg4) + ((long) arg12 << 48);
		@Pc(53) Class391 local53 = Static108.aClass391_10;
		@Pc(61) Class164 local61;
		synchronized (Static108.aClass391_10) {
			local61 = (Class164) Static108.aClass391_10.method9275(local51);
			if (arg13 != -19478) {
				aFloatArray90 = null;
			}
		}
		if (local61 == null || arg10.method7670(local61.ua(), local12) != 0) {
			if (local61 != null) {
				local12 = arg10.method7661(local12, local61.ua());
			}
			@Pc(99) byte local99;
			if (arg4 == 1) {
				local99 = 9;
			} else if (arg4 == 2) {
				local99 = 12;
			} else if (arg4 == 3) {
				local99 = 15;
			} else if (arg4 == 4) {
				local99 = 18;
			} else {
				local99 = 21;
			}
			@Pc(137) int[] local137 = new int[] { 64, 96, 128 };
			@Pc(156) Class192 local156 = new Class192(local99 * 3 + 1, -local99 + local99 * 3 * 2, 0);
			@Pc(163) int local163 = local156.method4322(0, 0, 0);
			@Pc(167) int[][] local167 = new int[3][local99];
			@Pc(175) int local175;
			@Pc(179) int local179;
			@Pc(181) int local181;
			@Pc(205) int local205;
			for (@Pc(169) int local169 = 0; local169 < 3; local169++) {
				local175 = local137[local169];
				local179 = local137[local169];
				for (local181 = 0; local181 < local99; local181++) {
					@Pc(189) int local189 = (local181 << 14) / local99;
					@Pc(197) int local197 = local175 * Class5_Sub12.anIntArray544[local189] >> 14;
					local205 = local179 * Class5_Sub12.anIntArray543[local189] >> 14;
					local167[local169][local181] = local156.method4322(0, local205, local197);
				}
			}
			for (local175 = 0; local175 < 3; local175++) {
				local179 = (local175 * 256 + 128) / 3;
				local181 = 256 - local179;
				@Pc(255) byte local255 = (byte) (arg9 * local181 + arg2 * local179 >> 8);
				@Pc(300) short local300 = (short) (((arg12 & 0x7F) * local179 + local181 * (arg6 & 0x7F) & 0x7F00) + ((arg12 & 0x380) * local179 + local181 * (arg6 & 0x380) & 0x38000) + ((arg6 & 0xFC00) * local181 + local179 * (arg12 & 0xFC00) & 0xFC0000) >> 8);
				for (local205 = 0; local205 < local99; local205++) {
					if (local175 == 0) {
						local156.method4327(local255, (byte) -1, (byte) 1, local300, local163, (short) -1, local167[0][local205], local167[0][(local205 + 1) % local99]);
					} else {
						local156.method4327(local255, (byte) -1, (byte) 1, local300, local167[local175 - 1][local205], (short) -1, local167[local175][(local205 + 1) % local99], local167[local175 - 1][(local205 + 1) % local99]);
						local156.method4327(local255, (byte) -1, (byte) 1, local300, local167[local175 - 1][local205], (short) -1, local167[local175][local205], local167[local175][(local205 + 1) % local99]);
					}
				}
			}
			local61 = arg10.method7700(local156, local12, Static494.anInt8259, 64, 768);
			@Pc(431) Class391 local431 = Static108.aClass391_10;
			synchronized (Static108.aClass391_10) {
				Static108.aClass391_10.method9273(local51, local61, 1);
			}
		}
		@Pc(447) int local447 = arg5.V();
		@Pc(450) int local450 = arg5.RA();
		@Pc(453) int local453 = arg5.HA();
		@Pc(456) int local456 = arg5.G();
		@Pc(458) Class5_Sub5_Sub15 local458 = null;
		if (arg3 != null) {
			@Pc(465) int local465 = arg3.anIntArray226[arg1];
			local458 = Static158.aClass317_1.method7883(local465 >> 16, arg13 ^ 0xFFFFB3AA);
			arg1 = local465 & 0xFFFF;
		}
		if (local458 == null) {
			local61 = local61.method9072((byte) 3, local12, true);
			local61.O(local450 - local447 >> 1, 128, local456 - local453 >> 1);
			local61.H(local450 + local447 >> 1, 0, local453 + local456 >> 1);
		} else {
			local61 = local61.method9072((byte) 3, local12, true);
			local61.O(local450 - local447 >> 1, 128, local456 - local453 >> 1);
			local61.H(local450 + local447 >> 1, 0, local456 + local453 >> 1);
			local61.method9075(arg1, local458);
		}
		if (arg8 != 0) {
			local61.FA(arg8);
		}
		if (arg11 != 0) {
			local61.VA(arg11);
		}
		if (arg7 != 0) {
			local61.H(0, arg7, 0);
		}
		return local61;
	}
}
