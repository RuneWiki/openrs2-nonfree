import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 {

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "Lclient!ci;")
	private Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "I")
	private final int anInt4499;

	@OriginalMember(owner = "client!jca", name = "r", descriptor = "I")
	private final int anInt4498;

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
	private final int anInt4500;

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
	private final int anInt4495;

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_19;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "I")
	private final int anInt4494;

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
	private final int anInt4502;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!te;IIIIII)V")
	public Class25_Sub1_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4499 = arg5;
		this.anInt4498 = arg3;
		this.anInt4500 = arg4;
		this.anInt4495 = arg1;
		this.aClass9_Sub3_19 = arg0;
		this.anInt4494 = arg2;
		this.anInt4502 = arg6;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Lclient!ci;")
	@Override
	public Class20_Sub2 method3934() {
		if (this.aClass20_Sub2_2 == null) {
			Static513.anIntArray741[0] = this.anInt4495;
			Static513.anIntArray741[2] = this.anInt4498;
			@Pc(28) Interface8 local28 = this.aClass9_Sub3_19.anInterface8_13;
			Static513.anIntArray741[4] = this.anInt4499;
			Static513.anIntArray741[5] = this.anInt4502;
			Static513.anIntArray741[3] = this.anInt4500;
			Static513.anIntArray741[1] = this.anInt4494;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method7084(Static513.anIntArray741[local54])) {
					return null;
				}
				@Pc(74) Class175 local74 = local28.method7085(Static513.anIntArray741[local54]);
				@Pc(81) int local81 = local74.aBoolean354 ? 64 : 128;
				if (local74.aByte55 > 0) {
					local50 = 1;
				}
				if (local52 < local81) {
					local52 = local81;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static485.anIntArrayArray76[local99] = local28.method7088(local52, false, local52, 1.0F, Static513.anIntArray741[local99]);
			}
			this.aClass20_Sub2_2 = new Class20_Sub2(this.aClass9_Sub3_19, 6407, local52, local50 != 0, Static485.anIntArrayArray76);
		}
		return this.aClass20_Sub2_2;
	}
}
