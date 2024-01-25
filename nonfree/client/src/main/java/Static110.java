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

public final class Static110 {

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!ic;")
	public static Class113 aClass113_38;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!vp;")
	public static Class254 aClass254_11;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
	public static int anInt1939 = 765;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method1535(@OriginalArg(0) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!mv;I)V")
	public static void method1536(@OriginalArg(1) Class1_Sub11_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) Static131.aClass254_13.method5437();
			if (local15 == null) {
				return;
			}
			@Pc(20) boolean local20 = false;
			for (@Pc(22) int local22 = 0; local22 < local15.anInt1360; local22++) {
				if (local15.aClass215Array2[local22] != null) {
					if (local15.aClass215Array2[local22].anInt5791 == 2) {
						local15.anIntArray63[local22] = -5;
					}
					if (local15.aClass215Array2[local22].anInt5791 == 0) {
						local20 = true;
					}
				}
				if (local15.aClass215Array1[local22] != null) {
					if (local15.aClass215Array1[local22].anInt5791 == 2) {
						local15.anIntArray63[local22] = -6;
					}
					if (local15.aClass215Array1[local22].anInt5791 == 0) {
						local20 = true;
					}
				}
			}
			if (local20) {
				return;
			}
			arg0.method3343(arg1);
			arg0.method4445(0);
			@Pc(104) int local104 = arg0.anInt5766;
			arg0.method4450(local15.anInt1359);
			for (@Pc(111) int local111 = 0; local111 < local15.anInt1360; local111++) {
				if (local15.anIntArray63[local111] == 0) {
					try {
						@Pc(135) int local135 = local15.anIntArray61[local111];
						@Pc(155) Field local155;
						@Pc(158) int local158;
						if (local135 == 0) {
							local155 = (Field) local15.aClass215Array2[local111].anObject10;
							local158 = local155.getInt(null);
							arg0.method4445(0);
							arg0.method4450(local158);
						} else if (local135 == 1) {
							local155 = (Field) local15.aClass215Array2[local111].anObject10;
							local155.setInt(null, local15.anIntArray62[local111]);
							arg0.method4445(0);
						} else if (local135 == 2) {
							local155 = (Field) local15.aClass215Array2[local111].anObject10;
							local158 = local155.getModifiers();
							arg0.method4445(0);
							arg0.method4450(local158);
						}
						@Pc(224) Method local224;
						if (local135 == 3) {
							local224 = (Method) local15.aClass215Array1[local111].anObject10;
							@Pc(249) byte[][] local249 = local15.aByteArrayArrayArray1[local111];
							@Pc(253) Object[] local253 = new Object[local249.length];
							for (@Pc(255) int local255 = 0; local255 < local249.length; local255++) {
								@Pc(267) ObjectInputStream local267 = new ObjectInputStream(new ByteArrayInputStream(local249[local255]));
								local253[local255] = local267.readObject();
							}
							@Pc(286) Object local286 = local224.invoke(null, local253);
							if (local286 == null) {
								arg0.method4445(0);
							} else if (local286 instanceof Number) {
								arg0.method4445(1);
								arg0.method4446(((Number) local286).longValue());
							} else if (local286 instanceof String) {
								arg0.method4445(2);
								arg0.method4453((String) local286);
							} else {
								arg0.method4445(4);
							}
						} else if (local135 == 4) {
							local224 = (Method) local15.aClass215Array1[local111].anObject10;
							local158 = local224.getModifiers();
							arg0.method4445(0);
							arg0.method4450(local158);
						}
					} catch (@Pc(333) ClassNotFoundException local333) {
						arg0.method4445(-10);
					} catch (@Pc(339) InvalidClassException local339) {
						arg0.method4445(-11);
					} catch (@Pc(345) StreamCorruptedException local345) {
						arg0.method4445(-12);
					} catch (@Pc(351) OptionalDataException local351) {
						arg0.method4445(-13);
					} catch (@Pc(357) IllegalAccessException local357) {
						arg0.method4445(-14);
					} catch (@Pc(365) IllegalArgumentException local365) {
						arg0.method4445(-15);
					} catch (@Pc(371) InvocationTargetException local371) {
						arg0.method4445(-16);
					} catch (@Pc(377) SecurityException local377) {
						arg0.method4445(-17);
					} catch (@Pc(385) IOException local385) {
						arg0.method4445(-18);
					} catch (@Pc(391) NullPointerException local391) {
						arg0.method4445(-19);
					} catch (@Pc(397) Exception local397) {
						arg0.method4445(-20);
					} catch (@Pc(403) Throwable local403) {
						arg0.method4445(-21);
					}
				} else {
					arg0.method4445(local15.anIntArray63[local111]);
				}
			}
			arg0.method4491(local104);
			arg0.method4478(arg0.anInt5766 - local104);
			local15.method5617();
		}
	}
}
