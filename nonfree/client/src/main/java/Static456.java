import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!pl;")
	public static Class259 aClass259_141;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt7889;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ks;II)Z")
	public static boolean method6472(@OriginalArg(0) Class2_Sub15_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method4355(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method4355(1) != 0) {
				method6472(arg0, arg1);
			}
			local28 = arg0.method4355(6);
			local33 = arg0.method4355(6);
			@Pc(45) boolean local45 = arg0.method4355(1) == 1;
			if (local45) {
				Static137.anIntArray168[Static572.anInt9306++] = arg1;
			}
			if (Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class274 local68 = Static119.aClass274Array1[arg1];
			@Pc(76) Class6_Sub1_Sub1_Sub1_Sub2 local76 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class6_Sub1_Sub1_Sub1_Sub2();
			local76.lb = arg1;
			if (Static566.aClass2_Sub15Array1[arg1] != null) {
				local76.method6180(Static566.aClass2_Sub15Array1[arg1]);
			}
			local76.method6169(local68.anInt7766, true);
			local76.anInt7339 = local68.anInt7767;
			local102 = local68.anInt7769;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(125) int local125 = (local112 << 6) + local28 - Static35.anInt906;
			@Pc(135) int local135 = (local116 << 6) + local33 - Static130.anInt5246;
			local76.aBoolean575 = local68.aBoolean614;
			local76.aByteArray73[0] = Static195.aByteArray43[arg1];
			local76.aByte112 = local76.aByte111 = (byte) local106;
			if (Static551.method7475(local135, local125)) {
				local76.aByte111++;
			}
			local76.method6182(local125, local135);
			local76.aBoolean574 = false;
			Static119.aClass274Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method4355(2);
			local33 = Static119.aClass274Array1[arg1].anInt7769;
			Static119.aClass274Array1[arg1].anInt7769 = (local33 & 0xFFFFFFF) + (((local33 >> 28) + local28 & 0x3) << 28);
			return false;
		} else {
			@Pc(229) int local229;
			@Pc(234) int local234;
			@Pc(242) int local242;
			if (local8 != 2) {
				local28 = arg0.method4355(18);
				local33 = local28 >> 16;
				local229 = local28 >> 8 & 0xFF;
				local234 = local28 & 0xFF;
				local242 = Static119.aClass274Array1[arg1].anInt7769;
				local102 = (local242 >> 28) + local33 & 0x3;
				local106 = (local242 >> 14) + local229 & 0xFF;
				local112 = local242 + local234 & 0xFF;
				Static119.aClass274Array1[arg1].anInt7769 = local112 + (local106 << 14) + (local102 << 28);
				return false;
			}
			local28 = arg0.method4355(5);
			local33 = local28 >> 3;
			local229 = local28 & 0x7;
			local234 = Static119.aClass274Array1[arg1].anInt7769;
			local242 = local33 + (local234 >> 28) & 0x3;
			local102 = local234 >> 14 & 0xFF;
			local106 = local234 & 0xFF;
			if (local229 == 0) {
				local106--;
				local102--;
			}
			if (local229 == 1) {
				local106--;
			}
			if (local229 == 2) {
				local102++;
				local106--;
			}
			if (local229 == 3) {
				local102--;
			}
			if (local229 == 4) {
				local102++;
			}
			if (local229 == 5) {
				local102--;
				local106++;
			}
			if (local229 == 6) {
				local106++;
			}
			if (local229 == 7) {
				local106++;
				local102++;
			}
			Static119.aClass274Array1[arg1].anInt7769 = local106 + (local242 << 28) + (local102 << 14);
			return false;
		}
	}
}
