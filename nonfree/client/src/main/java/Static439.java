import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!ha;ZIIIII)V")
	public static void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		Static536.aClass22_11 = arg1;
		Static245.aClass58_2 = Static536.aClass22_11.method9376();
		Static276.aClass58_3 = Static536.aClass22_11.method9376();
		Static445.aClass58_5 = Static536.aClass22_11.method9376();
		Static91.anInt2080 = arg3;
		Static614.anInt9291 = 0;
		Static604.anInt9164 = 2;
		Static488.anInt7680 = 1;
		Static414.anInt6387 = 2;
		Static406.anInt10703 = 0;
		Static538.anInterface25_1 = null;
		Static703.anInt10979 = arg4;
		Static670.method8989(arg2, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)[Lclient!jia;")
	public static Class192[] method5851() {
		if (Static298.aClass192Array1 == null) {
			@Pc(11) Class192[] local11 = Static703.method9306(Static122.aClass47_1);
			@Pc(15) Class192[] local15 = new Class192[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22 = Static580.aClass3_Sub22_24.aClass21_Sub11_1.method4664();
			@Pc(111) int local111;
			@Pc(117) Class192 local117;
			label70: for (@Pc(24) int local24 = 0; local24 < local11.length; local24++) {
				@Pc(32) Class192 local32 = local11[local24];
				if ((local32.anInt4997 <= 0 || local32.anInt4997 >= 24) && local32.anInt4995 >= 800 && local32.anInt4999 >= 600 && (local22 != 2 || local32.anInt4995 <= 800 && local32.anInt4999 <= 600) && (local22 != 1 || local32.anInt4995 <= 1024 && local32.anInt4999 <= 768)) {
					for (local111 = 0; local111 < local17; local111++) {
						local117 = local15[local111];
						if (local32.anInt4995 == local117.anInt4995 && local32.anInt4999 == local117.anInt4999) {
							if (local117.anInt4997 < local32.anInt4997) {
								local15[local111] = local32;
							}
							continue label70;
						}
					}
					local15[local17] = local32;
					local17++;
				}
			}
			Static298.aClass192Array1 = new Class192[local17];
			Static732.method6316(local15, 0, Static298.aClass192Array1, 0, local17);
			@Pc(191) int[] local191 = new int[Static298.aClass192Array1.length];
			for (local111 = 0; local111 < Static298.aClass192Array1.length; local111++) {
				local117 = Static298.aClass192Array1[local111];
				local191[local111] = local117.anInt4995 * local117.anInt4999;
			}
			Static353.method4958(Static298.aClass192Array1, local191);
		}
		return Static298.aClass192Array1;
	}
}
