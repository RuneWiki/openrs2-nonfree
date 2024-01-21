import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Lclient!ja;")
	public static Class33 aClass33_16 = new Class33(100);

	@OriginalMember(owner = "client!ge", name = "Wb", descriptor = "Lclient!ja;")
	public static Class33 aClass33_17 = new Class33(30);

	@OriginalMember(owner = "client!ge", name = "Yb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_285 = Static60.method1113("Walk here");

	@OriginalMember(owner = "client!ge", name = "Xb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_284 = aClass22_285;

	@OriginalMember(owner = "client!ge", name = "Zb", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ea;Lclient!ea;Lclient!c;BLclient!ea;)Z")
	public static boolean method745(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class4_Sub4_Sub1 arg2, @OriginalArg(4) Class20 arg3) {
		Static69.aClass4_Sub4_Sub1_2 = arg2;
		Static87.aClass20_44 = arg0;
		Static79.aClass20_40 = arg3;
		Static80.aClass20_41 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(B)V")
	public static void method749() {
		aClass22_284 = null;
		aClass33_16 = null;
		aClass33_17 = null;
		aClass22_285 = null;
	}

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "(I)V")
	public static void method753() {
		Static38.aClass33_14.method1003();
		Static96.aClass33_28.method1003();
		Static29.aClass33_10.method1003();
		Static115.aClass33_31.method1003();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ea;IB)Z")
	public static boolean method754(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method609(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static46.method890(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII[Lclient!qf;B[BII)V")
	public static void method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class60[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if (local12 + arg2 > 0 && arg2 + local12 < 103 && arg1 + local16 > 0 && local16 + arg1 < 103) {
					arg5[arg8].anIntArrayArray27[arg2 + local12][local16 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(90) Class4_Sub11 local90 = new Class4_Sub11(arg6);
		for (@Pc(92) int local92 = 0; local92 < 4; local92++) {
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
					if (local92 == arg4 && arg0 <= local96 && local96 < arg0 + 8 && arg3 <= local100 && arg3 + 8 > local100) {
						Static112.method1798(local90, arg8, 0, arg7, Static29.method490(arg7, local100 & 0x7, local96 & 0x7) + arg1, Static34.method556(arg7, local96 & 0x7, local100 & 0x7) + arg2, 0);
					} else {
						Static112.method1798(local90, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}
}
