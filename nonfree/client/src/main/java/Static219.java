import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_1 = new Class134(0, 3, Static438.aClass261_18);

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_2 = new Class134(1, 3, Static438.aClass261_18);

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_3 = new Class134(2, 4, Static438.aClass261_14);

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_4 = new Class134(3, 1, Static438.aClass261_18);

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_5 = new Class134(4, 2, Static438.aClass261_18);

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_6 = new Class134(5, 3, Static438.aClass261_18);

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!gm;")
	public static final Class134 aClass134_7 = new Class134(6, 4, Static438.aClass261_18);

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
	public static final int anInt4250 = Static700.method9156(16);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method3495() {
		Static337.aClass338_29.method8047();
		Static682.aClass338_62.method8047();
		Static594.aClass338_56.method8047();
		Static504.aClass338_42.method8047();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
	public static void method3496(@OriginalArg(0) byte arg0) {
		if (Static221.aByteArrayArrayArray15 == null) {
			Static221.aByteArrayArrayArray15 = new byte[4][Static362.anInt8653][Static206.anInt11291];
		}
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			for (@Pc(27) int local27 = 0; local27 < Static362.anInt8653; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static206.anInt11291; local31++) {
					Static221.aByteArrayArrayArray15[local16][local27][local31] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)Lclient!gm;")
	public static Class134 method3498(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass134_1;
		} else if (arg0 == 1) {
			return aClass134_2;
		} else if (arg0 == 2) {
			return aClass134_3;
		} else if (arg0 == 3) {
			return aClass134_4;
		} else if (arg0 == 4) {
			return aClass134_5;
		} else if (arg0 == 5) {
			return aClass134_6;
		} else if (arg0 == 6) {
			return aClass134_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIZII)V")
	public static void method3499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(4, (long) arg2);
		local9.method630();
		local9.anInt805 = arg1;
		local9.anInt804 = arg3;
		local9.anInt803 = arg0;
	}
}
