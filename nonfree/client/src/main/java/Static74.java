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

public final class Static74 {

	@OriginalMember(owner = "client!cga", name = "T", descriptor = "Lclient!fea;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!cga", name = "w", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_24 = new Class289(9, 7);

	@OriginalMember(owner = "client!cga", name = "Q", descriptor = "[I")
	public static final int[] anIntArray80 = new int[1024];

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1301(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local45.append(Static4.aCharArray1[(int) (local49 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)Z")
	public static boolean method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Interface18 local16 = (Interface18) Static401.method5788(arg0, arg1, arg2);
		@Pc(18) boolean local18 = true;
		if (local16 != null) {
			local18 = Static506.method7222(local16) & true;
		}
		local16 = (Interface18) Static486.method7064(arg0, arg1, arg2, oc.class);
		if (local16 != null) {
			local18 &= Static506.method7222(local16);
		}
		local16 = (Interface18) Static82.method1398(arg0, arg1, arg2);
		if (local16 != null) {
			local18 &= Static506.method7222(local16);
		}
		return local18;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static154.method2176(arg5, Static292.anInt4921, Static55.anInt4238);
		@Pc(17) int local17 = Static154.method2176(arg6, Static292.anInt4921, Static55.anInt4238);
		@Pc(23) int local23 = Static154.method2176(arg0, Static153.anInt2554, Static502.anInt8456);
		@Pc(31) int local31 = Static154.method2176(arg1, Static153.anInt2554, Static502.anInt8456);
		@Pc(39) int local39 = Static154.method2176(arg3 + arg5, Static292.anInt4921, Static55.anInt4238);
		@Pc(47) int local47 = Static154.method2176(arg6 - arg3, Static292.anInt4921, Static55.anInt4238);
		for (@Pc(49) int local49 = local11; local49 < local39; local49++) {
			Static270.method3998(arg4, local23, local31, Static173.anIntArrayArray15[local49]);
		}
		for (@Pc(65) int local65 = local17; local65 > local47; local65--) {
			Static270.method3998(arg4, local23, local31, Static173.anIntArrayArray15[local65]);
		}
		@Pc(92) int local92 = Static154.method2176(arg0 + arg3, Static153.anInt2554, Static502.anInt8456);
		@Pc(101) int local101 = Static154.method2176(arg1 - arg3, Static153.anInt2554, Static502.anInt8456);
		for (@Pc(103) int local103 = local39; local103 <= local47; local103++) {
			@Pc(109) int[] local109 = Static173.anIntArrayArray15[local103];
			Static270.method3998(arg4, local23, local92, local109);
			Static270.method3998(arg2, local92, local101, local109);
			Static270.method3998(arg4, local101, local31, local109);
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!gs;)V")
	public static void method1305(@OriginalArg(1) Class6_Sub23_Sub1 arg0) {
		@Pc(10) Class6_Sub29 local10 = (Class6_Sub29) Static403.aClass362_34.method8538();
		if (local10 == null) {
			return;
		}
		@Pc(20) boolean local20 = false;
		for (@Pc(22) int local22 = 0; local22 < local10.anInt4677; local22++) {
			if (local10.aClass103Array2[local22] != null) {
				if (local10.aClass103Array2[local22].anInt2541 == 2) {
					local10.anIntArray265[local22] = -5;
				}
				if (local10.aClass103Array2[local22].anInt2541 == 0) {
					local20 = true;
				}
			}
			if (local10.aClass103Array1[local22] != null) {
				if (local10.aClass103Array1[local22].anInt2541 == 2) {
					local10.anIntArray265[local22] = -6;
				}
				if (local10.aClass103Array1[local22].anInt2541 == 0) {
					local20 = true;
				}
			}
		}
		if (local20) {
			return;
		}
		@Pc(99) int local99 = arg0.anInt9901;
		arg0.method8364(local10.anInt4675);
		for (@Pc(106) int local106 = 0; local106 < local10.anInt4677; local106++) {
			if (local10.anIntArray265[local106] == 0) {
				try {
					@Pc(130) int local130 = local10.anIntArray263[local106];
					@Pc(139) Field local139;
					@Pc(143) int local143;
					if (local130 == 0) {
						local139 = (Field) local10.aClass103Array2[local106].anObject9;
						local143 = local139.getInt((Object) null);
						arg0.method8366(0);
						arg0.method8364(local143);
					} else if (local130 == 1) {
						local139 = (Field) local10.aClass103Array2[local106].anObject9;
						local139.setInt((Object) null, local10.anIntArray264[local106]);
						arg0.method8366(0);
					} else if (local130 == 2) {
						local139 = (Field) local10.aClass103Array2[local106].anObject9;
						local143 = local139.getModifiers();
						arg0.method8366(0);
						arg0.method8364(local143);
					}
					@Pc(214) Method local214;
					if (local130 == 3) {
						local214 = (Method) local10.aClass103Array1[local106].anObject9;
						@Pc(239) byte[][] local239 = local10.aByteArrayArrayArray4[local106];
						@Pc(243) Object[] local243 = new Object[local239.length];
						for (@Pc(245) int local245 = 0; local245 < local239.length; local245++) {
							@Pc(257) ObjectInputStream local257 = new ObjectInputStream(new ByteArrayInputStream(local239[local245]));
							local243[local245] = local257.readObject();
						}
						@Pc(276) Object local276 = local214.invoke((Object) null, local243);
						if (local276 == null) {
							arg0.method8366(0);
						} else if (local276 instanceof Number) {
							arg0.method8366(1);
							arg0.method8392(((Number) local276).longValue());
						} else if (local276 instanceof String) {
							arg0.method8366(2);
							arg0.method8398((String) local276);
						} else {
							arg0.method8366(4);
						}
					} else if (local130 == 4) {
						local214 = (Method) local10.aClass103Array1[local106].anObject9;
						local143 = local214.getModifiers();
						arg0.method8366(0);
						arg0.method8364(local143);
					}
				} catch (@Pc(319) ClassNotFoundException local319) {
					arg0.method8366(-10);
				} catch (@Pc(325) InvalidClassException local325) {
					arg0.method8366(-11);
				} catch (@Pc(331) StreamCorruptedException local331) {
					arg0.method8366(-12);
				} catch (@Pc(337) OptionalDataException local337) {
					arg0.method8366(-13);
				} catch (@Pc(343) IllegalAccessException local343) {
					arg0.method8366(-14);
				} catch (@Pc(349) IllegalArgumentException local349) {
					arg0.method8366(-15);
				} catch (@Pc(355) InvocationTargetException local355) {
					arg0.method8366(-16);
				} catch (@Pc(361) SecurityException local361) {
					arg0.method8366(-17);
				} catch (@Pc(367) IOException local367) {
					arg0.method8366(-18);
				} catch (@Pc(373) NullPointerException local373) {
					arg0.method8366(-19);
				} catch (@Pc(379) Exception local379) {
					arg0.method8366(-20);
				} catch (@Pc(385) Throwable local385) {
					arg0.method8366(-21);
				}
			} else {
				arg0.method8366(local10.anIntArray265[local106]);
			}
		}
		arg0.method8361(local99);
		local10.method9174();
	}
}
