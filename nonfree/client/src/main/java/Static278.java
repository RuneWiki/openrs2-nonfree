import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public static int anInt6866;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "[I")
	public static int[] anIntArray493;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_228 = new Class92(74, -1);

	@OriginalMember(owner = "client!o", name = "C", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_252 = new Class184(95, 8);

	@OriginalMember(owner = "client!o", name = "D", descriptor = "I")
	public static int anInt6872 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(CI)B")
	public static byte method5344(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!v;Lclient!qa;Lclient!tn;IIILclient!cc;I)V")
	public static void method5345(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub8 arg6) {
		@Pc(21) int local21 = arg6.anInt1151 - arg4 / 2 - 5;
		@Pc(25) int local25 = arg3 + 2;
		if (arg2.anInt6711 != 0) {
			arg1.method2600(arg5 * arg0.method5574() + arg3 + 1 - local25, local21, arg4 + 10, local25, arg2.anInt6711);
		}
		if (arg2.anInt6736 != 0) {
			arg1.method2625(arg2.anInt6736, local25, arg5 * arg0.method5574() + arg3 + 1 - local25, arg4 + 10, local21);
		}
		@Pc(78) int local78 = arg2.anInt6715;
		if (arg6.aBoolean94 && arg2.anInt6707 != -1) {
			local78 = arg2.anInt6707;
		}
		for (@Pc(91) int local91 = 0; local91 < arg5; local91++) {
			@Pc(96) String local96 = Static328.aStringArray143[local91];
			if (local91 < arg5 - 1) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg0.method5569(arg1, local96, arg6.anInt1151, arg3, local78);
			arg3 += arg0.method5574();
		}
	}
}
