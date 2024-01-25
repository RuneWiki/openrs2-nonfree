import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	public static int anInt5031;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_131 = new Class140(50);

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!ng;")
	public static Class140 aClass140_132 = new Class140(64);

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[128][128];

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "[I")
	public static final int[] anIntArray639 = new int[32];

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
	public static int anInt5034 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZILjava/lang/String;)V")
	public static void method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class177 local8 = Static323.method5412(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray14 != null) {
			@Pc(18) Class1_Sub19 local18 = new Class1_Sub19();
			local18.anInt3149 = arg2;
			local18.aString122 = arg3;
			local18.anObjectArray3 = local8.anObjectArray14;
			local18.aClass177_9 = local8;
			Static98.method1797(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt5204 > 0) {
			local35 = Static176.method3460(local8);
		}
		if (!local35 || !Static47.method1096(local8).method4899(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static248.aClass1_Sub7_Sub1_2.method728(28);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 2) {
			Static248.aClass1_Sub7_Sub1_2.method728(31);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 3) {
			Static248.aClass1_Sub7_Sub1_2.method728(80);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 4) {
			Static248.aClass1_Sub7_Sub1_2.method728(224);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 5) {
			Static248.aClass1_Sub7_Sub1_2.method728(32);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 6) {
			Static248.aClass1_Sub7_Sub1_2.method728(53);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 7) {
			Static248.aClass1_Sub7_Sub1_2.method728(219);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 8) {
			Static248.aClass1_Sub7_Sub1_2.method728(254);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 9) {
			Static248.aClass1_Sub7_Sub1_2.method728(33);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
		if (arg2 == 10) {
			Static248.aClass1_Sub7_Sub1_2.method728(3);
			Static248.aClass1_Sub7_Sub1_2.method3098(arg1);
			Static248.aClass1_Sub7_Sub1_2.method3128(arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method4568() {
		Static156.aClass140_81.method3813();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4570(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static200.aString162 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static312.aString259 + "</col>";
		}
	}
}
