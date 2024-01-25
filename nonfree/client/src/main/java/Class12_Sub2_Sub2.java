import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!fca;")
	private Class24_Sub3 aClass24_Sub3_2;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	private final int anInt4280;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	private final int anInt4278;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_27;

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
	private final int anInt4279;

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
	private final int anInt4275;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	private final int anInt4276;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
	private final int anInt4274;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!vj;IIIIII)V")
	public Class12_Sub2_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4280 = arg3;
		this.anInt4278 = arg2;
		this.aClass45_Sub3_27 = arg0;
		this.anInt4279 = arg5;
		this.anInt4275 = arg1;
		this.anInt4276 = arg6;
		this.anInt4274 = arg4;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Lclient!fca;")
	@Override
	public Class24_Sub3 method3734() {
		if (this.aClass24_Sub3_2 == null) {
			Static29.anIntArray562[1] = this.anInt4278;
			Static29.anIntArray562[4] = this.anInt4279;
			@Pc(28) Interface3 local28 = this.aClass45_Sub3_27.anInterface3_12;
			Static29.anIntArray562[5] = this.anInt4276;
			Static29.anIntArray562[2] = this.anInt4280;
			Static29.anIntArray562[3] = this.anInt4274;
			Static29.anIntArray562[0] = this.anInt4275;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method4774(Static29.anIntArray562[local54])) {
					return null;
				}
				@Pc(72) Class55 local72 = local28.method4776(Static29.anIntArray562[local54]);
				@Pc(79) int local79 = local72.aBoolean141 ? 64 : 128;
				if (local72.aByte19 > 0) {
					local50 = true;
				}
				if (local79 > local52) {
					local52 = local79;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static310.anIntArrayArray120[local101] = local28.method4779(local52, false, 1.0F, local52, Static29.anIntArray562[local101]);
			}
			this.aClass24_Sub3_2 = new Class24_Sub3(this.aClass45_Sub3_27, 6407, local52, local50, Static310.anIntArrayArray120);
		}
		return this.aClass24_Sub3_2;
	}
}
