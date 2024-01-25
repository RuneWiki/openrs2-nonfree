import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "[S")
	public static short[] aShortArray143;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_15 = new Class179(10, 2, 2, 0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V")
	public static void method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(4, arg0);
		local8.method3256();
		local8.anInt3734 = arg2;
		local8.anInt3739 = arg1;
		local8.anInt3740 = arg3;
	}
}
