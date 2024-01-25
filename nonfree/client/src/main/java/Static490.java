import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!rg", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString118;

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_54 = new Class306();

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
	public static int method7196(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZI)I")
	public static int method7197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static88.anInt1458 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static203.anInt136;
		@Pc(31) int local31 = arg0 - Static203.anInt137;
		for (@Pc(36) Class5_Sub39 local36 = (Class5_Sub39) Static203.aClass306_2.method7313(); local36 != null; local36 = (Class5_Sub39) Static203.aClass306_2.method7301()) {
			if (arg1 == local36.anInt7217) {
				@Pc(49) int local49 = local36.anInt7224;
				@Pc(52) int local52 = local36.anInt7220;
				@Pc(62) int local62 = Static203.anInt137 + local52 | Static203.anInt136 + local49 << 14;
				@Pc(81) int local81 = (local21 - local49) * (local21 + -local49) + (local31 - local52) * (-local52 + local31);
				if (local14 < 0 || local16 > local81) {
					local14 = local62;
					local16 = local81;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z[B)Ljava/lang/String;")
	public static String method7198(@OriginalArg(1) byte[] arg0) {
		return Static62.method1073(0, arg0.length, arg0);
	}
}
