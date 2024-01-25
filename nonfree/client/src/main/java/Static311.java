import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "Lclient!po;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_116 = new Class205(99, 7);

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_80 = new Class11(71, 0);

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "Lclient!ha;")
	public static final Class89 aClass89_5 = new Class89("WIP", 2);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIILclient!ae;BILclient!oj;II)V")
	public static void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class165 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg1 * arg1 + arg4 * arg4;
		if (arg6 < local12) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg3.anInt101 / 2, arg3.anInt113 / 2);
		if (local30 * local30 >= local12) {
			Static35.method636(arg1, arg5, arg7, Static210.aClass18Array9[arg0], arg4, arg2, arg3);
			return;
		}
		local30 -= 10;
		@Pc(58) int local58;
		if (Static79.anInt4624 == 4) {
			local58 = (int) Static127.aFloat41 & 0x3FFF;
		} else {
			local58 = Static190.anInt3567 + (int) Static127.aFloat41 & 0x3FFF;
		}
		@Pc(69) int local69 = Class177.anIntArray843[local58];
		@Pc(73) int local73 = Class177.anIntArray844[local58];
		if (Static79.anInt4624 != 4) {
			local73 = local73 * 256 / (Static30.anInt643 + 256);
			local69 = local69 * 256 / (Static30.anInt643 + 256);
		}
		@Pc(104) int local104 = arg1 * local73 + arg4 * local69 >> 15;
		@Pc(115) int local115 = local73 * arg4 - local69 * arg1 >> 15;
		@Pc(121) double local121 = Math.atan2((double) local104, (double) local115);
		@Pc(128) int local128 = (int) ((double) local30 * Math.sin(local121));
		@Pc(135) int local135 = (int) (Math.cos(local121) * (double) local30);
		Static379.aClass18Array13[arg0].method4556((float) arg2 + (float) arg3.anInt101 / 2.0F + (float) local128, (float) -local135 + (float) arg7 + (float) arg3.anInt113 / 2.0F, 4096, (int) (-local121 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!is;)[Lclient!vt;")
	public static Class241[] method4586(@OriginalArg(1) Class111 arg0) {
		if (!arg0.method2810()) {
			return new Class241[0];
		}
		@Pc(18) Class182 local18 = arg0.method2818();
		while (local18.anInt4498 == 0) {
			Static358.method2028(10L);
		}
		if (local18.anInt4498 == 2) {
			return new Class241[0];
		}
		@Pc(37) int[] local37 = (int[]) local18.anObject6;
		@Pc(43) Class241[] local43 = new Class241[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class241 local51 = new Class241();
			local43[local45] = local51;
			local51.anInt6298 = local37[local45 << 2];
			local51.anInt6295 = local37[(local45 << 2) + 1];
			local51.anInt6293 = local37[(local45 << 2) + 2];
			local51.anInt6296 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
