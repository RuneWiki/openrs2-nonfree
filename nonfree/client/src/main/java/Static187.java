import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
	public static int anInt6996;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZI)V")
	public static void method5796(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11;
		if (Static195.anInt3759 != arg1) {
			Static554.anIntArray510 = new int[arg1];
			for (local11 = 0; local11 < arg1; local11++) {
				Static554.anIntArray510[local11] = (local11 << 12) / arg1;
			}
			Static195.anInt3759 = arg1;
			Static388.anInt6925 = arg1 - 1;
			Static318.anInt5992 = arg1 * 32;
		}
		if (Static195.anInt3756 == arg0) {
			return;
		}
		if (arg0 == Static195.anInt3759) {
			Static369.anIntArray377 = Static554.anIntArray510;
		} else {
			Static369.anIntArray377 = new int[arg0];
			for (local11 = 0; local11 < arg0; local11++) {
				Static369.anIntArray377[local11] = (local11 << 12) / arg0;
			}
		}
		Static195.anInt3756 = arg0;
		Static115.anInt2379 = arg0 - 1;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)Z")
	public static boolean method5797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZIIBI)Lclient!lfa;")
	public static Class5_Sub39 method5799(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class5_Sub39 local15 = new Class5_Sub39();
		local15.anInt6236 = arg1;
		local15.anInt6238 = arg3;
		Static452.aClass300_33.method7191(local15, (long) arg2);
		Static340.method5191(arg3);
		@Pc(36) Class345 local36 = Static264.method4120(arg2);
		if (local36 != null) {
			Static211.method3351(local36);
		}
		if (Static244.aClass345_7 != null) {
			Static211.method3351(Static244.aClass345_7);
			Static244.aClass345_7 = null;
		}
		Static588.method8085();
		if (local36 != null) {
			Static550.method7644(local36, !arg0);
		}
		if (!arg0) {
			Static652.method8737(arg3);
		}
		if (!arg0 && Static84.anInt2018 != -1) {
			Static162.method2876(Static84.anInt2018, 1);
		}
		return local15;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!oq;)[Lclient!rw;")
	public static Class310[] method5800(@OriginalArg(1) Class268 arg0) {
		if (!arg0.method6322()) {
			return new Class310[0];
		}
		@Pc(19) Class331 local19 = arg0.method6338();
		while (local19.anInt9108 == 0) {
			Static579.method8004(10L);
		}
		if (local19.anInt9108 == 2) {
			return new Class310[0];
		}
		@Pc(40) int[] local40 = (int[]) local19.anObject20;
		@Pc(46) Class310[] local46 = new Class310[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(53) Class310 local53 = new Class310();
			local46[local48] = local53;
			local53.anInt8744 = local40[local48 << 2];
			local53.anInt8743 = local40[(local48 << 2) + 1];
			local53.anInt8742 = local40[(local48 << 2) + 2];
			local53.anInt8746 = local40[(local48 << 2) + 3];
		}
		return local46;
	}
}
