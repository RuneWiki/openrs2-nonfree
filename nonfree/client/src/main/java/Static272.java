import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray75;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[Lclient!cj;")
	public static Class28[] aClass28Array3 = new Class28[50];

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	public static int anInt3136 = 0;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "B")
	public static byte aByte15 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)I")
	public static int method2767(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)J")
	public static long method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass95_1 == null ? 0L : local7.aClass95_1.aLong124;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2776(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
