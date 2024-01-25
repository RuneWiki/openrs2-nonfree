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

public final class Static224 {

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "Lclient!dfa;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!iea", name = "s", descriptor = "Lclient!tp;")
	public static Class331 aClass331_7 = null;

	@OriginalMember(owner = "client!iea", name = "v", descriptor = "I")
	public static int anInt5112 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!ig;)V")
	public static void method4177(@OriginalArg(1) Class8_Sub8 arg0) {
		if (arg0.aByteArray107.length - arg0.anInt10588 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method8525();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray107.length - arg0.anInt10588 < 2) {
			return;
		}
		@Pc(47) int local47 = arg0.method8578();
		if (arg0.aByteArray107.length - arg0.anInt10588 < local47 * 6) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < local47; local65++) {
			@Pc(73) int local73 = arg0.method8578();
			@Pc(79) int local79 = arg0.method8540();
			if (Static69.anIntArray417.length > local73 && Static378.aBooleanArray19[local73] && (Static420.aClass128_1.method3671(local73).aChar3 != '1' || local79 >= -1 && local79 <= 1)) {
				Static69.anIntArray417[local73] = local79;
			}
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!wp;I)V")
	public static void method4179(@OriginalArg(0) Class8_Sub8_Sub2 arg0) {
		@Pc(10) Class8_Sub6 local10 = (Class8_Sub6) Static572.aClass43_61.method1422();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt1476; local17++) {
			if (local10.aClass301Array1[local17] != null) {
				if (local10.aClass301Array1[local17].anInt8915 == 2) {
					local10.anIntArray55[local17] = -5;
				}
				if (local10.aClass301Array1[local17].anInt8915 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass301Array2[local17] != null) {
				if (local10.aClass301Array2[local17].anInt8915 == 2) {
					local10.anIntArray55[local17] = -6;
				}
				if (local10.aClass301Array2[local17].anInt8915 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(88) int local88 = arg0.anInt10588;
		arg0.method8523(local10.anInt1475);
		for (@Pc(95) int local95 = 0; local95 < local10.anInt1476; local95++) {
			if (local10.anIntArray55[local95] == 0) {
				try {
					@Pc(116) int local116 = local10.anIntArray56[local95];
					@Pc(133) Field local133;
					@Pc(159) int local159;
					if (local116 == 0) {
						local133 = (Field) local10.aClass301Array1[local95].anObject18;
						local159 = local133.getInt(null);
						arg0.method8562(0);
						arg0.method8523(local159);
					} else if (local116 == 1) {
						local133 = (Field) local10.aClass301Array1[local95].anObject18;
						local133.setInt(null, local10.anIntArray54[local95]);
						arg0.method8562(0);
					} else if (local116 == 2) {
						local133 = (Field) local10.aClass301Array1[local95].anObject18;
						local159 = local133.getModifiers();
						arg0.method8562(0);
						arg0.method8523(local159);
					}
					@Pc(203) Method local203;
					if (local116 == 3) {
						local203 = (Method) local10.aClass301Array2[local95].anObject18;
						@Pc(228) byte[][] local228 = local10.aByteArrayArrayArray8[local95];
						@Pc(232) Object[] local232 = new Object[local228.length];
						for (@Pc(234) int local234 = 0; local234 < local228.length; local234++) {
							@Pc(246) ObjectInputStream local246 = new ObjectInputStream(new ByteArrayInputStream(local228[local234]));
							local232[local234] = local246.readObject();
						}
						@Pc(261) Object local261 = local203.invoke(null, local232);
						if (local261 == null) {
							arg0.method8562(0);
						} else if (local261 instanceof Number) {
							arg0.method8562(1);
							arg0.method8564(((Number) local261).longValue());
						} else if (local261 instanceof String) {
							arg0.method8562(2);
							arg0.method8582((String) local261);
						} else {
							arg0.method8562(4);
						}
					} else if (local116 == 4) {
						local203 = (Method) local10.aClass301Array2[local95].anObject18;
						local159 = local203.getModifiers();
						arg0.method8562(0);
						arg0.method8523(local159);
					}
				} catch (@Pc(304) ClassNotFoundException local304) {
					arg0.method8562(-10);
				} catch (@Pc(310) InvalidClassException local310) {
					arg0.method8562(-11);
				} catch (@Pc(316) StreamCorruptedException local316) {
					arg0.method8562(-12);
				} catch (@Pc(322) OptionalDataException local322) {
					arg0.method8562(-13);
				} catch (@Pc(328) IllegalAccessException local328) {
					arg0.method8562(-14);
				} catch (@Pc(334) IllegalArgumentException local334) {
					arg0.method8562(-15);
				} catch (@Pc(340) InvocationTargetException local340) {
					arg0.method8562(-16);
				} catch (@Pc(346) SecurityException local346) {
					arg0.method8562(-17);
				} catch (@Pc(352) IOException local352) {
					arg0.method8562(-18);
				} catch (@Pc(358) NullPointerException local358) {
					arg0.method8562(-19);
				} catch (@Pc(364) Exception local364) {
					arg0.method8562(-20);
				} catch (@Pc(370) Throwable local370) {
					arg0.method8562(-21);
				}
			} else {
				arg0.method8562(local10.anIntArray55[local95]);
			}
		}
		arg0.method8531(local88);
		local10.method8640();
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	public static void method4185() {
		if (Static401.anInt7696 != -1) {
			Static252.method4539(-1, Static401.anInt7696, -1, false);
			Static401.anInt7696 = -1;
		}
	}
}
