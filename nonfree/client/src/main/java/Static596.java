import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
	public static int anInt10491;

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "Lclient!oea;")
	public static Class239 aClass239_17;

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
	public static int anInt10492;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_104 = new Class94(42, 8);

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_105 = new Class94(55, 4);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8754(@OriginalArg(0) String arg0) {
		@Pc(6) Class2_Sub52 local6 = Static483.method7528();
		local6.aClass2_Sub11_Sub2_7.method8374(Static444.aClass141_14.anInt4991);
		local6.aClass2_Sub11_Sub2_7.method8333(0);
		@Pc(21) int local21 = local6.aClass2_Sub11_Sub2_7.anInt10066;
		local6.aClass2_Sub11_Sub2_7.method8333(634);
		@Pc(30) int[] local30 = Static172.method3630(local6);
		@Pc(34) int local34 = local6.aClass2_Sub11_Sub2_7.anInt10066;
		local6.aClass2_Sub11_Sub2_7.method8329(arg0);
		local6.aClass2_Sub11_Sub2_7.method8374(Static476.anInt8915);
		local6.aClass2_Sub11_Sub2_7.anInt10066 += 7;
		local6.aClass2_Sub11_Sub2_7.method8346(local34, local30, local6.aClass2_Sub11_Sub2_7.anInt10066);
		local6.aClass2_Sub11_Sub2_7.method8379(local6.aClass2_Sub11_Sub2_7.anInt10066 - local21);
		Static96.method2563(local6);
		Static411.anInt7764 = 1;
		Static129.anInt3275 = -3;
		Static427.anInt8027 = 0;
		Static256.anInt5473 = 0;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public static int method8756(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static132.method3029(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
