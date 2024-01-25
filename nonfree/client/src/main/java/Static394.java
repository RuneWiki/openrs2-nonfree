import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!pca", name = "Z", descriptor = "[I")
	public static int[] anIntArray413;

	@OriginalMember(owner = "client!pca", name = "R", descriptor = "Z")
	public static boolean aBoolean561 = false;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!d;Lclient!hw;IIIIILclient!nf;)V")
	public static void method6038(@OriginalArg(0) Class21_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class21_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class233 arg6) {
		@Pc(12) Class4_Sub43 local12 = new Class4_Sub43();
		local12.anInt8721 = arg2;
		local12.anInt8726 = arg3 << 9;
		local12.anInt8735 = arg4 << 9;
		if (arg6 != null) {
			local12.aClass233_1 = arg6;
			@Pc(33) int local33 = arg6.anInt6718;
			@Pc(36) int local36 = arg6.anInt6665;
			if (arg5 == 1 || arg5 == 3) {
				local33 = arg6.anInt6665;
				local36 = arg6.anInt6718;
			}
			local12.aBoolean613 = arg6.aBoolean459;
			local12.anInt8722 = local33 + arg4 << 9;
			local12.anInt8723 = arg6.anInt6698;
			local12.anInt8733 = local36 + arg3 << 9;
			local12.anInt8728 = arg6.anInt6667;
			local12.anInt8736 = arg6.anInt6707;
			local12.anInt8727 = arg6.anInt6719;
			local12.anInt8724 = arg6.anInt6680 << 9;
			local12.aBoolean614 = arg6.aBoolean468;
			local12.anInt8725 = arg6.anInt6702;
			local12.anIntArray513 = arg6.anIntArray375;
			local12.anInt8731 = arg6.anInt6696;
			if (arg6.anIntArray374 != null) {
				local12.aBoolean612 = true;
				local12.method6719();
			}
			if (local12.anIntArray513 != null) {
				local12.anInt8732 = (int) ((double) (local12.anInt8736 - local12.anInt8727) * Math.random()) + local12.anInt8727;
			}
			Static10.aClass22_11.method894(local12);
		} else if (arg0 != null) {
			local12.aClass21_Sub1_Sub1_Sub1_Sub1_2 = arg0;
			@Pc(148) Class51 local148 = arg0.aClass51_1;
			if (local148.anIntArray61 != null) {
				local12.aBoolean612 = true;
				local148 = local148.method1371(Static523.aClass173_1);
			}
			if (local148 != null) {
				local12.anInt8733 = local148.anInt1581 + arg3 << 9;
				local12.anInt8722 = arg4 + local148.anInt1581 << 9;
				local12.anInt8723 = Static26.method904(arg0);
				local12.anInt8731 = local148.anInt1596;
				local12.aBoolean613 = local148.aBoolean129;
				local12.anInt8725 = local148.anInt1604;
				local12.anInt8728 = local148.anInt1617;
				local12.anInt8724 = local148.anInt1597 << 9;
			}
			Static414.aClass22_53.method894(local12);
		} else if (arg1 != null) {
			local12.aClass21_Sub1_Sub1_Sub1_Sub2_3 = arg1;
			local12.anInt8722 = arg4 + arg1.method3339() << 9;
			local12.anInt8733 = arg3 + arg1.method3339() << 9;
			local12.anInt8723 = Static124.method2269(arg1);
			local12.anInt8728 = 256;
			local12.anInt8725 = arg1.anInt4297;
			local12.anInt8724 = arg1.anInt4308 << 9;
			local12.aBoolean613 = arg1.aBoolean301;
			local12.anInt8731 = 256;
			Static458.aClass221_32.method5073(local12, (long) arg1.anInt4256);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IZI)Z")
	public static boolean method6040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static582.method8146(arg1, arg0) || Static378.method5890(arg0, arg1);
	}
}
