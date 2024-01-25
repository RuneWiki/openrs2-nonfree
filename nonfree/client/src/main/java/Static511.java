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

public final class Static511 {

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "Lclient!pu;")
	public static Class270 aClass270_105;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "Lclient!ut;")
	public static final Class335 aClass335_18 = new Class335();

	@OriginalMember(owner = "client!ts", name = "B", descriptor = "[Lclient!rv;")
	public static final Class296[] aClass296Array1 = new Class296[2048];

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!qaa;I)V")
	public static void method7103(@OriginalArg(0) Class1_Sub35_Sub2 arg0) {
		@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static520.aClass353_61.method7677();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt3251; local17++) {
			if (local10.aClass260Array2[local17] != null) {
				if (local10.aClass260Array2[local17].anInt7041 == 2) {
					local10.anIntArray302[local17] = -5;
				}
				if (local10.aClass260Array2[local17].anInt7041 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass260Array1[local17] != null) {
				if (local10.aClass260Array1[local17].anInt7041 == 2) {
					local10.anIntArray302[local17] = -6;
				}
				if (local10.aClass260Array1[local17].anInt7041 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(83) int local83 = arg0.anInt7214;
		arg0.method5792(local10.anInt3250);
		for (@Pc(95) int local95 = 0; local95 < local10.anInt3251; local95++) {
			if (local10.anIntArray302[local95] == 0) {
				try {
					@Pc(116) int local116 = local10.anIntArray300[local95];
					@Pc(128) Field local128;
					@Pc(132) int local132;
					if (local116 == 0) {
						local128 = (Field) local10.aClass260Array2[local95].anObject16;
						local132 = local128.getInt(null);
						arg0.method5777(0);
						arg0.method5792(local132);
					} else if (local116 == 1) {
						local128 = (Field) local10.aClass260Array2[local95].anObject16;
						local128.setInt(null, local10.anIntArray301[local95]);
						arg0.method5777(0);
					} else if (local116 == 2) {
						local128 = (Field) local10.aClass260Array2[local95].anObject16;
						local132 = local128.getModifiers();
						arg0.method5777(0);
						arg0.method5792(local132);
					}
					@Pc(198) Method local198;
					if (local116 == 3) {
						local198 = (Method) local10.aClass260Array1[local95].anObject16;
						@Pc(203) byte[][] local203 = local10.aByteArrayArrayArray14[local95];
						@Pc(207) Object[] local207 = new Object[local203.length];
						for (@Pc(209) int local209 = 0; local209 < local203.length; local209++) {
							@Pc(221) ObjectInputStream local221 = new ObjectInputStream(new ByteArrayInputStream(local203[local209]));
							local207[local209] = local221.readObject();
						}
						@Pc(240) Object local240 = local198.invoke(null, local207);
						if (local240 == null) {
							arg0.method5777(0);
						} else if (local240 instanceof Number) {
							arg0.method5777(1);
							arg0.method5748(((Number) local240).longValue());
						} else if (local240 instanceof String) {
							arg0.method5777(2);
							arg0.method5761((String) local240);
						} else {
							arg0.method5777(4);
						}
					} else if (local116 == 4) {
						local198 = (Method) local10.aClass260Array1[local95].anObject16;
						local132 = local198.getModifiers();
						arg0.method5777(0);
						arg0.method5792(local132);
					}
				} catch (@Pc(310) ClassNotFoundException local310) {
					arg0.method5777(-10);
				} catch (@Pc(316) InvalidClassException local316) {
					arg0.method5777(-11);
				} catch (@Pc(322) StreamCorruptedException local322) {
					arg0.method5777(-12);
				} catch (@Pc(328) OptionalDataException local328) {
					arg0.method5777(-13);
				} catch (@Pc(334) IllegalAccessException local334) {
					arg0.method5777(-14);
				} catch (@Pc(340) IllegalArgumentException local340) {
					arg0.method5777(-15);
				} catch (@Pc(346) InvocationTargetException local346) {
					arg0.method5777(-16);
				} catch (@Pc(352) SecurityException local352) {
					arg0.method5777(-17);
				} catch (@Pc(358) IOException local358) {
					arg0.method5777(-18);
				} catch (@Pc(364) NullPointerException local364) {
					arg0.method5777(-19);
				} catch (@Pc(370) Exception local370) {
					arg0.method5777(-20);
				} catch (@Pc(376) Throwable local376) {
					arg0.method5777(-21);
				}
			} else {
				arg0.method5777(local10.anIntArray302[local95]);
			}
		}
		arg0.method5787(local83);
		local10.method7859();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method7105() {
		Static374.aClass137_3.method2923();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)Lclient!kg;")
	public static Class8_Sub3_Sub4 method7108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub3_Sub4_2;
	}
}
