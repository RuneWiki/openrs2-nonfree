import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!pu", name = "V", descriptor = "Lclient!no;")
	public static final Class2_Sub29_Sub2 aClass2_Sub29_Sub2_2 = new Class2_Sub29_Sub2(5000);

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(III)Z")
	public static boolean method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(I)Lclient!ob;")
	public static Class2_Sub35 method5975() {
		if (Static201.aClass249_3 == null || Static113.aClass291_1 == null) {
			return null;
		}
		for (@Pc(22) Class2_Sub35 local22 = (Class2_Sub35) Static113.aClass291_1.method7338(); local22 != null; local22 = (Class2_Sub35) Static113.aClass291_1.method7338()) {
			@Pc(32) Class182 local32 = Static201.aClass56_2.method1680(local22.anInt6264);
			if (local32 != null && local32.aBoolean396 && local32.method4598(Static201.anInterface2_2)) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	public static void method5976() {
		Static203.anInt3677 = -1;
		Static68.anInt1451 = 0;
		Static440.anInt8023 = -1;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I")
	public static int method5977(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIBIZI)V")
	public static void method5978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) (arg2 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(28) Class2_Sub16 local28 = (Class2_Sub16) Static127.aClass127_23.method3205(local22);
		if (local28 == null) {
			local28 = new Class2_Sub16();
			Static127.aClass127_23.method3213(local28, local22);
		}
		if (local28.anIntArray128.length <= arg1) {
			@Pc(53) int[] local53 = new int[arg1 + 1];
			@Pc(58) int[] local58 = new int[arg1 + 1];
			for (@Pc(60) int local60 = 0; local60 < local28.anIntArray128.length; local60++) {
				local53[local60] = local28.anIntArray128[local60];
				local58[local60] = local28.anIntArray129[local60];
			}
			for (@Pc(90) int local90 = local28.anIntArray128.length; local90 < arg1; local90++) {
				local53[local90] = -1;
				local58[local90] = 0;
			}
			local28.anIntArray129 = local58;
			local28.anIntArray128 = local53;
		}
		local28.anIntArray128[arg1] = arg4;
		local28.anIntArray129[arg1] = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZII)I")
	public static int method5979(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub16 local8 = Static218.method3456(arg1, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray128.length) {
			return local8.anIntArray128[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "(I)Ljava/lang/String;")
	public static String method5981() {
		@Pc(7) String local7 = "www";
		if (Static414.aClass320_17 == Static141.aClass320_18) {
			local7 = "www-wtrc";
		} else if (Static414.aClass320_17 == Static175.aClass320_6) {
			local7 = "www-wtqa";
		} else if (Static136.aClass320_2 == Static414.aClass320_17) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static530.aString206 != null) {
			local28 = "/p=" + Static530.aString206;
		}
		return "http://" + local7 + "." + Static185.aClass212_1.aString136 + ".com/l=" + Static172.anInt6352 + "/a=" + Static224.anInt4041 + local28 + "/";
	}
}
