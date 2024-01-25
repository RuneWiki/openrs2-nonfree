import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_153 = new Class151("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	public static int anInt5050 = 1;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	public static int anInt5058 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLclient!vp;Lclient!qa;I)V")
	public static void method3964(@OriginalArg(2) Class254 arg0, @OriginalArg(3) Class128 arg1) {
		Static110.aClass254_11.method5438();
		if (Static220.aBoolean282) {
			return;
		}
		for (@Pc(16) Class1_Sub7 local16 = (Class1_Sub7) arg0.method5437(); local16 != null; local16 = (Class1_Sub7) arg0.method5433()) {
			@Pc(32) Class56 local32 = Static114.aClass101_4.method2104(local16.anInt969);
			if (Static402.method5020(local32)) {
				@Pc(44) boolean local44 = Static49.method727(local32, arg1, local16);
				if (local44) {
					Static279.method5484(arg1, local32, local16);
				}
			}
		}
	}
}
