import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!kb;")
	private static Class46 aClass46_182 = Static65.method1172("Select");

	@OriginalMember(owner = "client!db", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_179 = aClass46_182;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Lclient!kb;")
	private static Class46 aClass46_180 = Static65.method1172("Loading fonts )2 ");

	@OriginalMember(owner = "client!db", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_181 = aClass46_180;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "Lclient!h;")
	public static Class33 aClass33_2 = null;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_183 = Static65.method1172("gleiten:");

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	public static final int anInt729 = 3353893;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "Lclient!kb;")
	private static Class46 aClass46_184 = Static65.method1172("Cancel");

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_185 = aClass46_184;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_186 = Static65.method1172("headicons_hint");

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public static void method516() {
		aClass46_183 = null;
		aClass33_2 = null;
		aClass46_179 = null;
		aClass46_180 = null;
		aClass46_182 = null;
		aClass46_186 = null;
		aClass46_184 = null;
		aClass46_185 = null;
		aClass46_181 = null;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(Z)[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] method517() {
		@Pc(8) Class3_Sub2_Sub3_Sub3[] local8 = new Class3_Sub2_Sub3_Sub3[Static8.anInt276];
		for (@Pc(10) int local10 = 0; local10 < Static8.anInt276; local10++) {
			@Pc(16) Class3_Sub2_Sub3_Sub3 local16 = new Class3_Sub2_Sub3_Sub3();
			local16.anInt2696 = Static168.anInt3719;
			local16.anInt2695 = Static116.anInt2760;
			local16.anInt2697 = Static135.anIntArray363[local10];
			local16.anInt2693 = Static71.anIntArray172[local10];
			local16.anInt2694 = Static54.anIntArray131[local10];
			local16.anInt2698 = Static87.anIntArray219[local10];
			@Pc(46) byte[] local46 = Static32.aByteArrayArray4[local10];
			@Pc(52) int local52 = local16.anInt2694 * local16.anInt2698;
			local16.anIntArray301 = new int[local52];
			for (@Pc(58) int local58 = 0; local58 < local52; local58++) {
				local16.anIntArray301[local58] = Static90.anIntArray226[local46[local58] & 0xFF];
			}
			local8[local10] = local16;
		}
		Static181.method2896();
		return local8;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IBI)I")
	public static int method518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static28.aClass54_2.method1602((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray70.length) {
			return local10.anIntArray70[arg0];
		} else {
			return -1;
		}
	}
}
