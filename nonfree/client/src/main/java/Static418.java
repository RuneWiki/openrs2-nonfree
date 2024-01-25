import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!raa", name = "W", descriptor = "I")
	public static int anInt7781;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!hh;Z)I")
	public static int method6471(@OriginalArg(0) Class30_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class130 local8 = arg0.aClass130_1;
		if (local8.anIntArray308 != null) {
			local8 = local8.method3570(Static393.aClass31_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.lb;
		@Pc(27) Class166 local27 = arg0.method3602();
		if (arg0.aBoolean335) {
			local23 = local8.anInt4106;
		} else if (local27.anInt4962 == arg0.anInt4155 || local27.anInt4973 == arg0.anInt4155 || arg0.anInt4155 == local27.anInt4992 || arg0.anInt4155 == local27.anInt4982) {
			local23 = local8.anInt4092;
		} else if (local27.anInt4987 == arg0.anInt4155 || arg0.anInt4155 == local27.anInt4971 || local27.anInt4983 == arg0.anInt4155 || arg0.anInt4155 == local27.anInt4978) {
			local23 = local8.anInt4080;
		}
		return local23;
	}

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(IZ)I")
	public static int method6472(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)Z")
	public static boolean method6474(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!hv;)V")
	public static void method6475(@OriginalArg(1) Class12_Sub20 arg0) {
		if (!Static389.aBoolean533) {
			arg0.method7967();
			Static8.anInt118--;
		}
	}
}
