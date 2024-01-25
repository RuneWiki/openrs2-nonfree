import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
	public static int anInt3693;

	@OriginalMember(owner = "client!jk", name = "L", descriptor = "[Lclient!jl;")
	public static final Class131[] aClass131Array2 = new Class131[14];

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_51 = new Class267("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public static void method3039() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static181.anInt3574; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static117.anInt2450; local13++) {
				if (Static389.method5717(true, local9, local7, local13, Static409.aClass101ArrayArrayArray3)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILclient!eq;IIII)Lclient!va;")
	public static Class224 method3041(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) long local14 = (long) arg0;
		@Pc(20) Class224 local20 = (Class224) Static24.aClass44_2.method1353(local14);
		if (local20 == null) {
			@Pc(30) Class78 local30 = Static100.method1817(arg0, Static335.aClass100_66);
			if (local30 == null) {
				return null;
			}
			if (local30.anInt2404 < 13) {
				local30.method1969();
			}
			local20 = arg1.method4971(local30, 2055, Static244.anInt7797, 64, 768);
			Static24.aClass44_2.method1349(local20, local14);
		}
		local20 = local20.method5808((byte) 2, 2055, true);
		if (arg4 != 0) {
			local20.method5839(arg4);
		}
		if (arg2 != 0) {
			local20.method5817(arg2);
		}
		if (arg3 != 0) {
			local20.method5840(arg3);
		}
		if (arg5 != 0) {
			local20.method5806(0, arg5, 0);
		}
		return local20;
	}
}
