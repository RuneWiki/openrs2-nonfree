import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	public static int anInt2167 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!pe;Lclient!pe;B)V")
	public static void method1656(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1) {
		Static84.aClass13_15 = arg1;
		Static147.aClass13_33 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)I")
	public static int method1658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIIII)V")
	public static void method1660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg2; local11 <= arg4; local11++) {
			Static163.method3070(arg0, arg3, arg1, Static42.anIntArrayArray8[local11]);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)Lclient!ob;")
	public static Class60 method1661(@OriginalArg(1) int arg0) {
		return Static97.method2262(arg0, false);
	}
}
