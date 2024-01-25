import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!nq", name = "V", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!nq", name = "Y", descriptor = "Lclient!uk;")
	public static Class346 aClass346_5 = new Class346("WTWIP", "office", "_wip", 3);

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "(I)V")
	public static void method5943() {
		if (Static454.method6737(Static469.anInt7883) || Static318.method4969(Static469.anInt7883)) {
			Static369.method5771(Static70.anInt9231 >> 12, Static646.anInt10445 >> 12, 5000);
		} else {
			@Pc(31) int local31 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0] >> 3;
			@Pc(38) int local38 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0] >> 3;
			if (local31 >= 0 && local31 < Static111.anInt1752 >> 3 && local38 >= 0 && local38 < Static279.anInt4567 >> 3) {
				Static369.method5771(local31, local38, 5000);
			} else {
				Static369.method5771(Static111.anInt1752 >> 4, Static279.anInt4567 >> 4, 0);
			}
		}
		Static342.method5253();
		Static533.method389();
		Static256.method7331();
		Static587.method8249();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
	public static byte[] method5945(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static190.method674(local18) : local18;
		} else if (arg0 instanceof Class225) {
			@Pc(34) Class225 local34 = (Class225) arg0;
			return local34.method8143();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5947(@OriginalArg(0) Class126 arg0) {
		if (Static251.aBoolean343) {
			Static89.method1392(arg0);
		} else {
			Static317.method4965(arg0);
		}
	}
}
