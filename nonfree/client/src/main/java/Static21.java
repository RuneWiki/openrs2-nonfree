import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!ci;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_2 = new Class21("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_20 = new Class214(17, 0);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIZZ)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static124.aFrame2 != null && (arg1 != 3 || arg2 != Static157.aClass185_Sub1_1.anInt5574 || arg3 != Static157.aClass185_Sub1_1.anInt5575)) {
			Static302.method4668(Static124.aFrame2, Static390.aClass255_5);
			Static124.aFrame2 = null;
		}
		if (arg1 == 3 && Static124.aFrame2 == null) {
			Static124.aFrame2 = Static320.method4788(arg2, 0, arg3, Static390.aClass255_5);
			if (Static124.aFrame2 != null) {
				Static157.aClass185_Sub1_1.anInt5575 = arg3;
				Static157.aClass185_Sub1_1.anInt5574 = arg2;
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
			}
		}
		if (arg1 == 3 && Static124.aFrame2 == null) {
			method354(arg0, Static157.aClass185_Sub1_1.anInt5573, -1, -1, true);
			return;
		}
		@Pc(77) Container local77;
		@Pc(97) Insets local97;
		if (Static124.aFrame2 != null) {
			Static448.anInt7687 = arg2;
			Static4.anInt50 = arg3;
			local77 = Static124.aFrame2;
		} else if (Static97.aFrame1 == null) {
			local77 = Static390.aClass255_5.anApplet1;
			Static448.anInt7687 = local77.getSize().width;
			Static4.anInt50 = local77.getSize().height;
		} else {
			local97 = Static97.aFrame1.getInsets();
			@Pc(105) int local105 = local97.right + local97.left;
			Static448.anInt7687 = Static97.aFrame1.getSize().width - local105;
			@Pc(113) int local113 = -local97.top;
			Static4.anInt50 = Static97.aFrame1.getSize().height + local113 - local97.bottom;
			local77 = Static97.aFrame1;
		}
		@Pc(158) int local158;
		if (arg1 == 1) {
			Static30.anInt518 = Static449.anInt7705;
			Static464.anInt7952 = 0;
			Static331.anInt5897 = (Static448.anInt7687 - Static146.anInt3029) / 2;
			Static374.anInt6595 = Static146.anInt3029;
		} else if (Static263.anInt5007 < 96 && Static192.anInt3828 == 0) {
			local158 = Static448.anInt7687 > 1024 ? 1024 : Static448.anInt7687;
			Static331.anInt5897 = (Static448.anInt7687 - local158) / 2;
			Static374.anInt6595 = local158;
			@Pc(176) int local176 = Static4.anInt50 > 768 ? 768 : Static4.anInt50;
			Static30.anInt518 = local176;
			Static464.anInt7952 = 0;
		} else {
			Static374.anInt6595 = Static448.anInt7687;
			Static464.anInt7952 = 0;
			Static30.anInt518 = Static4.anInt50;
			Static331.anInt5897 = 0;
		}
		if (Static297.aClass219_2 != Static42.aClass219_1) {
			@Pc(205) boolean local205;
			if (Static374.anInt6595 < 1024 && Static30.anInt518 < 768) {
				local205 = true;
			} else {
				local205 = false;
			}
		}
		if (arg4) {
			Static412.method5722();
		} else {
			Static409.aCanvas7.setSize(Static374.anInt6595, Static30.anInt518);
			Static30.aClass30_3.method2032(Static409.aCanvas7);
			if (local77 == Static97.aFrame1) {
				local97 = Static97.aFrame1.getInsets();
				Static409.aCanvas7.setLocation(Static331.anInt5897 + local97.left, local97.top - -Static464.anInt7952);
			} else {
				Static409.aCanvas7.setLocation(Static331.anInt5897, Static464.anInt7952);
			}
		}
		if (arg1 < 2) {
			Static292.aBoolean386 = false;
		} else {
			Static292.aBoolean386 = true;
		}
		if (Static248.anInt4793 != -1) {
			Static393.method5536(true);
		}
		if (Static172.aClass13_1 != null && Static200.method3531(Static70.anInt1726)) {
			Static83.method5665();
		}
		for (local158 = 0; local158 < 100; local158++) {
			Static353.aBooleanArray124[local158] = true;
		}
		Static384.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)I")
	public static int method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static389.aClass14Array3 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local11 < 0 || local20 < 0 || Static193.anInt3853 - 1 < local11 || Static301.anInt5585 - 1 < local20) {
			return 0;
		}
		@Pc(45) int local45 = arg2;
		if (arg2 < 3 && (Static398.aByteArrayArrayArray17[1][local11][local20] & 0x2) != 0) {
			local45 = arg2 + 1;
		}
		return Static389.aClass14Array3[local45].R(arg0, arg1);
	}
}
