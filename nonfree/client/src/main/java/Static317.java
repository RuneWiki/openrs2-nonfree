import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "Lclient!sd;")
	public static Class294 aClass294_12;

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
	public static int anInt9395 = -1;

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "Lclient!wq;")
	public static final Class359 aClass359_13 = new Class359();

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BLclient!fd;)V")
	public static void method7631(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(7) int local7 = arg0.method6542();
		Static472.aClass65Array1 = new Class65[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static472.aClass65Array1[local12] = new Class65();
			Static472.aClass65Array1[local12].anInt2305 = arg0.method6542();
			Static472.aClass65Array1[local12].aString28 = arg0.method6514();
		}
		Static312.anInt6275 = arg0.method6542();
		Static394.anInt7572 = arg0.method6542();
		Static244.anInt5120 = arg0.method6542();
		Static390.aClass69_Sub1Array2 = new Class69_Sub1[Static394.anInt7572 + 1 - Static312.anInt6275];
		for (@Pc(63) int local63 = 0; local63 < Static244.anInt5120; local63++) {
			@Pc(68) int local68 = arg0.method6542();
			@Pc(76) Class69_Sub1 local76 = Static390.aClass69_Sub1Array2[local68] = new Class69_Sub1();
			local76.anInt4845 = arg0.method6538();
			local76.anInt4846 = arg0.method6497();
			local76.anInt4848 = local68 + Static312.anInt6275;
			local76.aString49 = arg0.method6514();
			local76.aString50 = arg0.method6514();
		}
		Static455.anInt8610 = arg0.method6497();
		Static528.aBoolean799 = true;
	}
}
