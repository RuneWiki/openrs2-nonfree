import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
	public static int anInt3712;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
	public static int anInt3716;

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
	public static int anInt3713 = 0;

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_3 = new Class269("", 12);

	@OriginalMember(owner = "client!gn", name = "O", descriptor = "[I")
	public static int[] anIntArray207 = new int[2];

	@OriginalMember(owner = "client!gn", name = "S", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_52 = new Class286(37, 7);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZII)Z")
	public static boolean method3054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static132.method6006(arg0, arg1) || Static379.method5606(arg0, arg1);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ks;)I")
	public static int method3056(@OriginalArg(1) Class2_Sub15_Sub2 arg0) {
		@Pc(18) int local18 = arg0.method4355(2);
		@Pc(31) int local31;
		if (local18 == 0) {
			local31 = 0;
		} else if (local18 == 1) {
			local31 = arg0.method4355(5);
		} else if (local18 == 2) {
			local31 = arg0.method4355(8);
		} else {
			local31 = arg0.method4355(11);
		}
		return local31;
	}
}
