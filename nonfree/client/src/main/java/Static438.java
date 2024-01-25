import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	public static int anInt7970;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "I")
	public static int anInt7971;

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	public static int anInt7963 = 0;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	public static int anInt7964 = 0;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[200];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public static void method7126(@OriginalArg(1) int arg0) {
		Static377.anInt7162 = arg0;
		Static207.aClass22_18.method461();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "([Lclient!uf;IZ)V")
	public static void method7129(@OriginalArg(0) Class357[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class357 local9 = arg0[local3];
			if (local9 != null && local9.anInt10449 == arg1 && !Static85.method1479(local9)) {
				if (local9.anInt10430 == 0) {
					method7129(arg0, local9.anInt10460);
					if (local9.aClass357Array2 != null) {
						method7129(local9.aClass357Array2, local9.anInt10460);
					}
					@Pc(50) Class2_Sub20 local50 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local9.anInt10460);
					if (local50 != null) {
						Static254.method4443(local50.anInt1667);
					}
				}
				if (local9.anInt10430 == 6 && local9.anInt10446 != -1) {
					@Pc(70) Class178 local70 = Static354.aClass40_2.method1123(local9.anInt10446);
					if (local70 != null) {
						local9.anInt10467 += Static87.anInt1634;
						@Pc(81) int local81 = local9.anInt10475;
						while (local9.anInt10467 > local70.anIntArray257[local9.anInt10475]) {
							local9.anInt10467 -= local70.anIntArray257[local9.anInt10475];
							local9.anInt10475++;
							if (local70.anIntArray259.length <= local9.anInt10475) {
								local9.anInt10475 -= local70.anInt5142;
								if (local9.anInt10475 < 0 || local70.anIntArray259.length <= local9.anInt10475) {
									local9.anInt10475 = 0;
								}
							}
							local9.anInt10408 = local9.anInt10475 + 1;
							if (local9.anInt10408 >= local70.anIntArray259.length) {
								local9.anInt10408 -= local70.anInt5142;
								if (local9.anInt10408 < 0 || local70.anIntArray259.length <= local9.anInt10408) {
									local9.anInt10408 = -1;
								}
							}
							Static473.method7526(local9);
						}
						if (local81 != local9.anInt10475) {
							Static364.method6183(local9.anInt10475, local70);
						}
					}
				}
			}
		}
	}
}
