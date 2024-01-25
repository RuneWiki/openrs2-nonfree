import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "Lclient!cp;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "Lclient!wn;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
	public static int anInt278;

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "I")
	public static int anInt280;

	@OriginalMember(owner = "client!aq", name = "X", descriptor = "Lclient!jb;")
	public static Class115_Sub1 aClass115_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "[I")
	public static final int[] anIntArray29 = new int[2048];

	@OriginalMember(owner = "client!aq", name = "W", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!aq", name = "ab", descriptor = "I")
	public static int anInt287 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([SI)[S")
	public static short[] method181(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static404.method4342(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([BI)Z")
	public static boolean method182(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		@Pc(12) int local12 = local8.method5174();
		if (local12 != 1) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method5174() == 1;
		if (local28) {
			Static113.method1651(local8);
		}
		Static329.method3254(local8);
		return true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!ui;Lclient!ui;)I")
	public static int method185(@OriginalArg(1) Class230 arg0, @OriginalArg(2) Class230 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method4966(Static107.anInt5816)) {
			local5++;
		}
		if (arg0.method4966(Static160.anInt2900)) {
			local5++;
		}
		if (arg0.method4966(Static241.anInt4030)) {
			local5++;
		}
		if (arg1.method4966(Static107.anInt5816)) {
			local5++;
		}
		if (arg1.method4966(Static160.anInt2900)) {
			local5++;
		}
		if (arg1.method4966(Static241.anInt4030)) {
			local5++;
		}
		return local5;
	}
}
