import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!vd;I)Lclient!jj;")
	public static Class6_Sub2_Sub11 method3753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		@Pc(14) Class6_Sub40 local14 = new Class6_Sub40(arg2.method8404(arg1, arg0));
		@Pc(45) Class6_Sub2_Sub11 local45 = new Class6_Sub2_Sub11(arg0, local14.method8611(), local14.method8611(), local14.method8579(), local14.method8579(), local14.method8604() == 1, local14.method8604(), local14.method8604());
		@Pc(49) int local49 = local14.method8604();
		for (@Pc(60) int local60 = 0; local60 < local49; local60++) {
			local45.aClass8_30.method157(new Class6_Sub23(local14.method8604(), local14.method8571(), local14.method8571(), local14.method8571(), local14.method8571(), local14.method8571(), local14.method8571(), local14.method8571(), local14.method8571()));
		}
		local45.method4678();
		return local45;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)I")
	public static int method3755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg0) {
			return arg2;
		}
		@Pc(18) int local18 = 128 - arg1;
		@Pc(33) int local33 = (arg2 & 0x7F) * local18 + (arg0 & 0x7F) * arg1 >> 7;
		@Pc(47) int local47 = (arg2 & 0x380) * local18 + arg1 * (arg0 & 0x380) >> 7;
		@Pc(62) int local62 = (arg2 & 0xFC00) * local18 + (arg0 & 0xFC00) * arg1 >> 7;
		return local47 & 0x380 | local62 & 0xFC00 | local33 & 0x7F;
	}
}
