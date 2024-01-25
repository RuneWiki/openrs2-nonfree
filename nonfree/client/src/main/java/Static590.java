import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!ska", name = "c", descriptor = "J")
	public static long aLong329;

	@OriginalMember(owner = "client!ska", name = "d", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_167 = new Class186(66, -2);

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(II)V")
	public static void method8096(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub4_Sub2 local14 = Static502.method7211(16, (long) arg0);
		local14.method627();
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(I)[Lclient!kia;")
	public static Class206[] method8097() {
		return new Class206[] { Static333.aClass206_10, Static686.aClass206_14, Static152.aClass206_5, Static407.aClass206_13, Static605.aClass206_16, Static354.aClass206_11, Static372.aClass206_12, Static563.aClass206_15, Static247.aClass206_8, Static140.aClass206_4, Static220.aClass206_7, Static710.aClass206_18, Static189.aClass206_6, Static636.aClass206_17, Static69.aClass206_1 };
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "([Lclient!bla;II)V")
	public static void method8098(@OriginalArg(0) Class19_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class19_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt11205;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt11205 > local27 + (local29 & 0x1)) {
				@Pc(44) Class19_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method8098(arg0, arg1, local10 - 1);
		method8098(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(JJ)J")
	public static long method8099(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!ska", name = "c", descriptor = "(I)[Lclient!pm;")
	public static Class291[] method8100() {
		return new Class291[] { Static605.aClass291_2, Static608.aClass291_3, Static425.aClass291_1 };
	}
}
