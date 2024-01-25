import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[I")
	public static int[] anIntArray230;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_17 = new Class42();

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_112 = new Class106("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public static void method2925() {
		Static94.anInt2085 = 0;
		@Pc(12) int local12 = (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7) + Static50.anInt1271;
		@Pc(27) int local27 = (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7) + Static299.anInt4036;
		if (local12 >= 3053 && local12 <= 3156 && local27 >= 3056 && local27 <= 3136) {
			Static94.anInt2085 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local27 >= 9492 && local27 <= 9535) {
			Static94.anInt2085 = 1;
		}
		if (Static94.anInt2085 == 1 && local12 >= 3139 && local12 <= 3199 && local27 >= 3008 && local27 <= 3062) {
			Static94.anInt2085 = 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!gt;)[Lclient!mg;")
	public static Class134[] method2926(@OriginalArg(1) Class75 arg0) {
		if (!arg0.method2365()) {
			return new Class134[0];
		}
		@Pc(16) Class121 local16 = arg0.method2348();
		while (local16.anInt3693 == 0) {
			Static135.method2737(10L);
		}
		if (local16.anInt3693 == 2) {
			return new Class134[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject2;
		@Pc(43) Class134[] local43 = new Class134[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class134 local51 = new Class134();
			local43[local45] = local51;
			local51.anInt3972 = local37[local45 << 2];
			local51.anInt3973 = local37[(local45 << 2) + 1];
			local51.anInt3968 = local37[(local45 << 2) + 2];
			local51.anInt3974 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
