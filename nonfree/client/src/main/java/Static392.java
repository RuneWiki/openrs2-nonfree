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

public final class Static392 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_121 = new Class337(38, -2);

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_122 = new Class337(2, 0);

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_14 = new Class365(3, 2);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!gba;)V")
	public static void method5816(@OriginalArg(1) Class5_Sub22_Sub1 arg0) {
		@Pc(10) Class5_Sub9 local10 = (Class5_Sub9) Static360.aClass330_30.method7908();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(22) int local22 = 0; local22 < local10.anInt1146; local22++) {
			if (local10.aClass91Array1[local22] != null) {
				if (local10.aClass91Array1[local22].anInt2271 == 2) {
					local10.anIntArray78[local22] = -5;
				}
				if (local10.aClass91Array1[local22].anInt2271 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass91Array2[local22] != null) {
				if (local10.aClass91Array2[local22].anInt2271 == 2) {
					local10.anIntArray78[local22] = -6;
				}
				if (local10.aClass91Array2[local22].anInt2271 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(93) int local93 = arg0.anInt6629;
		arg0.method5949(local10.anInt1144);
		for (@Pc(100) int local100 = 0; local100 < local10.anInt1146; local100++) {
			if (local10.anIntArray78[local100] == 0) {
				try {
					@Pc(121) int local121 = local10.anIntArray77[local100];
					@Pc(130) Field local130;
					@Pc(134) int local134;
					if (local121 == 0) {
						local130 = (Field) local10.aClass91Array1[local100].anObject2;
						local134 = local130.getInt(null);
						arg0.method5905(0);
						arg0.method5949(local134);
					} else if (local121 == 1) {
						local130 = (Field) local10.aClass91Array1[local100].anObject2;
						local130.setInt(null, local10.anIntArray79[local100]);
						arg0.method5905(0);
					} else if (local121 == 2) {
						local130 = (Field) local10.aClass91Array1[local100].anObject2;
						local134 = local130.getModifiers();
						arg0.method5905(0);
						arg0.method5949(local134);
					}
					@Pc(202) Method local202;
					if (local121 == 3) {
						local202 = (Method) local10.aClass91Array2[local100].anObject2;
						@Pc(207) byte[][] local207 = local10.aByteArrayArrayArray1[local100];
						@Pc(211) Object[] local211 = new Object[local207.length];
						for (@Pc(213) int local213 = 0; local213 < local207.length; local213++) {
							@Pc(225) ObjectInputStream local225 = new ObjectInputStream(new ByteArrayInputStream(local207[local213]));
							local211[local213] = local225.readObject();
						}
						@Pc(244) Object local244 = local202.invoke(null, local211);
						if (local244 == null) {
							arg0.method5905(0);
						} else if (local244 instanceof Number) {
							arg0.method5905(1);
							arg0.method5943(((Number) local244).longValue());
						} else if (local244 instanceof String) {
							arg0.method5905(2);
							arg0.method5910((String) local244);
						} else {
							arg0.method5905(4);
						}
					} else if (local121 == 4) {
						local202 = (Method) local10.aClass91Array2[local100].anObject2;
						local134 = local202.getModifiers();
						arg0.method5905(0);
						arg0.method5949(local134);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method5905(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method5905(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method5905(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method5905(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method5905(-14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method5905(-15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method5905(-16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method5905(-17);
				} catch (@Pc(358) IOException local358) {
					arg0.method5905(-18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method5905(-19);
				} catch (@Pc(370) Exception local370) {
					arg0.method5905(-20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method5905(-21);
				}
			} else {
				arg0.method5905(local10.anIntArray78[local100]);
			}
		}
		arg0.method5960(local93);
		local10.method9047();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z[BII)Ljava/lang/String;")
	public static String method5817(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg2];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg2; local15++) {
			@Pc(24) int local24 = arg0[local15 + arg1] & 0xFF;
			if (local24 != 0) {
				if (local24 >= 128 && local24 < 160) {
					@Pc(40) char local40 = Static555.aCharArray6[local24 - 128];
					if (local40 == '\u0000') {
						local40 = '?';
					}
					local24 = local40;
				}
				local6[local13++] = (char) local24;
			}
		}
		return new String(local6, 0, local13);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public static void method5819() {
		Static550.aClass133_14.L(Static16.anInt250, Static97.aClass5_Sub25_8.aClass6_Sub2_1.method114() == 1 ? Static463.anInt7780 + 256 << 2 : -1, 0);
	}
}
