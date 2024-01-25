import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_154 = new Class133(67, -2);

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_143 = new Class67("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public static int anInt8722 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
	public static boolean method7167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static449.method6811(arg1, arg0) | Static440.method6638(arg0, arg1) | Static190.method3581(arg0, arg1)) & Static386.method5950(arg0, arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public static void method7168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static269.anInt5577 <= arg2 && Static81.anInt1788 >= arg2) {
			@Pc(15) int local15 = Static73.method7829(arg1, Static190.anInt4314, Static145.anInt2941);
			@Pc(21) int local21 = Static73.method7829(arg3, Static190.anInt4314, Static145.anInt2941);
			Static23.method5783(arg2, local21, local15, arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)I")
	public static int method7169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZI)I")
	public static int method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 4095 - arg0;
		} else if (local12 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}
}
