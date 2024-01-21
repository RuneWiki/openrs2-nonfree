import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	public static int anInt2647;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!qd;")
	public static Class65 aClass65_10 = new Class65();

	@OriginalMember(owner = "client!na", name = "s", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1566 = Static107.method1838("Login");

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1562 = aClass28_1566;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1565 = Static107.method1838("Loaded wordpack");

	@OriginalMember(owner = "client!na", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1563 = aClass28_1565;

	@OriginalMember(owner = "client!na", name = "v", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1564 = Static107.method1838("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!na", name = "C", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1567 = Static107.method1838("blinken2:");

	@OriginalMember(owner = "client!na", name = "E", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1568 = Static107.method1838("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!na", name = "F", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1569 = Static107.method1838("");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ka;III)V")
	public static void method1856(@OriginalArg(0) Class2_Sub4_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub14 local12;
		@Pc(27) Class2_Sub4_Sub1_Sub5 local27;
		if (arg2 < Static178.anInt3959) {
			local12 = Static133.aClass2_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass19_1 != null && local12.aClass19_1.aClass2_Sub4_Sub1_1 instanceof Class2_Sub4_Sub1_Sub5) {
				local27 = (Class2_Sub4_Sub1_Sub5) local12.aClass19_1.aClass2_Sub4_Sub1_1;
				Static86.method1543(arg0, local27, 128, 0, 0, true);
			}
		}
		if (arg3 < Static178.anInt3959) {
			local12 = Static133.aClass2_Sub14ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass19_1 != null && local12.aClass19_1.aClass2_Sub4_Sub1_1 instanceof Class2_Sub4_Sub1_Sub5) {
				local27 = (Class2_Sub4_Sub1_Sub5) local12.aClass19_1.aClass2_Sub4_Sub1_1;
				Static86.method1543(arg0, local27, 0, 0, 128, true);
			}
		}
		if (arg2 < Static178.anInt3959 && arg3 < Static13.anInt587) {
			local12 = Static133.aClass2_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass19_1 != null && local12.aClass19_1.aClass2_Sub4_Sub1_1 instanceof Class2_Sub4_Sub1_Sub5) {
				local27 = (Class2_Sub4_Sub1_Sub5) local12.aClass19_1.aClass2_Sub4_Sub1_1;
				Static86.method1543(arg0, local27, 128, 0, 128, true);
			}
		}
		if (arg2 >= Static178.anInt3959 || arg3 <= 0) {
			return;
		}
		local12 = Static133.aClass2_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local12 != null && local12.aClass19_1 != null && local12.aClass19_1.aClass2_Sub4_Sub1_1 instanceof Class2_Sub4_Sub1_Sub5) {
			local27 = (Class2_Sub4_Sub1_Sub5) local12.aClass19_1.aClass2_Sub4_Sub1_1;
			Static86.method1543(arg0, local27, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	public static void method1857() {
		for (@Pc(1) int local1 = 0; local1 < Static84.anInt2128; local1++) {
			@Pc(6) Class43 local6 = Static58.aClass43Array37[local1];
			Static43.method773(local6);
			Static58.aClass43Array37[local1] = null;
		}
		Static84.anInt2128 = 0;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1858() {
		aClass28_1567 = null;
		aRandom1 = null;
		aClass28_1569 = null;
		aClass65_10 = null;
		aClass28_1568 = null;
		aClass28_1563 = null;
		aClass28_1564 = null;
		aClass28_1565 = null;
		aClass28_1566 = null;
		aClass28_1562 = null;
	}
}
