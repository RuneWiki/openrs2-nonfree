import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "Lclient!ao;")
	public static Class12 aClass12_56;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_55 = new Class12(1, -1);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!wk;)V")
	public static void method1806(@OriginalArg(1) Class25_Sub5_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static236.anInt4213 == arg0.anInt4244 || arg0.anInt4270 == -1 || arg0.anInt4235 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class177 local33 = Static174.aClass254_1.method5670(arg0.anInt4270);
			if (local33.aBoolean573 || arg0.anInt4271 + 1 > local33.anIntArray327[arg0.anInt4301]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(62) int local62 = arg0.anInt4244 - arg0.anInt4285;
			@Pc(68) int local68 = Static236.anInt4213 - arg0.anInt4285;
			@Pc(80) int local80 = arg0.anInt4286 * 128 + arg0.method3427() * 64;
			@Pc(91) int local91 = arg0.anInt4282 * 128 + arg0.method3427() * 64;
			@Pc(102) int local102 = arg0.anInt4289 * 128 + arg0.method3427() * 64;
			@Pc(114) int local114 = arg0.anInt4292 * 128 + arg0.method3427() * 64;
			arg0.anInt5514 = (local91 * (local62 - local68) + local114 * local68) / local62;
			arg0.anInt5518 = (local68 * local102 + (local62 - local68) * local80) / local62;
		}
		arg0.anInt4315 = 0;
		if (arg0.anInt4273 == 0) {
			arg0.method3435(8192);
		}
		if (arg0.anInt4273 == 1) {
			arg0.method3435(12288);
		}
		if (arg0.anInt4273 == 2) {
			arg0.method3435(0);
		}
		if (arg0.anInt4273 == 3) {
			arg0.method3435(4096);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z")
	public static boolean method1810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	public static void method1812() {
		Static190.aClass102_23.method2260();
		Static370.aClass102_46.method2260();
		Static17.aClass102_3.method2260();
		Static36.aClass102_52.method2260();
		Static238.aClass102_28.method2260();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!kh;II)V")
	public static void method1813(@OriginalArg(0) Class1_Sub28_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static435.aBoolean799 = false;
		Static409.anInt6725 = 0;
		Static3.method4553(arg0);
		Static66.method1083(arg0);
		if (Static435.aBoolean799) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt6812 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt6812 + " psize:" + arg1);
		}
	}
}
