import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cf", name = "Q", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_4 = new Class184(2, 2);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!dm;II)V")
	public static void method1194(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class1 local14 = arg1.method1693(Static600.aClass87_15);
		if (local14 == null) {
			return;
		}
		Static600.aClass87_15.KA(arg2, arg0, arg2 + arg1.anInt1964, arg1.anInt1991 + arg0);
		if (Static511.anInt7699 >= 3) {
			Static600.aClass87_15.A(-16777216, local14, arg2, arg0);
		} else {
			Static289.aClass20_14.method4574((float) arg2 + (float) arg1.anInt1964 / 2.0F, (float) arg0 + (float) arg1.anInt1991 / 2.0F, ((int) -Static378.aFloat160 & 0x3FFF) << 2, local14, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public static void method1195(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg0, 10);
		local8.method4387();
	}
}
