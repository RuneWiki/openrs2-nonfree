import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_94 = new Class181(75, 3);

	@OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
	public static int anInt10210 = 0;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILclient!ha;ZI)Lclient!ko;")
	public static Class195 method8672(@OriginalArg(1) Class126 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static137.anIntArray180 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static137.anIntArray180.length; local14++) {
				if (arg2 == Static137.anIntArray180[local14]) {
					return Static464.aClass195Array1[local14];
				}
			}
		}
		@Pc(41) Class195 local41 = (Class195) Static407.aClass293_46.method6921((long) arg2);
		if (local41 != null) {
			if (arg1 && local41.aClass298_6 == null) {
				@Pc(53) Class298 local53 = Static7.method166(Static558.aClass384_124, arg2);
				if (local53 == null) {
					return null;
				}
				local41.aClass298_6 = local53;
			}
			return local41;
		}
		@Pc(72) Class176[] local72 = Static654.method4058(Static76.aClass384_29, arg2);
		if (local72 == null) {
			return null;
		}
		@Pc(81) Class298 local81 = Static7.method166(Static558.aClass384_124, arg2);
		if (local81 == null) {
			return null;
		}
		if (arg1) {
			local41 = new Class195(arg0.method7000(local81, local72), local81);
		} else {
			local41 = new Class195(arg0.method7000(local81, local72));
		}
		Static407.aClass293_46.method6925((long) arg2, local41);
		return local41;
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)I")
	public static int method8673() {
		return Static453.anInt7627 == 1 ? Static134.anInt2214 : Static27.anInt517;
	}
}
