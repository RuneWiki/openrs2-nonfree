import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "Lclient!sf;")
	public static Class5_Sub50 aClass5_Sub50_14;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIFZIIBII)[[I")
	public static int[][] method2967(@OriginalArg(2) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(22) Class5_Sub2_Sub4 local22 = new Class5_Sub2_Sub4();
		local22.anInt830 = (int) (arg0 * 4096.0F);
		local22.anInt832 = 3;
		local22.aBoolean59 = false;
		local22.anInt833 = 4;
		local22.anInt835 = 4;
		local22.method8951();
		Static187.method5796(256, 64);
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			local22.method731(local7[local49], local49);
		}
		return local7;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(BIIZLclient!wm;II)V")
	public static void method2968(@OriginalArg(2) int arg0, @OriginalArg(4) Class390 arg1, @OriginalArg(5) int arg2) {
		Static561.anInt9131 = arg2;
		Static171.anInt3389 = 2;
		Static234.aClass390_55 = arg1;
		Static128.aBoolean231 = false;
		Static577.anInt9443 = arg0;
		Static439.aClass5_Sub17_Sub1_3 = null;
		Static26.anInt352 = 1;
		Static67.anInt1002 = 0;
	}
}
