import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!hn", name = "T", descriptor = "Z")
	public static boolean aBoolean124;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(B)I")
	public static int method1746() {
		return ((Static210.anInt4682 == 0 ? 0 : 1) << 22) + ((Static153.aBoolean183 ? 1 : 0) << 19) + ((Static70.aBoolean96 ? 1 : 0) << 16) + ((Static10.aBoolean12 ? 1 : 0) << 13) + ((Static265.anInt5769 & 0x3) << 11) + ((Static50.aBoolean80 ? 1 : 0) << 9) + ((Static135.aBoolean157 ? 1 : 0) << 5) + ((Static53.aBoolean84 ? 1 : 0) << 4) + (Static20.anInt5576 & 0x7) + ((Static138.aBoolean162 ? 1 : 0) << 3) + ((Static45.aBoolean75 ? 1 : 0) << 6) + ((Static64.aBoolean92 ? 1 : 0) << 7) + ((Static135.aBoolean154 ? 1 : 0) << 8) + ((Static263.aBoolean302 ? 1 : 0) << 10) + ((Static119.aBoolean141 ? 1 : 0) << 15) + (Static204.anInt4555 << 17) + ((Static11.anInt2931 == 0 ? 0 : 1) << 20) + ((Static239.anInt5264 == 0 ? 0 : 1) << 21) + (Static155.method2875() << 23);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!kb;Lclient!kb;ZLclient!kb;)V")
	public static void method1747(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(3) Class83 arg2) {
		Static86.aClass83_54 = arg0;
		Static186.aClass83_128 = arg1;
		Static210.aClass83_140 = arg2;
	}

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "(B)V")
	public static void method1749() {
		Static18.aClass155_6.method4362();
	}
}
