import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public static int anInt1371 = 0;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_1324 = Static94.method1596("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_1325 = Static94.method1596("Regelversto-8 melden");

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_1326 = Static94.method1596("Select");

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_1327 = aClass1_1326;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	public static int anInt1376 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method944() {
		aClass1_1326 = null;
		aClass1_1324 = null;
		aClass1_1325 = null;
		aClass1_1327 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method945() {
		if (Static5.aClass10_1 == null) {
			return;
		}
		@Pc(9) long local9 = Static85.method1534();
		if (local9 <= Static12.aLong86) {
			return;
		}
		Static5.aClass10_1.method1739(local9);
		@Pc(27) int local27 = (int) (local9 - Static12.aLong86);
		Static12.aLong86 = local9;
		@Pc(38) Class local38 = ca.class;
		synchronized (ca.class) {
			Static39.anInt2689 += Static5.anInt382 * local27;
			@Pc(60) int local60 = (Static39.anInt2689 - Static5.anInt382 * 2000) / 1000;
			if (local60 > 0) {
				if (Static46.aClass2_Sub2_1 != null) {
					Static46.aClass2_Sub2_1.method1197(local60);
				}
				Static39.anInt2689 -= local60 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([BBLclient!sa;I)V")
	public static void method946(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub7 local15 = new Class2_Sub7();
		local15.aLong96 = arg2;
		local15.aByteArray12 = arg0;
		local15.anInt1640 = 0;
		local15.aClass57_2 = arg1;
		@Pc(30) Class46 local30 = Static53.aClass46_4;
		synchronized (Static53.aClass46_4) {
			Static53.aClass46_4.method1437(local15);
		}
		Static43.method992();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method947(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static48.aClass63_1);
		arg0.addMouseMotionListener(Static48.aClass63_1);
		arg0.addFocusListener(Static48.aClass63_1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method948() {
		Static59.aClass29_1.method1591();
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			Static55.aLongArray2[local6] = 0L;
		}
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static112.aLongArray7[local18] = 0L;
		}
		Static20.anInt898 = 0;
	}
}
