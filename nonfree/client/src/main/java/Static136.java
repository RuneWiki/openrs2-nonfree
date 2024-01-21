import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_14;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_918 = Static38.method685("Null");

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "Lclient!ai;")
	private static Class6 aClass6_919 = Static38.method685("Please try using a different world)3");

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_920 = aClass6_919;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "Lclient!ai;")
	public static Class6 aClass6_921 = aClass6_919;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!ai;")
	private static Class6 aClass6_922 = Static38.method685("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "Lclient!ai;")
	public static Class6 aClass6_923 = aClass6_922;

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!ai;")
	public static Class6 aClass6_924 = Static38.method685(" x ");

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "Lclient!ai;")
	public static Class6 aClass6_925 = Static38.method685("title_mute");

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "Lclient!ai;")
	public static Class6 aClass6_926 = aClass6_919;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
	public static int anInt3178 = -1;

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_931 = Static38.method685("Your account has been disabled)3");

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_927 = aClass6_931;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_928 = aClass6_919;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "Lclient!ai;")
	public static Class6 aClass6_929 = aClass6_919;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_930 = aClass6_919;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
	public static void method2121() {
		aClass6_930 = null;
		aClass6_920 = null;
		aClass6_931 = null;
		aClass6_927 = null;
		aClass6_929 = null;
		aClass6_918 = null;
		aClass6_921 = null;
		aClass10_Sub1_14 = null;
		aClass6_922 = null;
		aClass6_926 = null;
		aClass6_919 = null;
		aClass6_925 = null;
		aClass6_923 = null;
		aClass6_928 = null;
		aClass6_924 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ai;Lclient!ai;BLclient!ai;)V")
	public static void method2122(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(3) Class6 arg2) {
		Static9.aClass6_78 = arg1;
		Static9.aClass6_73 = arg0;
		Static9.aClass6_80 = arg2;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)Z")
	public static boolean method2123() {
		@Pc(5) Class15 local5 = Static86.aClass15_1;
		synchronized (Static86.aClass15_1) {
			if (Static138.anInt3226 == Static65.anInt1617) {
				return false;
			} else {
				Static4.anInt72 = Static81.anIntArray145[Static138.anInt3226];
				Static73.anInt1788 = Static105.anIntArray217[Static138.anInt3226];
				Static138.anInt3226 = Static138.anInt3226 + 1 & 0x7F;
				return true;
			}
		}
	}
}
