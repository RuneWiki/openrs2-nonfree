import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wia", name = "z", descriptor = "[B")
	public static final byte[] aByteArray105 = new byte[2048];

	@OriginalMember(owner = "client!wia", name = "C", descriptor = "I")
	public static int anInt10633 = 0;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IBI)V")
	public static void method9021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class6_Sub4_Sub18 local18 = Static565.method7924((long) arg0 << 32 | (long) arg1, 18);
		local18.method7979();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ns;I)V")
	public static void method9025(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
			@Pc(13) Class2_Sub1_Sub1_Sub3_Sub2 local13 = (Class2_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local13.aClass91_1 != null) {
				Static438.method2190(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 != local13.aByte140, local13);
				return;
			}
		} else if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub1) {
			@Pc(38) Class2_Sub1_Sub1_Sub3_Sub1 local38 = (Class2_Sub1_Sub1_Sub3_Sub1) arg0;
			Static78.method1361(local38.aByte140 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140, local38);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V")
	public static void method9027() {
		Static243.anInt4304 = 200;
		Static182.anInt3138 = (int) ((double) Static491.anInt9856 * 34.46D);
		Static182.anInt3138 <<= 0x2;
		if (Static546.aClass132_13.method7495()) {
			Static182.anInt3138 += 512;
		}
		Static340.method5000(false);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)I")
	public static int method9028(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static353.anInt6019;
		if (local5 == 0) {
			return arg0 ? 0 : Static475.anInt8169;
		} else if (local5 == 1) {
			return Static475.anInt8169;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
