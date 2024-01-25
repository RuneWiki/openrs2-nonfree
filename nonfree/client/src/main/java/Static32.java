import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "[Lclient!o;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
	public static int anInt616;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!nf;II)Z")
	public static boolean method478(@OriginalArg(0) Class2_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0.method3615(2);
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(108) int local108;
		@Pc(112) int local112;
		@Pc(118) int local118;
		if (local16 == 0) {
			if (arg0.method3615(1) != 0) {
				method478(arg0, arg1);
			}
			local36 = arg0.method3615(6);
			local41 = arg0.method3615(6);
			@Pc(51) boolean local51 = arg0.method3615(1) == 1;
			if (local51) {
				Static151.anIntArray209[Static250.anInt4042++] = arg1;
			}
			if (Static152.aClass3_Sub4_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(74) Class68 local74 = Static428.aClass68Array1[arg1];
			@Pc(82) Class3_Sub4_Sub1_Sub2 local82 = Static152.aClass3_Sub4_Sub1_Sub2Array1[arg1] = new Class3_Sub4_Sub1_Sub2();
			local82.anInt4915 = arg1;
			if (Static357.aClass2_Sub13Array3[arg1] != null) {
				local82.method4024(Static357.aClass2_Sub13Array3[arg1]);
			}
			local82.method3999(true, local74.anInt1864);
			local82.anInt4936 = local74.anInt1868;
			local108 = local74.anInt1866;
			local112 = local108 >> 28;
			local118 = local108 >> 14 & 0xFF;
			local82.aBoolean358 = local74.aBoolean131;
			@Pc(126) int local126 = local108 & 0xFF;
			local82.aByteArray64[0] = Static288.aByteArray59[arg1];
			local82.aByte91 = (byte) local112;
			local82.method4020((local126 << 6) + local41 - Static209.anInt3497, local36 + ((local118 << 6) - Static275.anInt4506));
			local82.aBoolean357 = false;
			Static428.aClass68Array1[arg1] = null;
			return true;
		} else if (local16 == 1) {
			local36 = arg0.method3615(2);
			local41 = Static428.aClass68Array1[arg1].anInt1866;
			Static428.aClass68Array1[arg1].anInt1866 = (local41 & 0xFFFFFFF) + (((local41 >> 28) + local36 & 0x3) << 28);
			return false;
		} else {
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(227) int local227;
			if (local16 != 2) {
				local36 = arg0.method3615(18);
				local41 = local36 >> 16;
				local214 = local36 >> 8 & 0xFF;
				local219 = local36 & 0xFF;
				local227 = Static428.aClass68Array1[arg1].anInt1866;
				local108 = (local227 >> 28) + local41 & 0x3;
				local112 = (local227 >> 14) + local214 & 0xFF;
				local118 = local219 + local227 & 0xFF;
				Static428.aClass68Array1[arg1].anInt1866 = (local112 << 14) + (local108 << 28) + local118;
				return false;
			}
			local36 = arg0.method3615(5);
			local41 = local36 >> 3;
			local214 = local36 & 0x7;
			local219 = Static428.aClass68Array1[arg1].anInt1866;
			local227 = local41 + (local219 >> 28) & 0x3;
			local108 = local219 >> 14 & 0xFF;
			local112 = local219 & 0xFF;
			if (local214 == 0) {
				local112--;
				local108--;
			}
			if (local214 == 1) {
				local112--;
			}
			if (local214 == 2) {
				local108++;
				local112--;
			}
			if (local214 == 3) {
				local108--;
			}
			if (local214 == 4) {
				local108++;
			}
			if (local214 == 5) {
				local108--;
				local112++;
			}
			if (local214 == 6) {
				local112++;
			}
			if (local214 == 7) {
				local108++;
				local112++;
			}
			Static428.aClass68Array1[arg1].anInt1866 = local112 + (local108 << 14) + (local227 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)V")
	public static void method480(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(2, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I")
	public static int method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(32) int local32 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local32;
		}
		return arg1;
	}
}
