import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public static int anInt226;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!jca;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!aea;")
	public static final Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
	public static int anInt230 = 0;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "Lclient!db;")
	public static final Class64 aClass64_13 = new Class64(69, 9);

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_14 = new Class64(104, 2);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public static void method271() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static21.aBooleanArray5[local7] = false;
		}
		Static354.anInt6168 = 0;
		Static555.anInt9335 = 1;
		Static135.anInt3092 = -1;
		Static140.anInt3147 = -1;
		Static380.anInt6749 = -1;
		Static466.anInt7862 = 0;
		Static226.anInt4661 = -1;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)I")
	public static int method272() {
		return 46;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	public static int method273(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static59.method861(arg0);
	}
}
