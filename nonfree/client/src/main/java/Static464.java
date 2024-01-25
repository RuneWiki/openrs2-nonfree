import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pf", name = "pb", descriptor = "I")
	public static int anInt7770;

	@OriginalMember(owner = "client!pf", name = "Hb", descriptor = "I")
	public static int anInt7758 = 0;

	@OriginalMember(owner = "client!pf", name = "xb", descriptor = "[I")
	public static final int[] anIntArray412 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ID)V")
	public static void method6835(@OriginalArg(1) double arg0) {
		Static289.aClass263_5.method8437(Static65.aClass263_1);
		Static289.aClass263_5.method8442(0, 0, (int) arg0);
		Static22.aClass144_1.method6896(Static289.aClass263_5);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!jc;)Lclient!pia;")
	public static Class14_Sub7 method6837(@OriginalArg(1) Class14_Sub21 arg0) {
		arg0.method7695(109);
		@Pc(22) int local22 = arg0.method7695(108);
		@Pc(26) Class14_Sub7 local26 = Static405.method6126(local22);
		local26.anInt11067 = arg0.method7695(113);
		@Pc(35) int local35 = arg0.method7695(115);
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) int local43 = arg0.method7695(106);
			local26.method9391(local43, arg0);
		}
		local26.method9386();
		return local26;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lclient!haa;II)V")
	public static void method6839(@OriginalArg(0) Class4_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt11177;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt11177 < local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6839(arg0, arg1, local10 - 1);
		method6839(arg0, local10 + 1, arg2);
	}
}
