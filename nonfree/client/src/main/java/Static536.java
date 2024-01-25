import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!po;")
	public static Class290 aClass290_6 = null;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)Z")
	public static boolean method7358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method7360(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!oi;)V")
	public static void method7362(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub1_Sub2 arg1) {
		if (arg1.anIntArray403 == null) {
			return;
		}
		@Pc(14) int local14 = arg1.anIntArray403[arg0 + 1];
		if (arg1.anInt6872 == local14) {
			return;
		}
		arg1.anInt6869 = 0;
		arg1.anInt6872 = local14;
		arg1.anInt6844 = 0;
		arg1.anInt6836 = 1;
		arg1.anInt6839 = 0;
		arg1.anInt6897 = arg1.anInt6895;
		if (arg1.anInt6872 != -1) {
			Static628.method8566(Static315.aClass14_1.method227(arg1.anInt6872), arg1.anInt6839, arg1);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Z")
	public static boolean method7364() {
		if (Static652.anInt10664 == 3) {
			return Static205.anInt3674 == 0 && Static78.anInt1382 == 0;
		} else {
			return false;
		}
	}
}
