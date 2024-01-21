import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	public static int anInt255 = 0;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!v;")
	private static Class76 aClass76_130 = Static134.method2017("Walk here");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_131 = Static134.method2017("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_132 = aClass76_130;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	public static int anInt261 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] method179() {
		@Pc(4) Class4_Sub4_Sub5_Sub4[] local4 = new Class4_Sub4_Sub5_Sub4[Static3.anInt2206];
		for (@Pc(15) int local15 = 0; local15 < Static3.anInt2206; local15++) {
			@Pc(25) Class4_Sub4_Sub5_Sub4 local25 = local4[local15] = new Class4_Sub4_Sub5_Sub4();
			local25.anInt2608 = Static55.anInt1464;
			local25.anInt2611 = Static18.anInt350;
			local25.anInt2610 = Static31.anIntArray96[local15];
			local25.anInt2609 = Static102.anIntArray321[local15];
			local25.anInt2607 = Static34.anIntArray107[local15];
			local25.anInt2612 = Static25.anIntArray80[local15];
			local25.anIntArray388 = Static49.anIntArray159;
			local25.aByteArray69 = Static38.aByteArrayArray3[local15];
		}
		Static57.method1000();
		return local4;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!v;Lclient!v;ILclient!v;)V")
	public static void method180(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(3) Class76 arg2) {
		Static111.aClass76_1151 = arg2;
		Static111.aClass76_1156 = arg0;
		Static111.aClass76_1154 = arg1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILclient!la;)Lclient!wd;")
	public static Class4_Sub24 method181(@OriginalArg(1) int arg0, @OriginalArg(2) Class17 arg1) {
		@Pc(8) byte[] local8 = arg1.method291(arg0);
		return local8 == null ? null : new Class4_Sub24(local8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!ef;I)V")
	public static void method182(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub4_Sub3_Sub1 arg1) {
		Static29.method385(arg1.anInt1416, arg1.anInt1393, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method183() {
		aClass76_131 = null;
		aClass76_130 = null;
		aClass76_132 = null;
	}
}
