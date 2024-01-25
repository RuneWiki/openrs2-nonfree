import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
	public static final int anInt4056 = 1408;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!fca;I)V")
	public static void method3457(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method4841();
		Static520.aClass331Array5 = new Class331[local9];
		for (@Pc(20) int local20 = 0; local20 < local9; local20++) {
			Static520.aClass331Array5[local20] = new Class331();
			Static520.aClass331Array5[local20].anInt9038 = arg0.method4841();
			Static520.aClass331Array5[local20].aString113 = arg0.method4890();
		}
		Static414.anInt7011 = arg0.method4841();
		Static119.anInt2334 = arg0.method4841();
		Static120.anInt2362 = arg0.method4841();
		Static559.aClass31_Sub1Array6 = new Class31_Sub1[Static119.anInt2334 + 1 - Static414.anInt7011];
		for (@Pc(72) int local72 = 0; local72 < Static120.anInt2362; local72++) {
			@Pc(78) int local78 = arg0.method4841();
			@Pc(86) Class31_Sub1 local86 = Static559.aClass31_Sub1Array6[local78] = new Class31_Sub1();
			local86.anInt10054 = arg0.method4888();
			local86.anInt10058 = arg0.method4868();
			local86.anInt10062 = Static414.anInt7011 + local78;
			local86.aString129 = arg0.method4890();
			local86.aString130 = arg0.method4890();
		}
		Static173.anInt3296 = arg0.method4868();
		Static50.aBoolean124 = true;
	}
}
