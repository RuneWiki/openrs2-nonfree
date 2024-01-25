import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "[I")
	public static final int[] anIntArray393 = new int[6];

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	public static int anInt4233 = -1;

	@OriginalMember(owner = "client!ho", name = "P", descriptor = "Lclient!db;")
	public static final Class64 aClass64_164 = new Class64(107, 6);

	@OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
	public static int anInt4239 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BZ)Z")
	public static boolean method3593(@OriginalArg(1) boolean arg0) {
		@Pc(14) boolean local14 = Static185.aClass66_14.method6852();
		if (arg0 == local14) {
			return true;
		}
		if (!arg0) {
			Static185.aClass66_14.method6830();
		} else if (!Static185.aClass66_14.method6814()) {
			arg0 = false;
		}
		if (local14 == arg0) {
			return false;
		} else {
			Static189.aClass4_Sub2_Sub1_1.aBoolean645 = arg0;
			Static189.aClass4_Sub2_Sub1_1.method7661(Static147.aClass161_4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IC)I")
	public static int method3596(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class4_Sub7_Sub7_Sub2.anIntArray699.length > arg0 ? Class4_Sub7_Sub7_Sub2.anIntArray699[arg0] : -1;
	}
}
