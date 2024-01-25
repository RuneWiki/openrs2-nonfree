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

public final class Static368 {

	@OriginalMember(owner = "client!mka", name = "Pb", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!mka", name = "Ob", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_13 = new Class226(13, 3);

	@OriginalMember(owner = "client!mka", name = "Ib", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!mka", name = "s", descriptor = "(II)I")
	public static int method5493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static503.anIntArrayArray57 == null ? 0 : Static503.anIntArrayArray57[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(BII)Z")
	public static boolean method5497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(ILclient!wq;)V")
	public static void method5498(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static683.aClass62_8 != null) {
			@Pc(29) int local29;
			try {
				Static683.aClass62_8.method1160(0L);
				Static683.aClass62_8.method1158(local8);
				for (local29 = 0; local29 < 24 && local8[local29] == 0; local29++) {
				}
				if (local29 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(62) Exception local62) {
				for (local29 = 0; local29 < 24; local29++) {
					local8[local29] = -1;
				}
			}
		}
		arg0.method7313(0, 24, local8);
	}

	@OriginalMember(owner = "client!mka", name = "y", descriptor = "(I)Z")
	public static boolean method5499() {
		@Pc(10) Class5_Sub26 local10 = (Class5_Sub26) Static119.aClass20_7.method378();
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt4753; local24++) {
			if (local10.aClass361Array2[local24] != null && local10.aClass361Array2[local24].anInt9720 == 0) {
				return false;
			}
			if (local10.aClass361Array1[local24] != null && local10.aClass361Array1[local24].anInt9720 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(ZI)V")
	public static void method5500(@OriginalArg(0) boolean arg0) {
		if (Static220.aString35.length() == 0) {
			return;
		}
		Static239.method3794("--> " + Static220.aString35);
		Static661.method9076(false, arg0, Static220.aString35);
		if (!arg0) {
			Static220.aString35 = "";
			Static335.anInt8972 = 0;
		}
		Static471.anInt7669 = 0;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(ILclient!rv;)V")
	public static void method5501(@OriginalArg(1) Class5_Sub36_Sub2 arg0) {
		@Pc(10) Class5_Sub26 local10 = (Class5_Sub26) Static119.aClass20_7.method378();
		if (local10 == null) {
			return;
		}
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local10.anInt4753; local18++) {
			if (local10.aClass361Array2[local18] != null) {
				if (local10.aClass361Array2[local18].anInt9720 == 2) {
					local10.anIntArray261[local18] = -5;
				}
				if (local10.aClass361Array2[local18].anInt9720 == 0) {
					local16 = true;
				}
			}
			if (local10.aClass361Array1[local18] != null) {
				if (local10.aClass361Array1[local18].anInt9720 == 2) {
					local10.anIntArray261[local18] = -6;
				}
				if (local10.aClass361Array1[local18].anInt9720 == 0) {
					local16 = true;
				}
			}
		}
		if (local16) {
			return;
		}
		@Pc(103) int local103 = arg0.anInt8456;
		arg0.method7287(local10.anInt4751);
		for (@Pc(118) int local118 = 0; local118 < local10.anInt4753; local118++) {
			if (local10.anIntArray261[local118] == 0) {
				try {
					@Pc(146) int local146 = local10.anIntArray259[local118];
					@Pc(167) Field local167;
					@Pc(170) int local170;
					if (local146 == 0) {
						local167 = (Field) local10.aClass361Array2[local118].anObject20;
						local170 = local167.getInt((Object) null);
						arg0.method7324(0);
						arg0.method7287(local170);
					} else if (local146 == 1) {
						local167 = (Field) local10.aClass361Array2[local118].anObject20;
						local167.setInt((Object) null, local10.anIntArray260[local118]);
						arg0.method7324(0);
					} else if (local146 == 2) {
						local167 = (Field) local10.aClass361Array2[local118].anObject20;
						local170 = local167.getModifiers();
						arg0.method7324(0);
						arg0.method7287(local170);
					}
					@Pc(236) Method local236;
					if (local146 == 3) {
						local236 = (Method) local10.aClass361Array1[local118].anObject20;
						@Pc(261) byte[][] local261 = local10.aByteArrayArrayArray13[local118];
						@Pc(265) Object[] local265 = new Object[local261.length];
						for (@Pc(267) int local267 = 0; local267 < local261.length; local267++) {
							@Pc(279) ObjectInputStream local279 = new ObjectInputStream(new ByteArrayInputStream(local261[local267]));
							local265[local267] = local279.readObject();
						}
						@Pc(298) Object local298 = local236.invoke((Object) null, local265);
						if (local298 == null) {
							arg0.method7324(0);
						} else if (local298 instanceof Number) {
							arg0.method7324(1);
							arg0.method7329(((Number) local298).longValue());
						} else if (local298 instanceof String) {
							arg0.method7324(2);
							arg0.method7327((String) local298);
						} else {
							arg0.method7324(4);
						}
					} else if (local146 == 4) {
						local236 = (Method) local10.aClass361Array1[local118].anObject20;
						local170 = local236.getModifiers();
						arg0.method7324(0);
						arg0.method7287(local170);
					}
				} catch (@Pc(351) ClassNotFoundException local351) {
					arg0.method7324(-10);
				} catch (@Pc(357) InvalidClassException local357) {
					arg0.method7324(-11);
				} catch (@Pc(363) StreamCorruptedException local363) {
					arg0.method7324(-12);
				} catch (@Pc(369) OptionalDataException local369) {
					arg0.method7324(-13);
				} catch (@Pc(375) IllegalAccessException local375) {
					arg0.method7324(-14);
				} catch (@Pc(381) IllegalArgumentException local381) {
					arg0.method7324(-15);
				} catch (@Pc(387) InvocationTargetException local387) {
					arg0.method7324(-16);
				} catch (@Pc(393) SecurityException local393) {
					arg0.method7324(-17);
				} catch (@Pc(399) IOException local399) {
					arg0.method7324(-18);
				} catch (@Pc(405) NullPointerException local405) {
					arg0.method7324(-19);
				} catch (@Pc(411) Exception local411) {
					arg0.method7324(-20);
				} catch (@Pc(417) Throwable local417) {
					arg0.method7324(-21);
				}
			} else {
				arg0.method7324(local10.anIntArray261[local118]);
			}
		}
		arg0.method7299(local103);
		local10.method9222();
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!aa;IILclient!mj;IIILjava/lang/String;Lclient!kaa;ILclient!da;Z)V")
	public static void method5502(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class238 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class196 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class70 arg10) {
		@Pc(16) int local16;
		if (Static426.anInt7111 == 4) {
			local16 = (int) Static243.aFloat117 & 0x3FFF;
		} else {
			local16 = (int) Static243.aFloat117 + Static271.anInt4907 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt5985 / 2, arg3.anInt5973 / 2) + 10;
		@Pc(43) int local43 = arg9 * arg9 + arg6 * arg6;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(59) int local59 = Class42.anIntArray51[local16];
		@Pc(63) int local63 = Class42.anIntArray52[local16];
		if (Static426.anInt7111 != 4) {
			local63 = local63 * 256 / (Static283.anInt5029 + 256);
			local59 = local59 * 256 / (Static283.anInt5029 + 256);
		}
		@Pc(92) int local92 = local59 * arg6 + arg9 * local63 >> 14;
		@Pc(103) int local103 = arg6 * local63 - local59 * arg9 >> 14;
		@Pc(110) int local110 = arg8.method4562(arg7, 100, (Class155[]) null);
		@Pc(116) int local116 = local92 - local110 / 2;
		@Pc(124) int local124 = arg8.method4563(arg7, (Class155[]) null, 100, 0);
		if (local116 >= -arg3.anInt5985 && arg3.anInt5985 >= local116 && -arg3.anInt5973 <= local103 && local103 <= arg3.anInt5973) {
			arg10.method8435(arg0, 1, arg5, arg7, 50, local110, arg4, arg5 + local116 + arg3.anInt5985 / 2, (Class155[]) null, arg1, 0, 0, (int[]) null, 0, arg3.anInt5973 / 2 + arg1 - local124 - local103 - arg2);
		}
	}
}
