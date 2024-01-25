import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static int anInt9708 = -1;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Lclient!cf;")
	public static final Class51 aClass51_18 = new Class51();

	@OriginalMember(owner = "client!da", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray33 = new boolean[100];

	@OriginalMember(owner = "client!da", name = "m", descriptor = "I")
	public static int anInt9715 = -1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pca;ILclient!pca;)V")
	public static void method7633(@OriginalArg(0) Class251 arg0, @OriginalArg(2) Class251 arg1) {
		@Pc(16) Class3_Sub10 local16 = Static129.method2403(Static452.aClass353_2, Static239.aClass287_73);
		local16.aClass3_Sub26_Sub1_1.method6826(arg0.anInt7279);
		local16.aClass3_Sub26_Sub1_1.method6800(arg0.anInt7254);
		local16.aClass3_Sub26_Sub1_1.method6800(arg1.anInt7268);
		local16.aClass3_Sub26_Sub1_1.method6770(arg1.anInt7279);
		local16.aClass3_Sub26_Sub1_1.method6820(arg1.anInt7254);
		local16.aClass3_Sub26_Sub1_1.method6795(arg0.anInt7268);
		Static193.method3398(local16);
	}
}
