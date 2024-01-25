import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lclient!f;")
	public static Class88 aClass88_13;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_74 = new Class90(64, 16);

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "Lclient!jda;")
	public static final Class162 aClass162_4 = new Class162("", 15);

	@OriginalMember(owner = "client!ie", name = "fb", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_8 = new Class68(4, 1, 1, 1);

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "[I")
	public static final int[] anIntArray221 = new int[1000];

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
	public static int anInt4500 = 0;

	@OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
	public static int anInt4501 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJ)V")
	public static void method3478(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static77.method1608(arg0 - 1L);
			Static77.method1608(1L);
		} else {
			Static77.method1608(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Z")
	public static boolean method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!vj;[Lclient!am;)V")
	public static void method3482(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Class4_Sub3[] arg1) {
		@Pc(6) int local6;
		if (Static505.aBoolean639) {
			local6 = arg0.method8234(arg1);
			Static299.aClass7_12.method7852(local6, arg1);
		}
		if (Static140.aClass115Array1 == Static255.aClass115Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class21_Sub1_Sub1) {
				local6 = ((Class21_Sub1_Sub1) arg0).aShort119;
				local28 = ((Class21_Sub1_Sub1) arg0).aShort121;
			} else {
				local6 = arg0.anInt10551 >> Static392.anInt3635;
				local28 = arg0.anInt10550 >> Static392.anInt3635;
			}
			Static299.aClass7_12.YA(Static432.aClass115Array3[0].method8064(arg0.anInt10551, arg0.anInt10550), Static418.method6588(local6, local28), Static600.method3511(local6, local28), Static493.method7124(local6, local28));
		}
		@Pc(64) Class21_Sub4 local64 = arg0.method8228(Static299.aClass7_12);
		if (local64 == null) {
			return;
		}
		local64.aClass21_Sub1_2 = arg0;
		if (Static406.aBoolean566) {
			@Pc(73) Class158 local73 = Static322.aClass158_13;
			synchronized (Static322.aClass158_13) {
				@Pc(77) boolean local77 = false;
				for (@Pc(82) Class21_Sub4 local82 = (Class21_Sub4) Static322.aClass158_13.method3726(); local82 != null; local82 = (Class21_Sub4) Static322.aClass158_13.method3721()) {
					if (arg0.anInt10557 >= local82.aClass21_Sub1_2.anInt10557) {
						Static239.method3895(local64, local82);
						local77 = true;
						break;
					}
				}
				if (!local77) {
					Static322.aClass158_13.method3720(local64);
				}
				return;
			}
		}
		@Pc(117) boolean local117 = false;
		for (@Pc(122) Class21_Sub4 local122 = (Class21_Sub4) Static322.aClass158_13.method3726(); local122 != null; local122 = (Class21_Sub4) Static322.aClass158_13.method3721()) {
			if (arg0.anInt10557 >= local122.aClass21_Sub1_2.anInt10557) {
				Static239.method3895(local64, local122);
				local117 = true;
				break;
			}
		}
		if (!local117) {
			Static322.aClass158_13.method3720(local64);
		}
	}
}
