import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	public static int anInt8114;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lclient!cj;")
	public static Class60[] aClass60Array9;

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	public static int anInt8115;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
	public static int anInt8116;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_28 = new Class146(7, 2);

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!wt;")
	public static final Class393 aClass393_5 = new Class393();

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!hi;")
	public static final Class136 aClass136_1 = new Class136();

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString90 = "";

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "S")
	public static short aShort86 = 32767;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method7091(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte[] local18;
		if (arg0 > 0) {
			local18 = new byte[arg2];
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local18[local20] = arg1[arg0 + local20];
			}
		} else {
			local18 = arg1;
		}
		@Pc(42) Class243 local42 = new Class243();
		local42.method5862();
		local42.method5863(local18, (long) (arg2 * 8));
		@Pc(56) byte[] local56 = new byte[64];
		local42.method5859(local56);
		return local56;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!aj;)V")
	public static void method7092(@OriginalArg(1) Class15 arg0) {
		Static524.aClass15_131 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!jp;I)Lclient!mba;")
	public static Class106_Sub3 method7093(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(12) Class106 local12 = Static342.method5131(arg0);
		@Pc(16) int local16 = arg0.method8618();
		@Pc(20) int local20 = arg0.method8618();
		return new Class106_Sub3(local12.aClass356_8, local12.aClass56_11, local12.anInt5838, local12.anInt5836, local12.anInt5840, local12.anInt5834, local12.anInt5837, local12.anInt5841, local12.anInt5839, local16, local20);
	}
}
