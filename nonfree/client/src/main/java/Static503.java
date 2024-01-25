import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	public static int anInt8161;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!da;")
	public static Class69 aClass69_10;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
	public static int anInt8166;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IILclient!ha;IIIIII)V")
	public static void method7148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Interface11 local15 = (Interface11) Static583.method8200(arg4, arg5, arg0);
		@Pc(24) Class277 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(49) int local49;
		if (local15 != null) {
			local24 = Static652.aClass267_4.method6682(local15.method9221());
			local30 = local15.method9217() & 0x3;
			local34 = local15.method9216();
			if (local24.anInt7713 == -1) {
				local49 = arg6;
				if (local24.anInt7757 > 0) {
					local49 = arg7;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg2.method8482(4, arg1, arg3, local49);
					} else if (local30 == 1) {
						arg2.method8493(arg3, arg1, local49, 4);
					} else if (local30 == 2) {
						arg2.method8482(4, arg1 + 3, arg3, local49);
					} else if (local30 == 3) {
						arg2.method8493(arg3 + 3, arg1, local49, 4);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg2.method8452(1, arg3, 1, arg1, local49);
					} else if (local30 == 1) {
						arg2.method8452(1, arg3, 1, arg1 + 3, local49);
					} else if (local30 == 2) {
						arg2.method8452(1, arg3 + 3, 1, arg1 + 3, local49);
					} else if (local30 == 3) {
						arg2.method8452(1, arg3 + 3, 1, arg1, local49);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg2.method8493(arg3, arg1, local49, 4);
					} else if (local30 == 1) {
						arg2.method8482(4, arg1 + 3, arg3, local49);
					} else if (local30 == 2) {
						arg2.method8493(arg3 + 3, arg1, local49, 4);
					} else if (local30 == 3) {
						arg2.method8482(4, arg1, arg3, local49);
					}
				}
			} else {
				Static352.method5224(local24, arg2, local30, arg3, arg1);
			}
		}
		local15 = (Interface11) Static318.method4861(arg4, arg5, arg0, he.class);
		if (local15 != null) {
			local24 = Static652.aClass267_4.method6682(local15.method9221());
			local30 = local15.method9217() & 0x3;
			local34 = local15.method9216();
			if (local24.anInt7713 != -1) {
				Static352.method5224(local24, arg2, local30, arg3, arg1);
			} else if (local34 == 9) {
				local49 = -1118482;
				if (local24.anInt7757 > 0) {
					local49 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg2.method8467(local49, arg3 + 3, arg1 + 3, arg3, arg1);
				} else {
					arg2.method8467(local49, arg3, arg1 + 3, arg3 - -3, arg1);
				}
			}
		}
		local15 = (Interface11) Static280.method4469(arg4, arg5, arg0);
		if (local15 == null) {
			return;
		}
		local24 = Static652.aClass267_4.method6682(local15.method9221());
		local30 = local15.method9217() & 0x3;
		if (local24.anInt7713 != -1) {
			Static352.method5224(local24, arg2, local30, arg3, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "()V")
	public static void method7149() {
		for (@Pc(1) int local1 = 0; local1 < Static569.aClass383Array1.length; local1++) {
			Static569.aClass383Array1[local1].method9130();
		}
		Static569.aClass383Array1 = null;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
	public static void method7150() {
		Static36.aClass83_2.method2374();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
	public static void method7152(@OriginalArg(1) int arg0) {
		Static399.aLong204 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method7153(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static643.method8934(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static142.method2609(local7);
			local7 = Static101.method1778("%3a", local7, ":");
			local7 = Static101.method1778("%40", local7, "@");
			local7 = Static101.method1778("%26", local7, "&");
			local7 = Static101.method1778("%23", local7, "#");
			if (Static261.anApplet2 != null) {
				@Pc(110) Class81 local110 = Static264.aClass291_3.method7127(new URL(Static261.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static179.anInt3523 + "&u=" + (Static636.aString120 == null ? String.valueOf(Static65.aLong38) : Static636.aString120) + "&v1=" + Static497.aString96 + "&v2=" + Static497.aString93 + "&e=" + local7));
				while (local110.anInt2532 == 0) {
					Static373.method5403(1L);
				}
				if (local110.anInt2532 == 1) {
					@Pc(128) DataInputStream local128 = (DataInputStream) local110.anObject4;
					local128.read();
					local128.close();
				}
			}
		} catch (@Pc(135) Exception local135) {
		}
	}
}
