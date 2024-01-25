import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Z")
	public static boolean aBoolean293;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_56 = new Class32(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	public static int anInt3858 = 0;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "Lclient!bn;")
	public static Interface1 anInterface1_1 = null;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vc;B)V")
	public static void method3551(@OriginalArg(0) Class63 arg0) {
		if (Static63.anInt1264 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 && (Static64.aClass251ArrayArrayArray1 != null && Static241.method3899(arg0, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69))) {
			Static63.anInt1264 = Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()V")
	public static void method3553() {
		for (@Pc(1) int local1 = 0; local1 < Static167.anInt5330; local1++) {
			@Pc(6) Class1_Sub5 local6 = Static377.aClass1_Sub5Array5[local1];
			Static297.method4435(local6);
			Static377.aClass1_Sub5Array5[local1] = null;
		}
		Static167.anInt5330 = 0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Lclient!rn;)V")
	public static void method3555(@OriginalArg(1) Class18[] arg0) {
		Static141.anInt2849 = arg0.length;
		Static44.anIntArray183 = new int[Static141.anInt2849 + 10];
		Static382.aClass18Array14 = new Class18[Static141.anInt2849 + 10];
		Static399.method2486(arg0, 0, Static382.aClass18Array14, 0, Static141.anInt2849);
		for (@Pc(26) int local26 = 0; local26 < Static141.anInt2849; local26++) {
			Static44.anIntArray183[local26] = Static382.aClass18Array14[local26].method4560();
		}
		for (@Pc(45) int local45 = Static141.anInt2849; local45 < Static382.aClass18Array14.length; local45++) {
			Static44.anIntArray183[local45] = 12;
		}
	}
}
