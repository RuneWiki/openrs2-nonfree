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

public final class Static50 {

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!oi;")
	public static Class185 aClass185_14;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_37 = new Class67(8, -2);

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	public static int anInt722 = 0;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[B")
	public static final byte[] aByteArray11 = new byte[520];

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_1 = new Class156("WIP", 2);

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "[I")
	public static final int[] anIntArray106 = new int[13];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BILclient!vo;I)Lclient!vf;")
	public static Class1_Sub3_Sub17 method663(@OriginalArg(1) int arg0, @OriginalArg(2) Class265 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anInt6903 | arg0 << 8;
		@Pc(19) Class1_Sub3_Sub17 local19 = (Class1_Sub3_Sub17) Static43.aClass54_47.method922((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static377.aClass185_99.method3997(Static377.aClass185_99.method4001(local10));
		if (local31 == null) {
			local10 = arg2 + 65536 << 8 | arg1.anInt6903;
			local19 = (Class1_Sub3_Sub17) Static43.aClass54_47.method922((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static377.aClass185_99.method3997(Static377.aClass185_99.method4001(local10));
			if (local31 == null) {
				local10 = arg1.anInt6903 | 0xFFFF00;
				local19 = (Class1_Sub3_Sub17) Static43.aClass54_47.method922((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static377.aClass185_99.method3997(Static377.aClass185_99.method4001(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static452.method5827(local31);
					local19.aClass265_10 = arg1;
					Static43.aClass54_47.method920(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static452.method5827(local31);
				local19.aClass265_10 = arg1;
				Static43.aClass54_47.method920(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static452.method5827(local31);
			local19.aClass265_10 = arg1;
			Static43.aClass54_47.method920(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "([JZ[Ljava/lang/Object;)V")
	public static void method668(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static302.method4041(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!jp;IZ)V")
	public static void method670(@OriginalArg(0) Class1_Sub19_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) Class1_Sub46 local14 = (Class1_Sub46) Static62.aClass14_4.method203();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt6950; local21++) {
				if (local14.aClass253Array2[local21] != null) {
					if (local14.aClass253Array2[local21].anInt6669 == 2) {
						local14.anIntArray502[local21] = -5;
					}
					if (local14.aClass253Array2[local21].anInt6669 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass253Array1[local21] != null) {
					if (local14.aClass253Array1[local21].anInt6669 == 2) {
						local14.anIntArray502[local21] = -6;
					}
					if (local14.aClass253Array1[local21].anInt6669 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method2949(arg1);
			arg0.method2934(0);
			@Pc(96) int local96 = arg0.anInt3698;
			arg0.method2912(local14.anInt6952);
			for (@Pc(107) int local107 = 0; local107 < local14.anInt6950; local107++) {
				if (local14.anIntArray502[local107] == 0) {
					try {
						@Pc(131) int local131 = local14.anIntArray499[local107];
						@Pc(148) Field local148;
						@Pc(151) int local151;
						if (local131 == 0) {
							local148 = (Field) local14.aClass253Array2[local107].anObject9;
							local151 = local148.getInt(null);
							arg0.method2934(0);
							arg0.method2912(local151);
						} else if (local131 == 1) {
							local148 = (Field) local14.aClass253Array2[local107].anObject9;
							local148.setInt(null, local14.anIntArray500[local107]);
							arg0.method2934(0);
						} else if (local131 == 2) {
							local148 = (Field) local14.aClass253Array2[local107].anObject9;
							local151 = local148.getModifiers();
							arg0.method2934(0);
							arg0.method2912(local151);
						}
						@Pc(218) Method local218;
						if (local131 == 3) {
							local218 = (Method) local14.aClass253Array1[local107].anObject9;
							@Pc(223) byte[][] local223 = local14.aByteArrayArrayArray18[local107];
							@Pc(227) Object[] local227 = new Object[local223.length];
							for (@Pc(229) int local229 = 0; local229 < local223.length; local229++) {
								@Pc(241) ObjectInputStream local241 = new ObjectInputStream(new ByteArrayInputStream(local223[local229]));
								local227[local229] = local241.readObject();
							}
							@Pc(256) Object local256 = local218.invoke(null, local227);
							if (local256 == null) {
								arg0.method2934(0);
							} else if (local256 instanceof Number) {
								arg0.method2934(1);
								arg0.method2916(((Number) local256).longValue());
							} else if (local256 instanceof String) {
								arg0.method2934(2);
								arg0.method2935((String) local256);
							} else {
								arg0.method2934(4);
							}
						} else if (local131 == 4) {
							local218 = (Method) local14.aClass253Array1[local107].anObject9;
							local151 = local218.getModifiers();
							arg0.method2934(0);
							arg0.method2912(local151);
						}
					} catch (@Pc(324) ClassNotFoundException local324) {
						arg0.method2934(-10);
					} catch (@Pc(330) InvalidClassException local330) {
						arg0.method2934(-11);
					} catch (@Pc(336) StreamCorruptedException local336) {
						arg0.method2934(-12);
					} catch (@Pc(342) OptionalDataException local342) {
						arg0.method2934(-13);
					} catch (@Pc(348) IllegalAccessException local348) {
						arg0.method2934(-14);
					} catch (@Pc(354) IllegalArgumentException local354) {
						arg0.method2934(-15);
					} catch (@Pc(360) InvocationTargetException local360) {
						arg0.method2934(-16);
					} catch (@Pc(366) SecurityException local366) {
						arg0.method2934(-17);
					} catch (@Pc(372) IOException local372) {
						arg0.method2934(-18);
					} catch (@Pc(378) NullPointerException local378) {
						arg0.method2934(-19);
					} catch (@Pc(384) Exception local384) {
						arg0.method2934(-20);
					} catch (@Pc(390) Throwable local390) {
						arg0.method2934(-21);
					}
				} else {
					arg0.method2934(local14.anIntArray502[local107]);
				}
			}
			arg0.method2902(local96);
			arg0.method2907(arg0.anInt3698 - local96);
			local14.method5953();
		}
	}
}
