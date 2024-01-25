import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_237 = new Class88("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString93 = "";

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Z")
	public static boolean method6667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static273.method4587(arg0, arg1) || Static58.method1436(arg0, arg1);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIB)Z")
	public static boolean method6669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface19 local11 = (Interface19) Static324.method5105(arg1, arg0, arg2);
		if (local11 != null) {
			local5 = Static127.method2687(local11) & true;
		}
		local11 = (Interface19) Static531.method7866(arg1, arg0, arg2, wf.class);
		if (local11 != null) {
			local5 &= Static127.method2687(local11);
		}
		local11 = (Interface19) Static160.method3298(arg1, arg0, arg2);
		if (local11 != null) {
			local5 &= Static127.method2687(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([IIII[ILclient!wr;)Lclient!uo;")
	public static Class145_Sub3 method6670(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class42_Sub1 arg4) {
		@Pc(18) int local18;
		@Pc(28) int local28;
		@Pc(30) int local30;
		if (!arg4.method5911(Static61.aClass72_1, Static155.aClass114_6)) {
			@Pc(16) int[] local16 = new int[arg1 * arg2];
			for (local18 = 0; local18 < arg2; local18++) {
				local28 = local18 * arg1 + arg3[local18];
				for (local30 = 0; local30 < arg0[local18]; local30++) {
					local16[local28++] = -16777216;
				}
			}
			return new Class145_Sub3(arg4, arg1, arg2, local16);
		}
		@Pc(60) byte[] local60 = new byte[arg1 * arg2];
		for (local18 = 0; local18 < arg2; local18++) {
			local28 = arg1 * local18 + arg3[local18];
			for (local30 = 0; local30 < arg0[local18]; local30++) {
				local60[local28++] = -1;
			}
		}
		return new Class145_Sub3(arg4, arg1, arg2, local60);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIBIIII)V")
	public static void method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static251.anInt5168 <= arg3 - arg5 && arg3 + arg5 <= Static341.anInt6481 && arg2 - arg5 >= Static507.anInt9124 && Static234.anInt4897 >= arg5 + arg2) {
			Static478.method7171(arg2, arg0, arg1, arg5, arg3, arg4);
		} else {
			Static123.method2634(arg5, arg4, arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V")
	public static void method6673(@OriginalArg(0) int arg0) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(9, arg0);
		local13.method823();
	}
}
