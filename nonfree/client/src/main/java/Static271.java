import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[100];

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "J")
	public static long aLong174 = -1L;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!iq;ZII)V")
	public static void method4700(@OriginalArg(0) int arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(5) int arg2) {
		Static319.aBoolean562 = false;
		Static81.anInt1526 = arg2;
		Static230.anInt5823 = 1;
		Static341.aClass104_24 = arg1;
		Static92.anInt1809 = 10000;
		Static167.anInt3809 = 0;
		Static139.anInt3012 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBI)I")
	public static int method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ef;Z)V")
	public static void method4702(@OriginalArg(0) Class2_Sub12 arg0) {
		@Pc(9) int local9 = arg0.method3153();
		Static8.aClass123Array1 = new Class123[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static8.aClass123Array1[local14] = new Class123();
			Static8.aClass123Array1[local14].anInt3966 = arg0.method3153();
			Static8.aClass123Array1[local14].aString39 = arg0.method3111();
		}
		Static129.anInt2764 = arg0.method3153();
		Static317.anInt6258 = arg0.method3153();
		Static109.anInt2285 = arg0.method3153();
		Static279.aClass120_Sub1Array5 = new Class120_Sub1[Static317.anInt6258 + 1 - Static129.anInt2764];
		for (@Pc(66) int local66 = 0; local66 < Static109.anInt2285; local66++) {
			@Pc(77) int local77 = arg0.method3153();
			@Pc(85) Class120_Sub1 local85 = Static279.aClass120_Sub1Array5[local77] = new Class120_Sub1();
			local85.anInt5087 = arg0.method3124();
			local85.anInt5085 = arg0.method3135();
			local85.anInt5093 = local77 + Static129.anInt2764;
			local85.aString48 = arg0.method3111();
			local85.aString47 = arg0.method3111();
		}
		Static90.anInt1756 = arg0.method3135();
		Static122.aBoolean255 = true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
	public static void method4703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static146.method2839(arg1)) {
			Static64.method1324(Static264.aClass68ArrayArray1[arg1], arg0);
		}
	}
}
