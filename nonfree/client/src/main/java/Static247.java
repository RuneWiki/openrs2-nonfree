import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "Lclient!rba;")
	public static Class3_Sub28 aClass3_Sub28_8;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_8 = new Class409(6, 1);

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[4];

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "[I")
	public static final int[] anIntArray248 = new int[6];

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_8 = new Class206(8, 8);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZBLclient!ha;IZ)Lclient!pk;")
	public static Class288 method3753(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == -1) {
			return null;
		}
		if (Static480.anIntArray459 != null) {
			for (@Pc(22) int local22 = 0; local22 < Static480.anIntArray459.length; local22++) {
				if (arg2 == Static480.anIntArray459[local22]) {
					return Static33.aClass288Array1[local22];
				}
			}
		}
		@Pc(63) Class288 local63 = (Class288) Static394.aClass338_38.method8049((long) ((arg0 ? 1 : 0) | arg2 << 1));
		if (local63 != null) {
			if (arg3 && local63.aClass330_10 == null) {
				@Pc(79) Class330 local79 = Static101.method1316(arg2, Static152.aClass221_39);
				if (local79 == null) {
					return null;
				}
				local63.aClass330_10 = local79;
			}
			return local63;
		}
		@Pc(93) Class194[] local93 = Static728.method4755(Static264.aClass221_72, arg2);
		if (local93 == null) {
			return null;
		}
		@Pc(103) Class330 local103 = Static101.method1316(arg2, Static152.aClass221_39);
		if (local103 == null) {
			return null;
		}
		if (arg3) {
			local63 = new Class288(arg1.method7641(local103, local93, arg0), local103);
		} else {
			local63 = new Class288(arg1.method7641(local103, local93, arg0));
		}
		Static394.aClass338_38.method8044((long) (arg2 << 1 | (arg0 ? 1 : 0)), local63);
		return local63;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public static void method3755() {
		Static720.aClass9_36 = null;
		Static432.aClass9Array28 = null;
		Static235.aClass9_9 = null;
		Static343.aClass9_18 = null;
		Static325.aClass9_17 = null;
		Static547.aClass9_29 = null;
		Static640.aClass9_33 = null;
		Static152.aClass9_6 = null;
		Static428.aClass9_21 = null;
	}
}
