import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "Z")
	public static boolean aBoolean88;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[I")
	public static final int[] anIntArray26 = new int[8];

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public static int anInt950 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ig;I)Lclient!lk;")
	public static Class196 method904(@OriginalArg(0) Class8_Sub8 arg0) {
		@Pc(12) int local12 = arg0.method8578();
		@Pc(19) Class173 local19 = Static148.method5412()[arg0.method8525()];
		@Pc(26) Class60 local26 = Static593.method8190()[arg0.method8525()];
		@Pc(30) int local30 = arg0.method8568();
		@Pc(34) int local34 = arg0.method8568();
		return new Class196(local12, local19, local26, local30, local34);
	}
}
