import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "E", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_3;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_60 = Static134.method2017("runes");

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!v;")
	public static Class76 aClass76_61 = Static134.method2017("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!ua;")
	public static Class72 aClass72_6 = new Class72(64);

	@OriginalMember(owner = "client!b", name = "B", descriptor = "[I")
	public static int[] anIntArray19 = new int[2000];

	@OriginalMember(owner = "client!b", name = "C", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "Lclient!v;")
	public static Class76 aClass76_63 = Static134.method2017("welle2:");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	public static void method96(@OriginalArg(1) int arg0) {
		Static92.anInt2149 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public static void method97() {
		aClass76_60 = null;
		anIntArray19 = null;
		aClass17_Sub1_3 = null;
		aClass76_61 = null;
		aClass76_63 = null;
		aClass72_6 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZLclient!la;Lclient!la;)V")
	public static void method98(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class17 arg2) {
		Static126.aClass17_41 = arg2;
		Static128.aClass17_42 = arg1;
		Static115.aBoolean145 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!la;)V")
	public static void method99(@OriginalArg(1) Class17 arg0) {
		Static32.aClass17_12 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public static void method100() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
