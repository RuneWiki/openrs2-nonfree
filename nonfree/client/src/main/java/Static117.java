import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "[S")
	public static short[] aShortArray77;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Lclient!n;")
	public static Class72 aClass72_5;

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "[I")
	public static final int[] anIntArray380 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
	public static int anInt4903 = 999999;

	@OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
	public static int anInt4907 = 0;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
	public static void method4155() {
		if (Static43.aFloat26 < 1024.0F) {
			Static43.aFloat26 = 1024.0F;
		}
		while (Static322.aFloat82 >= 16384.0F) {
			Static322.aFloat82 -= 16384.0F;
		}
		if (Static43.aFloat26 > 3072.0F) {
			Static43.aFloat26 = 3072.0F;
		}
		while (Static322.aFloat82 < 0.0F) {
			Static322.aFloat82 += 16384.0F;
		}
		@Pc(41) int local41 = Static53.anInt4623 >> 7;
		@Pc(45) int local45 = Static233.anInt4616 >> 7;
		@Pc(51) int local51 = Static21.method356(Static53.anInt4623, Static233.anInt4616, Static59.anInt1472);
		@Pc(53) int local53 = 0;
		@Pc(75) int local75;
		if (local41 > 3 && local45 > 3 && Static193.anInt3853 - 4 > local41 && Static301.anInt5585 - 4 > local45) {
			for (local75 = local41 - 4; local75 <= local41 + 4; local75++) {
				for (@Pc(81) int local81 = local45 - 4; local81 <= local45 + 4; local81++) {
					@Pc(85) int local85 = Static59.anInt1472;
					if (local85 < 3 && Static34.method498(local75, local81)) {
						local85++;
					}
					@Pc(96) int local96 = 0;
					if (Static272.aClass191_Sub1_1.aByteArrayArrayArray13 != null && Static272.aClass191_Sub1_1.aByteArrayArrayArray13[local85] != null) {
						local96 = (Static272.aClass191_Sub1_1.aByteArrayArrayArray13[local85][local75][local81] & 0xFF) * 8;
					}
					@Pc(129) int local129 = local51 + local96 - Static389.aClass14Array3[local85].oa(local75, local81);
					if (local129 > local53) {
						local53 = local129;
					}
				}
			}
		}
		local75 = (local53 >> 0) * 1536;
		if (local75 > 786432) {
			local75 = 786432;
		}
		if (local75 < 262144) {
			local75 = 262144;
		}
		if (local75 > Static349.anInt6186) {
			Static349.anInt6186 += (local75 - Static349.anInt6186) / 24;
		} else if (local75 < Static349.anInt6186) {
			Static349.anInt6186 += (local75 - Static349.anInt6186) / 80;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!qa;Lclient!ci;)V")
	public static void method4157(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class38 arg1) {
		@Pc(10) Class98[] local10 = Static472.method2843(arg1, Static47.anInt1072);
		Static46.aClass2Array10 = new Class2[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static46.aClass2Array10[local16] = arg0.method2031(local10[local16]);
		}
		local10 = Static472.method2843(arg1, Static287.anInt5559);
		Static416.aClass2Array44 = new Class2[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static416.aClass2Array44[local47] = arg0.method2031(local10[local47]);
		}
		local10 = Static472.method2843(arg1, Static295.anInt5430);
		Static366.aClass2Array40 = new Class2[local10.length];
		for (@Pc(85) int local85 = 0; local85 < local10.length; local85++) {
			Static366.aClass2Array40[local85] = arg0.method2031(local10[local85]);
		}
		local10 = Static472.method2843(arg1, Static293.anInt5390);
		Static433.aClass2Array12 = new Class2[local10.length];
		for (@Pc(116) int local116 = 0; local116 < local10.length; local116++) {
			Static433.aClass2Array12[local116] = arg0.method2031(local10[local116]);
		}
		local10 = Static472.method2843(arg1, Static104.anInt2195);
		Static42.aClass2Array9 = new Class2[local10.length];
		for (@Pc(147) int local147 = 0; local147 < local10.length; local147++) {
			Static42.aClass2Array9[local147] = arg0.method2031(local10[local147]);
		}
		local10 = Static472.method2843(arg1, Static430.anInt7360);
		Static355.aClass2Array37 = new Class2[local10.length];
		for (@Pc(178) int local178 = 0; local178 < local10.length; local178++) {
			Static355.aClass2Array37[local178] = arg0.method2031(local10[local178]);
		}
		local10 = Static472.method2843(arg1, Static193.anInt3858);
		Static29.aClass2Array46 = new Class2[local10.length];
		for (@Pc(205) int local205 = 0; local205 < local10.length; local205++) {
			Static29.aClass2Array46[local205] = arg0.method2031(local10[local205]);
		}
		local10 = Static472.method2843(arg1, Static366.anInt6370);
		Static403.aClass2Array28 = new Class2[local10.length];
		for (@Pc(232) int local232 = 0; local232 < local10.length; local232++) {
			Static403.aClass2Array28[local232] = arg0.method2031(local10[local232]);
		}
		local10 = Static472.method2843(arg1, Static139.anInt2874);
		Static220.aClass2Array31 = new Class2[local10.length];
		for (@Pc(259) int local259 = 0; local259 < local10.length; local259++) {
			Static220.aClass2Array31[local259] = arg0.method2031(local10[local259]);
		}
		local10 = Static472.method2843(arg1, Static457.anInt7814);
		Static373.aClass2Array42 = new Class2[local10.length];
		for (@Pc(286) int local286 = 0; local286 < local10.length; local286++) {
			Static373.aClass2Array42[local286] = arg0.method2031(local10[local286]);
		}
		local10 = Static472.method2843(arg1, Static92.anInt2058);
		Static351.aClass2Array36 = new Class2[local10.length];
		for (@Pc(317) int local317 = 0; local317 < local10.length; local317++) {
			Static351.aClass2Array36[local317] = arg0.method2031(local10[local317]);
		}
		local10 = Static472.method2843(arg1, Static16.anInt320);
		Static307.aClass2Array45 = new Class2[local10.length];
		for (@Pc(348) int local348 = 0; local348 < local10.length; local348++) {
			Static307.aClass2Array45[local348] = arg0.method2031(local10[local348]);
		}
		Static197.aClass2_19 = arg0.method2031(Static472.method2850(arg1, Static321.anInt5395, 0));
		Static151.aClass2_17 = arg0.method2031(Static472.method2850(arg1, Static105.anInt2239, 0));
		local10 = Static472.method2843(arg1, Static141.anInt7998);
		Static168.aClass2Array23 = new Class2[local10.length];
		for (@Pc(395) int local395 = 0; local395 < local10.length; local395++) {
			Static168.aClass2Array23[local395] = arg0.method2031(local10[local395]);
		}
	}
}
