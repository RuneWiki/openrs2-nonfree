import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
	public static int anInt6471;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	public static void method5243() {
		@Pc(12) Class4_Sub2_Sub17 local12 = Static34.method1709(15, 0);
		local12.method5523();
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)[Lclient!ni;")
	public static Class178[] method5245() {
		return new Class178[] { Static324.aClass178_18, Static194.aClass178_19, Static219.aClass178_13, Static26.aClass178_6, Static236.aClass178_15, Static39.aClass178_7 };
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)Z")
	public static boolean method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILclient!ta;)V")
	public static void method5247(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1) {
		Static278.aClass41Array3[arg0] = arg1;
	}
}
