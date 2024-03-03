import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CI)Z", line = 11)
	public static boolean method2699(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjava/lang/String;)I", line = 32)
	public static int method2700(@OriginalArg(1) String arg0) {
		return Static296.method5434(10, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!tb;", line = 48)
	public static Class2_Sub2_Sub16 method2701(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub16 local10 = (Class2_Sub2_Sub16) Class248.aClass116_8.method3153((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = Static128.aClass197_33.method5090(arg0, 1);
		} else {
			local28 = Static285.aClass197_80.method5090(arg0 & 0x7FFF, 1);
		}
		local10 = new Class2_Sub2_Sub16();
		if (local28 != null) {
			local10.method5600(new Class2_Sub4(local28));
		}
		if (arg0 >= 32768) {
			local10.method5605();
		}
		Class248.aClass116_8.method3156(local10, (long) arg0);
		return local10;
	}
}
