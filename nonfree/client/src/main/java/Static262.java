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

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!ak;")
	public static Class7 aClass7_210;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt5263 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!pi;")
	public static Class133 method4031(@OriginalArg(0) int arg0) {
		@Pc(10) Class133 local10 = (Class133) Static284.aClass31_43.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static232.aClass7_197.method253(Static295.method4514(arg0), Static8.method182(arg0));
		local10 = new Class133();
		local10.anInt4020 = arg0;
		if (local26 != null) {
			local10.method3166(new Class1_Sub18(local26));
		}
		local10.method3161();
		Static284.aClass31_43.method851(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)V")
	public static void method4032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class140 local3 = Static246.method2732(arg0);
		@Pc(10) int local10 = local3.anInt4486;
		@Pc(13) int local13 = local3.anInt4489;
		@Pc(16) int local16 = local3.anInt4481;
		@Pc(27) int local27 = Class1_Sub27.anIntArray582[local13 - local10];
		if (arg1 < 0 || arg1 > local27) {
			arg1 = 0;
		}
		local27 <<= local10;
		Static56.method932(local16, arg1 << local10 & local27 | ~local27 & Static224.anIntArray535[local16]);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBII)V")
	public static void method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static110.anInt2060 = arg0;
		Static234.anInt4890 = arg1;
		Static124.anInt2374 = arg3;
		Static147.anInt2715 = arg2;
		Static28.anInt602 = arg4;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BILclient!pf;)V")
	public static void method4034(@OriginalArg(2) Class1_Sub18_Sub1 arg0) {
		while (true) {
			@Pc(17) Class1_Sub14 local17 = (Class1_Sub14) Static113.aClass69_11.method1636();
			if (local17 == null) {
				return;
			}
			@Pc(22) boolean local22 = false;
			@Pc(24) int local24;
			for (local24 = 0; local24 < local17.anInt1897; local24++) {
				if (local17.aClass118Array1[local24] != null) {
					if (local17.aClass118Array1[local24].anInt3187 == 2) {
						local17.anIntArray254[local24] = -5;
					}
					if (local17.aClass118Array1[local24].anInt3187 == 0) {
						local22 = true;
					}
				}
				if (local17.aClass118Array2[local24] != null) {
					if (local17.aClass118Array2[local24].anInt3187 == 2) {
						local17.anIntArray254[local24] = -6;
					}
					if (local17.aClass118Array2[local24].anInt3187 == 0) {
						local22 = true;
					}
				}
			}
			if (local22) {
				return;
			}
			arg0.method3130(107);
			arg0.method3093(0);
			local24 = arg0.anInt3911;
			arg0.method3119(local17.anInt1902);
			for (@Pc(109) int local109 = 0; local109 < local17.anInt1897; local109++) {
				if (local17.anIntArray254[local109] == 0) {
					try {
						@Pc(141) int local141 = local17.anIntArray257[local109];
						@Pc(156) Field local156;
						@Pc(185) int local185;
						if (local141 == 0) {
							local156 = (Field) local17.aClass118Array1[local109].anObject3;
							local185 = local156.getInt(null);
							arg0.method3093(0);
							arg0.method3119(local185);
						} else if (local141 == 1) {
							local156 = (Field) local17.aClass118Array1[local109].anObject3;
							local156.setInt(null, local17.anIntArray255[local109]);
							arg0.method3093(0);
						} else if (local141 == 2) {
							local156 = (Field) local17.aClass118Array1[local109].anObject3;
							local185 = local156.getModifiers();
							arg0.method3093(0);
							arg0.method3119(local185);
						}
						@Pc(229) Method local229;
						if (local141 == 3) {
							local229 = (Method) local17.aClass118Array2[local109].anObject3;
							@Pc(256) byte[][] local256 = local17.aByteArrayArrayArray12[local109];
							@Pc(260) Object[] local260 = new Object[local256.length];
							for (@Pc(262) int local262 = 0; local262 < local256.length; local262++) {
								@Pc(276) ObjectInputStream local276 = new ObjectInputStream(new ByteArrayInputStream(local256[local262]));
								local260[local262] = local276.readObject();
							}
							@Pc(289) Object local289 = local229.invoke(null, local260);
							if (local289 == null) {
								arg0.method3093(0);
							} else if (local289 instanceof Number) {
								arg0.method3093(1);
								arg0.method3091(((Number) local289).longValue());
							} else if (local289 instanceof String) {
								arg0.method3093(2);
								arg0.method3067((String) local289);
							} else {
								arg0.method3093(4);
							}
						} else if (local141 == 4) {
							local229 = (Method) local17.aClass118Array2[local109].anObject3;
							local185 = local229.getModifiers();
							arg0.method3093(0);
							arg0.method3119(local185);
						}
					} catch (@Pc(336) ClassNotFoundException local336) {
						arg0.method3093(-10);
					} catch (@Pc(344) InvalidClassException local344) {
						arg0.method3093(-11);
					} catch (@Pc(350) StreamCorruptedException local350) {
						arg0.method3093(-12);
					} catch (@Pc(356) OptionalDataException local356) {
						arg0.method3093(-13);
					} catch (@Pc(362) IllegalAccessException local362) {
						arg0.method3093(-14);
					} catch (@Pc(368) IllegalArgumentException local368) {
						arg0.method3093(-15);
					} catch (@Pc(374) InvocationTargetException local374) {
						arg0.method3093(-16);
					} catch (@Pc(380) SecurityException local380) {
						arg0.method3093(-17);
					} catch (@Pc(386) IOException local386) {
						arg0.method3093(-18);
					} catch (@Pc(392) NullPointerException local392) {
						arg0.method3093(-19);
					} catch (@Pc(398) Exception local398) {
						arg0.method3093(-20);
					} catch (@Pc(406) Throwable local406) {
						arg0.method3093(-21);
					}
				} else {
					arg0.method3093(local17.anIntArray254[local109]);
				}
			}
			arg0.method3098(local24);
			arg0.method3087(arg0.anInt3911 - local24);
			local17.method4534();
		}
	}
}
