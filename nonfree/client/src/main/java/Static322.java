import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "F")
	public static float aFloat82 = 0.0F;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!iu;IB)V")
	public static void method4801(@OriginalArg(0) Class4_Sub20_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static216.aBoolean433 = false;
		Static239.anInt4701 = 0;
		Static412.method5721(arg0);
		Static374.method5328(arg0);
		if (Static216.aBoolean433) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt5526 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5526 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(III)Z")
	public static boolean method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZI)V")
	public static void method4803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub1_Sub5 local12 = Static431.method5935(12, arg1);
		local12.method521();
		local12.anInt621 = arg0;
	}
}
