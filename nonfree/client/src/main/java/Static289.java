import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method5237() {
		if (Static137.aClass167_2 != null) {
			Static251.aClass8_1 = new Class8();
			Static251.aClass8_1.method169(Static137.aClass167_2, Static137.aClass167_2.aClass351_1.method8691(Static476.anInt8915), Static137.aClass167_2.anInt5653, Static601.aLong262);
			Static474.aThread5 = new Thread(Static251.aClass8_1, "");
			Static474.aThread5.start();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
	public static void method5238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg2, 9);
		local8.method3088();
		local8.anInt3368 = arg1;
		local8.anInt3367 = arg0;
	}
}
