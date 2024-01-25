import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!kh", name = "fb", descriptor = "[Lclient!wt;")
	public static final Class365[] aClass365Array1 = new Class365[14];

	@OriginalMember(owner = "client!kh", name = "qb", descriptor = "[I")
	public static final int[] anIntArray268 = new int[1000];

	@OriginalMember(owner = "client!kh", name = "Kb", descriptor = "I")
	public static int anInt5576 = 1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!r;IZ)Lclient!bg;")
	public static Class32 method4718(@OriginalArg(1) Class44 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static566.anIntArray532 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static566.anIntArray532.length; local14++) {
				if (arg1 == Static566.anIntArray532[local14]) {
					return Static401.aClass32Array1[local14];
				}
			}
		}
		@Pc(37) Class32 local37 = (Class32) Static419.aClass223_54.method5388((long) arg1);
		if (local37 != null) {
			if (arg2 && local37.aClass114_1 == null) {
				@Pc(49) Class114 local49 = Static503.method7393(Static114.aClass176_130, arg1);
				if (local49 == null) {
					return null;
				}
				local37.aClass114_1 = local49;
			}
			return local37;
		}
		@Pc(62) Class261[] local62 = Static598.method6316(Static478.aClass176_116, arg1);
		if (local62 == null) {
			return null;
		}
		@Pc(71) Class114 local71 = Static503.method7393(Static114.aClass176_130, arg1);
		if (local71 == null) {
			return null;
		}
		if (arg2) {
			local37 = new Class32(arg0.method4983(local71, local62), local71);
		} else {
			local37 = new Class32(arg0.method4983(local71, local62));
		}
		Static419.aClass223_54.method5394(local37, (long) arg1);
		return local37;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!gba;III)V")
	public static void method4720(@OriginalArg(0) Class112 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static442.aClass112ArrayArray1[arg2][arg1] = arg0;
	}
}
