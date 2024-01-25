import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!bga;")
	public static Class31 aClass31_11;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)I")
	public static int method7733(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!qaa;I)V")
	public static void method7735(@OriginalArg(0) Class1_Sub35_Sub2 arg0) {
		arg0.method5809();
		@Pc(15) int local15 = Static296.anInt5113;
		@Pc(25) Class8_Sub3_Sub3_Sub1_Sub1 local25 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local15] = new Class8_Sub3_Sub3_Sub1_Sub1();
		local25.anInt6821 = local15;
		@Pc(33) int local33 = arg0.method5806(30);
		@Pc(38) byte local38 = (byte) (local33 >> 28);
		@Pc(44) int local44 = local33 >> 14 & 0x3FFF;
		local25.anIntArray534[0] = local44 - Static541.anInt9058;
		@Pc(55) int local55 = local33 & 0x3FFF;
		local25.anInt9365 = (local25.anIntArray534[0] << 9) + (local25.method5434() << 8);
		local25.anIntArray533[0] = local55 - Static116.anInt2289;
		local25.anInt9370 = (local25.anIntArray533[0] << 9) + (local25.method5434() << 8);
		Static433.anInt7592 = local25.aByte123 = local25.aByte124 = local38;
		if (Static466.method6426(local25.anIntArray533[0], local25.anIntArray534[0])) {
			local25.aByte124++;
		}
		if (Static510.aClass1_Sub35Array1[local15] != null) {
			local25.method1443(Static510.aClass1_Sub35Array1[local15]);
		}
		Static220.anInt4237 = 0;
		Static572.anIntArray717[Static220.anInt4237++] = local15;
		Static505.aByteArray91[local15] = 0;
		Static43.anInt696 = 0;
		for (@Pc(145) int local145 = 1; local145 < 2048; local145++) {
			if (local15 != local145) {
				@Pc(155) int local155 = arg0.method5806(18);
				@Pc(159) int local159 = local155 >> 16;
				@Pc(165) int local165 = local155 >> 8 & 0xFF;
				@Pc(169) int local169 = local155 & 0xFF;
				@Pc(177) Class296 local177 = Static511.aClass296Array1[local145] = new Class296();
				local177.anInt7949 = 0;
				local177.anInt7950 = -1;
				local177.anInt7951 = local169 + (local159 << 28) + (local165 << 14);
				local177.aBoolean612 = false;
				Static89.anIntArray159[Static43.anInt696++] = local145;
				Static505.aByteArray91[local145] = 0;
			}
		}
		arg0.method5814();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7737(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static281.anInt4916; local16++) {
			if (arg0.equalsIgnoreCase(Static308.aStringArray24[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
