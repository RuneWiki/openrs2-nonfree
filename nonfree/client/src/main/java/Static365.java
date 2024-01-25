import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "Lclient!ju;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "Lclient!st;")
	public static final Class314 aClass314_103 = new Class314(28, 4);

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_42 = new Class136(3000000, 200);

	@OriginalMember(owner = "client!nba", name = "m", descriptor = "Z")
	public static final boolean aBoolean484 = false;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "Z")
	public static boolean aBoolean485 = false;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
	public static int anInt6737 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIILclient!ka;I)Lclient!iha;")
	public static Class160 method5854(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class160(arg3, arg1, arg0, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "([Lclient!uq;II)V")
	public static void method5857(@OriginalArg(0) Class9_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			if (arg0[local29].anInt10151 < local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5857(arg0, arg1, local10 - 1);
		method5857(arg0, local10 + 1, arg2);
	}
}
