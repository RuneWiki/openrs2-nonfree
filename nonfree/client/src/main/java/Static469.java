import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!pp", name = "kb", descriptor = "Lclient!bu;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "[Lclient!laa;")
	public static Class60_Sub1_Sub1[] aClass60_Sub1_Sub1Array1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!pp", name = "A", descriptor = "Ljava/lang/Class;")
	public static Class aClass16;

	@OriginalMember(owner = "client!pp", name = "ib", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_143 = new Class322(64, 20);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBII)V")
	public static void method7073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg1, 9);
		local9.method2040();
		local9.anInt2111 = arg0;
		local9.anInt2113 = arg2;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIILclient!ka;I)Lclient!sba;")
	public static Class323 method7078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class54 arg3) {
		return arg3 == null ? null : new Class323(arg0, arg2, arg1, arg3.na(), arg3.V(), arg3.RA(), arg3.fa(), arg3.EA(), arg3.HA(), arg3.G());
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)Z")
	public static boolean method7081() {
		return Static34.method446("jaclib") ? Static34.method446("hw3d") : false;
	}
}
