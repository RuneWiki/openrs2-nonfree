import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "I")
	public static int anInt2981;

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_99 = new Class107(78, 2);

	@OriginalMember(owner = "client!hu", name = "x", descriptor = "I")
	public static int anInt2982 = 0;

	@OriginalMember(owner = "client!hu", name = "A", descriptor = "Lclient!ls;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!ya;IILclient!jt;II)V")
	public static void method2569(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class129 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class58 local9 = Static343.aClass217_15.method4901(arg2.anInt3493);
		if (local9.anInt1855 == -1) {
			return;
		}
		if (arg2.aBoolean216) {
			@Pc(23) int local23 = arg3 + arg2.anInt3492;
			arg3 = local23 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(46) Class143 local46 = local9.method1603(arg3, arg0, arg2.aBoolean213);
		if (local46 == null) {
			return;
		}
		@Pc(52) int local52 = arg2.anInt3517;
		@Pc(55) int local55 = arg2.anInt3507;
		if ((arg3 & 0x1) == 1) {
			local52 = arg2.anInt3507;
			local55 = arg2.anInt3517;
		}
		@Pc(71) int local71 = local46.j();
		@Pc(74) int local74 = local46.T();
		if (local9.aBoolean111) {
			local74 = local55 * 4;
			local71 = local52 * 4;
		}
		if (local9.anInt1850 == 0) {
			local46.method5719(arg1, arg4 + 4 - local55 * 4, local71, local74);
		} else {
			local46.s(arg1, arg4 - (local55 - 1) * 4, local71, local74, 0, local9.anInt1850 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method2570(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static206.method3302(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static46.method824(local5);
			local5 = Static263.method3885(local5, ":", "%3a");
			local5 = Static263.method3885(local5, "@", "%40");
			local5 = Static263.method3885(local5, "&", "%26");
			local5 = Static263.method3885(local5, "#", "%23");
			if (Static455.aClass180_5.anApplet1 != null) {
				@Pc(105) Class9 local105 = Static455.aClass180_5.method4076(new URL(Static455.aClass180_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static123.anInt2494 + "&u=" + Static198.aLong117 + "&v1=" + Static282.aString46 + "&v2=" + Static282.aString44 + "&e=" + local5));
				while (local105.anInt368 == 0) {
					Static224.method3441(1L);
				}
				if (local105.anInt368 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local105.anObject2;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IB)Z")
	public static boolean method2572(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)V")
	public static void method2573() {
		Static414.anInt6715 = -1;
		Static264.anInt4692 = 0;
		Static207.anInt3927 = -1;
		Static446.anInt7163 = -1;
	}
}
