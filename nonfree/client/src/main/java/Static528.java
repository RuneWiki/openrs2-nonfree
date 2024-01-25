import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[Lclient!ke;")
	public static Class186[] aClass186Array1;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!sea;")
	public static Class308 aClass308_179;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!gi;")
	public static final Class118 aClass118_3 = new Class118();

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Lclient!eg;")
	public static final Class77 aClass77_6 = new Class77();

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public static int anInt8967 = 0;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	public static int anInt8968 = -1;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Lclient!df;")
	public static Class59 method7270(@OriginalArg(1) int arg0) {
		@Pc(10) Class59 local10 = (Class59) Static469.aClass207_49.method4390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static390.aClass308_191.method6569(0, arg0);
		local10 = new Class59();
		if (local20 != null) {
			local10.method1370(new Class1_Sub3(local20));
		}
		local10.method1372();
		Static469.aClass207_49.method4391((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
	public static boolean method7272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static349.method5204(arg0, arg1) | (arg0 & 0x70000) != 0 || Static48.method6683(arg1, arg0);
	}
}
