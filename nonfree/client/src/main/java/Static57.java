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

public final class Static57 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "Lclient!td;")
	public static Class79 aClass79_8 = new Class79(64);

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_593 = Static169.method2903("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!ed;")
	public static Class23 aClass23_594 = Static169.method2903("::qa_op_test");

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "Lclient!ed;")
	private static Class23 aClass23_595 = Static169.method2903("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
	public static int[] anIntArray225 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!ed;")
	public static Class23 aClass23_596 = Static169.method2903("sl_back");

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_597 = aClass23_595;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!ff;I)V")
	public static void method1097(@OriginalArg(1) Class1_Sub8_Sub1 arg0) {
		while (true) {
			@Pc(17) Class1_Sub14 local17 = (Class1_Sub14) Static45.aClass56_3.method1853();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			for (@Pc(24) int local24 = 0; local24 < local17.anInt2960; local24++) {
				if (local17.aClass63Array2[local24] != null) {
					if (local17.aClass63Array2[local24].anInt3324 == 2) {
						local17.anIntArray392[local24] = -5;
					}
					if (local17.aClass63Array2[local24].anInt3324 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass63Array1[local24] != null) {
					if (local17.aClass63Array1[local24].anInt3324 == 2) {
						local17.anIntArray392[local24] = -6;
					}
					if (local17.aClass63Array1[local24].anInt3324 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method919(113);
			arg0.method862(0);
			@Pc(105) int local105 = arg0.anInt1357;
			arg0.method904(local17.anInt2961);
			for (@Pc(112) int local112 = 0; local112 < local17.anInt2960; local112++) {
				if (local17.anIntArray392[local112] == 0) {
					try {
						@Pc(136) int local136 = local17.anIntArray393[local112];
						@Pc(148) Field local148;
						@Pc(152) int local152;
						if (local136 == 0) {
							local148 = (Field) local17.aClass63Array2[local112].anObject3;
							local152 = local148.getInt(null);
							arg0.method862(0);
							arg0.method904(local152);
						} else if (local136 == 1) {
							local148 = (Field) local17.aClass63Array2[local112].anObject3;
							local148.setInt(null, local17.anIntArray391[local112]);
							arg0.method862(0);
						} else if (local136 == 2) {
							local148 = (Field) local17.aClass63Array2[local112].anObject3;
							local152 = local148.getModifiers();
							arg0.method862(0);
							arg0.method904(local152);
						}
						@Pc(223) Method local223;
						if (local136 == 3) {
							local223 = (Method) local17.aClass63Array1[local112].anObject3;
							@Pc(248) byte[][] local248 = local17.aByteArrayArrayArray71[local112];
							@Pc(252) Object[] local252 = new Object[local248.length];
							for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
								@Pc(266) ObjectInputStream local266 = new ObjectInputStream(new ByteArrayInputStream(local248[local254]));
								local252[local254] = local266.readObject();
							}
							@Pc(285) Object local285 = local223.invoke(null, local252);
							if (local285 == null) {
								arg0.method862(0);
							} else if (local285 instanceof Number) {
								arg0.method862(1);
								arg0.method873(((Number) local285).longValue());
							} else if (local285 instanceof Class23) {
								arg0.method862(2);
								arg0.method858((Class23) local285);
							} else {
								arg0.method862(4);
							}
						} else if (local136 == 4) {
							local223 = (Method) local17.aClass63Array1[local112].anObject3;
							local152 = local223.getModifiers();
							arg0.method862(0);
							arg0.method904(local152);
						}
					} catch (@Pc(328) ClassNotFoundException local328) {
						arg0.method862(-10);
					} catch (@Pc(334) InvalidClassException local334) {
						arg0.method862(-11);
					} catch (@Pc(340) StreamCorruptedException local340) {
						arg0.method862(-12);
					} catch (@Pc(346) OptionalDataException local346) {
						arg0.method862(-13);
					} catch (@Pc(352) IllegalAccessException local352) {
						arg0.method862(-14);
					} catch (@Pc(358) IllegalArgumentException local358) {
						arg0.method862(-15);
					} catch (@Pc(364) InvocationTargetException local364) {
						arg0.method862(-16);
					} catch (@Pc(370) SecurityException local370) {
						arg0.method862(-17);
					} catch (@Pc(376) IOException local376) {
						arg0.method862(-18);
					} catch (@Pc(382) NullPointerException local382) {
						arg0.method862(-19);
					} catch (@Pc(388) Exception local388) {
						arg0.method862(-20);
					} catch (@Pc(394) Throwable local394) {
						arg0.method862(-21);
					}
				} else {
					arg0.method862(local17.anIntArray392[local112]);
				}
			}
			arg0.method871(local105);
			arg0.method877(arg0.anInt1357 - local105);
			local17.method3141();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1098() {
		aClass23_596 = null;
		aClass23_593 = null;
		aClass23_594 = null;
		aClass23_595 = null;
		anIntArray225 = null;
		aClass23_597 = null;
		aClass79_8 = null;
		anIntArray224 = null;
	}
}
