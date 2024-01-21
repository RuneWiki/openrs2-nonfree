import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_109 = Static8.method128("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "Lclient!u;")
	public static Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean10 = true;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_110 = Static8.method128("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_111 = Static8.method128("titlebox");

	@OriginalMember(owner = "client!ba", name = "q", descriptor = "Lclient!ea;")
	public static Class18 aClass18_112 = Static8.method128("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method175() {
		aClass18_110 = null;
		aClass18_111 = null;
		aClass18_112 = null;
		aClass77_1 = null;
		aClass18_109 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIILclient!k;)V")
	public static void method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub8_Sub3 arg4) {
		@Pc(15) int local15 = arg3 * arg3 + arg1 * arg1;
		if (local15 <= 4225 || local15 >= 90000) {
			Static178.method3191(arg2, arg1, arg4, arg0, arg3);
			return;
		}
		@Pc(35) int local35 = Static180.anInt4777 + Static98.anInt3021 & 0x7FF;
		@Pc(39) int local39 = Class1_Sub1_Sub8_Sub4.anIntArray212[local35];
		@Pc(47) int local47 = local39 * 256 / (Static160.anInt4384 + 256);
		@Pc(51) int local51 = Class1_Sub1_Sub8_Sub4.anIntArray216[local35];
		@Pc(59) int local59 = local51 * 256 / (Static160.anInt4384 + 256);
		@Pc(70) int local70 = local47 * arg3 + local59 * arg1 >> 16;
		@Pc(80) int local80 = arg3 * local59 - local47 * arg1 >> 16;
		@Pc(86) double local86 = Math.atan2((double) local70, (double) local80);
		@Pc(92) int local92 = (int) (Math.sin(local86) * 63.0D);
		@Pc(98) int local98 = (int) (Math.cos(local86) * 57.0D);
		Static126.aClass1_Sub1_Sub8_Sub3_5.method1653(local92 + arg0 + 94 + 4 - 10, -local98 + arg2 - -83 - 20, local86);
	}
}
