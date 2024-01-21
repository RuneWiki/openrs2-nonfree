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

public final class Static166 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!td;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "[I")
	public static int[] anIntArray382 = new int[50];

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1957 = Static122.method531("Prepared visibility map");

	@OriginalMember(owner = "client!v", name = "g", descriptor = "[I")
	public static int[] anIntArray383 = new int[4000];

	@OriginalMember(owner = "client!v", name = "u", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1958 = aClass73_1957;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	public static int anInt3619 = 0;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[104][104];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!f;ZLclient!f;B)Lclient!nc;")
	public static Class3_Sub1_Sub14 method2606(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(20) int[] local20 = arg1.method345(arg0);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(32) byte[] local32 = arg1.method361(local20[local22], arg0);
			if (local32 == null) {
				local15 = false;
			} else {
				@Pc(52) int local52 = local32[1] & 0xFF | (local32[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg2.method361(0, local52);
				if (local60 == null) {
					local15 = false;
				}
			}
		}
		if (!local15) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub14(arg1, arg2, arg0, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[BII)Z")
	public static boolean method2607(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub12 local6 = new Class3_Sub12(arg1);
		@Pc(8) boolean local8 = true;
		@Pc(10) int local10 = -1;
		label56: while (true) {
			@Pc(19) int local19 = local6.method1379();
			if (local19 == 0) {
				return local8;
			}
			local10 += local19;
			@Pc(30) int local30 = 0;
			@Pc(32) boolean local32 = false;
			while (true) {
				@Pc(38) int local38;
				while (!local32) {
					local38 = local6.method1379();
					if (local38 == 0) {
						continue label56;
					}
					local30 += local38 - 1;
					@Pc(65) int local65 = local30 & 0x3F;
					@Pc(71) int local71 = local30 >> 6 & 0x3F;
					@Pc(75) int local75 = arg2 + local71;
					@Pc(81) int local81 = local6.method1354() >> 2;
					@Pc(85) int local85 = arg0 + local65;
					if (local75 > 0 && local85 > 0 && local75 < 103 && local85 < 103) {
						@Pc(102) Class3_Sub1_Sub15 local102 = Static151.method2466(local10);
						if (local81 != 22 || !Static85.aBoolean127 || local102.anInt3017 != 0 || local102.anInt3008 == 1 || local102.aBoolean200) {
							if (!local102.method2189()) {
								local8 = false;
								Static9.anInt267++;
							}
							local32 = true;
						}
					}
				}
				local38 = local6.method1379();
				if (local38 == 0) {
					break;
				}
				local6.method1354();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
	public static void method2609(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static162.method2568(arg0 - 1L);
			Static162.method2568(1L);
		} else {
			Static162.method2568(arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method2610() {
		aClass76_1 = null;
		anIntArrayArray37 = null;
		anIntArray382 = null;
		aClass73_1957 = null;
		aClass73_1958 = null;
		anIntArray383 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!vd;)Lclient!vd;")
	public static Class83 method2618(@OriginalArg(1) Class83 arg0) {
		@Pc(20) int local20 = Static22.method470(Static127.method484(arg0));
		if (local20 == 0) {
			return null;
		}
		for (@Pc(26) int local26 = 0; local26 < local20; local26++) {
			arg0 = Static80.method1396(arg0.anInt3702);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!k;Z)V")
	public static void method2620(@OriginalArg(1) Class3_Sub12_Sub1 arg0) {
		while (true) {
			@Pc(15) Class3_Sub22 local15 = (Class3_Sub22) Static151.aClass72_46.method2401();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt3476; local22++) {
				if (local15.aClass29Array2[local22] != null) {
					if (local15.aClass29Array2[local22].anInt1375 == 2) {
						local15.anIntArray374[local22] = -5;
					}
					if (local15.aClass29Array2[local22].anInt1375 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass29Array1[local22] != null) {
					if (local15.aClass29Array1[local22].anInt1375 == 2) {
						local15.anIntArray374[local22] = -6;
					}
					if (local15.aClass29Array1[local22].anInt1375 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method1400(163);
			arg0.method1383(0);
			@Pc(104) int local104 = arg0.anInt1793;
			arg0.method1392(local15.anInt3478);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt3476; local111++) {
				if (local15.anIntArray374[local111] == 0) {
					try {
						@Pc(135) int local135 = local15.anIntArray375[local111];
						@Pc(150) Field local150;
						@Pc(178) int local178;
						if (local135 == 0) {
							local150 = (Field) local15.aClass29Array2[local111].anObject2;
							local178 = local150.getInt(null);
							arg0.method1383(0);
							arg0.method1392(local178);
						} else if (local135 == 1) {
							local150 = (Field) local15.aClass29Array2[local111].anObject2;
							local150.setInt(null, local15.anIntArray373[local111]);
							arg0.method1383(0);
						} else if (local135 == 2) {
							local150 = (Field) local15.aClass29Array2[local111].anObject2;
							local178 = local150.getModifiers();
							arg0.method1383(0);
							arg0.method1392(local178);
						}
						@Pc(219) Method local219;
						if (local135 == 3) {
							local219 = (Method) local15.aClass29Array1[local111].anObject2;
							@Pc(224) byte[][] local224 = local15.aByteArrayArrayArray7[local111];
							@Pc(228) Object[] local228 = new Object[local224.length];
							for (@Pc(230) int local230 = 0; local230 < local224.length; local230++) {
								@Pc(242) ObjectInputStream local242 = new ObjectInputStream(new ByteArrayInputStream(local224[local230]));
								local228[local230] = local242.readObject();
							}
							@Pc(257) Object local257 = local219.invoke(null, local228);
							if (local257 == null) {
								arg0.method1383(0);
							} else if (local257 instanceof Number) {
								arg0.method1383(1);
								arg0.method1382(((Number) local257).longValue());
							} else if (local257 instanceof Class73) {
								arg0.method1383(2);
								arg0.method1350((Class73) local257);
							} else {
								arg0.method1383(4);
							}
						} else if (local135 == 4) {
							local219 = (Method) local15.aClass29Array1[local111].anObject2;
							local178 = local219.getModifiers();
							arg0.method1383(0);
							arg0.method1392(local178);
						}
					} catch (@Pc(325) ClassNotFoundException local325) {
						arg0.method1383(-10);
					} catch (@Pc(331) InvalidClassException local331) {
						arg0.method1383(-11);
					} catch (@Pc(337) StreamCorruptedException local337) {
						arg0.method1383(-12);
					} catch (@Pc(343) OptionalDataException local343) {
						arg0.method1383(-13);
					} catch (@Pc(349) IllegalAccessException local349) {
						arg0.method1383(-14);
					} catch (@Pc(355) IllegalArgumentException local355) {
						arg0.method1383(-15);
					} catch (@Pc(361) InvocationTargetException local361) {
						arg0.method1383(-16);
					} catch (@Pc(367) SecurityException local367) {
						arg0.method1383(-17);
					} catch (@Pc(373) IOException local373) {
						arg0.method1383(-18);
					} catch (@Pc(379) NullPointerException local379) {
						arg0.method1383(-19);
					} catch (@Pc(385) Exception local385) {
						arg0.method1383(-20);
					} catch (@Pc(391) Throwable local391) {
						arg0.method1383(-21);
					}
				} else {
					arg0.method1383(local15.anIntArray374[local111]);
				}
			}
			arg0.method1389(local104);
			arg0.method1362(arg0.anInt1793 - local104);
			local15.method2783();
		}
	}
}
