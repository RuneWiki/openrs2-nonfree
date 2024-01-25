import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_18 = new Class118(16);

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
	public static int anInt3617 = -1;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "[I")
	public static final int[] anIntArray248 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
	public static int anInt3618 = 2;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIZI)I")
	public static int method3023(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class2_Sub8 local10 = Static384.method5147(arg2, arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray123.length > arg0) {
			return local10.anIntArray123[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)Z")
	public static boolean method3025(@OriginalArg(0) int arg0) {
		if (Static414.aBooleanArray118[arg0]) {
			return true;
		} else if (Static92.aClass380_29.method8635(arg0)) {
			@Pc(30) int local30 = Static92.aClass380_29.method8631(arg0);
			if (local30 == 0) {
				Static414.aBooleanArray118[arg0] = true;
				return true;
			}
			if (Static559.aClass261ArrayArray2[arg0] == null) {
				Static559.aClass261ArrayArray2[arg0] = new Class261[local30];
			}
			for (@Pc(49) int local49 = 0; local49 < local30; local49++) {
				if (Static559.aClass261ArrayArray2[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static92.aClass380_29.method8620(arg0, local49);
					if (local63 != null) {
						@Pc(75) Class261 local75 = Static559.aClass261ArrayArray2[arg0][local49] = new Class261();
						local75.anInt6614 = local49 + (arg0 << 16);
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method5637(new Class2_Sub22(local63));
					}
				}
			}
			Static414.aBooleanArray118[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public static void method3026() {
		Static140.anInt2578 = 0;
		Static205.anInt6320++;
		Static52.anInt1087 = 0;
		Static388.method5230();
		Static148.method2226();
		Static237.method3326();
		@Pc(29) boolean local29 = false;
		@Pc(37) int local37;
		for (@Pc(31) int local31 = 0; local31 < Static52.anInt1087; local31++) {
			local37 = Static314.anIntArray344[local31];
			@Pc(44) Class2_Sub43 local44 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local37);
			@Pc(47) Class13_Sub1_Sub1_Sub1_Sub1 local47 = local44.aClass13_Sub1_Sub1_Sub1_Sub1_2;
			if (Static627.aBoolean736 && Static239.method3349(local37)) {
				Static58.method901();
			}
			if (local47.anInt4601 != Static205.anInt6320) {
				if (local47.aClass150_1.method3197()) {
					Static475.method6410(local47);
				}
				local47.method405(null);
				local44.method8653();
				local29 = true;
			}
		}
		if (local29) {
			Static645.anInt9916 = Static440.aClass118_41.method2602();
			Static440.aClass118_41.method2598(Static38.aClass2_Sub43Array1);
		}
		if (Static53.aClass2_Sub22_Sub2_1.anInt10247 != Static84.anInt1498) {
			throw new RuntimeException("gnp1 pos:" + Static53.aClass2_Sub22_Sub2_1.anInt10247 + " psize:" + Static84.anInt1498);
		}
		for (local37 = 0; local37 < Static639.anInt10306; local37++) {
			if (Static440.aClass118_41.method2595((long) Static147.anIntArray182[local37]) == null) {
				throw new RuntimeException("gnp2 pos:" + local37 + " size:" + Static639.anInt10306);
			}
		}
		if (Static645.anInt9916 - Static639.anInt10306 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static645.anInt9916 - Static639.anInt10306));
		}
		for (@Pc(174) int local174 = 0; local174 < Static645.anInt9916; local174++) {
			if (Static205.anInt6320 != Static38.aClass2_Sub43Array1[local174].aClass13_Sub1_Sub1_Sub1_Sub1_2.anInt4601) {
				throw new RuntimeException("gnp4 uk:" + Static38.aClass2_Sub43Array1[local174].aClass13_Sub1_Sub1_Sub1_Sub1_2.anInt4582);
			}
		}
	}
}
