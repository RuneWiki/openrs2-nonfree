import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class30_Sub1_Sub2 extends Class30_Sub1 {

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!dl;")
	private Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	private final int anInt4709;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	private final int anInt4716;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	private final int anInt4713;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	private final int anInt4711;

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
	private final int anInt4714;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_28;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	private final int anInt4712;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!da;IIIIII)V")
	public Class30_Sub1_Sub2(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4709 = arg2;
		this.anInt4716 = arg1;
		this.anInt4713 = arg5;
		this.anInt4711 = arg3;
		this.anInt4714 = arg4;
		this.aClass50_Sub1_28 = arg0;
		this.anInt4712 = arg6;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Lclient!dl;")
	@Override
	public Class4_Sub2 method3802() {
		if (this.aClass4_Sub2_2 == null) {
			Static63.anIntArray95[5] = this.anInt4712;
			Static63.anIntArray95[4] = this.anInt4713;
			Static63.anIntArray95[0] = this.anInt4716;
			Static63.anIntArray95[2] = this.anInt4711;
			Static63.anIntArray95[3] = this.anInt4714;
			Static63.anIntArray95[1] = this.anInt4709;
			@Pc(47) Interface7 local47 = this.aClass50_Sub1_28.anInterface7_8;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local47.method4450(Static63.anIntArray95[local53])) {
					return null;
				}
				@Pc(71) Class259 local71 = local47.method4447(Static63.anIntArray95[local53]);
				@Pc(78) int local78 = local71.aBoolean474 ? 64 : 128;
				if (local51 < local78) {
					local51 = local78;
				}
				if (local71.aByte103 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(97) int local97 = 0; local97 < 6; local97++) {
				Static427.anIntArrayArray67[local97] = local47.method4448(false, local51, 1.0F, Static63.anIntArray95[local97], local51);
			}
			this.aClass4_Sub2_2 = new Class4_Sub2(this.aClass50_Sub1_28, 6407, local51, local49 != 0, Static427.anIntArrayArray67);
		}
		return this.aClass4_Sub2_2;
	}
}
