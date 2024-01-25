import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Lclient!pj;")
	public static Class248 aClass248_45;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_5 = new Class179(4, 1, 1, 1);

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Lclient!uj;")
	public static final Class321 aClass321_4 = new Class321();

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "Z")
	public static boolean aBoolean385 = true;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
	public static void method4564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static133.anInt2531 && Static52.anInt1226 >= arg2) {
			@Pc(21) int local21 = Static502.method6952(Static205.anInt3906, arg3, Static529.anInt9806);
			@Pc(27) int local27 = Static502.method6952(Static205.anInt3906, arg1, Static529.anInt9806);
			Static139.method2293(local21, arg0, arg2, local27);
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(III)Z")
	public static boolean method4567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static564.method7800(arg1, arg0) || Static369.method5433(arg1, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V")
	public static void method4568(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(2, arg0);
		local8.method3257();
	}
}
