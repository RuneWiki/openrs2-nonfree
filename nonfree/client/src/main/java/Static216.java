import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nk", name = "ob", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_140 = new Class157(55, 6);

	@OriginalMember(owner = "client!nk", name = "pb", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_158 = new Class221(64, 2);

	@OriginalMember(owner = "client!nk", name = "sb", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_113 = new Class140("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!vp;")
	public static Class93 method4117(@OriginalArg(2) Component arg0) {
		return new Class93_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)V")
	public static void method4121(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static366.aFloat48 = local15;
		Static99.aFloat33 = local7;
		if (Static135.anInt2910 == 2) {
			Static168.anInt3820 = local7;
			Static234.anInt5031 = 0;
			Static195.anInt4286 = local15;
		}
		Static255.method4486();
		Static273.aBoolean493 = true;
	}
}
