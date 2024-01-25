import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_168 = new Class268(106, 4);

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
	public static int[] anIntArray577 = new int[1];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILclient!rg;)Lclient!hu;")
	public static Class141 method8013(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(7) int local7 = arg0.method8604();
		@Pc(16) Class238 local16 = Static613.method8515()[arg0.method8604()];
		@Pc(23) Class79 local23 = Static23.method3614()[arg0.method8604()];
		@Pc(27) int local27 = arg0.method8615();
		@Pc(31) int local31 = arg0.method8615();
		@Pc(35) int local35 = arg0.method8571();
		@Pc(39) int local39 = arg0.method8571();
		@Pc(49) int local49 = arg0.method8579();
		@Pc(53) int local53 = arg0.method8579();
		@Pc(57) int local57 = arg0.method8579();
		@Pc(66) boolean local66 = arg0.method8604() == 1;
		return new Class141(local7, local16, local23, local27, local31, local35, local39, local49, local53, local57, local66);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)I")
	public static int method8014() {
		return Static544.anInt9351;
	}
}
