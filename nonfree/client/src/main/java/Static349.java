import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "Lclient!f;")
	public static Class38 aClass38_31;

	@OriginalMember(owner = "client!nca", name = "n", descriptor = "Lclient!nr;")
	public static Class245 aClass245_4;

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_12 = new Class222("", 14);

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "F")
	public static float aFloat187 = 0.25F;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(CI)Z")
	public static boolean method5583(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLclient!cea;[[B)V")
	public static void method5584(@OriginalArg(1) Class50_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg1.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg1[local21];
			if (local27 != null) {
				@Pc(34) Class2_Sub7 local34 = new Class2_Sub7(local27);
				local40 = Static301.anIntArray349[local21] >> 8;
				@Pc(46) int local46 = Static301.anIntArray349[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static485.anInt7725;
				@Pc(60) int local60 = local46 * 64 - Static310.anInt5129;
				Static574.method7450();
				arg0.method1054(local34, local60, Static485.anInt7725, Static87.aClass362Array3, local53, Static310.anInt5129);
				arg0.method1061(local60, local34, Static417.aClass162_17, local16, local53);
				if (!arg0.aBoolean61 && local40 == Static434.anInt6974 / 8 && local46 == Static79.anInt7835 / 8 && local16[0] != -1) {
					Static320.aClass358_1 = Static403.aClass123_2.method2205(local16[2], local16[0], local16[3], local16[1], Static496.aClass39_1);
					Static189.anInt2779 = local16[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local19; local128++) {
			@Pc(140) int local140 = (Static301.anIntArray349[local128] >> 8) * 64 - Static485.anInt7725;
			local40 = (Static301.anIntArray349[local128] & 0xFF) * 64 - Static310.anInt5129;
			@Pc(155) byte[] local155 = arg1[local128];
			if (local155 == null && Static79.anInt7835 < 800) {
				Static574.method7450();
				arg0.method1051(local40, local140);
			}
		}
	}
}
