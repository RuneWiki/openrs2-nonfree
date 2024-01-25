import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!kh;")
	public static final Class172 aClass172_11 = new Class172();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7854(@OriginalArg(1) String arg0) {
		if (!Static540.aBoolean580) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static333.anInt6355;
		@Pc(14) int[] local14 = Static354.anIntArray461;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class15_Sub2_Sub4_Sub2 local24 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local14[local16]];
			if (local24 != null && Static461.aClass15_Sub2_Sub4_Sub2_2 != local24 && local24.aString82 != null && local24.aString82.equalsIgnoreCase(arg0)) {
				Static534.method7063(Static458.aClass316_102);
				Static340.aClass6_Sub12_Sub2_1.method6032(Static96.anInt7891);
				Static340.aClass6_Sub12_Sub2_1.method6002(Static152.anInt1934);
				Static340.aClass6_Sub12_Sub2_1.method6032(local14[local16]);
				Static340.aClass6_Sub12_Sub2_1.method6045(0);
				Static340.aClass6_Sub12_Sub2_1.method6032(Static208.anInt3948);
				Static227.method3563(local24.method7135(), local24.method7135(), true, -2, local24.anIntArray638[0], 0, 0, local24.anIntArray637[0]);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static141.method2337(Static146.aClass103_68.method2355(Static188.anInt28) + arg0);
		}
		if (Static540.aBoolean580) {
			Static269.method4026();
		}
	}
}
