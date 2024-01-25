import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "Lclient!nq;")
	public static Class144 aClass144_92;

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_98 = new Class117("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(BI)Lclient!eq;")
	public static Class11_Sub4_Sub6 method4771(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4_Sub6 local10 = (Class11_Sub4_Sub6) Static42.aClass142_4.method3874((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static306.aClass144_97.method3896(arg0, 11);
		local10 = new Class11_Sub4_Sub6();
		if (local20 != null) {
			local10.method1177(new Class11_Sub25(local20));
		}
		Static42.aClass142_4.method3870(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)V")
	public static void method4772() {
		if (Static88.aBoolean94) {
			return;
		}
		Static147.method2248(Static293.aClass106ArrayArrayArray3);
		if (Static118.aClass106ArrayArrayArray1 != null) {
			Static147.method2248(Static118.aClass106ArrayArrayArray1);
		}
		Static88.aBoolean94 = true;
	}
}
