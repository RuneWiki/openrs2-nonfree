import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt4201;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public static int anInt4203;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!hc;")
	public static Class51 aClass51_60;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public static int anInt4200 = -1;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString281 = "Loading...";

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "J")
	public static volatile long aLong132 = 0L;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3151(@OriginalArg(1) String arg0) {
		if (Static138.aClass1_Sub20Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = Static93.method2008(arg0);
		if (local14 == 0L) {
			return;
		}
		while (Static138.aClass1_Sub20Array1.length > local10 && local14 != Static138.aClass1_Sub20Array1[local10].aLong184) {
			local10++;
		}
		if (Static138.aClass1_Sub20Array1.length > local10 && Static138.aClass1_Sub20Array1[local10] != null) {
			Static171.aClass1_Sub13_Sub1_3.method1825(76);
			Static171.aClass1_Sub13_Sub1_3.method1770(Static138.aClass1_Sub20Array1[local10].aLong184);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mi;I)V")
	public static void method3152(@OriginalArg(0) Class9_Sub1 arg0) {
		if (Static156.anInt3722 == arg0.anInt409 || arg0.anInt443 == -1 || arg0.anInt399 != 0 || arg0.anInt474 + 1 > Static131.method697(arg0.anInt443).anIntArray170[arg0.anInt431]) {
			@Pc(42) int local42 = arg0.anInt409 - arg0.anInt421;
			@Pc(47) int local47 = Static156.anInt3722 - arg0.anInt421;
			@Pc(59) int local59 = arg0.anInt463 * 128 + arg0.method208() * 64;
			@Pc(70) int local70 = arg0.anInt471 * 128 + arg0.method208() * 64;
			@Pc(82) int local82 = arg0.anInt414 * 128 + arg0.method208() * 64;
			@Pc(94) int local94 = arg0.anInt456 * 128 + arg0.method208() * 64;
			arg0.anInt479 = (local94 * local47 + local70 * (local42 - local47)) / local42;
			arg0.anInt427 = (local47 * local82 + local59 * (local42 - local47)) / local42;
		}
		arg0.anInt429 = 0;
		if (arg0.anInt468 == 0) {
			arg0.anInt418 = 1024;
		}
		if (arg0.anInt468 == 1) {
			arg0.anInt418 = 1536;
		}
		if (arg0.anInt468 == 2) {
			arg0.anInt418 = 0;
		}
		if (arg0.anInt468 == 3) {
			arg0.anInt418 = 512;
		}
		arg0.anInt419 = arg0.anInt418;
	}
}
