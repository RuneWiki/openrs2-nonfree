import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBLclient!sf;Lclient!jc;IIILclient!ig;)V")
	public static void method2264(@OriginalArg(0) int arg0, @OriginalArg(2) Class24_Sub3_Sub2_Sub2 arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class24_Sub3_Sub2_Sub1 arg6) {
		@Pc(11) Class10_Sub23 local11 = new Class10_Sub23();
		local11.anInt4005 = arg0 << 7;
		local11.anInt3989 = arg5;
		local11.anInt4002 = arg3 << 7;
		if (arg2 != null) {
			local11.aClass126_1 = arg2;
			@Pc(139) int local139 = arg2.anInt3785;
			@Pc(142) int local142 = arg2.anInt3782;
			if (arg4 == 1 || arg4 == 3) {
				local139 = arg2.anInt3782;
				local142 = arg2.anInt3785;
			}
			local11.anInt3992 = local139 + arg3 << 7;
			local11.anInt3995 = arg0 + local142 << 7;
			local11.anIntArray396 = arg2.anIntArray381;
			local11.anInt4003 = arg2.anInt3776;
			local11.anInt3991 = arg2.anInt3763 << 7;
			local11.anInt3996 = arg2.anInt3760;
			local11.anInt3990 = arg2.anInt3809;
			local11.anInt4004 = arg2.anInt3771;
			if (arg2.anIntArray380 != null) {
				local11.aBoolean269 = true;
				local11.method3170();
			}
			if (local11.anIntArray396 != null) {
				local11.anInt3997 = (int) ((double) (local11.anInt3990 - local11.anInt4004) * Math.random()) + local11.anInt4004;
			}
			Static418.aClass163_43.method3613(local11);
		} else if (arg6 != null) {
			local11.aClass24_Sub3_Sub2_Sub1_1 = arg6;
			@Pc(82) Class222 local82 = arg6.aClass222_1;
			if (local82.anIntArray613 != null) {
				local11.aBoolean269 = true;
				local82 = local82.method4938(Static329.aClass201_9);
			}
			if (local82 != null) {
				local11.anInt3995 = arg0 + local82.anInt6351 << 7;
				local11.anInt3992 = arg3 + local82.anInt6351 << 7;
				local11.anInt3996 = Static109.method1900(arg6);
				local11.anInt4003 = local82.anInt6353;
				local11.anInt3991 = local82.anInt6348 << 7;
			}
			Static104.aClass163_19.method3613(local11);
		} else if (arg1 != null) {
			local11.aClass24_Sub3_Sub2_Sub2_3 = arg1;
			local11.anInt3992 = arg3 + arg1.method4919() << 7;
			local11.anInt3995 = arg0 + arg1.method4919() << 7;
			local11.anInt3996 = Static125.method2191(arg1);
			local11.anInt3991 = arg1.anInt6328 << 7;
			local11.anInt4003 = arg1.anInt6302;
			Static414.aClass167_32.method3705(local11, (long) arg1.anInt6228);
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
	public static int method2265(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(30) int local30 = (local16 >>> 2 & 0x73333333) + (local16 & 0x33333333);
		@Pc(38) int local38 = (local30 >>> 4) + local30 & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
