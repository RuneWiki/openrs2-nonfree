import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public static int anInt5015;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_117 = new Class163(26, 11);

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!ke;")
	public static Class126 aClass126_1 = new Class126();

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
	public static boolean method4131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static240.method5191(arg1, arg0) || Static21.method6250(arg1, arg0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BIII)I")
	public static int method4132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg2;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!qa;Lclient!uu;)V")
	public static void method4134(@OriginalArg(1) Class167 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(10) Class154[] local10 = Static467.method3627(arg1, Static195.anInt3530);
		Static40.aClass2Array2 = new Class2[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static40.aClass2Array2[local16] = arg0.method5993(local10[local16]);
		}
		local10 = Static467.method3627(arg1, Static311.anInt5308);
		Static107.aClass2Array5 = new Class2[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static107.aClass2Array5[local43] = arg0.method5993(local10[local43]);
		}
		local10 = Static467.method3627(arg1, Static145.anInt2647);
		Static63.aClass2Array18 = new Class2[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static63.aClass2Array18[local74] = arg0.method5993(local10[local74]);
		}
		local10 = Static467.method3627(arg1, Static345.anInt5819);
		Static153.aClass2Array10 = new Class2[local10.length];
		for (@Pc(101) int local101 = 0; local101 < local10.length; local101++) {
			Static153.aClass2Array10[local101] = arg0.method5993(local10[local101]);
		}
		local10 = Static467.method3627(arg1, Static362.anInt6170);
		Static419.aClass2Array17 = new Class2[local10.length];
		for (@Pc(136) int local136 = 0; local136 < local10.length; local136++) {
			Static419.aClass2Array17[local136] = arg0.method5993(local10[local136]);
		}
		local10 = Static467.method3627(arg1, Static51.anInt930);
		Static93.aClass2Array4 = new Class2[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static93.aClass2Array4[local163] = arg0.method5993(local10[local163]);
		}
		local10 = Static467.method3627(arg1, Static205.anInt5935);
		Static125.aClass2Array6 = new Class2[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static125.aClass2Array6[local194] = arg0.method5993(local10[local194]);
		}
		local10 = Static467.method3627(arg1, Static331.anInt7371);
		Static230.aClass2Array11 = new Class2[local10.length];
		for (@Pc(221) int local221 = 0; local221 < local10.length; local221++) {
			Static230.aClass2Array11[local221] = arg0.method5993(local10[local221]);
		}
		local10 = Static467.method3627(arg1, Static105.anInt1900);
		Static215.aClass2Array12 = new Class2[local10.length];
		for (@Pc(252) int local252 = 0; local252 < local10.length; local252++) {
			Static215.aClass2Array12[local252] = arg0.method5993(local10[local252]);
		}
		local10 = Static467.method3627(arg1, Static90.anInt1611);
		Static3.aClass2Array1 = new Class2[local10.length];
		for (@Pc(279) int local279 = 0; local279 < local10.length; local279++) {
			Static3.aClass2Array1[local279] = arg0.method5993(local10[local279]);
		}
		local10 = Static467.method3627(arg1, Static314.anInt5328);
		Static264.aClass2Array14 = new Class2[local10.length];
		for (@Pc(306) int local306 = 0; local306 < local10.length; local306++) {
			Static264.aClass2Array14[local306] = arg0.method5993(local10[local306]);
		}
		local10 = Static467.method3627(arg1, Static170.anInt3086);
		Static353.aClass2Array19 = new Class2[local10.length];
		for (@Pc(337) int local337 = 0; local337 < local10.length; local337++) {
			Static353.aClass2Array19[local337] = arg0.method5993(local10[local337]);
		}
		Static278.aClass2_9 = arg0.method5993(Static467.method3619(arg1, Static126.anInt2305, 0));
		Static330.aClass2_13 = arg0.method5993(Static467.method3619(arg1, Static426.anInt7184, 0));
		local10 = Static467.method3627(arg1, Static6.anInt41);
		Static248.aClass2Array13 = new Class2[local10.length];
		for (@Pc(384) int local384 = 0; local384 < local10.length; local384++) {
			Static248.aClass2Array13[local384] = arg0.method5993(local10[local384]);
		}
	}
}
