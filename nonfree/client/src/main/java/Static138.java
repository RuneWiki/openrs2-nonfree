import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!pf", name = "Kb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1155 = Static120.method1824(":clanreq:");

	@OriginalMember(owner = "client!pf", name = "Ob", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!pf", name = "Pb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1156 = Static120.method1824("k");

	@OriginalMember(owner = "client!pf", name = "Sb", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1157 = Static120.method1824("huffman");

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(Z)Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 method2143() {
		@Pc(15) Class3_Sub1_Sub4_Sub4 local15 = new Class3_Sub1_Sub4_Sub4();
		local15.anInt3598 = Static175.anInt3951;
		local15.anInt3603 = Static147.anInt3287;
		local15.anInt3599 = Static27.anIntArray523[0];
		local15.anInt3601 = Static49.anIntArray152[0];
		local15.anInt3600 = Static17.anIntArray64[0];
		local15.anInt3602 = Static86.anIntArray220[0];
		@Pc(47) int local47 = local15.anInt3602 * local15.anInt3599;
		local15.anIntArray449 = new int[local47];
		@Pc(55) byte[] local55 = Static167.aByteArrayArray10[0];
		for (@Pc(57) int local57 = 0; local57 < local47; local57++) {
			local15.anIntArray449[local57] = Static101.anIntArray288[local55[local57] & 0xFF];
		}
		Static164.method2645();
		return local15;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(IZ)Lclient!rd;")
	public static Class80 method2149(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static154.method2467(new Class80[] { Static153.aClass80_211, Static83.method1219(arg0), Static27.aClass80_1733 });
		} else if (arg0 < 10000000) {
			return Static154.method2467(new Class80[] { Static31.aClass80_233, Static83.method1219(arg0 / 1000), Static150.aClass80_1320, Static27.aClass80_1733 });
		} else {
			return Static154.method2467(new Class80[] { Static81.aClass80_676, Static83.method1219(arg0 / 1000000), Static163.aClass80_1408, Static27.aClass80_1733 });
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Lclient!ad;")
	public static Class4 method2153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2014; local13++) {
			@Pc(19) Class4 local19 = local7.aClass4Array3[local13];
			if ((local19.aLong4 >> 29 & 0x3L) == 2L && local19.anInt185 == arg1 && local19.anInt188 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
