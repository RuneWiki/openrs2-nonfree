import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "Z")
	public static boolean aBoolean607;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	public static int anInt6841;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_133 = new Class102("", 12);

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt6836 = 2;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	public static int anInt6838 = 0;

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
	public static int anInt6840 = 0;

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_218 = new Class157(49, -1);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ef;I)Lclient!cj;")
	public static Class2_Sub3 method5721(@OriginalArg(0) Class2_Sub12 arg0) {
		arg0.method3124();
		@Pc(13) int local13 = arg0.method3124();
		@Pc(17) Class2_Sub3 local17 = Static91.method1820(local13);
		local17.anInt6813 = arg0.method3124();
		@Pc(26) int local26 = arg0.method3124();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(42) int local42 = arg0.method3124();
			local17.method5704(local42, arg0);
		}
		local17.method5708();
		return local17;
	}
}
