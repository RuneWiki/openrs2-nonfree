import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sja", name = "Q", descriptor = "Lclient!it;")
	public static Class171 aClass171_1;

	@OriginalMember(owner = "client!sja", name = "T", descriptor = "[I")
	public static final int[] anIntArray496 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(BLclient!qf;)Ljava/lang/String;")
	public static String method7614(@OriginalArg(1) Class5_Sub3_Sub15 arg0) {
		return arg0.aString76 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "([[[Lclient!mf;I)V")
	public static void method7615(@OriginalArg(0) Class226[][][] arg0) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(15) Class226[][] local15 = arg0[local10];
			for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
				for (@Pc(20) int local20 = 0; local20 < local15[local17].length; local20++) {
					@Pc(27) Class226 local27 = local15[local17][local20];
					if (local27 != null) {
						if (local27.aClass28_Sub1_Sub2_1 instanceof Interface1) {
							((Interface1) local27.aClass28_Sub1_Sub2_1).method8989();
						}
						if (local27.aClass28_Sub1_Sub3_2 instanceof Interface1) {
							((Interface1) local27.aClass28_Sub1_Sub3_2).method8989();
						}
						if (local27.aClass28_Sub1_Sub3_1 instanceof Interface1) {
							((Interface1) local27.aClass28_Sub1_Sub3_1).method8989();
						}
						if (local27.aClass28_Sub1_Sub5_2 instanceof Interface1) {
							((Interface1) local27.aClass28_Sub1_Sub5_2).method8989();
						}
						if (local27.aClass28_Sub1_Sub5_1 instanceof Interface1) {
							((Interface1) local27.aClass28_Sub1_Sub5_1).method8989();
						}
						for (@Pc(77) Class41 local77 = local27.aClass41_3; local77 != null; local77 = local77.aClass41_2) {
							@Pc(81) Class28_Sub1_Sub4 local81 = local77.aClass28_Sub1_Sub4_1;
							if (local81 instanceof Interface1) {
								((Interface1) local81).method8989();
							}
						}
					}
				}
			}
		}
	}
}
