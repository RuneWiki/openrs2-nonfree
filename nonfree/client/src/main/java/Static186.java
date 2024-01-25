import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!wu;")
	public static Class384 aClass384_47;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Z")
	public static boolean aBoolean276;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_28 = new Class181(15, -1);

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_20 = new Class293(8);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
	public static int method2985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15;
		if (arg1 > arg0) {
			local15 = arg0;
			arg0 = arg1;
			arg1 = local15;
		}
		while (arg1 != 0) {
			local15 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local15;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public static void method2986() {
		@Pc(17) Class5_Sub35 local17;
		for (local17 = (Class5_Sub35) Static404.aClass306_36.method7313(); local17 != null; local17 = (Class5_Sub35) Static404.aClass306_36.method7301()) {
			if (local17.aBoolean540) {
				local17.method8911();
			} else {
				local17.aBoolean539 = true;
				if (local17.anInt6495 >= 0 && local17.anInt6497 >= 0 && Static111.anInt1752 > local17.anInt6495 && Static279.anInt4567 > local17.anInt6497) {
					Static213.method3231(local17);
				}
			}
		}
		for (local17 = (Class5_Sub35) Static498.aClass306_55.method7313(); local17 != null; local17 = (Class5_Sub35) Static498.aClass306_55.method7301()) {
			if (local17.aBoolean540) {
				local17.method8911();
			} else {
				local17.aBoolean539 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kf;ZZ)V")
	public static void method2987(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean759 = arg1;
		if (Static425.aBoolean601) {
			Static589.aClass350Array3[Static589.aClass350Array3.length - 1].method8252(arg0);
		} else {
			Static362.method5664(arg0, Static348.aClass5_Sub27Array3);
		}
	}
}
