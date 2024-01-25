import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "[I")
	public static final int[] anIntArray577 = new int[200];

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_147 = new Class287(66, 8);

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject19 = null;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
	public static void method7852() {
		Static527.aClass342_205.method7693();
		Static472.aClass342_164.method7693();
		Static294.aClass342_114.method7693();
		Static465.aClass342_160.method7693();
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
	public static void method7854() {
		if (Static372.anIntArray362 != null && Static392.anIntArray389 != null) {
			return;
		}
		Static392.anIntArray389 = new int[256];
		Static372.anIntArray362 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static372.anIntArray362[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static392.anIntArray389[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!bm;Lclient!bm;)V")
	public static void method7856(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_62 != null) {
			arg1.method8136();
		}
		arg1.aClass3_Sub7_61 = arg0.aClass3_Sub7_61;
		arg1.aClass3_Sub7_62 = arg0;
		arg1.aClass3_Sub7_62.aClass3_Sub7_61 = arg1;
		arg1.aClass3_Sub7_61.aClass3_Sub7_62 = arg1;
	}
}
