import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!fi;")
	public static Class2_Sub11_Sub1 aClass2_Sub11_Sub1_3;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
	public static int anInt5683;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_162 = new Class208(68, 28);

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
	public static int anInt5684 = -1;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lclient!vt;")
	public static Class2_Sub24 method5030() {
		@Pc(8) Class2_Sub24 local8 = new Class2_Sub24(38);
		local8.method5746(15);
		local8.method5746(Static190.anInt3986);
		local8.method5746(Static48.aBoolean73 ? 1 : 0);
		local8.method5746(Static314.aBoolean421 ? 1 : 0);
		local8.method5746(Static72.aBoolean125 ? 1 : 0);
		local8.method5746(Static308.aBoolean416 ? 1 : 0);
		local8.method5746(0);
		local8.method5746(Static74.aBoolean127 ? 1 : 0);
		local8.method5746(Static135.aBoolean205 ? 1 : 0);
		local8.method5746(Static183.aBoolean279 ? 1 : 0);
		local8.method5746(Static266.anInt5047);
		local8.method5746(Static382.aBoolean487 ? 1 : 0);
		local8.method5746(Static104.aBoolean168 ? 1 : 0);
		local8.method5746(Static135.aBoolean204 ? 1 : 0);
		local8.method5746(Static11.anInt210);
		local8.method5746(Static41.aBoolean51 ? 1 : 0);
		local8.method5746(Static135.anInt2943);
		local8.method5746(Static228.anInt4592);
		local8.method5746(Static107.anInt2388);
		local8.method5721(Static120.anInt2646);
		local8.method5721(Static260.anInt4975);
		local8.method5746(Static333.method5395());
		local8.method5734(Static34.anInt592);
		local8.method5746(Static202.anInt4200);
		local8.method5746(Static70.aBoolean117 ? 1 : 0);
		local8.method5746(Static260.aBoolean369 ? 1 : 0);
		local8.method5746(Static42.anInt733);
		local8.method5746(Static220.aBoolean317 ? 1 : 0);
		local8.method5746(Static224.aBoolean324 ? 1 : 0);
		local8.method5746(Static73.anInt1628);
		local8.method5746(Static73.aBoolean126 ? 1 : 0);
		local8.method5746(Static232.anInt4637);
		local8.method5746(Static71.anInt1579);
		return local8;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!oj;Z)V")
	public static void method5031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2) {
		Static92.aClass48_5 = arg2;
		Static169.aClass189ArrayArray3 = new Class189[arg1][arg0];
		if (Static360.anIntArray572 != null) {
			Static269.aClass10_2 = Static121.method5861(Static360.anIntArray572[5], Static360.anIntArray572[1], Static360.anIntArray572[2], Static360.anIntArray572[4], Static360.anIntArray572[3], Static360.anIntArray572[0]);
		}
		Static318.aClass189_2 = new Class189();
		Static346.method5532();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!ws;)I")
	public static int method5033(@OriginalArg(1) Class2_Sub43 arg0) {
		@Pc(12) String local12 = Static264.method3357(arg0);
		@Pc(14) int[] local14 = null;
		if (Static102.method1833(arg0.anInt7126)) {
			local14 = Static57.aClass196_1.method4827((int) arg0.aLong212).anIntArray314;
		} else if (arg0.anInt7124 != -1) {
			local14 = Static57.aClass196_1.method4827(arg0.anInt7124).anIntArray314;
		} else if (Static379.method5976(arg0.anInt7126)) {
			@Pc(89) Class1_Sub2_Sub1_Sub2 local89 = Static223.aClass1_Sub2_Sub1_Sub2Array1[(int) arg0.aLong212];
			if (local89 != null) {
				@Pc(94) Class197 local94 = local89.aClass197_1;
				if (local94.anIntArray468 != null) {
					local94 = local94.method4832(Static179.aClass115_1);
				}
				if (local94 != null) {
					local14 = local94.anIntArray467;
				}
			}
		} else if (Static54.method845(arg0.anInt7126)) {
			@Pc(61) Class47 local61;
			if (arg0.anInt7126 == 1004) {
				local61 = Static230.aClass96_4.method2303((int) arg0.aLong212);
			} else {
				local61 = Static230.aClass96_4.method2303((int) (arg0.aLong212 >>> 32 & 0x7FFFFFFFL));
			}
			if (local61.anIntArray95 != null) {
				local61 = local61.method903(Static179.aClass115_1);
			}
			if (local61 != null) {
				local14 = local61.anIntArray93;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static350.method5582(local14);
		}
		@Pc(138) int local138 = Static121.aClass24_10.method329(Static315.aClass27Array51, local12);
		if (arg0.aBoolean510) {
			local138 += Static62.aClass27_19.method5320() + 4;
		}
		return local138;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IB)V")
	public static void method5036(@OriginalArg(0) int arg0) {
		Static11.anInt211 = 3;
		Static228.anInt4596 = arg0;
		Static313.anInt5728 = 100;
		Static340.anInt6283 = -1;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static329.aByteArrayArrayArray17[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static329.aByteArrayArrayArray17[arg2][arg1][arg0] & 0x10) == 0) {
			return Static320.method6089(arg2, arg0, arg1) == arg3;
		} else {
			return false;
		}
	}
}
