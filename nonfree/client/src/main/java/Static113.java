import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Lclient!oq;")
	public static final Class182 aClass182_2 = new Class182("", 13);

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!za;Lclient!jk;IILclient!ta;IIB)V")
	public static void method1801(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class104 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) Class205 local10 = Static392.aClass178_4.method3963(arg0);
		if (local10 == null || !local10.aBoolean657 || !local10.method4516(Static320.aClass249_2)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray394 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray394.length];
			@Pc(42) int local42;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static333.anInt5693 == 4) {
					local42 = (int) Static98.aFloat20 & 0x3FFF;
				} else {
					local42 = (int) Static98.aFloat20 + Static378.anInt2798 & 0x3FFF;
				}
				@Pc(53) int local53 = Class1_Sub4_Sub8_Sub1.anIntArray50[local42];
				@Pc(57) int local57 = Class1_Sub4_Sub8_Sub1.anIntArray49[local42];
				if (Static333.anInt5693 != 4) {
					local57 = local57 * 256 / (Static435.anInt7311 + 256);
					local53 = local53 * 256 / (Static435.anInt7311 + 256);
				}
				local28[local30 * 2] = arg2.anInt3376 / 2 + arg4 + (local57 * (arg7 + local10.anIntArray394[local30 * 2] * 4) + (local10.anIntArray394[local30 * 2 + 1] * 4 + arg6) * local53 >> 15);
				local28[local30 * 2 + 1] = arg3 + arg2.anInt3356 / 2 - (local57 * (arg6 + local10.anIntArray394[local30 * 2 + 1] * 4) + -(local53 * (local10.anIntArray394[local30 * 2] * 4 + arg7)) >> 15);
			}
			Static375.method4965(arg1, local28, local10.anInt5748, arg2.anIntArray210, arg2.anIntArray219);
			for (local42 = 0; local42 < local28.length / 2 - 1; local42++) {
				arg1.method5799(local28[local42 * 2], local28[local42 * 2 + 1], local28[local42 * 2 + 2], local28[local42 * 2 + 2 + 1], local10.anInt5758, arg5, arg4, arg3);
			}
			arg1.method5799(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anInt5758, arg5, arg4, arg3);
		}
		@Pc(259) Class6 local259 = null;
		if (local10.anInt5765 != -1) {
			local259 = local10.method4522(false, arg1);
			if (local259 != null) {
				Static112.method1800(arg4, arg5, arg3, arg6, arg2, arg7, local259);
			}
		}
		if (local10.aString65 == null) {
			return;
		}
		local30 = 0;
		if (local259 != null) {
			local30 = local259.ZA();
		}
		@Pc(293) Class76 local293 = Static80.aClass76_1;
		@Pc(295) Class89 local295 = Static58.aClass89_1;
		if (local10.anInt5745 == 1) {
			local293 = Static437.aClass76_4;
			local295 = Static414.aClass89_9;
		}
		if (local10.anInt5745 == 2) {
			local293 = Static121.aClass76_2;
			local295 = Static451.aClass89_10;
		}
		Static184.method2665(arg6, local10.aString65, arg4, arg5, arg2, local295, local10.anInt5753, local30, local293, arg3, arg7);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1804(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(26) byte[] local26 = (byte[]) arg1;
			return arg0 ? Static3.method4549(local26) : local26;
		} else if (arg1 instanceof Class15) {
			@Pc(42) Class15 local42 = (Class15) arg1;
			return local42.method3813();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
