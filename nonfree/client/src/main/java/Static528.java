import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public static int anInt8313;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt8315;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt8312 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Lclient!wga;")
	public static Class3_Sub5_Sub20 method6835() {
		@Pc(14) Class3_Sub5_Sub20 local14 = (Class3_Sub5_Sub20) Static515.aClass243_12.method5459();
		if (local14 != null) {
			local14.method9034();
			local14.method9014();
			return local14;
		}
		do {
			local14 = (Class3_Sub5_Sub20) Static283.aClass243_8.method5459();
			if (local14 == null) {
				return null;
			}
			if (local14.method8835() > Static15.method380()) {
				return null;
			}
			local14.method9034();
			local14.method9014();
		} while ((local14.aLong312 & Long.MIN_VALUE) == 0L);
		return local14;
	}
}
