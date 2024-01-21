import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public static int anInt3314;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray32;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_922 = Static158.method3034("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public static int anInt3313 = 0;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "[J")
	public static final long[] aLongArray6 = new long[1000];

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public static int anInt3318 = -1;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lclient!hg;")
	public static Class29 method2564() {
		try {
			return (Class29) Class.forName("Class29_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return new Class29_Sub1();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZI)V")
	public static void method2566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static169.anInt4148 < 2 && Static29.anInt889 == 0 && !Static58.aBoolean74) {
			return;
		}
		@Pc(47) Class60 local47;
		if (Static29.anInt889 == 1 && Static169.anInt4148 < 2) {
			local47 = Static193.method3536(new Class60[] { Static56.aClass60_405, Static175.aClass60_1175, Static162.aClass60_1102, Static102.aClass60_827 });
		} else if (Static58.aBoolean74 && Static169.anInt4148 < 2) {
			local47 = Static193.method3536(new Class60[] { Static4.aClass60_35, Static175.aClass60_1175, Static167.aClass60_1132, Static102.aClass60_827 });
		} else {
			local47 = Static47.method2317(Static169.anInt4148 - 1);
		}
		if (Static169.anInt4148 > 2) {
			local47 = Static193.method3536(new Class60[] { local47, Static42.aClass60_301, Static72.method1661(Static169.anInt4148 - 2), Static41.aClass60_296 });
		}
		@Pc(125) int local125 = Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1784(local47, arg1 + 4, arg0 + 15, Static194.aRandom1, Static14.anInt470);
		Static129.method2731(arg0, arg1 + 4, local125 + Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1789(local47), 15);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2567(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static135.anInt3583 > 0) {
			local16 = Static118.aByteArrayArray5[--Static135.anInt3583];
			Static118.aByteArrayArray5[Static135.anInt3583] = null;
			return local16;
		} else if (arg0 == 5000 && Static148.anInt3849 > 0) {
			local16 = Static146.aByteArrayArray6[--Static148.anInt3849];
			Static146.aByteArrayArray6[Static148.anInt3849] = null;
			return local16;
		} else if (arg0 == 30000 && Static175.anInt4256 > 0) {
			local16 = Static97.aByteArrayArray4[--Static175.anInt4256];
			Static97.aByteArrayArray4[Static175.anInt4256] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
