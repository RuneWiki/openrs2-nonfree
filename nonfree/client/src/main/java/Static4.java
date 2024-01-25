import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "nb", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_1 = new Class101(2, -1);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILclient!ji;)V")
	public static void method342(@OriginalArg(1) Class6_Sub8 arg0) {
		@Pc(11) int local11 = arg0.method8214();
		Static583.aClass131Array1 = new Class131[local11];
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			Static583.aClass131Array1[local20] = new Class131();
			Static583.aClass131Array1[local20].anInt4576 = arg0.method8214();
			Static583.aClass131Array1[local20].aString47 = arg0.method8240();
		}
		Static305.anInt6172 = arg0.method8214();
		Static181.anInt3989 = arg0.method8214();
		Static428.anInt7857 = arg0.method8214();
		Static256.aClass67_Sub1Array2 = new Class67_Sub1[Static181.anInt3989 + 1 - Static305.anInt6172];
		for (@Pc(76) int local76 = 0; local76 < Static428.anInt7857; local76++) {
			@Pc(82) int local82 = arg0.method8214();
			@Pc(90) Class67_Sub1 local90 = Static256.aClass67_Sub1Array2[local82] = new Class67_Sub1();
			local90.anInt5763 = arg0.method8246();
			local90.anInt5764 = arg0.method8236();
			local90.anInt5773 = local82 + Static305.anInt6172;
			local90.aString58 = arg0.method8240();
			local90.aString59 = arg0.method8240();
		}
		Static10.anInt530 = arg0.method8236();
		Static211.aBoolean332 = true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZIIII)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static535.anInt9280 = arg3;
		Static465.anInt8298 = arg5;
		Static340.anInt6769 = arg4;
		Static150.anInt3514 = arg0;
		Static617.anInt10422 = arg1;
		if (arg2 && Static465.anInt8298 >= 100) {
			Static259.anInt6990 = Static340.anInt6769 * 512 + 256;
			Static184.anInt4048 = Static617.anInt10422 * 512 + 256;
			Static149.anInt3489 = Static150.method2982(Static86.anInt10575, Static259.anInt6990, Static184.anInt4048) - Static535.anInt9280;
		}
		Static594.anInt10048 = -1;
		Static214.anInt4587 = -1;
		Static554.anInt9497 = 2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method384(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 3);
		local8.method5179();
		local8.aString68 = arg1;
	}
}
