import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!wg", name = "tc", descriptor = "J")
	public static long aLong204 = 0L;

	@OriginalMember(owner = "client!wg", name = "vc", descriptor = "Lclient!lk;")
	public static final Class147 aClass147_1 = Static4.method84();

	@OriginalMember(owner = "client!wg", name = "Ac", descriptor = "I")
	public static int anInt6476 = 0;

	@OriginalMember(owner = "client!wg", name = "Bc", descriptor = "I")
	public static int anInt6477 = -1;

	@OriginalMember(owner = "client!wg", name = "Cc", descriptor = "[Lclient!ml;")
	public static Class138_Sub1[] aClass138_Sub1Array2 = new Class138_Sub1[0];

	@OriginalMember(owner = "client!wg", name = "Dc", descriptor = "I")
	public static int anInt6478 = 0;

	@OriginalMember(owner = "client!wg", name = "Ec", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!wg", name = "Gc", descriptor = "I")
	public static int anInt6480 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!ae;")
	public static Class4 method5560(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static183.aClass4ArrayArray1[local12] == null || Static183.aClass4ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static348.method5096(local12);
			if (!local30) {
				return null;
			}
		}
		return Static183.aClass4ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!kk;)Lclient!ns;")
	public static Class65_Sub2 method5564(@OriginalArg(1) Class2_Sub16 arg0) {
		return new Class65_Sub2(arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5341(), arg0.method5356(), arg0.method5356(), arg0.method5350());
	}
}
