import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!vo", name = "gb", descriptor = "I")
	public static int anInt6105;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Lclient!o;")
	public static final Class169 aClass169_330 = new Class169("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "Lclient!tl;")
	public static final Class227 aClass227_47 = new Class227(50);

	@OriginalMember(owner = "client!vo", name = "mb", descriptor = "Lclient!j;")
	public static final Class113 aClass113_18 = new Class113(7, 7);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z[[I)V")
	public static void method5252(@OriginalArg(1) int[][] arg0) {
		Static369.anIntArrayArray35 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "(I)V")
	public static void method5255() {
		Static107.aClass1_Sub40_3 = new Class1_Sub40(Static350.aClass169_306.method3680(Static48.anInt952), "", Static283.anInt4904, 1004, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "(I)V")
	public static void method5256() {
		Static314.method4644();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static257.aClass222Array1[local8].method4831();
		}
		Static372.method1264();
		Static81.method1214();
		System.gc();
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(B)V")
	public static void method5259() {
		Static197.aClass1_Sub7_Sub1_3.method1079();
		Static271.anInt4720 = 1;
		Static315.aClass230_71 = null;
	}
}
