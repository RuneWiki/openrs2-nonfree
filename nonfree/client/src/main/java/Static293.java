import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_96 = new Class142(12, 0, 1, 0);

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_113 = new Class265(69, 6);

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray25 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_39 = new Class14();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	public static void method4208() {
		@Pc(5) Class171 local5 = Static226.aClass171_22;
		synchronized (Static226.aClass171_22) {
			Static226.aClass171_22.method3936();
		}
		local5 = Static224.aClass171_36;
		synchronized (Static224.aClass171_36) {
			Static224.aClass171_36.method3936();
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IFFF)I")
	public static int method4210(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!tt;IILclient!tt;)I")
	public static int method4211(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class219_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class219_Sub1 arg3) {
		@Pc(12) int local12;
		if (arg2 == 1) {
			@Pc(9) int local9 = arg1.anInt6535;
			local12 = arg3.anInt6535;
			if (!arg0) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static204.method2768(arg1.method5168().aString57, Static388.anInt6533, arg3.method5168().aString57);
		} else if (arg2 == 3) {
			if (arg1.aString58.equals("-")) {
				if (arg3.aString58.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString58.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static204.method2768(arg1.aString58, Static388.anInt6533, arg3.aString58);
			}
		} else if (arg2 == 4) {
			if (arg1.method5164()) {
				return arg3.method5164() ? 0 : 1;
			} else if (arg3.method5164()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method5161()) {
				return arg3.method5161() ? 0 : 1;
			} else if (arg3.method5161()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method5158()) {
				return arg3.method5158() ? 0 : 1;
			} else if (arg3.method5158()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method5162()) {
				return arg3.method5162() ? 0 : 1;
			} else if (arg3.method5162()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local12 = arg1.anInt6543;
			@Pc(207) int local207 = arg3.anInt6543;
			if (arg0) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local207 == 1000) {
					local207 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local207 == -1) {
					local207 = 1000;
				}
			}
			return local12 - local207;
		} else {
			return arg1.anInt6547 - arg3.anInt6547;
		}
	}
}
