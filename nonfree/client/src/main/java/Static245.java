import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
	public static int anInt7888;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "Lclient!bt;")
	public static Class34 aClass34_106;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_57 = new Class352(8);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V")
	public static void method6855(@OriginalArg(0) int arg0) {
		if (Static583.method7687(arg0)) {
			Static324.method4459(-1, Static392.aClass199ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!vk;Lclient!iaa;IILclient!tba;II)V")
	public static void method6857(@OriginalArg(1) Class3_Sub1_Sub2_Sub2_Sub2 arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class342 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub23 local7 = new Class4_Sub23();
		local7.anInt4135 = arg6 << 9;
		local7.anInt4134 = arg2;
		local7.anInt4140 = arg3 << 9;
		if (arg4 != null) {
			local7.aClass342_1 = arg4;
			@Pc(167) int local167 = arg4.anInt8716;
			@Pc(170) int local170 = arg4.anInt8728;
			if (arg5 == 1 || arg5 == 3) {
				local170 = arg4.anInt8716;
				local167 = arg4.anInt8728;
			}
			local7.anInt4141 = arg4.anInt8746;
			local7.aBoolean306 = arg4.aBoolean687;
			local7.anInt4142 = arg6 + local167 << 9;
			local7.anInt4130 = arg4.anInt8692;
			local7.anInt4136 = arg4.anInt8696;
			local7.anInt4148 = arg4.anInt8700;
			local7.anInt4137 = arg4.anInt8711 << 9;
			local7.anInt4145 = arg4.anInt8729;
			local7.aBoolean307 = arg4.aBoolean688;
			local7.anIntArray302 = arg4.anIntArray622;
			local7.anInt4150 = arg4.anInt8688 << 9;
			local7.anInt4133 = arg4.anInt8710;
			local7.anInt4143 = arg3 + local170 << 9;
			if (arg4.anIntArray620 != null) {
				local7.aBoolean304 = true;
				local7.method3688();
			}
			if (local7.anIntArray302 != null) {
				local7.anInt4147 = (int) ((double) (local7.anInt4136 - local7.anInt4141) * Math.random()) + local7.anInt4141;
			}
			Static328.aClass163_30.method3646(local7);
			return;
		}
		if (arg0 != null) {
			local7.aClass3_Sub1_Sub2_Sub2_Sub2_1 = arg0;
			@Pc(35) Class345 local35 = arg0.aClass345_1;
			if (local35.anIntArray624 != null) {
				local7.aBoolean304 = true;
				local35 = local35.method7529(Static526.aClass293_1);
			}
			if (local35 != null) {
				local7.anInt4143 = arg3 + local35.anInt8812 << 9;
				local7.anInt4142 = local35.anInt8812 + arg6 << 9;
				local7.anInt4145 = Static617.method8307(arg0);
				local7.aBoolean306 = local35.aBoolean698;
				local7.anInt4133 = local35.anInt8773;
				local7.anInt4130 = local35.anInt8786;
				local7.anInt4137 = local35.anInt8781 << 9;
				local7.anInt4148 = local35.anInt8779;
				local7.anInt4150 = local35.anInt8808 << 9;
			}
			Static611.aClass163_65.method3646(local7);
			return;
		}
		if (arg1 == null) {
			return;
		}
		local7.aClass3_Sub1_Sub2_Sub2_Sub1_1 = arg1;
		local7.anInt4142 = arg1.method8514() + arg6 << 9;
		local7.anInt4143 = arg1.method8514() + arg3 << 9;
		local7.anInt4145 = Static225.method3273(arg1);
		local7.anInt4137 = arg1.anInt3936 << 9;
		local7.anInt4148 = arg1.anInt3942;
		local7.aBoolean306 = arg1.aBoolean294;
		local7.anInt4130 = 256;
		local7.anInt4150 = 0;
		local7.anInt4133 = 256;
		Static124.aClass66_10.method1985(local7, (long) arg1.anInt9961);
		return;
	}
}
