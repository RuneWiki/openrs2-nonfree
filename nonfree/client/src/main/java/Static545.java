import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public static int anInt8784;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public static int anInt8786 = 0;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
	public static int anInt8787 = 0;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	public static int anInt8790 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method7529(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static649.anInt10495;
		@Pc(7) int[] local7 = Static426.anIntArray476;
		@Pc(13) boolean local13 = false;
		for (@Pc(15) int local15 = 0; local15 < local5; local15++) {
			@Pc(22) Class16_Sub1_Sub1_Sub3_Sub2 local22 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local7[local15]];
			if (local22 != null && local22 != Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 && local22.aString82 != null && local22.aString82.equalsIgnoreCase(arg0)) {
				local13 = true;
				@Pc(51) Class2_Sub31 local51;
				if (arg1 == 1) {
					local51 = Static275.method4480(Static640.aClass314_2, Static363.aClass145_109);
					local51.aClass2_Sub17_Sub1_2.method2883(local7[local15]);
					local51.aClass2_Sub17_Sub1_2.method2849(0);
					Static526.method7309(local51);
				} else if (arg1 == 4) {
					local51 = Static275.method4480(Static640.aClass314_2, Static104.aClass145_39);
					local51.aClass2_Sub17_Sub1_2.method2879(local7[local15]);
					local51.aClass2_Sub17_Sub1_2.method2824(0);
					Static526.method7309(local51);
				} else if (arg1 == 5) {
					local51 = Static275.method4480(Static640.aClass314_2, Static347.aClass145_173);
					local51.aClass2_Sub17_Sub1_2.method2883(local7[local15]);
					local51.aClass2_Sub17_Sub1_2.method2831(0);
					Static526.method7309(local51);
				} else if (arg1 == 6) {
					local51 = Static275.method4480(Static640.aClass314_2, Static649.aClass145_182);
					local51.aClass2_Sub17_Sub1_2.method2889(local7[local15]);
					local51.aClass2_Sub17_Sub1_2.method2849(0);
					Static526.method7309(local51);
				} else if (arg1 == 7) {
					local51 = Static275.method4480(Static640.aClass314_2, Static181.aClass145_59);
					local51.aClass2_Sub17_Sub1_2.method2849(0);
					local51.aClass2_Sub17_Sub1_2.method2879(local7[local15]);
					Static526.method7309(local51);
				}
				break;
			}
		}
		if (!local13) {
			Static601.method8468(Static573.aClass345_23.method7951(Static496.anInt7407) + arg0);
		}
	}
}
