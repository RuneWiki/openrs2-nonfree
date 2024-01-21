import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_999 = Static120.method1824("Untersuchen");

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1000 = Static120.method1824("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1001 = Static120.method1824("Cabbage");

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1002 = Static120.method1824("compass");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	public static void method1745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class77 local8 = Static26.method425(arg2, arg0);
		if (local8 != null && local8.anObjectArray10 != null) {
			@Pc(17) Class3_Sub16 local17 = new Class3_Sub16();
			local17.anObjectArray3 = local8.anObjectArray10;
			local17.aClass77_10 = local8;
			Static168.method2710(local17);
		}
		Static38.anInt864 = arg0;
		Static33.anInt778 = arg1;
		Static162.aBoolean147 = true;
		Static118.anInt2619 = arg2;
		Static186.method3014(local8);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)I")
	public static int method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method1747() {
		@Pc(8) int[] local8 = new int[Static58.anInt1289];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static58.anInt1289; local12++) {
			@Pc(18) Class3_Sub1_Sub2 local18 = Static173.method2793(local12);
			if (local18.anInt385 >= 0 || local18.anInt382 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static29.anIntArray91 = new int[local10];
		for (@Pc(48) int local48 = 0; local48 < local10; local48++) {
			Static29.anIntArray91[local48] = local8[local48];
		}
	}
}
