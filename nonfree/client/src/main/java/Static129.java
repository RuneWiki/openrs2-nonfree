import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "Lclient!jd;")
	public static Class13 aClass13_8;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BIII)V", line = 72)
	public static void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static203.aClass177_Sub1_2.anInt4879 >> 8;
		if (arg2 == -1 && !Class252.aBoolean486) {
			Static343.method6193();
		} else if (arg2 != -1 && (Class2_Sub3_Sub18.anInt3264 != arg2 || !Static60.method1706()) && local6 != 0 && !Class252.aBoolean486) {
			Static168.method3368(arg2, arg0, local6, Static94.aClass197_23);
		}
		Class2_Sub3_Sub18.anInt3264 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIB)I", line = 102)
	public static int method2581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(49) int local49 = Static286.method5278(arg0 - 1, arg1 + -1) + Static286.method5278(arg0 - 1, arg1 + 1) + Static286.method5278(arg0 + 1, arg1 + -1) + Static286.method5278(arg0 + 1, arg1 + 1);
		@Pc(78) int local78 = Static286.method5278(arg0, arg1 - 1) + Static286.method5278(arg0, arg1 + 1) + Static286.method5278(arg0 - 1, arg1) + Static286.method5278(arg0 + 1, arg1);
		@Pc(83) int local83 = Static286.method5278(arg0, arg1);
		return local83 / 4 + local49 / 16 + local78 / 8;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V", line = 120)
	public static void method2582(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2 local16 = Class219.aClass4_127.method80(); local16 != null; local16 = Class219.aClass4_127.method79()) {
			if ((long) arg0 == (local16.aLong232 >> 48 & 0xFFFFL)) {
				local16.method6469();
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Lclient!mn;", line = 146)
	public static Class2_Sub2_Sub12 method2583(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub12 local10 = (Class2_Sub2_Sub12) Class14.aClass116_5.method3153((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 >= 32768) {
			local25 = Static40.aClass197_7.method5090(arg0 & 0x7FFF, 0);
		} else {
			local25 = Static342.aClass197_92.method5090(arg0, 0);
		}
		local10 = new Class2_Sub2_Sub12();
		if (local25 != null) {
			local10.method3798(new Class2_Sub4(local25));
		}
		if (arg0 >= 32768) {
			local10.method3794();
		}
		Class14.aClass116_5.method3156(local10, (long) arg0);
		return local10;
	}
}
