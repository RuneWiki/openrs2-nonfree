import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mja", name = "g", descriptor = "I")
	public static int anInt8186;

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "Lclient!qq;")
	public static Class203 aClass203_13;

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "Lclient!el;")
	public static final Class109 aClass109_172 = new Class109(85, 6);

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "Lclient!el;")
	public static final Class109 aClass109_173 = new Class109(13, 6);

	@OriginalMember(owner = "client!mja", name = "h", descriptor = "[I")
	public static final int[] anIntArray486 = new int[1];

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "[I")
	public static final int[] anIntArray487 = new int[4096];

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!ss;IZZ)V")
	public static void method7048(@OriginalArg(0) Class5_Sub49 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt9322;
		@Pc(12) int local12 = (int) arg0.aLong314;
		arg0.method9327(1);
		if (arg1) {
			Static607.method8681(local8);
		}
		Static179.method2593(local8);
		@Pc(29) Class73 local29 = Static259.method3831(local12);
		if (local29 != null) {
			Static298.method4399(local29);
		}
		Static231.method3356();
		if (!arg2 && Static390.anInt6669 != -1) {
			Static190.method2757(Static390.anInt6669, 1);
		}
		@Pc(63) Class132 local63 = new Class132(Static549.aClass291_37);
		for (@Pc(68) Class5_Sub49 local68 = (Class5_Sub49) local63.method2588(); local68 != null; local68 = (Class5_Sub49) local63.method2586()) {
			if (!local68.method9326()) {
				local68 = (Class5_Sub49) local63.method2588();
				if (local68 == null) {
					return;
				}
			}
			if (local68.anInt9318 == 3) {
				@Pc(95) int local95 = (int) local68.aLong314;
				if (local8 == local95 >>> 16) {
					method7048(local68, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(II)I")
	public static int method7049(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
