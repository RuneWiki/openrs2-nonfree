import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "Lclient!in;")
	public static Class157 aClass157_219;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_170 = new Class215(111, -1);

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
	public static int anInt8001 = 0;

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "Lclient!sia;")
	public static final Class315 aClass315_3 = new Class315();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B[B)Z")
	public static boolean method6831(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub11 local8 = new Class2_Sub11(arg0);
		@Pc(19) int local19 = local8.method8383();
		if (local19 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method8383() == 1;
		if (local35) {
			Static621.method9053(local8);
		}
		Static374.method6268(local8);
		return true;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "([Lclient!ga;II)V")
	public static void method6832(@OriginalArg(0) Class3_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class3_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10311;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10311 < local27 + (local29 & 0x1)) {
				@Pc(44) Class3_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6832(arg0, arg1, local10 - 1);
		method6832(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)Z")
	public static boolean method6833() {
		return Static614.anInt10750 == 0 ? Static341.aClass2_Sub8_Sub3_4.method5802() : true;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!ke;[I[I[I)V")
	public static void method6834(@OriginalArg(1) Class3_Sub1_Sub3_Sub3_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) int local18 = arg2[local12];
			@Pc(22) int local22 = arg1[local12];
			@Pc(26) int local26 = arg3[local12];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && local28 < arg0.aClass274Array3.length) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass274Array3[local28] = null;
					} else {
						@Pc(43) Class130 local43 = Static195.aClass193_1.method5573(local18);
						@Pc(46) int local46 = local43.anInt4705;
						@Pc(51) Class274 local51 = arg0.aClass274Array3[local28];
						if (local51 != null) {
							if (local18 == local51.anInt8352) {
								if (local46 == 0) {
									local51 = arg0.aClass274Array3[local28] = null;
								} else if (local46 == 1) {
									local51.anInt8347 = local26;
									local51.anInt8353 = 1;
									local51.anInt8354 = 0;
									local51.anInt8349 = 0;
									local51.anInt8345 = 0;
									if (!arg0.aBoolean454) {
										Static609.method8918(arg0, 0, local43);
									}
								} else if (local46 == 2) {
									local51.anInt8345 = 0;
								}
							} else if (local43.anInt4699 >= Static195.aClass193_1.method5573(local51.anInt8352).anInt4699) {
								local51 = arg0.aClass274Array3[local28] = null;
							}
						}
						if (local51 == null) {
							local51 = arg0.aClass274Array3[local28] = new Class274();
							local51.anInt8345 = 0;
							local51.anInt8353 = 1;
							local51.anInt8347 = local26;
							local51.anInt8354 = 0;
							local51.anInt8352 = local18;
							local51.anInt8349 = 0;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, 0, local43);
							}
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}
}
