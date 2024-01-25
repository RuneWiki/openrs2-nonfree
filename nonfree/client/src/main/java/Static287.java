import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kq", name = "U", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!kq", name = "W", descriptor = "Lclient!pl;")
	public static Class259 aClass259_86;

	@OriginalMember(owner = "client!kq", name = "O", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_97 = new Class286(41, 7);

	@OriginalMember(owner = "client!kq", name = "S", descriptor = "[I")
	public static final int[] anIntArray362 = new int[50];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLclient!es;)Lclient!bw;")
	public static Class9_Sub2 method4270(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(7) Class9 local7 = Static295.method7119(arg0);
		@Pc(11) int local11 = arg0.method4307();
		@Pc(15) int local15 = arg0.method4307();
		@Pc(19) int local19 = arg0.method4294();
		return new Class9_Sub2(local7.aClass62_10, local7.aClass279_9, local7.anInt5035, local7.anInt5029, local7.anInt5034, local7.anInt5030, local7.anInt5032, local7.anInt5027, local7.anInt5031, local11, local15, local19);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static67.method1100(arg0, arg1) & Static242.method3758(arg0, arg1);
	}
}
