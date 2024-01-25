import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_82 = new Class6(65, 28);

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
	public static final int[] anIntArray400 = new int[32];

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_83 = new Class6(70, 0);

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_78 = new Class186(15, 2);

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_84 = new Class6(50, 6);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!kda;I)V")
	public static void method4831(@OriginalArg(0) Class160 arg0) {
		Static355.anInt1773 = arg0.method4199("titlebg");
		Static389.anInt6795 = arg0.method4199("logo");
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method4834() {
		if (Static211.anInt4386 < 0) {
			Static128.anInt3069 = -1;
			Static211.anInt4386 = 0;
			Static241.anInt2906 = -1;
		}
		if (Static211.anInt4386 > Static451.anInt3555) {
			Static241.anInt2906 = -1;
			Static211.anInt4386 = Static451.anInt3555;
			Static128.anInt3069 = -1;
		}
		if (Static181.anInt3889 < 0) {
			Static241.anInt2906 = -1;
			Static128.anInt3069 = -1;
			Static181.anInt3889 = 0;
		}
		if (Static451.anInt3551 < Static181.anInt3889) {
			Static241.anInt2906 = -1;
			Static181.anInt3889 = Static451.anInt3551;
			Static128.anInt3069 = -1;
		}
	}
}
