import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_230 = new Class305(104, 12);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIII[J)V")
	public static void method4322(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) int local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (arg3[local56] < local20 + (long) (local56 & local54)) {
				@Pc(78) long local78 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16] = local78;
				@Pc(92) int local92 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16++] = local92;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method4322(arg0, local16 - 1, arg2, arg3);
		method4322(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)V")
	public static void method4326(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(16, arg0);
		local8.method6693();
		local8.anInt7487 = arg1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
	public static boolean method4327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method4330() {
		for (@Pc(10) Class1_Sub46 local10 = (Class1_Sub46) Static30.aClass295_6.method7543(); local10 != null; local10 = (Class1_Sub46) Static30.aClass295_6.method7540()) {
			if (local10.anInt7927 > 0) {
				local10.anInt7927--;
			}
			if (local10.anInt7927 != 0) {
				if (local10.anInt7921 > 0) {
					local10.anInt7921--;
				}
				if (local10.anInt7921 == 0 && local10.anInt7932 >= 1 && local10.anInt7922 >= 1 && Static237.anInt4563 - 2 >= local10.anInt7932 && local10.anInt7922 <= Static373.anInt6694 - 2 && (local10.anInt7928 < 0 || Static452.method6974(local10.anInt7929, local10.anInt7928))) {
					Static123.method2352(local10.anInt7933, local10.anInt7931, local10.anInt7925, local10.anInt7929, local10.anInt7932, local10.anInt7928, local10.anInt7922, -1);
					local10.anInt7921 = -1;
					if (local10.anInt7928 == local10.anInt7930 && local10.anInt7930 == -1) {
						local10.method8239();
					} else if (local10.anInt7928 == local10.anInt7930 && local10.anInt7925 == local10.anInt7923 && local10.anInt7926 == local10.anInt7929) {
						local10.method8239();
					}
				}
			} else if (local10.anInt7930 < 0 || Static452.method6974(local10.anInt7926, local10.anInt7930)) {
				Static123.method2352(local10.anInt7933, local10.anInt7931, local10.anInt7923, local10.anInt7926, local10.anInt7932, local10.anInt7930, local10.anInt7922, -1);
				local10.method8239();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)I")
	public static int method4331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			local15 = local15 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local15;
	}
}
