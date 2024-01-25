import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class66_Sub2_Sub1 extends Class66_Sub2 {

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "Lclient!wn;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
	private final int anInt6732;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
	private final int anInt6733;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_15;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	private final int anInt6738;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	private final int anInt6737;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
	private final int anInt6739;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	private final int anInt6734;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!tu;IIIIII)V")
	public Class66_Sub2_Sub1(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6732 = arg1;
		this.anInt6733 = arg4;
		this.aClass5_Sub3_15 = arg0;
		this.anInt6738 = arg2;
		this.anInt6737 = arg6;
		this.anInt6739 = arg5;
		this.anInt6734 = arg3;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Lclient!wn;")
	@Override
	public Interface20 method5629() {
		if (this.anInterface20_1 == null) {
			@Pc(17) Interface4 local17 = this.aClass5_Sub3_15.anInterface4_14;
			Static81.anIntArray203[2] = this.anInt6734;
			Static81.anIntArray203[0] = this.anInt6732;
			Static81.anIntArray203[4] = this.anInt6739;
			Static81.anIntArray203[3] = this.anInt6733;
			Static81.anIntArray203[5] = this.anInt6737;
			Static81.anIntArray203[1] = this.anInt6738;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method6708(Static81.anIntArray203[local53])) {
					return null;
				}
				@Pc(71) Class238 local71 = local17.method6712(Static81.anIntArray203[local53]);
				@Pc(78) int local78 = local71.aBoolean466 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte72 > 0) {
					local49 = true;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static200.anIntArrayArray89[local99] = local17.method6711(local51, 1.0F, Static81.anIntArray203[local99], local51, false);
			}
			this.anInterface20_1 = this.aClass5_Sub3_15.method6379(local49, local51, Static200.anIntArrayArray89);
		}
		return this.anInterface20_1;
	}
}
