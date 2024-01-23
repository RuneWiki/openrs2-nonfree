import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!wc;")
	public static Class110 aClass110_16 = new Class110(128);

	@OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
	public static int anInt3840 = -1;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "Lclient!qe;")
	private static Class78 aClass78_674 = Static199.method3560("Allocated memory");

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_675 = aClass78_674;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	public static int anInt3869 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!oe;Lclient!oe;Lclient!oe;Lclient!oe;B)V")
	public static void method3020(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class72 arg3) {
		Static100.aClass72_136 = arg2;
		Static182.aClass72_249 = arg0;
		Static11.aClass72_19 = arg3;
		Static126.aClass72_179 = arg1;
		Static181.aClass64ArrayArray1 = new Class64[Static11.aClass72_19.method3182()][];
		Static202.aBooleanArray124 = new boolean[Static11.aClass72_19.method3182()];
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(II)Lclient!qe;")
	public static Class78 method3037(@OriginalArg(1) int arg0) {
		@Pc(12) Class78 local12 = new Class78();
		local12.anInt3831 = 0;
		local12.aByteArray48 = new byte[arg0];
		return local12;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!nh;I)Lclient!re;")
	public static Class14_Sub4 method3049(@OriginalArg(0) Class2_Sub23 arg0) {
		return new Class14_Sub4(arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2091(), arg0.method2122());
	}
}
