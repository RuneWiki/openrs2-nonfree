import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gda", name = "u", descriptor = "I")
	public static int anInt9918;

	@OriginalMember(owner = "client!gda", name = "A", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_34 = new Class27(11, 0, 1, 2);

	@OriginalMember(owner = "client!gda", name = "B", descriptor = "I")
	public static int anInt9924 = -1;

	@OriginalMember(owner = "client!gda", name = "E", descriptor = "[I")
	public static final int[] anIntArray681 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!gda", name = "F", descriptor = "[Lclient!iaa;")
	public static final Class3_Sub1_Sub2_Sub2_Sub1[] aClass3_Sub1_Sub2_Sub2_Sub1Array20 = new Class3_Sub1_Sub2_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBI)Z")
	public static boolean method8487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static615.method8045(arg0, arg1) || Static612.method8029(arg0, arg1);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(CB)B")
	public static byte method8496(@OriginalArg(0) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(III)Z")
	public static boolean method8497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)I")
	public static int method8506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static32.anIntArrayArray3 == null ? 0 : Static32.anIntArrayArray3[arg0][arg1] & 0xFFFFFF;
	}
}
