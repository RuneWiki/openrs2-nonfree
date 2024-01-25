import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt4528;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!h;")
	public static final Class114 aClass114_92 = new Class114("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_71 = new Class6(22, -1);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!kda;Lclient!kda;I)I")
	public static int method3956(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method4213(Static152.anInt3449)) {
			local10++;
		}
		if (arg1.method4213(Static517.anInt8717)) {
			local10++;
		}
		if (arg1.method4213(Static26.anInt1130)) {
			local10++;
		}
		if (arg0.method4213(Static152.anInt3449)) {
			local10++;
		}
		if (arg0.method4213(Static517.anInt8717)) {
			local10++;
		}
		if (arg0.method4213(Static26.anInt1130)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	public static void method3957() {
		Static59.aClass316_9.method7791(5);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ica;[IB[I[I)V")
	public static void method3959(@OriginalArg(0) Class47_Sub2_Sub3_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(18) int local18 = arg2[local13];
			@Pc(22) int local22 = arg1[local13];
			@Pc(26) int local26 = arg3[local13];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg0.aClass8Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass8Array3[local28] = null;
					} else {
						@Pc(47) Class280 local47 = Static6.aClass126_1.method3574(local18);
						@Pc(50) int local50 = local47.anInt8110;
						@Pc(55) Class8 local55 = arg0.aClass8Array3[local28];
						if (local55 != null) {
							if (local55.anInt127 == local18) {
								if (local50 == 0) {
									local55 = arg0.aClass8Array3[local28] = null;
								} else if (local50 == 1) {
									local55.anInt129 = 0;
									local55.anInt125 = 0;
									local55.anInt124 = 0;
									local55.anInt123 = local26;
									local55.anInt121 = 1;
									Static351.method5589(arg0.anInt8189, local47, false, arg0.aByte94, arg0.anInt8191, 0);
								} else if (local50 == 2) {
									local55.anInt125 = 0;
								}
							} else if (local47.anInt8103 >= Static6.aClass126_1.method3574(local55.anInt127).anInt8103) {
								local55 = arg0.aClass8Array3[local28] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass8Array3[local28] = new Class8();
							local55.anInt125 = 0;
							local55.anInt127 = local18;
							local55.anInt129 = 0;
							local55.anInt121 = 1;
							local55.anInt124 = 0;
							local55.anInt123 = local26;
							Static351.method5589(arg0.anInt8189, local47, false, arg0.aByte94, arg0.anInt8191, 0);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z")
	public static boolean method3960(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
