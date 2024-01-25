import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_1 = new Class225(15, 0, 1, 0);

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
	public static int anInt1180 = 0;

	@OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
	public static int anInt1183 = -1;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(CB)B")
	public static byte method1009(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!lh;)Lclient!wc;")
	public static Class57_Sub4 method1011(@OriginalArg(1) Class1_Sub1 arg0) {
		return new Class57_Sub4(arg0.method4100(), arg0.method4100(), arg0.method4100(), arg0.method4100(), arg0.method4142(), arg0.method4142(), arg0.method4130());
	}
}
