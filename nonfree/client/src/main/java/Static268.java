import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "Lclient!rn;")
	public static Class155 aClass155_113;

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString199 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!tj", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray116 = new byte[1000][];

	@OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
	public static int anInt5481 = 0;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)V")
	public static void method4446() {
		Static19.aClass98_2.method2572();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
	public static void method4447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static49.aClass30_5.method663((long) arg1);
		if (local12 == null) {
			local12 = new Class3_Sub16();
			Static49.aClass30_5.method668(local12, (long) arg1);
		}
		if (local12.anIntArray294.length <= arg3) {
			@Pc(44) int[] local44 = new int[arg3 + 1];
			@Pc(49) int[] local49 = new int[arg3 + 1];
			@Pc(51) int local51;
			for (local51 = 0; local51 < local12.anIntArray294.length; local51++) {
				local44[local51] = local12.anIntArray294[local51];
				local49[local51] = local12.anIntArray293[local51];
			}
			for (local51 = local12.anIntArray294.length; local51 < arg3; local51++) {
				local44[local51] = -1;
				local49[local51] = 0;
			}
			local12.anIntArray294 = local44;
			local12.anIntArray293 = local49;
		}
		local12.anIntArray294[arg3] = arg0;
		local12.anIntArray293[arg3] = arg2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
	public static void method4448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) String local36 = "::tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local36);
		Static263.method4392(local36);
	}
}
