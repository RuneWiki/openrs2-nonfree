import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "Lclient!ak;")
	public static Class7 aClass7_17;

	@OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
	public static int anInt321;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "Lclient!db;")
	public static Class31 aClass31_1 = new Class31(50);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIB)V")
	public static void method229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static270.aClass1_Sub18_Sub1_3.method3130(182);
			Static270.aClass1_Sub18_Sub1_3.method3093(5);
		}
		if (arg0 == 1) {
			Static270.aClass1_Sub18_Sub1_3.method3130(145);
			Static270.aClass1_Sub18_Sub1_3.method3093(19);
		}
		Static270.aClass1_Sub18_Sub1_3.method3123(Static158.anInt2961 + arg2);
		Static270.aClass1_Sub18_Sub1_3.method3068(Static246.aBooleanArray15[82] ? 1 : 0);
		Static270.aClass1_Sub18_Sub1_3.method3123(Static224.anInt4695 + arg1);
		Static24.anInt554 = arg2;
		Static30.anInt663 = arg1;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIIIIIB)V")
	public static void method232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		@Pc(15) Class1_Sub26 local15 = new Class1_Sub26();
		local15.anInt4731 = arg11;
		local15.anInt4738 = arg0;
		local15.anInt4729 = arg2;
		local15.anInt4742 = arg6;
		local15.anInt4733 = arg5;
		local15.anInt4735 = arg7;
		local15.anInt4736 = arg4;
		local15.anInt4739 = arg1;
		local15.anInt4737 = arg10;
		local15.anInt4734 = arg8;
		local15.anInt4741 = arg3;
		local15.anInt4740 = arg9;
		Static2.aClass69_1.method1628(local15);
	}
}
