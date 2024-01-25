import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "Lclient!po;")
	public static Class281 aClass281_3;

	@OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
	public static int anInt3523;

	@OriginalMember(owner = "client!gha", name = "m", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_64 = new Class126(62, 16);

	@OriginalMember(owner = "client!gha", name = "q", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_65 = new Class126(59, 4);

	@OriginalMember(owner = "client!gha", name = "r", descriptor = "[I")
	public static final int[] anIntArray244 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)V")
	public static void method3089(@OriginalArg(0) int arg0) {
		Static405.anInt6913 = arg0;
		@Pc(14) Class279 local14 = Static415.aClass279_37;
		synchronized (Static415.aClass279_37) {
			Static415.aClass279_37.method6638();
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!fca;I)Lclient!wv;")
	public static Class84_Sub3 method3091(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(12) Class84 local12 = Static227.method3653(arg0);
		@Pc(16) int local16 = arg0.method4868();
		@Pc(20) int local20 = arg0.method4868();
		@Pc(26) int local26 = arg0.method4858();
		return new Class84_Sub3(local12.aClass92_13, local12.aClass65_17, local12.anInt10347, local12.anInt10345, local12.anInt10343, local12.anInt10342, local12.anInt10344, local12.anInt10346, local12.anInt10349, local16, local20, local26);
	}
}
