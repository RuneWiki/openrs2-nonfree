import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "Z")
	public static boolean aBoolean733;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "Lclient!ee;")
	public static final Class83 aClass83_42 = new Class83(8);

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "[J")
	public static final long[] aLongArray27 = new long[32];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI[B)V")
	public static void method8335(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static52.aClass3_Sub25_1 == null) {
			Static52.aClass3_Sub25_1 = new Class3_Sub25(20000);
		}
		Static52.aClass3_Sub25_1.method8637(arg1, arg1.length, 0);
		if (!arg0) {
			return;
		}
		Static428.method6172(Static52.aClass3_Sub25_1.aByteArray106);
		Static665.aClass98_Sub1Array3 = new Class98_Sub1[Static252.anInt4527];
		@Pc(42) int local42 = 0;
		for (@Pc(44) int local44 = Static321.anInt5361; local44 <= Static495.anInt8144; local44++) {
			@Pc(50) Class98_Sub1 local50 = Static217.method3760(local44);
			if (local50 != null) {
				Static665.aClass98_Sub1Array3[local42++] = local50;
			}
		}
		Static283.aBoolean360 = false;
		Static113.aLong65 = Static524.method7320();
		Static52.aClass3_Sub25_1 = null;
	}
}
