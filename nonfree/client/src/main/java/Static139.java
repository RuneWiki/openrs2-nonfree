import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	public static int anInt2797;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_51 = new Class180(79, -1);

	@OriginalMember(owner = "client!el", name = "l", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IILclient!bba;)V")
	public static void method2540(@OriginalArg(0) int arg0, @OriginalArg(2) Class28_Sub1_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static588.anInt9467 < arg1.anInt10780) {
			Static451.method6586(arg1);
		} else if (arg1.anInt10755 >= Static588.anInt9467) {
			Static468.method6792(arg1);
		} else {
			Static33.method9312(arg1, false);
			local9 = Static69.anInt1321;
			local7 = Static88.anInt1724;
		}
		@Pc(120) int local120;
		if (arg1.anInt10729 < 512 || arg1.anInt10731 < 512 || arg1.anInt10729 >= Static158.anInt927 * 512 - 512 || Static515.anInt8292 * 512 - 512 <= arg1.anInt10731) {
			arg1.anInt10755 = 0;
			arg1.anInt10780 = 0;
			local7 = -1;
			local9 = 0;
			arg1.lb = null;
			arg1.anInt10773 = -1;
			arg1.anInt10729 = arg1.anIntArray956[0] * 512 + arg1.method9314() * 256;
			arg1.anInt10731 = arg1.anIntArray955[0] * 512 + arg1.method9314() * 256;
			arg1.method9319();
			for (local120 = 0; local120 < arg1.aClass280Array3.length; local120++) {
				arg1.aClass280Array3[local120].anInt7952 = -1;
			}
		}
		if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == arg1 && (arg1.anInt10729 < 6144 || arg1.anInt10731 < 6144 || arg1.anInt10729 >= Static158.anInt927 * 512 - 6144 || arg1.anInt10731 >= Static515.anInt8292 * 512 - 6144)) {
			arg1.anInt10755 = 0;
			local7 = -1;
			local9 = 0;
			arg1.anInt10780 = 0;
			arg1.anInt10773 = -1;
			arg1.lb = null;
			arg1.anInt10729 = arg1.anIntArray956[0] * 512 + arg1.method9314() * 256;
			arg1.anInt10731 = arg1.anIntArray955[0] * 512 + arg1.method9314() * 256;
			arg1.method9319();
			for (local120 = 0; local120 < arg1.aClass280Array3.length; local120++) {
				arg1.aClass280Array3[local120].anInt7952 = -1;
			}
		}
		local120 = Static395.method5579(arg1);
		Static527.method7603(arg1);
		Static254.method4156(local120, arg1, local7, local9);
		Static231.method3913(arg1, local7);
		Static162.method2937(arg1);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method2541() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Class300.lb[local7] = false;
		}
		Static266.anInt4722 = -1;
		Static134.anInt2727 = -1;
		Static153.anInt3036 = -1;
		Static410.anInt6542 = -1;
		Static72.anInt1357 = 0;
		Static676.anInt10886 = 0;
		Static428.anInt6834 = 1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!jp;)V")
	public static void method2545(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(9) int local9 = arg0.method8604();
		Static397.aClass181Array1 = new Class181[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static397.aClass181Array1[local14] = new Class181();
			Static397.aClass181Array1[local14].anInt4973 = arg0.method8604();
			Static397.aClass181Array1[local14].aString47 = arg0.method8584();
		}
		Static321.anInt5361 = arg0.method8604();
		Static495.anInt8144 = arg0.method8604();
		Static252.anInt4527 = arg0.method8604();
		Static33.aClass98_Sub1Array4 = new Class98_Sub1[Static495.anInt8144 + 1 - Static321.anInt5361];
		for (@Pc(65) int local65 = 0; local65 < Static252.anInt4527; local65++) {
			@Pc(70) int local70 = arg0.method8604();
			@Pc(78) Class98_Sub1 local78 = Static33.aClass98_Sub1Array4[local70] = new Class98_Sub1();
			local78.anInt5508 = arg0.method8632();
			local78.anInt5501 = arg0.method8618();
			local78.anInt5514 = Static321.anInt5361 + local70;
			local78.aString55 = arg0.method8584();
			local78.aString56 = arg0.method8584();
		}
		Static135.anInt6416 = arg0.method8618();
		Static323.aBoolean336 = true;
	}
}
