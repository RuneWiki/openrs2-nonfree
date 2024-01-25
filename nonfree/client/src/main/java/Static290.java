import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_123 = new Class25(83, 3);

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_86 = new Class231(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "[I")
	public static final int[] anIntArray441 = new int[250];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BI)[B")
	public static byte[] method4111(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		@Pc(12) int local12 = local8.method6138();
		@Pc(16) int local16 = local8.method6129();
		if (local16 < 0 || Static143.anInt2652 != 0 && Static143.anInt2652 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(76) byte[] local76 = new byte[local16];
			local8.method6164(local16, local76);
			return local76;
		} else {
			@Pc(36) int local36 = local8.method6129();
			if (local36 < 0 || Static143.anInt2652 != 0 && Static143.anInt2652 < local36) {
				throw new RuntimeException();
			}
			@Pc(53) byte[] local53 = new byte[local36];
			if (local12 == 1) {
				Static356.method4992(local53, local36, arg0, local16);
			} else {
				Static419.aClass222_1.method5133(local8, local53);
			}
			return local53;
		}
	}
}
