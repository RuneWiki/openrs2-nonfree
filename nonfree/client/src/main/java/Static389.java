import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_250 = new Class179(20, 4);

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
	public static void method5544(@OriginalArg(0) int arg0) {
		Static176.anInt2974 = arg0;
		@Pc(12) Class10 local12 = Static278.aClass10_58;
		synchronized (Static278.aClass10_58) {
			Static278.aClass10_58.method375();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[ILclient!kf;Z)V")
	public static void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub1_Sub1_Sub3_Sub2 arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg2.anIntArray296 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg2.anIntArray296.length; local12++) {
				if (arg2.anIntArray296[local12] != arg1[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg2.anInt5077 != -1) {
				@Pc(45) Class119 local45 = Static334.aClass268_2.method6469(arg2.anInt5077);
				@Pc(48) int local48 = local45.anInt3012;
				if (local48 == 1) {
					arg2.anInt5090 = 0;
					arg2.anInt5049 = 1;
					arg2.anInt5115 = 0;
					arg2.anInt5065 = arg0;
					arg2.anInt5054 = 0;
					if (!arg2.aBoolean329) {
						Static658.method8966(arg2, arg2.anInt5115, local45);
					}
				}
				if (local48 == 2) {
					arg2.anInt5090 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] != -1) {
				local10 = false;
			}
			if (arg2.anIntArray296 == null || arg2.anIntArray296[local12] == -1 || Static334.aClass268_2.method6469(arg1[local12]).anInt3004 >= Static334.aClass268_2.method6469(arg2.anIntArray296[local12]).anInt3004) {
				arg2.anIntArray296 = arg1;
				arg2.anInt5120 = arg2.anInt5119;
				arg2.anInt5065 = arg0;
			}
		}
		if (local10) {
			arg2.anInt5065 = arg0;
			arg2.anIntArray296 = arg1;
			arg2.anInt5120 = arg2.anInt5119;
		}
	}
}
