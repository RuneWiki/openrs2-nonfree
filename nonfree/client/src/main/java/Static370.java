import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "Lclient!sa;")
	public static Class299 aClass299_6;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "Lclient!bi;")
	public static Class31 aClass31_81;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	public static int anInt6653 = 0;

	@OriginalMember(owner = "client!oba", name = "k", descriptor = "Lclient!db;")
	public static final Class64 aClass64_322 = new Class64(48, 0);

	@OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
	public static final int[] anIntArray534 = new int[2];

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLclient!eh;)Lclient!oba;")
	public static Class170_Sub1 method5549(@OriginalArg(1) Class4_Sub9 arg0) {
		return new Class170_Sub1(arg0.method6003(), arg0.method6003(), arg0.method6003(), arg0.method6003(), arg0.method6023(), arg0.method6023(), arg0.method6015());
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)V")
	public static void method5550(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub7_Sub5 local14 = Static218.method3780(1, arg0);
		local14.method3062();
	}
}
