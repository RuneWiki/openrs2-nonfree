import java.util.Random;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
	public static int anInt995;

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_5;

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "[Lclient!de;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!ea", name = "R", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array6 = new Class6[1000];

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ea", name = "W", descriptor = "Lclient!dd;")
	public static Class17 aClass17_4 = new Class17(500);

	@OriginalMember(owner = "client!ea", name = "X", descriptor = "Lclient!dd;")
	public static Class17 aClass17_5 = new Class17(30);

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_260 = Static38.method685("Versteckt");

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_261 = Static38.method685("<col=80ff00>");

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
	public static int anInt997 = 127;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public static void method620() {
		Static158.aClass5_1.method929();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static76.aLongArray2[local10] = 0L;
		}
		for (@Pc(22) int local22 = 0; local22 < 32; local22++) {
			Static102.aLongArray4[local22] = 0L;
		}
		Static52.anInt1434 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public static void method621() {
		aRandom1 = null;
		aClass6Array6 = null;
		aClass6_260 = null;
		aClass17_5 = null;
		aClass17_4 = null;
		aClass6_261 = null;
		aClass10_Sub1_5 = null;
		aClass18Array1 = null;
	}
}
