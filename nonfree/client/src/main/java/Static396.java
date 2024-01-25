import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Z")
	public static boolean aBoolean385;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "Lclient!dt;")
	public static Class2_Sub10_Sub2 aClass2_Sub10_Sub2_3;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_83 = new Class286(2, -1);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BC)B")
	public static byte method4002(@OriginalArg(1) char arg0) {
		@Pc(31) byte local31;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local31 = (byte) arg0;
		} else if (arg0 == '€') {
			local31 = -128;
		} else if (arg0 == '‚') {
			local31 = -126;
		} else if (arg0 == 'ƒ') {
			local31 = -125;
		} else if (arg0 == '„') {
			local31 = -124;
		} else if (arg0 == '…') {
			local31 = -123;
		} else if (arg0 == '†') {
			local31 = -122;
		} else if (arg0 == '‡') {
			local31 = -121;
		} else if (arg0 == 'ˆ') {
			local31 = -120;
		} else if (arg0 == '‰') {
			local31 = -119;
		} else if (arg0 == 'Š') {
			local31 = -118;
		} else if (arg0 == '‹') {
			local31 = -117;
		} else if (arg0 == 'Œ') {
			local31 = -116;
		} else if (arg0 == 'Ž') {
			local31 = -114;
		} else if (arg0 == '‘') {
			local31 = -111;
		} else if (arg0 == '’') {
			local31 = -110;
		} else if (arg0 == '“') {
			local31 = -109;
		} else if (arg0 == '”') {
			local31 = -108;
		} else if (arg0 == '•') {
			local31 = -107;
		} else if (arg0 == '–') {
			local31 = -106;
		} else if (arg0 == '—') {
			local31 = -105;
		} else if (arg0 == '˜') {
			local31 = -104;
		} else if (arg0 == '™') {
			local31 = -103;
		} else if (arg0 == 'š') {
			local31 = -102;
		} else if (arg0 == '›') {
			local31 = -101;
		} else if (arg0 == 'œ') {
			local31 = -100;
		} else if (arg0 == 'ž') {
			local31 = -98;
		} else if (arg0 == 'Ÿ') {
			local31 = -97;
		} else {
			local31 = 63;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IB)V")
	public static void method4005(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static270.aFloat48 = 3.0F;
		} else if (arg0 == 50) {
			Static270.aFloat48 = 4.0F;
		} else if (arg0 == 75) {
			Static270.aFloat48 = 6.0F;
		} else if (arg0 == 100) {
			Static270.aFloat48 = 8.0F;
		} else if (arg0 == 200) {
			Static270.aFloat48 = 16.0F;
		}
		Static415.anInt7185 = -1;
		Static415.anInt7185 = -1;
	}
}
