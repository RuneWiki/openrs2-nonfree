import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "Lclient!hd;")
	public static Class107_Sub1 aClass107_Sub1_3;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
	public static final int[] anIntArray472 = new int[6];

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "[I")
	public static final int[] anIntArray473 = new int[256];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIII)V")
	public static void method4452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 + Static386.anInt7205;
		@Pc(14) int local14 = arg0 + Static153.anInt2798;
		if (Static175.aClass36ArrayArrayArray1 == null || arg2 < 0 || arg0 < 0 || arg2 >= Static234.anInt3949 || arg0 >= Static371.anInt6492) {
			return;
		}
		@Pc(42) long local42 = (long) (arg1 << 28 | local14 << 14 | local10);
		@Pc(48) Class2_Sub43 local48 = (Class2_Sub43) Static293.aClass220_27.method5099(local42);
		if (local48 == null) {
			Static229.method3108(arg1, arg2, arg0);
			return;
		}
		@Pc(62) Class2_Sub26 local62 = (Class2_Sub26) local48.aClass181_47.method3972();
		if (local62 == null) {
			Static229.method3108(arg1, arg2, arg0);
			return;
		}
		@Pc(76) Class11_Sub4_Sub1 local76 = (Class11_Sub4_Sub1) Static229.method3108(arg1, arg2, arg0);
		if (local76 == null) {
			local76 = new Class11_Sub4_Sub1();
		} else {
			local76.anInt5599 = local76.anInt5602 = -1;
		}
		local76.anInt5596 = local62.anInt4284;
		local76.anInt5600 = local62.anInt4278;
		label46: while (true) {
			@Pc(104) Class2_Sub26 local104 = (Class2_Sub26) local48.aClass181_47.method3975();
			if (local104 == null) {
				break;
			}
			if (local104.anInt4284 != local76.anInt5596) {
				local76.anInt5597 = local104.anInt4278;
				local76.anInt5599 = local104.anInt4284;
				while (true) {
					@Pc(125) Class2_Sub26 local125 = (Class2_Sub26) local48.aClass181_47.method3975();
					if (local125 == null) {
						break label46;
					}
					if (local125.anInt4284 != local76.anInt5596 && local125.anInt4284 != local76.anInt5599) {
						local76.anInt5602 = local125.anInt4284;
						local76.anInt5595 = local125.anInt4278;
					}
				}
			}
		}
		@Pc(165) int local165 = Static365.method3535(arg1, (arg2 << 7) + 64, (arg0 << 7) + 64);
		Static181.method2416(arg1, arg2, arg0, local165, local76);
	}
}
