import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
	public static int anInt3442;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "Lclient!vc;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	public static int anInt3448 = 1;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "Lclient!qh;")
	public static final Class274 aClass274_2 = new Class274("runescape", 0);

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
	public static int anInt3454 = 0;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	public static void method3085() {
		@Pc(12) byte[] local12;
		if (Static383.anObject15 == null) {
			@Pc(5) Class2_Sub1_Sub2 local5 = new Class2_Sub1_Sub2();
			local12 = local5.method5156();
			Static383.anObject15 = Static258.method6206(local12);
		}
		if (Static468.anObject19 == null) {
			@Pc(35) Class2_Sub2_Sub2 local35 = new Class2_Sub2_Sub2();
			local12 = local35.method6214();
			Static468.anObject19 = Static258.method6206(local12);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V")
	public static void method3087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class3_Sub7_Sub18 local16 = Static543.method7218(11, arg0);
		local16.method7326();
		local16.anInt8802 = arg1;
		local16.anInt8806 = arg2;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method3090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
