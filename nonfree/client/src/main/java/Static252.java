import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_70 = new Class96("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_218 = new Class12(74, 3);

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_71 = new Class96("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!hh;I)V")
	public static void method3606(@OriginalArg(0) Class109 arg0) {
		Static362.anInt6604 = arg0.method2343("titlebg");
		Static96.anInt1882 = arg0.method2343("logo");
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	public static int method3608() {
		@Pc(7) Class121 local7 = Static447.aClass121_11;
		@Pc(9) boolean local9 = false;
		if (Static146.anInt2664 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static319.method4644(local18, 0, 0, null, null);
			local9 = true;
		}
		@Pc(40) long local40 = Static107.method1707();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method4608();
		}
		@Pc(67) int local67 = (int) (Static107.method1707() - local40);
		local7.method4600(100, 0, -16777216, 100, 0);
		if (local9) {
			local7.method4598();
		}
		return local67;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public static void method3609(@OriginalArg(0) int arg0) {
		if (!Static111.method1740(arg0)) {
			return;
		}
		@Pc(20) Class229[] local20 = Static276.aClass229ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class229 local28 = local20[local22];
			if (local28 != null) {
				local28.anInt6898 = 1;
				local28.anInt6879 = 0;
				local28.anInt6916 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)I")
	public static int method3610(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
