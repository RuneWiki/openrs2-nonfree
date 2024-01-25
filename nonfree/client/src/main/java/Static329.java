import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_12 = new Class93(1, 2, 2, 0);

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public static int anInt5459 = -1;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_87 = new Class171(83, -1);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method4683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static461.aClass272Array44[Static592.anInt9569++] = new Class272(4, arg0, arg6, arg5, arg5, arg6, arg4, arg3, arg3, arg4, arg1, arg1, arg2, arg2);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIBIIZF)[[I")
	public static int[][] method4684(@OriginalArg(8) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class3_Sub8_Sub19 local18 = new Class3_Sub8_Sub19();
		local18.anInt6941 = 4;
		local18.anInt6939 = 4;
		local18.anInt6931 = (int) (arg0 * 4096.0F);
		local18.anInt6932 = 3;
		local18.aBoolean487 = false;
		local18.method8780();
		Static565.method7440(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method5879(local45, local14[local45]);
		}
		return local14;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
	public static void method4686() {
		Static667.aClass295_72.method6462(50);
		Static145.aClass295_11.method6462(50);
		Static427.aClass295_45.method6462(50);
		Static137.aClass295_10.method6462(50);
	}
}
