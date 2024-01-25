import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

	@OriginalMember(owner = "client!jl", name = "Q", descriptor = "Lclient!d;")
	public static final Class44 aClass44_32 = new Class44(260);

	@OriginalMember(owner = "client!jl", name = "S", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_81 = new Class129(69, -2);

	@OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
	public static final int anInt3340 = 1338;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public static void method2683() {
		Static316.aBoolean342 = false;
		Static286.anIntArray346 = null;
		Static236.anIntArray248 = null;
		Static410.anIntArray466 = null;
		Static273.anIntArray337 = null;
		Static205.anIntArray207 = null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBLclient!tt;I[IZ)Lclient!f;")
	public static Class31_Sub1_Sub1 method2685(@OriginalArg(0) int arg0, @OriginalArg(2) Class200_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1.aBoolean429 || Static147.method2135(arg0) && Static147.method2135(arg2)) {
			return new Class31_Sub1_Sub1(arg1, 3553, arg0, arg2, false, arg3);
		} else if (arg1.aBoolean432) {
			return new Class31_Sub1_Sub1(arg1, 34037, arg0, arg2, false, arg3);
		} else {
			return new Class31_Sub1_Sub1(arg1, arg0, arg2, Static331.method4084(arg0), Static331.method4084(arg2), arg3);
		}
	}
}
