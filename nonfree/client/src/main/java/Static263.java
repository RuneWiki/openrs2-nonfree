import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!qi;")
	public static final Class208 aClass208_28 = new Class208(16);

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "[I")
	public static int[] anIntArray345 = new int[2];

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_65 = new Class142("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[BI)I")
	public static int method3649(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static428.method5439(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)[Lclient!du;")
	public static Class62[] method3650() {
		return new Class62[] { Static132.aClass62_37, Static109.aClass62_12, Static145.aClass62_16, Static229.aClass62_27, Static452.aClass62_40, Static345.aClass62_33, Static169.aClass62_32, Static201.aClass62_22, Static308.aClass62_31, Static427.aClass62_38, Static209.aClass62_24, Static443.aClass62_39, Static208.aClass62_23, Static233.aClass62_28, Static246.aClass62_29 };
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg6) {
			Static21.method338(arg6, arg3, arg4, arg1, arg0, arg5);
		} else if (arg4 - arg6 >= Static281.anInt4757 && arg4 + arg6 <= Static457.anInt7264 && arg1 - arg2 >= Static142.anInt2163 && Static182.anInt3402 >= arg1 + arg2) {
			Static23.method348(arg5, arg6, arg4, arg2, arg1, arg3, arg0);
		} else {
			Static226.method3212(arg3, arg4, arg6, arg0, arg1, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZIIIII)V")
	public static void method3652(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(28) Class1_Sub28 local28 = (Class1_Sub28) Static172.aClass208_18.method4405(local22);
		if (local28 == null) {
			local28 = new Class1_Sub28();
			Static172.aClass208_18.method4413(local22, local28);
		}
		if (arg2 >= local28.anIntArray291.length) {
			@Pc(49) int[] local49 = new int[arg2 + 1];
			@Pc(54) int[] local54 = new int[arg2 + 1];
			for (@Pc(56) int local56 = 0; local56 < local28.anIntArray291.length; local56++) {
				local49[local56] = local28.anIntArray291[local56];
				local54[local56] = local28.anIntArray292[local56];
			}
			for (@Pc(86) int local86 = local28.anIntArray291.length; local86 < arg2; local86++) {
				local49[local86] = -1;
				local54[local86] = 0;
			}
			local28.anIntArray292 = local54;
			local28.anIntArray291 = local49;
		}
		local28.anIntArray291[arg2] = arg3;
		local28.anIntArray292[arg2] = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
	public static void method3653() {
		Static459.aClass77_63.method1386(50);
		Static368.aClass77_60.method1386(50);
		Static141.aClass77_51.method1386(50);
		Static254.aClass77_35.method1386(50);
		Static402.aClass77_54.method1386(50);
	}
}
