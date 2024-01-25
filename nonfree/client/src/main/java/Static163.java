import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ht", name = "Q", descriptor = "I")
	public static int anInt3488 = 100;

	@OriginalMember(owner = "client!ht", name = "S", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!dn;B)I")
	public static int method2865(@OriginalArg(0) Class56 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method1365(Static347.anInt6317)) {
			local10++;
		}
		if (arg0.method1365(Static37.anInt1023)) {
			local10++;
		}
		if (arg0.method1365(Static304.anInt5558)) {
			local10++;
		}
		if (arg0.method1365(Static137.anInt3152)) {
			local10++;
		}
		if (arg0.method1365(Static55.anInt1302)) {
			local10++;
		}
		if (arg0.method1365(Static237.anInt4553)) {
			local10++;
		}
		if (arg0.method1365(Static9.anInt250)) {
			local10++;
		}
		if (arg0.method1365(Static278.anInt6866)) {
			local10++;
		}
		if (arg0.method1365(Static136.anInt2296)) {
			local10++;
		}
		if (arg0.method1365(Static287.anInt5244)) {
			local10++;
		}
		if (arg0.method1365(Static373.anInt6594)) {
			local10++;
		}
		if (arg0.method1365(Static7.anInt160)) {
			local10++;
		}
		if (arg0.method1365(Static241.anInt4607)) {
			local10++;
		}
		if (arg0.method1365(Static330.anInt6005)) {
			local10++;
		}
		if (arg0.method1365(Static160.anInt3380)) {
			local10++;
		}
		if (arg0.method1365(Static50.anInt1236)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(II)I")
	public static int method2866(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!jt;IIIB)V")
	public static void method2867(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(8) Class3_Sub36 local8 = (Class3_Sub36) Static455.aClass229_37.method5328(); local8 != null; local8 = (Class3_Sub36) Static455.aClass229_37.method5325()) {
			if (arg1 == local8.anInt6170 && local8.anInt6171 == arg3 << 7 && arg2 << 7 == local8.anInt6180 && local8.aClass128_1.anInt4027 == arg0.anInt4027) {
				if (local8.aClass3_Sub5_Sub3_3 != null) {
					Static251.aClass3_Sub5_Sub4_1.method5196(local8.aClass3_Sub5_Sub3_3);
					local8.aClass3_Sub5_Sub3_3 = null;
				}
				if (local8.aClass3_Sub5_Sub3_4 != null) {
					Static251.aClass3_Sub5_Sub4_1.method5196(local8.aClass3_Sub5_Sub3_4);
					local8.aClass3_Sub5_Sub3_4 = null;
				}
				local8.method5987();
				return;
			}
		}
	}
}
