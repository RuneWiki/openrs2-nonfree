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

public final class Static19 {

	@OriginalMember(owner = "client!aka", name = "t", descriptor = "Lclient!cr;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!aka", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!tia;Z)V")
	public static void method273(@OriginalArg(0) Class5_Sub41_Sub2 arg0) {
		@Pc(10) Class5_Sub12 local10 = (Class5_Sub12) Static475.aClass114_56.method2805();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt1099; local17++) {
			if (local10.aClass331Array2[local17] != null) {
				if (local10.aClass331Array2[local17].anInt9108 == 2) {
					local10.anIntArray60[local17] = -5;
				}
				if (local10.aClass331Array2[local17].anInt9108 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass331Array1[local17] != null) {
				if (local10.aClass331Array1[local17].anInt9108 == 2) {
					local10.anIntArray60[local17] = -6;
				}
				if (local10.aClass331Array1[local17].anInt9108 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(92) int local92 = arg0.anInt9230;
		arg0.method7803(local10.anInt1097);
		for (@Pc(99) int local99 = 0; local99 < local10.anInt1099; local99++) {
			if (local10.anIntArray60[local99] == 0) {
				try {
					@Pc(123) int local123 = local10.anIntArray63[local99];
					@Pc(137) Field local137;
					@Pc(165) int local165;
					if (local123 == 0) {
						local137 = (Field) local10.aClass331Array2[local99].anObject20;
						local165 = local137.getInt((Object) null);
						arg0.method7798(0);
						arg0.method7803(local165);
					} else if (local123 == 1) {
						local137 = (Field) local10.aClass331Array2[local99].anObject20;
						local137.setInt((Object) null, local10.anIntArray61[local99]);
						arg0.method7798(0);
					} else if (local123 == 2) {
						local137 = (Field) local10.aClass331Array2[local99].anObject20;
						local165 = local137.getModifiers();
						arg0.method7798(0);
						arg0.method7803(local165);
					}
					@Pc(209) Method local209;
					if (local123 == 3) {
						local209 = (Method) local10.aClass331Array1[local99].anObject20;
						@Pc(234) byte[][] local234 = local10.aByteArrayArrayArray4[local99];
						@Pc(238) Object[] local238 = new Object[local234.length];
						for (@Pc(240) int local240 = 0; local240 < local234.length; local240++) {
							@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local234[local240]));
							local238[local240] = local252.readObject();
						}
						@Pc(267) Object local267 = local209.invoke((Object) null, local238);
						if (local267 == null) {
							arg0.method7798(0);
						} else if (local267 instanceof Number) {
							arg0.method7798(1);
							arg0.method7824(((Number) local267).longValue());
						} else if (local267 instanceof String) {
							arg0.method7798(2);
							arg0.method7854((String) local267);
						} else {
							arg0.method7798(4);
						}
					} else if (local123 == 4) {
						local209 = (Method) local10.aClass331Array1[local99].anObject20;
						local165 = local209.getModifiers();
						arg0.method7798(0);
						arg0.method7803(local165);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method7798(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method7798(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method7798(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method7798(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method7798(-14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method7798(-15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method7798(-16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method7798(-17);
				} catch (@Pc(358) IOException local358) {
					arg0.method7798(-18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method7798(-19);
				} catch (@Pc(370) Exception local370) {
					arg0.method7798(-20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method7798(-21);
				}
			} else {
				arg0.method7798(local10.anIntArray60[local99]);
			}
		}
		arg0.method7830(local92);
		local10.method9052();
	}
}
