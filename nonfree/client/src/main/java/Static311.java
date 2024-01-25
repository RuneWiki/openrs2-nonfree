import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[[Lclient!sj;")
	public static Class181[][] aClass181ArrayArray1;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	public static int anInt6166 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!lb;")
	public static Class86 method5219(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(19) Class local19 = Class.forName("Class86_Sub2");
			@Pc(23) Class86 local23 = (Class86) local19.getDeclaredConstructor().newInstance();
			local23.method5026(arg0);
			return local23;
		} catch (@Pc(32) Throwable local32) {
			@Pc(36) Class86_Sub1 local36 = new Class86_Sub1();
			local36.method5026(arg0);
			return local36;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIBLclient!tj;IIII)V")
	public static void method5220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface5 local11 = (Interface5) Static132.method2235(arg1, arg4, arg2);
		@Pc(24) Class170 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(49) int local49;
		if (local11 != null) {
			local24 = Static268.method4553(local11.method5344());
			local30 = local11.method5337() & 0x3;
			local34 = local11.method5342();
			if (local24.anInt5258 == -1) {
				local49 = arg0;
				if (local24.anInt5227 > 0) {
					local49 = arg5;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg3.method4760(4, local49, arg6, arg7);
					} else if (local30 == 1) {
						arg3.method4736(local49, arg6, 4, arg7);
					} else if (local30 == 2) {
						arg3.method4760(4, local49, arg6 + 3, arg7);
					} else if (local30 == 3) {
						arg3.method4736(local49, arg6, 4, arg7 + 3);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg3.method4801(1, arg6, arg7, 1, local49);
					} else if (local30 == 1) {
						arg3.method4801(1, arg6 + 3, arg7, 1, local49);
					} else if (local30 == 2) {
						arg3.method4801(1, arg6 + 3, arg7 + 3, 1, local49);
					} else if (local30 == 3) {
						arg3.method4801(1, arg6, arg7 + 3, 1, local49);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg3.method4736(local49, arg6, 4, arg7);
					} else if (local30 == 1) {
						arg3.method4760(4, local49, arg6 + 3, arg7);
					} else if (local30 == 2) {
						arg3.method4736(local49, arg6, 4, arg7 + 3);
					} else if (local30 == 3) {
						arg3.method4760(4, local49, arg6, arg7);
					}
				}
			} else {
				Static79.method4637(local24, arg7, arg6, arg3, local30);
			}
		}
		local11 = (Interface5) Static134.method2239(arg1, arg4, arg2, lk.class);
		if (local11 != null) {
			local24 = Static268.method4553(local11.method5344());
			local30 = local11.method5337() & 0x3;
			local34 = local11.method5342();
			if (local24.anInt5258 != -1) {
				Static79.method4637(local24, arg7, arg6, arg3, local30);
			} else if (local34 == 9) {
				local49 = -1118482;
				if (local24.anInt5227 > 0) {
					local49 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg3.method4793(arg6 + 3, arg7, arg6, arg7 + 3, local49);
				} else {
					arg3.method4793(arg6 + 3, arg7 - -3, arg6, arg7, local49);
				}
			}
		}
		local11 = (Interface5) Static135.method2262(arg1, arg4, arg2);
		if (local11 == null) {
			return;
		}
		local24 = Static268.method4553(local11.method5344());
		local30 = local11.method5337() & 0x3;
		if (local24.anInt5258 != -1) {
			Static79.method4637(local24, arg7, arg6, arg3, local30);
			return;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Lclient!uh;")
	public static Class201 method5224(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static193.aFloat14 == 3.0D) {
				return Static307.aClass201_16;
			}
			if ((double) Static193.aFloat14 == 4.0D) {
				return Static98.aClass201_1;
			}
			if ((double) Static193.aFloat14 == 6.0D) {
				return Static163.aClass201_8;
			}
			if ((double) Static193.aFloat14 >= 8.0D) {
				return Static235.aClass201_12;
			}
		} else if (arg0 == 1) {
			if ((double) Static193.aFloat14 == 3.0D) {
				return Static163.aClass201_8;
			}
			if ((double) Static193.aFloat14 == 4.0D) {
				return Static235.aClass201_12;
			}
			if ((double) Static193.aFloat14 == 6.0D) {
				return Static162.aClass201_3;
			}
			if ((double) Static193.aFloat14 >= 8.0D) {
				return Static251.aClass201_14;
			}
		} else if (arg0 == 2) {
			if ((double) Static193.aFloat14 == 3.0D) {
				return Static162.aClass201_3;
			}
			if ((double) Static193.aFloat14 == 4.0D) {
				return Static251.aClass201_14;
			}
			if ((double) Static193.aFloat14 == 6.0D) {
				return Static215.aClass201_11;
			}
			if ((double) Static193.aFloat14 >= 8.0D) {
				return Static274.aClass201_15;
			}
		}
		return null;
	}
}
