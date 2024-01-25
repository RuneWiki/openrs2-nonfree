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

public final class Static108 {

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!lb;")
	public static Class221 aClass221_21;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!vea;")
	public static final Class384 aClass384_7 = new Class384();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!lk;B)V")
	public static void method1946(@OriginalArg(0) Class3_Sub28_Sub2 arg0) {
		@Pc(10) Class3_Sub9 local10 = (Class3_Sub9) Static42.aClass357_3.method8391();
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local10.anInt698; local18++) {
			if (local10.aClass201Array2[local18] != null) {
				if (local10.aClass201Array2[local18].anInt5729 == 2) {
					local10.anIntArray40[local18] = -5;
				}
				if (local10.aClass201Array2[local18].anInt5729 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass201Array1[local18] != null) {
				if (local10.aClass201Array1[local18].anInt5729 == 2) {
					local10.anIntArray40[local18] = -6;
				}
				if (local10.aClass201Array1[local18].anInt5729 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(104) int local104 = arg0.anInt6241;
		arg0.method5311(local10.anInt697);
		for (@Pc(119) int local119 = 0; local119 < local10.anInt698; local119++) {
			if (local10.anIntArray40[local119] == 0) {
				try {
					@Pc(144) int local144 = local10.anIntArray38[local119];
					@Pc(160) Field local160;
					@Pc(190) int local190;
					if (local144 == 0) {
						local160 = (Field) local10.aClass201Array2[local119].anObject16;
						local190 = local160.getInt((Object) null);
						arg0.method5329(0);
						arg0.method5311(local190);
					} else if (local144 == 1) {
						local160 = (Field) local10.aClass201Array2[local119].anObject16;
						local160.setInt((Object) null, local10.anIntArray39[local119]);
						arg0.method5329(0);
					} else if (local144 == 2) {
						local160 = (Field) local10.aClass201Array2[local119].anObject16;
						local190 = local160.getModifiers();
						arg0.method5329(0);
						arg0.method5311(local190);
					}
					@Pc(229) Method local229;
					if (local144 == 3) {
						local229 = (Method) local10.aClass201Array1[local119].anObject16;
						@Pc(234) byte[][] local234 = local10.aByteArrayArrayArray2[local119];
						@Pc(238) Object[] local238 = new Object[local234.length];
						for (@Pc(240) int local240 = 0; local240 < local234.length; local240++) {
							@Pc(252) ObjectInputStream local252 = new ObjectInputStream(new ByteArrayInputStream(local234[local240]));
							local238[local240] = local252.readObject();
						}
						@Pc(267) Object local267 = local229.invoke((Object) null, local238);
						if (local267 == null) {
							arg0.method5329(0);
						} else if (local267 instanceof Number) {
							arg0.method5329(1);
							arg0.method5319(((Number) local267).longValue());
						} else if (local267 instanceof String) {
							arg0.method5329(2);
							arg0.method5283((String) local267);
						} else {
							arg0.method5329(4);
						}
					} else if (local144 == 4) {
						local229 = (Method) local10.aClass201Array1[local119].anObject16;
						local190 = local229.getModifiers();
						arg0.method5329(0);
						arg0.method5311(local190);
					}
				} catch (@Pc(349) ClassNotFoundException local349) {
					arg0.method5329(-10);
				} catch (@Pc(355) InvalidClassException local355) {
					arg0.method5329(-11);
				} catch (@Pc(361) StreamCorruptedException local361) {
					arg0.method5329(-12);
				} catch (@Pc(367) OptionalDataException local367) {
					arg0.method5329(-13);
				} catch (@Pc(373) IllegalAccessException local373) {
					arg0.method5329(-14);
				} catch (@Pc(379) IllegalArgumentException local379) {
					arg0.method5329(-15);
				} catch (@Pc(385) InvocationTargetException local385) {
					arg0.method5329(-16);
				} catch (@Pc(391) SecurityException local391) {
					arg0.method5329(-17);
				} catch (@Pc(397) IOException local397) {
					arg0.method5329(-18);
				} catch (@Pc(403) NullPointerException local403) {
					arg0.method5329(-19);
				} catch (@Pc(409) Exception local409) {
					arg0.method5329(-20);
				} catch (@Pc(415) Throwable local415) {
					arg0.method5329(-21);
				}
			} else {
				arg0.method5329(local10.anIntArray40[local119]);
			}
		}
		arg0.method5327(local104);
		local10.method9446();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public static void method1947(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static396.anInt7103 = arg1;
		Static161.anInt2962 = arg0;
		if (Static293.anInt5243 == 0) {
			Static306.anInt5501 = Static396.anInt7103 + Static351.anInt5981 * 2;
			Static648.anInt10431 = Static61.anInt946 * 2 + Static161.anInt2962;
		} else if (Static293.anInt5243 == 1) {
			Static643.anInt10383 = Static161.anInt2962 / Static523.anInt8898 + Static180.anInt3233 + 2;
			Static310.anInt5521 = Static396.anInt7103 / Static299.anInt6879 + Static533.anInt8992 + 2;
			Static648.anInt10431 = Static643.anInt10383 * Static523.anInt8898;
			Static306.anInt5501 = Static299.anInt6879 * Static310.anInt5521;
			Static61.anInt946 = Static648.anInt10431 - Static161.anInt2962 >> 1;
			Static351.anInt5981 = Static306.anInt5501 - Static396.anInt7103 >> 1;
		} else if (Static293.anInt5243 == 2) {
			Static306.anInt5501 = Static396.anInt7103;
			Static648.anInt10431 = Static161.anInt2962;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method1948(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static639.aClass313Array2 != Static711.aClass313Array3) {
			@Pc(12) int local12 = Static167.aClass313Array1[arg1].method9096(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class313 local19 = Static167.aClass313Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method9096(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method9094(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	public static void method1950(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(21, (long) arg0);
		local9.method627();
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(B)[Lclient!m;")
	public static Class235[] method1951() {
		return new Class235[] { Static18.aClass235_51, Static190.aClass235_19, Static372.aClass235_36, Static682.aClass235_52, Static94.aClass235_9, Static285.aClass235_28, Static587.aClass235_46, Static25.aClass235_2, Static580.aClass235_45, Static554.aClass235_43, Static318.aClass235_32, Static258.aClass235_24, Static109.aClass235_14, Static147.aClass235_18, Static588.aClass235_47, Static424.aClass235_37, Static475.aClass235_40, Static115.aClass235_15, Static465.aClass235_39, Static321.aClass235_34, Static49.aClass235_4, Static575.aClass235_44, Static284.aClass235_27, Static34.aClass235_3, Static630.aClass235_33, Static145.aClass235_17, Static72.aClass235_7, Static306.aClass235_30, Static561.aClass235_49, Static495.aClass235_41, Static659.aClass235_50 };
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1952() {
		Static394.aClass338_38.method8047();
	}
}
