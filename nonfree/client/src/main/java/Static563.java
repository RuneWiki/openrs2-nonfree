import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!ska", name = "j", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_171 = new Class322(67, 6);

	@OriginalMember(owner = "client!ska", name = "l", descriptor = "I")
	public static int anInt9103 = 0;

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IB)V")
	public static void method7951() {
		Static688.aClass359_70.method8502(50);
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IIIB)I")
	public static int method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 243) {
			arg1 >>= 0x4;
		} else if (arg0 > 217) {
			arg1 >>= 0x3;
		} else if (arg0 > 192) {
			arg1 >>= 0x2;
		} else if (arg0 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(ZC)Z")
	public static boolean method7955(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
