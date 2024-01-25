import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array13;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_16 = new Class16();

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
	public static int anInt3549 = 2;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
	public static int anInt3550 = 0;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
	public static void method3261() {
		for (@Pc(15) int local15 = 0; local15 < Static200.aByteArrayArrayArray8.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < Static200.aByteArrayArrayArray8[0].length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static200.aByteArrayArrayArray8[0][0].length; local23++) {
					Static200.aByteArrayArrayArray8[local15][local19][local23] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!aq;III)V")
	public static void method3262(@OriginalArg(0) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static3.aClass12_1 = arg0;
		Static28.anInt1033 = arg1;
		Static280.anInt5700 = arg2;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static230.anInt4756 = arg2;
		Static357.anInt4327 = arg4;
		Static263.anInt5364 = arg5;
		Static226.anInt4718 = arg3;
		Static343.anInt6447 = arg0;
		Static187.anInt4034 = arg1;
	}
}
