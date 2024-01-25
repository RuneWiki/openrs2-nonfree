import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Lclient!wn;")
	public static Class3_Sub1_Sub21 method8654() {
		@Pc(8) Class3_Sub1_Sub21 local8 = (Class3_Sub1_Sub21) Static532.aClass30_11.method780();
		if (local8 != null) {
			local8.method8671();
			local8.method8621();
			return local8;
		}
		@Pc(31) Class3_Sub1_Sub21 local31;
		do {
			local31 = (Class3_Sub1_Sub21) Static614.aClass30_13.method780();
			if (local31 == null) {
				return null;
			}
			if (local31.method8627() > Static444.method6719()) {
				return null;
			}
			local31.method8671();
			local31.method8621();
		} while ((local31.aLong275 & Long.MIN_VALUE) == 0L);
		return local31;
	}
}
