import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	public static int anInt8866;

	@OriginalMember(owner = "client!us", name = "c", descriptor = "Lclient!su;")
	public static final Class298 aClass298_190 = new Class298();

	@OriginalMember(owner = "client!us", name = "j", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	public static int anInt8867 = 0;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!uea;I)V")
	public static void method7059(@OriginalArg(0) Class15_Sub2_Sub4_Sub2 arg0) {
		@Pc(11) Class6_Sub34 local11 = (Class6_Sub34) Static149.aClass234_31.method5464((long) arg0.anInt8924);
		if (local11 == null) {
			Static90.method4176(arg0, 0, null, arg0.anIntArray638[0], arg0.aByte98, null, arg0.anIntArray637[0]);
		} else {
			local11.method5517();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public static void method7061() {
		if (Static338.aClass45_6 != Static9.aClass45_1) {
			try {
				Static594.method6348("tbrefresh", Static536.aClient1);
			} catch (@Pc(20) Throwable local20) {
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V")
	public static void method7062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		method7063(Static273.aClass316_61);
		Static340.aClass6_Sub12_Sub2_1.method6041(arg1);
		Static340.aClass6_Sub12_Sub2_1.method6006(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!uc;)V")
	public static void method7063(@OriginalArg(1) Class316 arg0) {
		Static340.aClass6_Sub12_Sub2_1.method6062(arg0.method7072());
	}
}
