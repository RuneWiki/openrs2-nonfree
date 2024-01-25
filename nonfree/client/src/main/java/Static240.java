import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_28 = new Class162(10, 8);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method7426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IILclient!n;I)V")
	public static void method7428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class225 arg2) {
		@Pc(12) Class6 local12 = arg2.method5508(Static440.aClass44_12);
		if (local12 == null) {
			return;
		}
		Static440.aClass44_12.da(arg1, arg0, arg1 + arg2.anInt6529, arg0 - -arg2.anInt6521);
		if (Static574.anInt10047 >= 3) {
			Static440.aClass44_12.FA(-16777216, local12, arg1, arg0);
		} else {
			Static299.aClass78_11.method8193((float) arg2.anInt6529 / 2.0F + (float) arg1, (float) arg0 + (float) arg2.anInt6521 / 2.0F, ((int) -Static201.aFloat128 & 0x3FFF) << 2, local12, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!un;I)Lclient!at;")
	public static Class22_Sub1 method7430(@OriginalArg(0) Class4_Sub11 arg0) {
		return new Class22_Sub1(arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4946(), arg0.method4934(), arg0.method4934(), arg0.method4905());
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B[IILclient!kfa;)V")
	public static void method7432(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub4_Sub2_Sub1_Sub1 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray459 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray459.length; local12++) {
				if (arg2.anIntArray459[local12] != arg0[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt8412 != -1) {
				@Pc(45) Class365 local45 = Static61.aClass48_1.method1016(arg2.anInt8412);
				@Pc(48) int local48 = local45.anInt10221;
				if (local48 == 1) {
					arg2.anInt8433 = 0;
					arg2.anInt8436 = 0;
					arg2.anInt8391 = 0;
					arg2.anInt8378 = arg1;
					arg2.anInt8369 = 1;
					if (!arg2.aBoolean590) {
						Static301.method5179(local45, arg2, arg2.anInt8391);
					}
				}
				if (local48 == 2) {
					arg2.anInt8436 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray459 == null || arg2.anIntArray459[local12] == -1 || Static61.aClass48_1.method1016(arg0[local12]).anInt10218 >= Static61.aClass48_1.method1016(arg2.anIntArray459[local12]).anInt10218) {
				arg2.anIntArray459 = arg0;
				arg2.anInt8445 = arg2.anInt8447;
				arg2.anInt8378 = arg1;
			}
		}
		if (local10) {
			arg2.anIntArray459 = arg0;
			arg2.anInt8378 = arg1;
			arg2.anInt8445 = arg2.anInt8447;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)[Lclient!pe;")
	public static Class258[] method7436() {
		return new Class258[] { Static408.aClass258_6, Static443.aClass258_8, Static528.aClass258_11 };
	}
}
