import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "Lclient!pf;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!wa", name = "mb", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!wa", name = "qb", descriptor = "I")
	public static int anInt3959;

	@OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "I")
	public static int anInt3957 = 0;

	@OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2356 = Static107.method1838("Versteckt");

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2357 = Static107.method1838("k");

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2358 = Static107.method1838("huffman");

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(BII)I")
	public static int method2781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static17.method420(4, arg1 + 45365, arg0 - -91923) + (Static17.method420(2, arg1 + 10294, arg0 - -37821) - 128 >> 1) + (Static17.method420(1, arg1, arg0) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!gg;Lclient!jc;BLclient!jc;Lclient!gg;)Lclient!th;")
	public static Class2_Sub4_Sub3_Sub2_Sub1 method2782(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) Class28 arg3) {
		@Pc(15) int local15 = arg2.method1777(arg3);
		@Pc(23) int local23 = arg2.method1774(arg0, local15);
		return Static11.method351(arg2, local23, local15, arg1);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public static void method2783() {
		aClass61_1 = null;
		aClass28_2357 = null;
		aClass28_2358 = null;
		anIntArray364 = null;
		aClass28_2356 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
	public static void method2785(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static181.method2906(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static99.aClass66_3.anApplet1 != null) {
				@Pc(106) Class41 local106 = Static99.aClass66_3.method2123(new URL(Static99.aClass66_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static148.anInt3352 + "&u=" + Static103.aLong91 + "&v1=" + Static134.aString4 + "&v2=" + Static134.aString5 + "&e=" + local7));
				while (local106.anInt2096 == 0) {
					Static176.method2744(1L);
				}
				if (local106.anInt2096 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local106.anObject2;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
