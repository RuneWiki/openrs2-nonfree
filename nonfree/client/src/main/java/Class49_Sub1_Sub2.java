import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class49_Sub1_Sub2 extends Class49_Sub1 {

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Lclient!g;")
	private Class70_Sub2 aClass70_Sub2_2;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	private final int anInt5641;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	private final int anInt5636;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	private final int anInt5640;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
	private final int anInt5637;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_35;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	private final int anInt5639;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	private final int anInt5638;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ql;IIIIII)V")
	public Class49_Sub1_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt5641 = arg5;
		this.anInt5636 = arg6;
		this.anInt5640 = arg1;
		this.anInt5637 = arg2;
		this.aClass92_Sub2_35 = arg0;
		this.anInt5639 = arg3;
		this.anInt5638 = arg4;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lclient!g;")
	@Override
	public Class70_Sub2 method4781() {
		if (this.aClass70_Sub2_2 == null) {
			Static278.anIntArray458[2] = this.anInt5639;
			Static278.anIntArray458[3] = this.anInt5638;
			Static278.anIntArray458[1] = this.anInt5637;
			Static278.anIntArray458[0] = this.anInt5640;
			Static278.anIntArray458[5] = this.anInt5636;
			@Pc(31) Interface1 local31 = this.aClass92_Sub2_35.anInterface1_6;
			Static278.anIntArray458[4] = this.anInt5641;
			@Pc(38) boolean local38 = false;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42;
			for (local42 = 0; local42 < 6; local42++) {
				if (!local31.method5637(Static278.anIntArray458[local42])) {
					return null;
				}
				@Pc(64) Class135 local64 = local31.method5634(Static278.anIntArray458[local42]);
				@Pc(71) int local71 = local64.aBoolean360 ? 64 : 128;
				if (local64.aByte48 > 0) {
					local38 = true;
				}
				if (local71 > local40) {
					local40 = local71;
				}
			}
			for (local42 = 0; local42 < 6; local42++) {
				Static278.anIntArrayArray54[local42] = local31.method5633(false, local40, local40, 1.0F, Static278.anIntArray458[local42]);
			}
			this.aClass70_Sub2_2 = new Class70_Sub2(this.aClass92_Sub2_35, 6407, local40, local38, Static278.anIntArrayArray54);
		}
		return this.aClass70_Sub2_2;
	}
}
