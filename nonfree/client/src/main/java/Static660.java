import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Lclient!uf;")
	public static Class357 aClass357_159;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_5 = new Class118();

	@OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
	public static int anInt10682 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)Z")
	public static boolean method9145(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZLclient!ha;II)Lclient!eg;")
	public static Class91 method9148(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static11.anIntArray3 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static11.anIntArray3.length; local14++) {
				if (arg2 == Static11.anIntArray3[local14]) {
					return Static320.aClass91Array8[local14];
				}
			}
		}
		@Pc(45) Class91 local45 = (Class91) Static387.aClass22_33.method462((long) arg2);
		if (local45 != null) {
			if (arg0 && local45.aClass324_5 == null) {
				@Pc(59) Class324 local59 = Static386.method6506(Static638.aClass124_130, arg2);
				if (local59 == null) {
					return null;
				}
				local45.aClass324_5 = local59;
			}
			return local45;
		}
		@Pc(72) Class67[] local72 = Static676.method1699(Static446.aClass124_92, arg2);
		if (local72 == null) {
			return null;
		}
		@Pc(81) Class324 local81 = Static386.method6506(Static638.aClass124_130, arg2);
		if (local81 == null) {
			return null;
		}
		if (arg0) {
			local45 = new Class91(arg1.method8146(local81, local72), local81);
		} else {
			local45 = new Class91(arg1.method8146(local81, local72));
		}
		Static387.aClass22_33.method470((long) arg2, local45);
		return local45;
	}
}
