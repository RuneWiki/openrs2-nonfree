import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class114_Sub1_Sub2 extends Class114_Sub1 {

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!hp;")
	private Class20_Sub2 aClass20_Sub2_2;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_31;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	private final int anInt4578;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	private final int anInt4581;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private final int anInt4576;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	private final int anInt4579;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	private final int anInt4577;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private final int anInt4580;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!h;IIIIII)V")
	public Class114_Sub1_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass32_Sub2_31 = arg0;
		this.anInt4578 = arg5;
		this.anInt4581 = arg1;
		this.anInt4576 = arg3;
		this.anInt4579 = arg6;
		this.anInt4577 = arg2;
		this.anInt4580 = arg4;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lclient!hp;")
	@Override
	public Class20_Sub2 method4118() {
		if (this.aClass20_Sub2_2 == null) {
			Static215.anIntArray411[3] = this.anInt4580;
			Static215.anIntArray411[4] = this.anInt4578;
			Static215.anIntArray411[2] = this.anInt4576;
			Static215.anIntArray411[0] = this.anInt4581;
			Static215.anIntArray411[1] = this.anInt4577;
			@Pc(39) Interface2 local39 = this.aClass32_Sub2_31.anInterface2_4;
			Static215.anIntArray411[5] = this.anInt4579;
			@Pc(46) byte local46 = 0;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50;
			for (local50 = 0; local50 < 6; local50++) {
				if (!local39.method4241(Static215.anIntArray411[local50])) {
					return null;
				}
				@Pc(69) Class154 local69 = local39.method4244(Static215.anIntArray411[local50]);
				@Pc(76) int local76 = local69.aBoolean440 ? 64 : 128;
				if (local76 > local48) {
					local48 = local76;
				}
				if (local69.aByte36 > 0) {
					local46 = 1;
				}
			}
			for (local50 = 0; local50 < 6; local50++) {
				Static215.anIntArrayArray51[local50] = local39.method4243(local48, Static215.anIntArray411[local50], 1.0F, local48, false);
			}
			this.aClass20_Sub2_2 = new Class20_Sub2(this.aClass32_Sub2_31, 6407, local48, local46 != 0, Static215.anIntArrayArray51);
		}
		return this.aClass20_Sub2_2;
	}
}
