import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
	public static int anInt8458;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "I")
	public static int anInt8462;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "[B")
	public static final byte[] aByteArray85 = new byte[2048];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[BZ)V")
	public static void method7034(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static15.aClass2_Sub15_1 == null) {
			Static15.aClass2_Sub15_1 = new Class2_Sub15(20000);
		}
		Static15.aClass2_Sub15_1.method4299(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static162.method2870(Static15.aClass2_Sub15_1.aByteArray62);
		Static225.aClass136_Sub1Array1 = new Class136_Sub1[Static407.anInt7071];
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = Static158.anInt3180; local38 <= Static198.anInt3925; local38++) {
			@Pc(44) Class136_Sub1 local44 = Static271.method4110(local38);
			if (local44 != null) {
				Static225.aClass136_Sub1Array1[local36++] = local44;
			}
		}
		Static225.aBoolean344 = false;
		Static535.aLong242 = Static548.method7437();
		Static15.aClass2_Sub15_1 = null;
	}
}
