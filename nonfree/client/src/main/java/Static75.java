import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public static int anInt9088;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public static int anInt9090;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_99 = new Class70(83, 0);

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_16 = new Class101(8, 0, 4, 1);

	@OriginalMember(owner = "client!da", name = "p", descriptor = "S")
	public static short aShort125 = 1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public static void method7416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 < arg0) {
			Static433.method6039(arg1, arg0, Static171.anIntArrayArray79[arg2], arg3);
		} else {
			Static433.method6039(arg1, arg3, Static171.anIntArrayArray79[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z")
	public static boolean method7432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static549.method6482(arg1, arg0) || Static448.method6201(arg0, arg1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method7433() {
		for (@Pc(3) int local3 = 0; local3 < Static429.anInt7505; local3++) {
			@Pc(17) int local17 = Static283.anIntArray376[local3];
			@Pc(25) Class8_Sub3_Sub3_Sub1_Sub2 local25 = ((Class1_Sub42) Static84.aClass187_40.method3797((long) local17)).aClass8_Sub3_Sub3_Sub1_Sub2_2;
			@Pc(29) int local29 = Static585.aClass1_Sub35_Sub2_2.method5750();
			if ((local29 & 0x20) != 0) {
				local29 += Static585.aClass1_Sub35_Sub2_2.method5750() << 8;
			}
			@Pc(50) int local50;
			@Pc(75) int local75;
			if ((local29 & 0x4) != 0) {
				@Pc(48) int[] local48 = new int[4];
				for (local50 = 0; local50 < 4; local50++) {
					local48[local50] = Static585.aClass1_Sub35_Sub2_2.method5779();
					if (local48[local50] == 65535) {
						local48[local50] = -1;
					}
				}
				local75 = Static585.aClass1_Sub35_Sub2_2.method5775();
				Static496.method6893(local25, local48, local75);
			}
			if ((local29 & 0x8) != 0) {
				if (local25.aClass20_1.method277()) {
					Static428.method5939(local25);
				}
				local25.method5450(Static322.aClass326_2.method7234(Static585.aClass1_Sub35_Sub2_2.method5783()));
				local25.method5429(local25.aClass20_1.anInt350);
				local25.anInt6804 = local25.aClass20_1.anInt330 << 3;
				if (local25.aClass20_1.method277()) {
					Static229.method3478(local25.anIntArray534[0], local25, local25.aByte123, local25.anIntArray533[0], null, 0, null);
				}
			}
			@Pc(149) int local149;
			if ((local29 & 0x400) != 0) {
				local149 = Static585.aClass1_Sub35_Sub2_2.method5772();
				local25.anInt6827 = Static585.aClass1_Sub35_Sub2_2.method5775();
				local25.anInt6837 = Static585.aClass1_Sub35_Sub2_2.method5750();
				local25.anInt6776 = local149 & 0x7FFF;
				local25.aBoolean552 = (local149 & 0x8000) != 0;
				local25.anInt6811 = local25.anInt6827 + Static301.anInt5197 + local25.anInt6776;
			}
			if ((local29 & 0x10) != 0) {
				local149 = Static585.aClass1_Sub35_Sub2_2.method5772();
				local50 = Static585.aClass1_Sub35_Sub2_2.method5737();
				if (local149 == 65535) {
					local149 = -1;
				}
				local75 = Static585.aClass1_Sub35_Sub2_2.method5742();
				local25.method5427(false, local75, local50, local149);
			}
			if ((local29 & 0x1) != 0) {
				local25.anInt6868 = Static585.aClass1_Sub35_Sub2_2.method5772();
				local25.anInt6877 = Static585.aClass1_Sub35_Sub2_2.method5772();
			}
			if ((local29 & 0x100) != 0) {
				local149 = Static585.aClass1_Sub35_Sub2_2.method5779();
				local50 = Static585.aClass1_Sub35_Sub2_2.method5737();
				if (local149 == 65535) {
					local149 = -1;
				}
				local75 = Static585.aClass1_Sub35_Sub2_2.method5775();
				local25.method5427(true, local75, local50, local149);
			}
			if ((local29 & 0x80) != 0) {
				local149 = Static585.aClass1_Sub35_Sub2_2.method5739();
				local50 = Static585.aClass1_Sub35_Sub2_2.method5775();
				local25.method5436(local149, local50, Static301.anInt5197);
				local25.anInt6816 = Static301.anInt5197 + 300;
				local25.anInt6851 = Static585.aClass1_Sub35_Sub2_2.method5775();
			}
			if ((local29 & 0x40) != 0) {
				local25.aString68 = Static585.aClass1_Sub35_Sub2_2.method5760();
				local25.anInt6815 = 100;
			}
			if ((local29 & 0x800) != 0) {
				local149 = Static585.aClass1_Sub35_Sub2_2.method5739();
				local50 = Static585.aClass1_Sub35_Sub2_2.method5793();
				local25.method5436(local149, local50, Static301.anInt5197);
			}
			if ((local29 & 0x200) != 0) {
				local149 = Static585.aClass1_Sub35_Sub2_2.method5775();
				@Pc(341) int[] local341 = new int[local149];
				@Pc(344) int[] local344 = new int[local149];
				@Pc(347) int[] local347 = new int[local149];
				for (@Pc(349) int local349 = 0; local349 < local149; local349++) {
					@Pc(355) int local355 = Static585.aClass1_Sub35_Sub2_2.method5779();
					if (local355 == 65535) {
						local355 = -1;
					}
					local341[local349] = local355;
					local344[local349] = Static585.aClass1_Sub35_Sub2_2.method5750();
					local347[local349] = Static585.aClass1_Sub35_Sub2_2.method5783();
				}
				Static28.method320(local347, local25, local341, local344);
			}
			if ((local29 & 0x1000) != 0) {
				local25.anInt6847 = Static585.aClass1_Sub35_Sub2_2.method5743();
				local25.anInt6796 = Static585.aClass1_Sub35_Sub2_2.method5768();
				local25.anInt6793 = Static585.aClass1_Sub35_Sub2_2.method5768();
				local25.anInt6788 = Static585.aClass1_Sub35_Sub2_2.method5762();
				local25.anInt6779 = Static585.aClass1_Sub35_Sub2_2.method5772() + Static301.anInt5197;
				local25.anInt6810 = Static585.aClass1_Sub35_Sub2_2.method5772() + Static301.anInt5197;
				local25.anInt6789 = Static585.aClass1_Sub35_Sub2_2.method5793();
				local25.anInt6859 = 1;
				local25.anInt6847 += local25.anIntArray534[0];
				local25.anInt6793 += local25.anIntArray534[0];
				local25.anInt6796 += local25.anIntArray533[0];
				local25.anInt6788 += local25.anIntArray533[0];
				local25.anInt6858 = 0;
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt6781 = Static585.aClass1_Sub35_Sub2_2.method5783();
				if (local25.anInt6781 == 65535) {
					local25.anInt6781 = -1;
				}
			}
			if ((local29 & 0x2000) != 0) {
				local25.lb = Static585.aClass1_Sub35_Sub2_2.method5768();
				local25.aByte92 = Static585.aClass1_Sub35_Sub2_2.method5768();
				local25.aByte93 = Static585.aClass1_Sub35_Sub2_2.method5751();
				local25.aByte94 = (byte) Static585.aClass1_Sub35_Sub2_2.method5775();
				local25.anInt6831 = Static301.anInt5197 + Static585.aClass1_Sub35_Sub2_2.method5779();
				local25.anInt6795 = Static301.anInt5197 + Static585.aClass1_Sub35_Sub2_2.method5783();
			}
		}
	}
}
