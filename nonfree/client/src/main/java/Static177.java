import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static int anInt3326;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "Lclient!sk;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
	public static int anInt3330;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
	public static int anInt3331;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "[B")
	public static final byte[] aByteArray23 = new byte[2048];

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_49 = new Class376(13, 6);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZ)V")
	public static void method2932(@OriginalArg(0) int arg0) {
		if (Static608.anIntArray621 == null || Static608.anIntArray621.length < arg0) {
			Static608.anIntArray621 = new int[arg0];
		}
	}
}
