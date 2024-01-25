import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public static int anInt3891;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public static final int anInt3895 = 1406;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
	public static void method3375(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class303 local8 = Static71.method1631(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(23) Class2_Sub18 local23 = new Class2_Sub18();
			local23.anObjectArray1 = local8.anObjectArray15;
			local23.anInt3015 = arg0;
			local23.aString28 = arg1;
			local23.aClass303_4 = local8;
			Static156.method2728(local23);
		}
		if (Static454.anInt7416 != 10 || !Static79.method1734(local8).method2649(arg0 - 1)) {
			return;
		}
		@Pc(65) Class2_Sub31 local65;
		if (arg0 == 1) {
			local65 = Static275.method4480(Static640.aClass314_2, Static507.aClass145_178);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 2) {
			local65 = Static275.method4480(Static640.aClass314_2, Static46.aClass145_97);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 3) {
			local65 = Static275.method4480(Static640.aClass314_2, Static414.aClass145_122);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 4) {
			local65 = Static275.method4480(Static640.aClass314_2, Static578.aClass145_166);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 5) {
			local65 = Static275.method4480(Static640.aClass314_2, Static286.aClass145_86);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 6) {
			local65 = Static275.method4480(Static640.aClass314_2, Static385.aClass145_115);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 7) {
			local65 = Static275.method4480(Static640.aClass314_2, Static373.aClass145_111);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 8) {
			local65 = Static275.method4480(Static640.aClass314_2, Static224.aClass145_64);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 9) {
			local65 = Static275.method4480(Static640.aClass314_2, Static553.aClass145_161);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
		if (arg0 == 10) {
			local65 = Static275.method4480(Static640.aClass314_2, Static484.aClass145_174);
			Static328.method4990(local8.anInt7964, local65, arg2, arg3);
			Static526.method7309(local65);
		}
	}
}
