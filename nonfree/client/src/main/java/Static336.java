import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	public static int anInt5844;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public static int anInt5845;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public static int anInt5846;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "J")
	public static long aLong173 = -1L;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_313 = new Class123(99, 2);

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_80 = new Class267("K", "T", "K", "K");

	@OriginalMember(owner = "client!re", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[128][128];

	@OriginalMember(owner = "client!re", name = "p", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II[S)[S")
	public static short[] method4885(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static459.method6339(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method4886() {
		Static24.aClass44_2.method1351();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method4888(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static459.method6338(arg0, arg1, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBII)V")
	public static void method4889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static409.aClass101ArrayArrayArray3 == null) {
			return;
		}
		@Pc(24) long local24 = (long) (arg0 | arg2 << 28 | arg1 << 14);
		@Pc(30) Class6_Sub22 local30 = (Class6_Sub22) Static165.aClass74_15.method1883(local24);
		if (local30 == null) {
			Static196.method3069(arg2, arg0, arg1);
			return;
		}
		@Pc(44) Class6_Sub43 local44 = (Class6_Sub43) local30.aClass244_20.method5976();
		if (local44 == null) {
			Static196.method3069(arg2, arg0, arg1);
			return;
		}
		@Pc(58) Class3_Sub4_Sub1 local58 = (Class3_Sub4_Sub1) Static196.method3069(arg2, arg0, arg1);
		if (local58 == null) {
			local58 = new Class3_Sub4_Sub1();
		} else {
			local58.anInt2183 = local58.anInt2175 = -1;
		}
		local58.anInt2179 = local44.anInt7504;
		local58.anInt2182 = local44.anInt7502;
		label44: while (true) {
			@Pc(86) Class6_Sub43 local86 = (Class6_Sub43) local30.aClass244_20.method5964();
			if (local86 == null) {
				break;
			}
			if (local86.anInt7502 != local58.anInt2182) {
				local58.anInt2185 = local86.anInt7504;
				local58.anInt2183 = local86.anInt7502;
				while (true) {
					@Pc(107) Class6_Sub43 local107 = (Class6_Sub43) local30.aClass244_20.method5964();
					if (local107 == null) {
						break label44;
					}
					if (local107.anInt7502 != local58.anInt2182 && local107.anInt7502 != local58.anInt2183) {
						local58.anInt2180 = local107.anInt7504;
						local58.anInt2175 = local107.anInt7502;
					}
				}
			}
		}
		@Pc(151) int local151 = Static221.method3331(arg2, (arg1 << 7) + 64, (arg0 << 7) + 64);
		Static420.method6160(arg2, arg0, arg1, local151, local58);
	}
}
