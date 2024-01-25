import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dm", name = "C", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_44 = new Class136(116, -1);

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_45 = new Class136(21, -1);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)I")
	public static int method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1523(@OriginalArg(0) String arg0) {
		if (!Static202.aBoolean295 || (Static42.anInt714 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static227.anInt3948;
		@Pc(18) int[] local18 = Static467.anIntArray632;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class14_Sub1_Sub1_Sub3_Sub1 local28 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local18[local20]];
			if (local28.aString42 != null && local28.aString42.equalsIgnoreCase(arg0) && (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == local28 && (Static42.anInt714 & 0x10) != 0 || local28 != null && (Static42.anInt714 & 0x8) != 0)) {
				@Pc(61) Class5_Sub40 local61 = Static25.method507(Static98.aClass208_2, Static59.aClass181_15);
				local61.aClass5_Sub12_Sub2_2.method8596(local18[local20]);
				local61.aClass5_Sub12_Sub2_2.method8596(Static343.anInt5922);
				local61.aClass5_Sub12_Sub2_2.method8605(Static288.anInt4696);
				local61.aClass5_Sub12_Sub2_2.method8647(0);
				local61.aClass5_Sub12_Sub2_2.method8622(Static402.anInt9331);
				Static612.method8496(local61);
				local14 = true;
				Static588.method8257(0, local28.anIntArray252[0], 0, local28.method2509(), -2, local28.method2509(), true, local28.anIntArray253[0]);
				break;
			}
		}
		if (!local14) {
			Static88.method1388(Static76.aClass58_22.method1237(Static321.anInt5554) + arg0);
		}
		if (Static202.aBoolean295) {
			Static2.method24();
		}
	}
}
