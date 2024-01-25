import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "[S")
	public static short[] aShortArray72;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_213 = new Class214(104, 18);

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "[I")
	public static int[] anIntArray347 = new int[2];

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
	public static void method4558(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class1 local9 = Static291.aClass257_18.method5506(); local9 != null; local9 = Static291.aClass257_18.method5501()) {
			if ((long) arg0 == (local9.aLong226 >> 48 & 0xFFFFL)) {
				local9.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)Z")
	public static boolean method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static290.method3791(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static384.anInt6381;
		@Pc(14) int local14 = arg2 << Static384.anInt6381;
		@Pc(23) int local23 = Static202.aClass163Array2[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static384.anInt6381 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static384.anInt6381 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static384.anInt6381 - 7);
		if (arg3 == 1) {
			if (local10 > Static332.anInt5443) {
				if (!Static95.method1363(local10, local23, local14)) {
					return false;
				}
				if (!Static95.method1363(local10, local23, local14 + Static188.anInt3025)) {
					return false;
				}
				if (!Static95.method1363(local10, local23, local14 + Static329.anInt5395)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static95.method1363(local10, local31, local14)) {
					return false;
				}
				if (!Static95.method1363(local10, local31, local14 + Static188.anInt3025)) {
					return false;
				}
				if (!Static95.method1363(local10, local31, local14 + Static329.anInt5395)) {
					return false;
				}
			}
			if (!Static95.method1363(local10, local39, local14)) {
				return false;
			} else if (Static95.method1363(local10, local39, local14 + Static188.anInt3025)) {
				return Static95.method1363(local10, local39, local14 + Static329.anInt5395);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static410.anInt6678) {
				if (!Static95.method1363(local10, local23, local14 + Static329.anInt5395)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static188.anInt3025, local23, local14 + Static329.anInt5395)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local23, local14 + Static329.anInt5395)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static95.method1363(local10, local31, local14 + Static329.anInt5395)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static188.anInt3025, local31, local14 + Static329.anInt5395)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local31, local14 + Static329.anInt5395)) {
					return false;
				}
			}
			if (!Static95.method1363(local10, local39, local14 + Static329.anInt5395)) {
				return false;
			} else if (Static95.method1363(local10 + Static188.anInt3025, local39, local14 + Static329.anInt5395)) {
				return Static95.method1363(local10 + Static329.anInt5395, local39, local14 + Static329.anInt5395);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static332.anInt5443) {
				if (!Static95.method1363(local10 + Static329.anInt5395, local23, local14)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local23, local14 + Static188.anInt3025)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local23, local14 + Static329.anInt5395)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static95.method1363(local10 + Static329.anInt5395, local31, local14)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local31, local14 + Static188.anInt3025)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local31, local14 + Static329.anInt5395)) {
					return false;
				}
			}
			if (!Static95.method1363(local10 + Static329.anInt5395, local39, local14)) {
				return false;
			} else if (Static95.method1363(local10 + Static329.anInt5395, local39, local14 + Static188.anInt3025)) {
				return Static95.method1363(local10 + Static329.anInt5395, local39, local14 + Static329.anInt5395);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static410.anInt6678) {
				if (!Static95.method1363(local10, local23, local14)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static188.anInt3025, local23, local14)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static95.method1363(local10, local31, local14)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static188.anInt3025, local31, local14)) {
					return false;
				}
				if (!Static95.method1363(local10 + Static329.anInt5395, local31, local14)) {
					return false;
				}
			}
			if (!Static95.method1363(local10, local39, local14)) {
				return false;
			} else if (Static95.method1363(local10 + Static188.anInt3025, local39, local14)) {
				return Static95.method1363(local10 + Static329.anInt5395, local39, local14);
			} else {
				return false;
			}
		} else if (!Static95.method1363(local10 + Static188.anInt3025, local47, local14 + Static188.anInt3025)) {
			return false;
		} else if (arg3 == 16) {
			return Static95.method1363(local10, local39, local14 + Static329.anInt5395);
		} else if (arg3 == 32) {
			return Static95.method1363(local10 + Static329.anInt5395, local39, local14 + Static329.anInt5395);
		} else if (arg3 == 64) {
			return Static95.method1363(local10 + Static329.anInt5395, local39, local14);
		} else if (arg3 == 128) {
			return Static95.method1363(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(II)I")
	public static int method4560(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!dh;B)Lclient!uf;")
	public static Class63_Sub3 method4562(@OriginalArg(0) Class1_Sub11 arg0) {
		return new Class63_Sub3(arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4482(), arg0.method4493(), arg0.method4493(), arg0.method4463());
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II[Lclient!vg;)V")
	public static void method4563(@OriginalArg(0) int arg0, @OriginalArg(2) Class250[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) Class250 local14 = arg1[local8];
			if (local14 != null) {
				if (local14.anInt7009 == 0) {
					if (local14.aClass250Array2 != null) {
						method4563(arg0, local14.aClass250Array2);
					}
					@Pc(35) Class1_Sub26 local35 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local14.anInt6994);
					if (local35 != null) {
						Static15.method241(arg0, local35.anInt3847);
					}
				}
				@Pc(51) Class1_Sub31 local51;
				if (arg0 == 0 && local14.lb != null) {
					local51 = new Class1_Sub31();
					local51.aClass250_8 = local14;
					local51.anObjectArray5 = local14.lb;
					Static267.method3402(local51);
				}
				if (arg0 == 1 && local14.anObjectArray14 != null) {
					if (local14.anInt7038 >= 0) {
						@Pc(74) Class250 local74 = Static96.method1379(local14.anInt6994);
						if (local74 == null || local74.aClass250Array2 == null || local14.anInt7038 >= local74.aClass250Array2.length || local14 != local74.aClass250Array2[local14.anInt7038]) {
							continue;
						}
					}
					local51 = new Class1_Sub31();
					local51.aClass250_8 = local14;
					local51.anObjectArray5 = local14.anObjectArray14;
					Static267.method3402(local51);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4564(@OriginalArg(1) String arg0) {
		Static116.aString52 = arg0;
		if (Static41.aClass124_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static41.aClass124_2.anApplet1.getParameter("cookieprefix");
			@Pc(26) String local26 = Static41.aClass124_2.anApplet1.getParameter("cookiehost");
			@Pc(41) String local41 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local26;
			if (arg0.length() == 0) {
				local41 = local41 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local41 = local41 + "; Expires=" + Static418.method5204(Static232.method3058() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static460.method3420("document.cookie=\"" + local41 + "\"", Static41.aClass124_2.anApplet1);
		} catch (@Pc(93) Throwable local93) {
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!vg;III)V")
	public static void method4565(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByte100 == 0) {
			arg0.anInt7013 = arg0.anInt7005;
		} else if (arg0.aByte100 == 1) {
			arg0.anInt7013 = arg0.anInt7005 + (arg2 - arg0.anInt6997) / 2;
		} else if (arg0.aByte100 == 2) {
			arg0.anInt7013 = arg2 - arg0.anInt7005 - arg0.anInt6997;
		} else if (arg0.aByte100 == 3) {
			arg0.anInt7013 = arg2 * arg0.anInt7005 >> 14;
		} else if (arg0.aByte100 == 4) {
			arg0.anInt7013 = (arg2 * arg0.anInt7005 >> 14) + (arg2 - arg0.anInt6997) / 2;
		} else {
			arg0.anInt7013 = arg2 - (arg2 * arg0.anInt7005 >> 14) - arg0.anInt6997;
		}
		if (arg0.aByte98 == 0) {
			arg0.anInt6964 = arg0.anInt7040;
		} else if (arg0.aByte98 == 1) {
			arg0.anInt6964 = (arg1 - arg0.anInt7041) / 2 + arg0.anInt7040;
		} else if (arg0.aByte98 == 2) {
			arg0.anInt6964 = arg1 - arg0.anInt7041 - arg0.anInt7040;
		} else if (arg0.aByte98 == 3) {
			arg0.anInt6964 = arg0.anInt7040 * arg1 >> 14;
		} else if (arg0.aByte98 == 4) {
			arg0.anInt6964 = (arg0.anInt7040 * arg1 >> 14) + (arg1 - arg0.anInt7041) / 2;
		} else {
			arg0.anInt6964 = arg1 - arg0.anInt7041 - (arg0.anInt7040 * arg1 >> 14);
		}
		if (!Static419.aBoolean556 || Static52.method804(arg0).anInt2172 == 0 && arg0.anInt7009 != 0) {
			return;
		}
		if (arg0.anInt7013 < 0) {
			arg0.anInt7013 = 0;
		} else if (arg2 < arg0.anInt6997 + arg0.anInt7013) {
			arg0.anInt7013 = arg2 - arg0.anInt6997;
		}
		if (arg0.anInt6964 < 0) {
			arg0.anInt6964 = 0;
		} else if (arg1 < arg0.anInt6964 + arg0.anInt7041) {
			arg0.anInt6964 = arg1 - arg0.anInt7041;
			return;
		}
	}
}
