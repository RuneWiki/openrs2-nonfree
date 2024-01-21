import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_202 = Static193.method3027("No reply from loginserver)3");

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "Lclient!oc;")
	public static Class70 aClass70_197 = aClass70_202;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_200 = Static193.method3027("purple:");

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_198 = aClass70_200;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_199 = aClass70_200;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	public static int anInt401 = 0;

	@OriginalMember(owner = "client!cb", name = "kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_201 = Static193.method3027(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ke;IBI)Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2 method344(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1) {
		return Static141.method2009(arg0, 0, arg1) ? Static185.method2902() : null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!b;)Lclient!b;")
	public static Class6 method345(@OriginalArg(1) Class6 arg0) {
		@Pc(11) int local11 = Static143.method2083(Static157.method2365(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			arg0 = Static146.method2127(arg0.anInt198);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)V")
	public static void method346(@OriginalArg(0) int arg0) {
		Static54.anInt1162 = -1;
		Static156.anInt3196 = arg0;
		Static136.anInt2777 = -1;
		Static149.method2172();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
	public static void method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt827; local12++) {
			@Pc(18) Class99 local18 = local7.aClass99Array1[local12];
			if ((local18.aLong144 >> 29 & 0x3L) == 2L && local18.anInt4226 == arg1 && local18.anInt4239 == arg2) {
				Static18.method311(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(B)Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 method349() {
		@Pc(9) Class3_Sub3_Sub2_Sub1 local9 = new Class3_Sub3_Sub2_Sub1();
		local9.anInt169 = Static88.anInt1712;
		local9.anInt168 = Static176.anIntArray295[0];
		local9.anInt165 = Static172.anIntArray284[0];
		local9.anInt167 = Static160.anIntArray245[0];
		local9.anInt166 = Static126.anInt2492;
		@Pc(34) byte[] local34 = Static204.aByteArrayArray9[0];
		local9.anInt164 = Static163.anIntArray250[0];
		@Pc(45) int local45 = local9.anInt165 * local9.anInt164;
		local9.anIntArray6 = new int[local45];
		for (@Pc(51) int local51 = 0; local51 < local45; local51++) {
			local9.anIntArray6[local51] = Static63.anIntArray75[local34[local51] & 0xFF];
		}
		Static161.method2418();
		return local9;
	}
}
