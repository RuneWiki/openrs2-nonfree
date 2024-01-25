import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_120 = new Class41(13, 8);

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[I")
	public static final int[] anIntArray484 = new int[25];

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method3596(@OriginalArg(0) Class82 arg0) {
		arg0.method4477(0, 0, Static335.anInt5875, 350);
		arg0.method4482(0, 0, Static335.anInt5875, 350, Static40.anInt6590 << 24 | 0x332277, 1);
		@Pc(31) int local31;
		@Pc(35) int local35;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			local31 = Static388.anIntArray496[local25];
			local35 = Static166.anIntArray331[local25];
			arg0.method4482(local31, local35, 2, 2, Static165.anIntArray330[local25] << 24 | 0xFFFFFF, 1);
		}
		local31 = 350 / Static108.anInt2141;
		if (Static214.anInt3953 > 0) {
			local35 = 346 - Static108.anInt2141 - 4;
			@Pc(78) int local78 = local35 * local31 / (local31 + Static214.anInt3953 - 1);
			@Pc(80) int local80 = 4;
			if (Static214.anInt3953 > 1) {
				local80 = (Static214.anInt3953 - Static154.anInt2771 - 1) * (-local78 + local35) / (Static214.anInt3953 - 1) + 4;
			}
			arg0.method4482(Static335.anInt5875 - 16, local80, 12, local78, Static40.anInt6590 << 24 | 0x332277, 2);
			for (@Pc(117) int local117 = Static154.anInt2771; local117 < local31 + Static154.anInt2771 && local117 < Static214.anInt3953; local117++) {
				@Pc(126) String[] local126 = Static29.method705(Static98.aStringArray12[local117], '\b');
				@Pc(135) int local135 = (Static335.anInt5875 - 8 - 16) / local126.length;
				for (@Pc(137) int local137 = 0; local137 < local126.length; local137++) {
					@Pc(146) int local146 = local135 * local137 + 8;
					arg0.method4477(local146, 0, local135 + local146 - 8, 350);
					Static246.aClass13_4.method5602(350 - (local117 - Static154.anInt2771) * Static108.anInt2141 - Static282.anInt4981 - Static62.aClass216_4.anInt5794 - 2, local126[local137], -1, -16777216, local146);
				}
			}
		}
		arg0.method4477(0, 0, Static335.anInt5875, 350);
		arg0.method4476(Static335.anInt5875, 0, -1, 350 - Static282.anInt4981);
		Static34.aClass13_1.method5602(350 - Static60.aClass216_3.anInt5794 - 1, "--> " + Static251.aString44, -1, -16777216, 10);
		local35 = -1;
		if (Static295.anInt5281 % 30 > 15) {
			local35 = 16777215;
		}
		arg0.method4509(local35, Static60.aClass216_3.method5073("--> " + Static251.aString44.substring(0, Static194.anInt3430)) + 10, 12, 350 - Static60.aClass216_3.anInt5794 - 11);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JZ)V")
	public static void method3597(@OriginalArg(0) long arg0) {
		if (Static297.aClass227ArrayArrayArray7 != null) {
			if (Static283.anInt5017 == 1 || Static283.anInt5017 == 5) {
				Static99.method1787(arg0);
			} else if (Static283.anInt5017 == 4) {
				Static19.method551(arg0);
			}
		}
		Static143.method2454(Static304.aClass82_4, (long) Static295.anInt5281);
		if (Static226.anInt4223 != -1) {
			Static216.method3641(Static226.anInt4223);
		}
		for (@Pc(39) int local39 = 0; local39 < Static318.anInt4651; local39++) {
			if (Static370.aBooleanArray143[local39]) {
				Static185.aBooleanArray73[local39] = true;
			}
			Static5.aBooleanArray148[local39] = Static370.aBooleanArray143[local39];
			Static370.aBooleanArray143[local39] = false;
		}
		Static213.anInt3923 = Static295.anInt5281;
		if (Static304.aClass82_4.method4543()) {
			Static257.aBoolean490 = true;
		}
		if (Static226.anInt4223 != -1) {
			Static318.anInt4651 = 0;
			Static236.method3858();
		}
		Static304.aClass82_4.method4512();
		Static388.method3688(Static304.aClass82_4);
		@Pc(90) int local90 = Static200.method3347();
		if (local90 == -1) {
			local90 = Static29.anInt669;
		}
		Static344.method5463(local90);
		Static155.method2591(Static346.anInt6113, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328);
		Static346.anInt6113 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public static void method3599(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub1_Sub2 local14 = Static323.method4982(arg0, 12);
		local14.method412();
	}
}
