import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "[S")
	public static short[] aShortArray74;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public static int anInt5863;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
	public static int anInt5864;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!pj;")
	public static final Class287 aClass287_2 = new Class287();

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static int anInt5865 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Lclient!hw;")
	public static Class14_Sub2_Sub9 method5262() {
		@Pc(17) Class14_Sub2_Sub9 local17 = (Class14_Sub2_Sub9) Static676.aClass269_181.method6494();
		if (local17 != null) {
			local17.method9513();
			local17.method9093();
			return local17;
		}
		do {
			local17 = (Class14_Sub2_Sub9) Static4.aClass269_1.method6494();
			if (local17 == null) {
				return null;
			}
			if (local17.method4003() > Static26.method382()) {
				return null;
			}
			local17.method9513();
			local17.method9093();
		} while ((Long.MIN_VALUE & local17.aLong308) == 0L);
		return local17;
	}
}
