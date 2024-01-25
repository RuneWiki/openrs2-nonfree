import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_194 = new Class198(64);

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
	public static final int[] anIntArray440 = new int[32];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	public static void method4620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static273.aClass128ArrayArrayArray4[0][arg1][arg2] != null && Static273.aClass128ArrayArrayArray4[0][arg1][arg2].aClass128_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static273.aClass128ArrayArrayArray4[local22][arg1][arg2] == null) {
				@Pc(46) Class128 local46 = Static273.aClass128ArrayArrayArray4[local22][arg1][arg2] = new Class128(local22, arg1, arg2);
				if (local20) {
					local46.aByte49++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!vq;Lclient!tj;I)V")
	public static void method4622(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class193 arg1) {
		@Pc(10) Class110[] local10 = Static362.method3088(arg1, Static170.anInt3632);
		Static354.aClass58Array137 = new Class58[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static354.aClass58Array137[local16] = arg0.method2677(local10[local16]);
		}
		local10 = Static362.method3088(arg1, Static40.anInt1100);
		Static186.aClass58Array74 = new Class58[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static186.aClass58Array74[local47] = arg0.method2677(local10[local47]);
		}
		local10 = Static362.method3088(arg1, Static166.anInt3582);
		Static106.aClass58Array43 = new Class58[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static106.aClass58Array43[local74] = arg0.method2677(local10[local74]);
		}
		local10 = Static362.method3088(arg1, Static204.anInt4277);
		Static233.aClass58Array92 = new Class58[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static233.aClass58Array92[local105] = arg0.method2677(local10[local105]);
		}
		local10 = Static362.method3088(arg1, Static119.anInt2859);
		Static138.aClass58Array54 = new Class58[local10.length];
		for (@Pc(132) int local132 = 0; local132 < local10.length; local132++) {
			Static138.aClass58Array54[local132] = arg0.method2677(local10[local132]);
		}
		local10 = Static362.method3088(arg1, Static47.anInt1277);
		Static348.aClass58Array134 = new Class58[local10.length];
		for (@Pc(163) int local163 = 0; local163 < local10.length; local163++) {
			Static348.aClass58Array134[local163] = arg0.method2677(local10[local163]);
		}
		local10 = Static362.method3088(arg1, Static11.anInt246);
		Static316.aClass58Array124 = new Class58[local10.length];
		for (@Pc(194) int local194 = 0; local194 < local10.length; local194++) {
			Static316.aClass58Array124[local194] = arg0.method2677(local10[local194]);
		}
		local10 = Static362.method3088(arg1, Static184.anInt3881);
		Static312.aClass58Array122 = new Class58[local10.length];
		for (@Pc(225) int local225 = 0; local225 < local10.length; local225++) {
			Static312.aClass58Array122[local225] = arg0.method2677(local10[local225]);
		}
		local10 = Static362.method3088(arg1, Static203.anInt4233);
		Static55.aClass58Array28 = new Class58[local10.length];
		for (@Pc(256) int local256 = 0; local256 < local10.length; local256++) {
			Static55.aClass58Array28[local256] = arg0.method2677(local10[local256]);
		}
		local10 = Static362.method3088(arg1, Static306.anInt5904);
		Static36.aClass58Array21 = new Class58[local10.length];
		for (@Pc(287) int local287 = 0; local287 < local10.length; local287++) {
			Static36.aClass58Array21[local287] = arg0.method2677(local10[local287]);
		}
		local10 = Static362.method3088(arg1, Static254.anInt2747);
		Static108.aClass58Array44 = new Class58[local10.length];
		for (@Pc(318) int local318 = 0; local318 < local10.length; local318++) {
			Static108.aClass58Array44[local318] = arg0.method2677(local10[local318]);
		}
		local10 = Static362.method3088(arg1, Static48.anInt1290);
		Static237.aClass58Array136 = new Class58[local10.length];
		for (@Pc(345) int local345 = 0; local345 < local10.length; local345++) {
			Static237.aClass58Array136[local345] = arg0.method2677(local10[local345]);
		}
		local10 = Static362.method3088(arg1, Static194.anInt4052);
		Static101.aClass58Array140 = new Class58[local10.length];
		for (@Pc(372) int local372 = 0; local372 < local10.length; local372++) {
			Static101.aClass58Array140[local372] = arg0.method2677(local10[local372]);
		}
		Static345.aClass58_47 = arg0.method2677(Static362.method3098(arg1, Static239.anInt4795, 0));
	}
}
