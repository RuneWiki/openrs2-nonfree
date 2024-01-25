import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!j", name = "y", descriptor = "Lclient!qj;")
	public static Class1_Sub33 aClass1_Sub33_3;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BILclient!qf;)Z")
	public static boolean method3094(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method4557(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (local8 == 0) {
			if (arg1.method4557(1) != 0) {
				method3094(arg0, arg1);
			}
			local28 = arg1.method4557(6);
			local33 = arg1.method4557(6);
			@Pc(45) boolean local45 = arg1.method4557(1) == 1;
			if (local45) {
				Static21.anIntArray24[Static204.anInt3633++] = arg0;
			}
			if (Static362.aClass47_Sub1_Sub5_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class144 local68 = Static212.aClass144Array1[arg0];
			@Pc(76) Class47_Sub1_Sub5_Sub2 local76 = Static362.aClass47_Sub1_Sub5_Sub2Array1[arg0] = new Class47_Sub1_Sub5_Sub2();
			local76.anInt5358 = arg0;
			if (Static31.aClass1_Sub14Array1[arg0] != null) {
				local76.method4342(Static31.aClass1_Sub14Array1[arg0]);
			}
			local76.method4320(local68.anInt3832);
			local76.anInt5378 = local68.anInt3830;
			local101 = local68.anInt3835;
			local105 = local101 >> 28;
			local111 = local101 >> 14 & 0xFF;
			@Pc(115) int local115 = local101 & 0xFF;
			local76.aBoolean438 = local68.aBoolean307;
			local76.aByteArray63[0] = Static282.aByteArray57[arg0];
			local76.aByte97 = (byte) local105;
			local76.method4336((local111 << 6) + local28 - Static190.anInt3507, (local115 << 6) + local33 + -Static331.anInt6034);
			local76.aBoolean436 = false;
			Static212.aClass144Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method4557(2);
			local33 = Static212.aClass144Array1[arg0].anInt3835;
			Static212.aClass144Array1[arg0].anInt3835 = (((local33 >> 28) + local28 & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(210) int local210;
			@Pc(215) int local215;
			@Pc(224) int local224;
			if (local8 != 2) {
				local28 = arg1.method4557(18);
				local33 = local28 >> 16;
				local210 = local28 >> 8 & 0xFF;
				local215 = local28 & 0xFF;
				local224 = Static212.aClass144Array1[arg0].anInt3835;
				local101 = local33 + (local224 >> 28) & 0x3;
				local105 = local210 + (local224 >> 14) & 0xFF;
				local111 = local224 + local215 & 0xFF;
				Static212.aClass144Array1[arg0].anInt3835 = local111 + (local101 << 28) + (local105 << 14);
				return false;
			}
			local28 = arg1.method4557(5);
			local33 = local28 >> 3;
			local210 = local28 & 0x7;
			local215 = Static212.aClass144Array1[arg0].anInt3835;
			local224 = (local215 >> 28) + local33 & 0x3;
			local101 = local215 >> 14 & 0xFF;
			local105 = local215 & 0xFF;
			if (local210 == 0) {
				local105--;
				local101--;
			}
			if (local210 == 1) {
				local105--;
			}
			if (local210 == 2) {
				local101++;
				local105--;
			}
			if (local210 == 3) {
				local101--;
			}
			if (local210 == 4) {
				local101++;
			}
			if (local210 == 5) {
				local105++;
				local101--;
			}
			if (local210 == 6) {
				local105++;
			}
			if (local210 == 7) {
				local105++;
				local101++;
			}
			Static212.aClass144Array1[arg0].anInt3835 = (local224 << 28) + ((local101 << 14) + local105);
			return false;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
	public static void method3095() {
		if (!Static31.method435()) {
			return;
		}
		if (Static71.aStringArray12 == null) {
			Static233.method3385();
		}
		Static404.aBoolean594 = true;
		Static114.anInt2194 = 0;
		try {
			Static218.aClipboard1 = Static451.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(25) Exception local25) {
		}
	}
}
