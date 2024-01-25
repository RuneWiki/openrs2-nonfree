import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "Lclient!jg;")
	public static Class174 aClass174_5;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
	public static final int[] anIntArray242 = new int[13];

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "[I")
	public static final int[] anIntArray243 = new int[3];

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_4 = new Class215(0, 19);

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
	public static int[] anIntArray244 = new int[2];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public static void method3797(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(7, arg0);
		local8.method1473();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([IIBLclient!wq;)V")
	public static void method3798(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class9_Sub2_Sub1_Sub2_Sub2 arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg2.anIntArray666 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg2.anIntArray666.length; local8++) {
				if (arg2.anIntArray666[local8] != arg0[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg2.anInt10193 != -1) {
				@Pc(45) Class267 local45 = Static474.aClass264_2.method6574(arg2.anInt10193);
				@Pc(48) int local48 = local45.anInt7585;
				if (local48 == 1) {
					arg2.anInt10214 = 1;
					arg2.anInt10186 = 0;
					arg2.anInt10189 = 0;
					arg2.anInt10219 = arg1;
					arg2.anInt10192 = 0;
					if (!arg2.aBoolean772) {
						Static522.method7586(arg2.anInt10189, arg2, local45);
					}
				}
				if (local48 == 2) {
					arg2.anInt10186 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg2.anIntArray666 == null || arg2.anIntArray666[local8] == -1 || Static474.aClass264_2.method6574(arg0[local8]).anInt7582 >= Static474.aClass264_2.method6574(arg2.anIntArray666[local8]).anInt7582) {
				arg2.anIntArray666 = arg0;
				arg2.anInt10234 = arg2.anInt10236;
				arg2.anInt10219 = arg1;
			}
		}
		if (local6) {
			arg2.anIntArray666 = arg0;
			arg2.anInt10234 = arg2.anInt10236;
			arg2.anInt10219 = arg1;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I")
	public static int method3799(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}
}
