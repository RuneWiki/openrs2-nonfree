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

public final class Static383 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!wn;I)V")
	public static void method5124(@OriginalArg(0) Class2_Sub22_Sub2 arg0) {
		@Pc(10) Class2_Sub17 local10 = (Class2_Sub17) Static568.aClass109_66.method2325();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt3528; local17++) {
			if (local10.aClass108Array2[local17] != null) {
				if (local10.aClass108Array2[local17].anInt2766 == 2) {
					local10.anIntArray234[local17] = -5;
				}
				if (local10.aClass108Array2[local17].anInt2766 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass108Array1[local17] != null) {
				if (local10.aClass108Array1[local17].anInt2766 == 2) {
					local10.anIntArray234[local17] = -6;
				}
				if (local10.aClass108Array1[local17].anInt2766 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(86) int local86 = arg0.anInt10247;
		arg0.method8552(local10.anInt3529);
		for (@Pc(93) int local93 = 0; local93 < local10.anInt3528; local93++) {
			if (local10.anIntArray234[local93] == 0) {
				try {
					@Pc(114) int local114 = local10.anIntArray235[local93];
					@Pc(126) Field local126;
					@Pc(130) int local130;
					if (local114 == 0) {
						local126 = (Field) local10.aClass108Array2[local93].anObject6;
						local130 = local126.getInt(null);
						arg0.method8537(0);
						arg0.method8552(local130);
					} else if (local114 == 1) {
						local126 = (Field) local10.aClass108Array2[local93].anObject6;
						local126.setInt(null, local10.anIntArray233[local93]);
						arg0.method8537(0);
					} else if (local114 == 2) {
						local126 = (Field) local10.aClass108Array2[local93].anObject6;
						local130 = local126.getModifiers();
						arg0.method8537(0);
						arg0.method8552(local130);
					}
					@Pc(203) Method local203;
					if (local114 == 3) {
						local203 = (Method) local10.aClass108Array1[local93].anObject6;
						@Pc(228) byte[][] local228 = local10.aByteArrayArrayArray6[local93];
						@Pc(232) Object[] local232 = new Object[local228.length];
						for (@Pc(234) int local234 = 0; local234 < local228.length; local234++) {
							@Pc(246) ObjectInputStream local246 = new ObjectInputStream(new ByteArrayInputStream(local228[local234]));
							local232[local234] = local246.readObject();
						}
						@Pc(261) Object local261 = local203.invoke(null, local232);
						if (local261 == null) {
							arg0.method8537(0);
						} else if (local261 instanceof Number) {
							arg0.method8537(1);
							arg0.method8509(((Number) local261).longValue());
						} else if (local261 instanceof String) {
							arg0.method8537(2);
							arg0.method8540((String) local261);
						} else {
							arg0.method8537(4);
						}
					} else if (local114 == 4) {
						local203 = (Method) local10.aClass108Array1[local93].anObject6;
						local130 = local203.getModifiers();
						arg0.method8537(0);
						arg0.method8552(local130);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method8537(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method8537(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method8537(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method8537(-13);
				} catch (@Pc(336) IllegalAccessException local336) {
					arg0.method8537(-14);
				} catch (@Pc(344) IllegalArgumentException local344) {
					arg0.method8537(-15);
				} catch (@Pc(350) InvocationTargetException local350) {
					arg0.method8537(-16);
				} catch (@Pc(356) SecurityException local356) {
					arg0.method8537(-17);
				} catch (@Pc(362) IOException local362) {
					arg0.method8537(-18);
				} catch (@Pc(368) NullPointerException local368) {
					arg0.method8537(-19);
				} catch (@Pc(376) Exception local376) {
					arg0.method8537(-20);
				} catch (@Pc(384) Throwable local384) {
					arg0.method8537(-21);
				}
			} else {
				arg0.method8537(local10.anIntArray234[local93]);
			}
		}
		arg0.method8530(local86);
		local10.method8653();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public static void method5125() {
		if (Static192.aClass95_4 == null) {
			return;
		}
		if (Static319.aBoolean356) {
			Static173.method8450();
		}
		Static219.aClass94_4.method1859();
		Static537.method7410();
		Static174.method2588();
		Static352.method4709();
		Static518.method7246();
		Static419.method5603();
		if (Static382.aClass160_1 != null) {
			Static382.aClass160_1.method3436();
		}
		Static478.method8274();
		Static88.method1312();
		Static247.method3408();
		Static617.method8288();
		Static393.method5366(false);
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class13_Sub1_Sub1_Sub1_Sub2 local45 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local39];
			if (local45 != null) {
				for (@Pc(49) int local49 = 0; local49 < local45.aClass182Array3.length; local49++) {
					local45.aClass182Array3[local49] = null;
				}
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static645.anInt9916; local70++) {
			@Pc(77) Class13_Sub1_Sub1_Sub1_Sub1 local77 = Static38.aClass2_Sub43Array1[local70].aClass13_Sub1_Sub1_Sub1_Sub1_2;
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass182Array3.length; local81++) {
					local77.aClass182Array3[local81] = null;
				}
			}
		}
		Static458.aClass177_9 = null;
		Static185.aClass177_4 = null;
		Static192.aClass95_4.method6930();
		Static192.aClass95_4 = null;
	}
}
