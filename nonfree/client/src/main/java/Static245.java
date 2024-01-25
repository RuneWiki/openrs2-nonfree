import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jca", name = "R", descriptor = "Lclient!jb;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!jca", name = "U", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!jca", name = "O", descriptor = "Z")
	public static volatile boolean aBoolean315 = true;

	@OriginalMember(owner = "client!jca", name = "W", descriptor = "Lclient!qaa;")
	public static final Class266 aClass266_3 = new Class266();

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(Z)V")
	public static void method3870() {
		if (Static229.aClass58_5 != null) {
			Static229.aClass58_5.method5323();
		}
		if (Static170.aClass58_6 != null) {
			Static170.aClass58_6.method5323();
		}
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(II)I")
	public static int method3871(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([BIILjava/lang/String;)I")
	public static int method3873(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg2.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17 += 4) {
			@Pc(25) int local25 = Static589.method8110(arg2.charAt(local17));
			@Pc(44) int local44 = local10 > local17 + 1 ? Static589.method8110(arg2.charAt(local17 + 1)) : -1;
			@Pc(59) int local59 = local10 <= local17 + 2 ? -1 : Static589.method8110(arg2.charAt(local17 + 2));
			@Pc(78) int local78 = local17 + 3 >= local10 ? -1 : Static589.method8110(arg2.charAt(local17 + 3));
			arg0[arg1++] = (byte) (local44 >>> 4 | local25 << 2);
			if (local59 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local44 & 0xF) << 4 | local59 >>> 2);
			if (local78 == -1) {
				break;
			}
			arg0[arg1++] = (byte) (local78 | (local59 & 0x3) << 6);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)I")
	public static int method3874() {
		if (Static445.anInt7881 == 0) {
			Static263.aClass164_2.method4039(new Class354("jaclib"));
			if (Static263.aClass164_2.method4038().method7897() != 100) {
				return 1;
			}
			if (!((Class354) Static263.aClass164_2.method4038()).method7900()) {
				Static507.aClient1.method1701();
			}
			Static445.anInt7881 = 1;
		}
		@Pc(226) int local226;
		@Pc(245) int local245;
		@Pc(259) int local259;
		@Pc(265) int local265;
		if (Static445.anInt7881 == 1) {
			Static512.aClass164Array1 = Static263.method4037();
			Static263.aClass164_1.method4039(new Class243(Static473.aClass284_132));
			Static263.aClass164_3.method4039(new Class354("jaggl"));
			Static263.aClass164_4.method4039(new Class354("jagdx"));
			Static263.aClass164_5.method4039(new Class354("jagmisc"));
			Static263.aClass164_6.method4039(new Class354("sw3d"));
			Static263.aClass164_7.method4039(new Class354("hw3d"));
			Static263.aClass164_8.method4039(new Class243(Static374.aClass284_112));
			Static263.aClass164_9.method4039(new Class243(Static336.aClass284_100));
			Static263.aClass164_10.method4039(new Class243(Static347.aClass284_106));
			Static263.aClass164_11.method4039(new Class243(Static222.aClass284_67));
			Static263.aClass164_12.method4039(new Class243(Static217.aClass284_66));
			Static263.aClass164_13.method4039(new Class243(Static411.aClass284_117));
			Static263.aClass164_14.method4039(new Class243(Static401.aClass284_116));
			Static263.aClass164_15.method4039(new Class243(Static569.aClass284_164));
			Static263.aClass164_16.method4039(new Class243(Static374.aClass284_111));
			Static263.aClass164_17.method4039(new Class243(Static125.aClass284_41));
			Static263.aClass164_18.method4039(new Class243(Static356.aClass284_107));
			Static263.aClass164_19.method4039(new Class243(Static16.aClass284_3));
			Static263.aClass164_20.method4039(new Class243(Static345.aClass284_104));
			Static263.aClass164_21.method4039(new Class243(Static434.aClass284_124));
			Static263.aClass164_22.method4039(new Class340(Static275.aClass284_83, "huffman"));
			Static263.aClass164_23.method4039(new Class243(Static226.aClass284_69));
			Static263.aClass164_24.method4039(new Class243(Static468.aClass284_131));
			Static263.aClass164_25.method4039(new Class243(Static336.aClass284_99));
			Static263.aClass164_26.method4039(new Class230(Static332.aClass284_24, "details"));
			for (local226 = 0; local226 < Static512.aClass164Array1.length; local226++) {
				if (Static512.aClass164Array1[local226].method4038() == null) {
					throw new RuntimeException();
				}
			}
			local245 = 0;
			@Pc(247) Class164[] local247 = Static512.aClass164Array1;
			for (@Pc(249) int local249 = 0; local249 < local247.length; local249++) {
				@Pc(255) Class164 local255 = local247[local249];
				local259 = local255.method4035();
				local265 = local255.method4038().method7897();
				local245 += local259 * local265 / 100;
			}
			Static591.anInt10278 = local245;
			Static445.anInt7881 = 2;
		}
		if (Static512.aClass164Array1 == null) {
			return 100;
		}
		local226 = 0;
		local245 = 0;
		@Pc(292) boolean local292 = true;
		@Pc(301) Class164[] local301 = Static512.aClass164Array1;
		for (@Pc(303) int local303 = 0; local303 < local301.length; local303++) {
			@Pc(309) Class164 local309 = local301[local303];
			local265 = local309.method4035();
			@Pc(319) int local319 = local309.method4038().method7897();
			local245 += local319 * local265 / 100;
			if (local319 < 100) {
				local292 = false;
			}
			local226 += local265;
		}
		if (local292) {
			if (!((Class354) Static263.aClass164_5.method4038()).method7900()) {
				Static507.aClient1.method1692();
			}
			Static512.aClass164Array1 = null;
		}
		local245 -= Static591.anInt10278;
		local226 -= Static591.anInt10278;
		local259 = local226 <= 0 ? 100 : local245 * 100 / local226;
		if (!local292 && local259 > 99) {
			local259 = 99;
		}
		return local259;
	}
}
