import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!fda;")
	public static final Class93 aClass93_6 = new Class93(3);

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_12 = new Class130();

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
	public static void method2755() {
		Static478.anInt7778 = 0;
		Static206.anInt4170 = 2;
		Static375.anInt6351 = 1;
		Static10.aClass246_11 = null;
		Static262.anInt4939 = -1;
		Static564.aBoolean704 = false;
		Static487.anInt7851 = -1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BIII)I")
	public static int method2756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 1);
	}
}
