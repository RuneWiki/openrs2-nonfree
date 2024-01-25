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

public final class Static243 {

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "Lclient!wg;")
	public static Class231 aClass231_1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZJILclient!tf;II)V")
	public static void method3773(@OriginalArg(2) long arg0, @OriginalArg(4) Class322 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static293.method3980(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!ce;)V")
	public static void method3774(@OriginalArg(1) Class3_Sub11_Sub1 arg0) {
		@Pc(10) Class3_Sub21 local10 = (Class3_Sub21) Static307.aClass112_33.method3088();
		if (local10 == null) {
			return;
		}
		@Pc(15) boolean local15 = false;
		for (@Pc(17) int local17 = 0; local17 < local10.anInt3426; local17++) {
			if (local10.aClass39Array2[local17] != null) {
				if (local10.aClass39Array2[local17].anInt894 == 2) {
					local10.anIntArray174[local17] = -5;
				}
				if (local10.aClass39Array2[local17].anInt894 == 0) {
					local15 = true;
				}
			}
			if (local10.aClass39Array1[local17] != null) {
				if (local10.aClass39Array1[local17].anInt894 == 2) {
					local10.anIntArray174[local17] = -6;
				}
				if (local10.aClass39Array1[local17].anInt894 == 0) {
					local15 = true;
				}
			}
		}
		if (local15) {
			return;
		}
		@Pc(93) int local93 = arg0.anInt6128;
		arg0.method5215(local10.anInt3425);
		for (@Pc(100) int local100 = 0; local100 < local10.anInt3426; local100++) {
			if (local10.anIntArray174[local100] == 0) {
				try {
					@Pc(124) int local124 = local10.anIntArray176[local100];
					@Pc(141) Field local141;
					@Pc(144) int local144;
					if (local124 == 0) {
						local141 = (Field) local10.aClass39Array2[local100].anObject2;
						local144 = local141.getInt(null);
						arg0.method5213(0);
						arg0.method5215(local144);
					} else if (local124 == 1) {
						local141 = (Field) local10.aClass39Array2[local100].anObject2;
						local141.setInt(null, local10.anIntArray175[local100]);
						arg0.method5213(0);
					} else if (local124 == 2) {
						local141 = (Field) local10.aClass39Array2[local100].anObject2;
						local144 = local141.getModifiers();
						arg0.method5213(0);
						arg0.method5215(local144);
					}
					@Pc(203) Method local203;
					if (local124 == 3) {
						local203 = (Method) local10.aClass39Array1[local100].anObject2;
						@Pc(208) byte[][] local208 = local10.aByteArrayArrayArray10[local100];
						@Pc(212) Object[] local212 = new Object[local208.length];
						for (@Pc(214) int local214 = 0; local214 < local208.length; local214++) {
							@Pc(226) ObjectInputStream local226 = new ObjectInputStream(new ByteArrayInputStream(local208[local214]));
							local212[local214] = local226.readObject();
						}
						@Pc(245) Object local245 = local203.invoke(null, local212);
						if (local245 == null) {
							arg0.method5213(0);
						} else if (local245 instanceof Number) {
							arg0.method5213(1);
							arg0.method5225(((Number) local245).longValue());
						} else if (local245 instanceof String) {
							arg0.method5213(2);
							arg0.method5227((String) local245);
						} else {
							arg0.method5213(4);
						}
					} else if (local124 == 4) {
						local203 = (Method) local10.aClass39Array1[local100].anObject2;
						local144 = local203.getModifiers();
						arg0.method5213(0);
						arg0.method5215(local144);
					}
				} catch (@Pc(313) ClassNotFoundException local313) {
					arg0.method5213(-10);
				} catch (@Pc(319) InvalidClassException local319) {
					arg0.method5213(-11);
				} catch (@Pc(325) StreamCorruptedException local325) {
					arg0.method5213(-12);
				} catch (@Pc(331) OptionalDataException local331) {
					arg0.method5213(-13);
				} catch (@Pc(337) IllegalAccessException local337) {
					arg0.method5213(-14);
				} catch (@Pc(343) IllegalArgumentException local343) {
					arg0.method5213(-15);
				} catch (@Pc(349) InvocationTargetException local349) {
					arg0.method5213(-16);
				} catch (@Pc(355) SecurityException local355) {
					arg0.method5213(-17);
				} catch (@Pc(361) IOException local361) {
					arg0.method5213(-18);
				} catch (@Pc(367) NullPointerException local367) {
					arg0.method5213(-19);
				} catch (@Pc(373) Exception local373) {
					arg0.method5213(-20);
				} catch (@Pc(379) Throwable local379) {
					arg0.method5213(-21);
				}
			} else {
				arg0.method5213(local10.anIntArray174[local100]);
			}
		}
		arg0.method5202(local93);
		local10.method7825();
	}
}
