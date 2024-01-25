import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "J")
	public static long aLong139;

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
	public static int anInt5102;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
	public static void method4385() throws IOException {
		if (Static547.aClass197_1 == null || Static551.anInt9154 <= 0) {
			return;
		}
		Static454.aClass3_Sub9_8.anInt6453 = 0;
		while (true) {
			@Pc(20) Class3_Sub27 local20 = (Class3_Sub27) Static262.aClass216_43.method5457();
			if (local20 == null || Static454.aClass3_Sub9_8.aByteArray51.length - Static454.aClass3_Sub9_8.anInt6453 < local20.anInt5444) {
				Static547.aClass197_1.method5190(Static454.aClass3_Sub9_8.anInt6453, Static454.aClass3_Sub9_8.aByteArray51);
				Static189.anInt3567 = 0;
				Static347.anInt6408 += Static454.aClass3_Sub9_8.anInt6453;
				break;
			}
			Static454.aClass3_Sub9_8.method5625(local20.aClass3_Sub9_Sub2_2.aByteArray51, local20.anInt5444, 0);
			Static551.anInt9154 -= local20.anInt5444;
			local20.method8682();
			local20.aClass3_Sub9_Sub2_2.method5575();
			local20.method4617();
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "([Lclient!uq;II)V")
	public static void method4387(@OriginalArg(0) Class9_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10151;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10151 > local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4387(arg0, arg1, local10 - 1);
		method4387(arg0, local10 + 1, arg2);
	}
}
