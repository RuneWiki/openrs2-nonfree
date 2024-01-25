import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "J")
	public static long aLong225;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!ri;")
	public static Class284 aClass284_140;

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "[I")
	public static final int[] anIntArray492 = new int[2048];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method6544() {
		@Pc(5) Class342 local5 = Static254.aClass342_96;
		synchronized (Static254.aClass342_96) {
			Static254.aClass342_96.method7687();
		}
		local5 = Static424.aClass342_187;
		synchronized (Static424.aClass342_187) {
			Static424.aClass342_187.method7687();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!pca;Z)V")
	public static void method6546(@OriginalArg(1) Class251 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt7234 == 0 ? arg0.anInt7285 : arg0.anInt7234;
		@Pc(25) int local25 = arg0.anInt7202 == 0 ? arg0.anInt7215 : arg0.anInt7202;
		Static501.method6727(local16, local25, arg0.anInt7279, arg1, Static449.aClass251ArrayArray1[arg0.anInt7279 >> 16]);
		if (arg0.aClass251Array3 != null) {
			Static501.method6727(local16, local25, arg0.anInt7279, arg1, arg0.aClass251Array3);
		}
		@Pc(58) Class3_Sub49 local58 = (Class3_Sub49) Static204.aClass297_16.method6531((long) arg0.anInt7279);
		if (local58 != null) {
			Static435.method6003(local16, arg1, local58.anInt9244, local25);
		}
	}
}
