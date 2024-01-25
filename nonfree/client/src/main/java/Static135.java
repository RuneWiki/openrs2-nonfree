import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_29 = new Class231("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
	public static int anInt1508 = 0;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
	public static void method1387(@OriginalArg(0) int arg0) {
		if (!Static195.method2779(arg0)) {
			return;
		}
		@Pc(22) Class93[] local22 = Static188.aClass93ArrayArray4[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class93 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt2455 = 1;
				local30.anInt2433 = 0;
				local30.anInt2438 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
	public static int method1391() {
		@Pc(7) Class75 local7 = Static257.aClass75_8;
		@Pc(9) boolean local9 = false;
		if (Static404.anInt2752 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static465.method6008(null, local18, 0, 0, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static432.method5870();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method5950();
		}
		@Pc(61) int local61 = (int) (Static432.method5870() - local35);
		local7.method5996(100, 0, -16777216, 0, 100);
		if (local9) {
			local7.method5989();
		}
		return local61;
	}
}
