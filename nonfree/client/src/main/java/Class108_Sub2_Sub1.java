import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class108_Sub2_Sub1 extends Class108_Sub2 {

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!tda;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	private final int anInt9837;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	private final int anInt9843;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	private final int anInt9840;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!fc;")
	private final Class15_Sub2 aClass15_Sub2_19;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	private final int anInt9839;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	private final int anInt9836;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	private final int anInt9842;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!fc;IIIIII)V")
	public Class108_Sub2_Sub1(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9837 = arg1;
		this.anInt9843 = arg4;
		this.anInt9840 = arg3;
		this.aClass15_Sub2_19 = arg0;
		this.anInt9839 = arg2;
		this.anInt9836 = arg5;
		this.anInt9842 = arg6;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lclient!tda;")
	@Override
	public Interface18 method8001() {
		if (this.anInterface18_1 == null) {
			Static263.anIntArray340[3] = this.anInt9843;
			Static263.anIntArray340[5] = this.anInt9842;
			Static263.anIntArray340[4] = this.anInt9836;
			Static263.anIntArray340[2] = this.anInt9840;
			Static263.anIntArray340[1] = this.anInt9839;
			@Pc(42) Interface4 local42 = this.aClass15_Sub2_19.anInterface4_11;
			Static263.anIntArray340[0] = this.anInt9837;
			@Pc(49) byte local49 = 0;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local42.method3090(Static263.anIntArray340[local53])) {
					return null;
				}
				@Pc(71) Class178 local71 = local42.method3088(Static263.anIntArray340[local53]);
				@Pc(78) int local78 = local71.aBoolean486 ? 64 : 128;
				if (local78 > local51) {
					local51 = local78;
				}
				if (local71.aByte53 > 0) {
					local49 = 1;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static486.anIntArrayArray74[local94] = local42.method3086(local51, false, 1.0F, local51, Static263.anIntArray340[local94]);
			}
			this.anInterface18_1 = this.aClass15_Sub2_19.method5463(local51, Static486.anIntArrayArray74, local49 != 0);
		}
		return this.anInterface18_1;
	}
}
