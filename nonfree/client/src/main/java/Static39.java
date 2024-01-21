import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public static int anInt1113 = 0;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!v;")
	public static Class76 aClass76_479 = Static134.method2017("jolt");

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
	public static int anInt1120 = 0;

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[104][104];

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
	public static final int anInt1123 = 50;

	@OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
	public static int anInt1125 = 0;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
	public static int anInt1126 = 0;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt1128 = 0;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
	public static int anInt1130 = 0;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
	public static void method764() {
		anIntArrayArray9 = null;
		aClass76_479 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!la;)V")
	public static void method765(@OriginalArg(1) Class17 arg0) {
		Static103.aClass17_32 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)I")
	public static int method766(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local1 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			local1 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local1 += 2;
		}
		if (arg0 >= 1) {
			local1++;
			arg0 >>>= 0x1;
		}
		return arg0 + local1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ne;Lclient!v;)I")
	public static int method768(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) Class76 arg1) {
		@Pc(11) int local11 = arg0.anInt931;
		arg0.method578(arg1.anInt2668);
		arg0.anInt931 += Static110.aClass23_1.method386(arg0.anInt931, arg1.anInt2668, arg1.aByteArray71, 0, arg0.aByteArray17);
		return arg0.anInt931 - local11;
	}
}
