import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
	public static boolean aBoolean756;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_9 = new Class392(9, 2);

	@OriginalMember(owner = "client!vp", name = "y", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_210 = new Class156(36, 7);

	@OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
	public static int anInt10557 = 0;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "[Lclient!jv;")
	public static Class194[] aClass194Array1 = null;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!hu;IZLclient!hu;B)I")
	public static int method8908(@OriginalArg(0) Class51_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class51_Sub1 arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg1 == 1) {
			local9 = arg0.anInt3943;
			local12 = arg3.anInt3943;
			if (!arg2) {
				if (local12 == -1) {
					local12 = 2001;
				}
				if (local9 == -1) {
					local9 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg1 == 2) {
			return Static311.method4809(Static375.anInt7800, arg3.method3616().aString10, arg0.method3616().aString10);
		} else if (arg1 == 3) {
			if (arg0.aString36.equals("-")) {
				if (arg3.aString36.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString36.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static311.method4809(Static375.anInt7800, arg3.aString36, arg0.aString36);
			}
		} else if (arg1 == 4) {
			if (arg0.method3612()) {
				return arg3.method3612() ? 0 : 1;
			} else if (arg3.method3612()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method3614()) {
				return arg3.method3614() ? 0 : 1;
			} else if (arg3.method3614()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method3613()) {
				return arg3.method3613() ? 0 : 1;
			} else if (arg3.method3613()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method3615()) {
				return arg3.method3615() ? 0 : 1;
			} else if (arg3.method3615()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local9 = arg0.anInt3951;
			local12 = arg3.anInt3951;
			if (arg2) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg0.anInt3950 - arg3.anInt3950;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!ka;IIII)Lclient!rga;")
	public static Class315 method8909(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg0 == null ? null : new Class315(arg1, arg3, arg2, arg0.na(), arg0.V(), arg0.RA(), arg0.fa(), arg0.EA(), arg0.HA(), arg0.G());
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI[BI)[B")
	public static byte[] method8911(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9;
		if (arg2 <= 0) {
			local9 = arg1;
		} else {
			local9 = new byte[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				local9[local16] = arg1[arg2 + local16];
			}
		}
		@Pc(40) Class72 local40 = new Class72();
		local40.method1376();
		local40.method1374(local9, (long) (arg0 * 8));
		@Pc(54) byte[] local54 = new byte[64];
		local40.method1375(local54);
		return local54;
	}
}
