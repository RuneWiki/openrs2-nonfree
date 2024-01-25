import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
	public static int anInt410 = -1;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "[I")
	public static final int[] anIntArray40 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	public static int anInt412 = -2;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Lclient!ho;")
	public static Class2_Sub16 method388() {
		if (Static5.aClass181_45 == null || Static196.aClass42_1 == null) {
			return null;
		}
		for (@Pc(16) Class2_Sub16 local16 = (Class2_Sub16) Static196.aClass42_1.method905(); local16 != null; local16 = (Class2_Sub16) Static196.aClass42_1.method905()) {
			@Pc(30) Class203 local30 = Static5.aClass84_4.method1953(local16.anInt2880);
			if (local30 != null && local30.aBoolean420 && local30.method4740(Static5.anInterface10_2)) {
				return local16;
			}
		}
		return null;
	}
}
