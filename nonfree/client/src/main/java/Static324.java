import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	public static int anInt6540 = 0;

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_198 = new Class119(16);

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
	public static int anInt6551 = 0;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)I")
	public static int method5677() {
		if ((double) Static127.aFloat33 == 3.0D) {
			return 37;
		} else if ((double) Static127.aFloat33 == 4.0D) {
			return 50;
		} else if ((double) Static127.aFloat33 == 6.0D) {
			return 75;
		} else if ((double) Static127.aFloat33 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	public static void method5679() {
		Static209.aClass119_147.method3315(5);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZIII)I")
	public static int method5683(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub26 local15 = Static42.method991(false, arg2);
		if (local15 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local15.anIntArray270.length; local23++) {
			if (local15.anIntArray270[local23] >= 0 && Static183.anInt3615 > local15.anIntArray270[local23]) {
				@Pc(46) Class208 local46 = Static282.method5080(local15.anIntArray270[local23]);
				@Pc(57) int local57 = local46.method5865(arg1, Static2.method57(arg1).anInt6866);
				if (arg0) {
					local21 += local15.anIntArray269[local23] * local57;
				} else {
					local21 += local57;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
	public static void method5684() {
		Static209.aClass119_147.method3304();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!dn;B)I")
	public static int method5685(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(7) String local7 = Static269.method4875(arg0);
		@Pc(9) int[] local9 = null;
		if (Static56.method1308(arg0.anInt1317)) {
			local9 = Static282.method5080((int) arg0.aLong38).anIntArray506;
		} else if (Static69.method1569(arg0.anInt1317)) {
			@Pc(25) Class62_Sub1_Sub2_Sub1 local25 = Static37.aClass62_Sub1_Sub2_Sub1Array1[(int) arg0.aLong38];
			if (local25 != null) {
				local9 = local25.aClass186_1.anIntArray431;
			}
		} else if (Static104.method4926(arg0.anInt1317)) {
			if (arg0.anInt1317 == 1009) {
				local9 = Static234.method4051((int) arg0.aLong38).anIntArray258;
			} else {
				local9 = Static234.method4051((int) (arg0.aLong38 >>> 32 & 0x7FFFFFFFL)).anIntArray258;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static184.method3328(local9);
		}
		return Static289.aClass188_8.method5309(local7, Static36.aClass31Array1);
	}
}
