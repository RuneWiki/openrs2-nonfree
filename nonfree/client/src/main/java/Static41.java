import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "Lclient!od;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
	public static int anInt1273;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "Lclient!rd;")
	public static Class63 aClass63_700 = Static80.method1463(" ");

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "Lclient!rd;")
	private static Class63 aClass63_701 = Static80.method1463("Report abuse");

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "Lclient!rd;")
	public static Class63 aClass63_702 = aClass63_701;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "Lclient!mb;")
	public static Class49 aClass49_12 = new Class49(64);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIIIII)I")
	public static int method901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(14) int local14 = arg5;
			arg5 = arg4;
			arg4 = local14;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg3;
		} else {
			return 1 + 7 - arg4 - arg1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method902() {
		aClass63_702 = null;
		aClass63_700 = null;
		aClass58_1 = null;
		aClass49_12 = null;
		anIntArray145 = null;
		aClass63_701 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBLclient!af;IZI)V")
	public static void method903(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) Class7_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) (arg3 + (arg5 << -700420656));
		@Pc(16) Class6_Sub3_Sub16 local16 = (Class6_Sub3_Sub16) Static31.aClass2_6.method20(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class6_Sub3_Sub16) Static25.aClass2_5.method20(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class6_Sub3_Sub16) Static2.aClass2_1.method20(local6);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class6_Sub3_Sub16) Static20.aClass2_4.method20(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class6_Sub3_Sub16();
			local16.anInt3135 = arg0;
			local16.aByte5 = arg1;
			local16.aClass7_Sub1_20 = arg2;
			if (arg4) {
				Static31.aClass2_6.method18(local16, local6);
				Static74.anInt2069++;
			} else {
				Static113.aClass61_2.method1681(local16);
				Static2.aClass2_1.method18(local16, local6);
				Static97.anInt2729++;
			}
		} else if (arg4) {
			local16.method2131();
			Static31.aClass2_6.method18(local16, local6);
			Static74.anInt2069++;
			Static97.anInt2729--;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IB)Lclient!cb;")
	public static Class6_Sub3_Sub2 method904(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub3_Sub2 local10 = (Class6_Sub3_Sub2) Static89.aClass49_23.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static30.aClass7_18.method110(9, arg0);
		local10 = new Class6_Sub3_Sub2();
		local10.anInt478 = arg0;
		if (local25 != null) {
			local10.method372(new Class6_Sub4(local25));
		}
		local10.method367();
		Static89.aClass49_23.method1396((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IB)Z")
	public static boolean method905(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
