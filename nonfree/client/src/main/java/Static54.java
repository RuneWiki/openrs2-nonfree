import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	public static int anInt998;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_23 = new Class27(8, 2);

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "[S")
	public static final short[] aShortArray10 = new short[] { 23, 8, 21, 44, 12, 46, 50, 2 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ke;IIIII)V")
	public static void method937(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt352 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static226.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class225 local35 = Static25.aClass225Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt352; local37++) {
							if (arg0.aClass10_Sub4Array2[local37] == local35.aClass10_Sub4_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass10_Sub4Array2[arg0.anInt352++] = local35.aClass10_Sub4_1;
						if (arg0.anInt352 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt352; local7 < 4; local7++) {
			arg0.aClass10_Sub4Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!ms;)I")
	public static int method938(@OriginalArg(1) Class24_Sub3_Sub2 arg0) {
		if (arg0.anInt6219 == 0) {
			return 0;
		}
		@Pc(66) int local66;
		@Pc(59) int local59;
		if (arg0.anInt6241 != -1) {
			@Pc(19) Class24_Sub3_Sub2 local19 = null;
			if (arg0.anInt6241 < 32768) {
				@Pc(31) Class10_Sub26 local31 = (Class10_Sub26) Static424.aClass167_33.method3709((long) arg0.anInt6241);
				if (local31 != null) {
					local19 = local31.aClass24_Sub3_Sub2_Sub1_2;
				}
			} else if (arg0.anInt6241 >= 32768) {
				local19 = Static360.aClass24_Sub3_Sub2_Sub2Array1[arg0.anInt6241 - 32768];
			}
			if (local19 != null) {
				local59 = arg0.anInt7092 - local19.anInt7092;
				local66 = arg0.anInt7094 - local19.anInt7094;
				if (local59 != 0 || local66 != 0) {
					arg0.method4920((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class24_Sub3_Sub2_Sub2) {
			@Pc(92) Class24_Sub3_Sub2_Sub2 local92 = (Class24_Sub3_Sub2_Sub2) arg0;
			if (local92.anInt6298 != -1 && (local92.anInt6288 == 0 || local92.anInt6290 > 0)) {
				local92.method4920(local92.anInt6298);
				local92.anInt6298 = -1;
			}
		} else if (arg0 instanceof Class24_Sub3_Sub2_Sub1) {
			@Pc(119) Class24_Sub3_Sub2_Sub1 local119 = (Class24_Sub3_Sub2_Sub1) arg0;
			if (local119.anInt3575 != -1 && (local119.anInt6288 == 0 || local119.anInt6290 > 0)) {
				local59 = local119.anInt7092 - (local119.anInt3575 - Static168.anInt3353 - Static168.anInt3353) * 64;
				local66 = local119.anInt7094 - (local119.anInt3585 - Static72.anInt1488 - Static72.anInt1488) * 64;
				if (local59 != 0 || local66 != 0) {
					local119.method4920((int) (Math.atan2((double) local59, (double) local66) * 2607.5945876176133D) & 0x3FFF);
				}
				local119.anInt3575 = -1;
			}
		}
		return arg0.method4906();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Lclient!ph;IZ)Lclient!jb;")
	public static Class125 method939(@OriginalArg(0) String arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method4278(arg0);
		if (local10 == -1) {
			return new Class125(0);
		}
		@Pc(23) int[] local23 = arg1.method4291(local10);
		@Pc(29) Class125 local29 = new Class125(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		while (true) {
			while (local29.anInt3753 > local31) {
				@Pc(47) Class10_Sub8 local47 = new Class10_Sub8(arg1.method4300(local10, local23[local33++]));
				@Pc(51) int local51 = local47.method2459();
				@Pc(55) int local55 = local47.method2485();
				@Pc(59) int local59 = local47.method2502();
				if (!arg2 && local59 == 1) {
					local29.anInt3753--;
				} else {
					local29.anIntArray379[local31] = local51;
					local29.anIntArray378[local31] = local55;
					local31++;
				}
			}
			return local29;
		}
	}
}
