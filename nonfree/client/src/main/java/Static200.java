import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
	public static int anInt4059;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	public static int anInt4057 = 0;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_50 = new Class241(88, 15);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_23 = new Class359(8);

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!ft;)[Lclient!sha;")
	public static Class328[] method3727(@OriginalArg(1) Class122 arg0) {
		if (!arg0.method3354()) {
			return new Class328[0];
		}
		@Pc(17) Class380 local17 = arg0.method3359();
		while (local17.anInt10067 == 0) {
			Static255.method4444(10L);
		}
		if (local17.anInt10067 == 2) {
			return new Class328[0];
		}
		@Pc(53) int[] local53 = (int[]) local17.anObject25;
		@Pc(59) Class328[] local59 = new Class328[local53.length >> 2];
		for (@Pc(61) int local61 = 0; local61 < local59.length; local61++) {
			@Pc(67) Class328 local67 = new Class328();
			local59[local61] = local67;
			local67.anInt9013 = local53[local61 << 2];
			local67.anInt9016 = local53[(local61 << 2) + 1];
			local67.anInt9011 = local53[(local61 << 2) + 2];
			local67.anInt9012 = local53[(local61 << 2) + 3];
		}
		return local59;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Lclient!iga;")
	public static Class6_Sub24 method3728() {
		if (Static627.aClass340_57 == null || Static678.aClass167_1 == null) {
			return null;
		}
		Static678.aClass167_1.method4230(Static627.aClass340_57);
		@Pc(29) Class6_Sub24 local29 = (Class6_Sub24) Static678.aClass167_1.method4235();
		if (local29 == null) {
			return null;
		} else {
			@Pc(40) Class361 local40 = Static627.aClass190_5.method4695(local29.anInt4787);
			return local40 != null && local40.aBoolean724 && local40.method8534(Static627.anInterface10_2) ? local29 : Static113.method2131();
		}
	}
}
