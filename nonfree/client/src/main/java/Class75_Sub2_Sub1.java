import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class75_Sub2_Sub1 extends Class75_Sub2 {

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "Lclient!ul;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	private final int anInt6941;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	private final int anInt6942;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_11;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	private final int anInt6937;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	private final int anInt6938;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	private final int anInt6940;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	private final int anInt6939;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ej;IIIIII)V")
	public Class75_Sub2_Sub1(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6941 = arg5;
		this.anInt6942 = arg1;
		this.aClass66_Sub1_11 = arg0;
		this.anInt6937 = arg3;
		this.anInt6938 = arg4;
		this.anInt6940 = arg6;
		this.anInt6939 = arg2;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!ul;")
	@Override
	public Interface22 method5791() {
		if (this.anInterface22_1 == null) {
			Static554.anIntArray701[3] = this.anInt6938;
			Static554.anIntArray701[5] = this.anInt6940;
			@Pc(28) Interface3 local28 = this.aClass66_Sub1_11.anInterface3_15;
			Static554.anIntArray701[1] = this.anInt6939;
			Static554.anIntArray701[2] = this.anInt6937;
			Static554.anIntArray701[0] = this.anInt6942;
			Static554.anIntArray701[4] = this.anInt6941;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method7248(Static554.anIntArray701[local54])) {
					return null;
				}
				@Pc(72) Class271 local72 = local28.method7249(Static554.anIntArray701[local54]);
				@Pc(79) int local79 = local72.aBoolean516 ? 64 : 128;
				if (local79 > local52) {
					local52 = local79;
				}
				if (local72.aByte85 > 0) {
					local50 = 1;
				}
			}
			for (@Pc(100) int local100 = 0; local100 < 6; local100++) {
				Static454.anIntArrayArray65[local100] = local28.method7250(local52, false, Static554.anIntArray701[local100], 1.0F, local52);
			}
			this.anInterface22_1 = this.aClass66_Sub1_11.method6922(local50 != 0, local52, Static454.anIntArrayArray65);
		}
		return this.anInterface22_1;
	}
}
