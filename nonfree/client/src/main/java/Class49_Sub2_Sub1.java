import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class49_Sub2_Sub1 extends Class49_Sub2 {

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!nn;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	private final int anInt9935;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	private final int anInt9940;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	private final int anInt9933;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
	private final int anInt9932;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	private final int anInt9934;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	private final int anInt9938;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!ij;")
	private final Class13_Sub3 aClass13_Sub3_21;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ij;IIIIII)V")
	public Class49_Sub2_Sub1(@OriginalArg(0) Class13_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9935 = arg2;
		this.anInt9940 = arg4;
		this.anInt9933 = arg5;
		this.anInt9932 = arg6;
		this.anInt9934 = arg1;
		this.anInt9938 = arg3;
		this.aClass13_Sub3_21 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lclient!nn;")
	@Override
	public Interface19 method8441() {
		if (this.anInterface19_1 == null) {
			@Pc(12) Interface2 local12 = this.aClass13_Sub3_21.anInterface2_12;
			Static604.anIntArray707[2] = this.anInt9938;
			Static604.anIntArray707[0] = this.anInt9934;
			Static604.anIntArray707[4] = this.anInt9933;
			Static604.anIntArray707[5] = this.anInt9932;
			Static604.anIntArray707[3] = this.anInt9940;
			Static604.anIntArray707[1] = this.anInt9935;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local12.method6026(Static604.anIntArray707[local48])) {
					return null;
				}
				@Pc(66) Class271 local66 = local12.method6027(Static604.anIntArray707[local48]);
				@Pc(73) int local73 = local66.aBoolean516 ? 64 : 128;
				if (local73 > local46) {
					local46 = local73;
				}
				if (local66.aByte96 > 0) {
					local44 = true;
				}
			}
			for (@Pc(94) int local94 = 0; local94 < 6; local94++) {
				Static538.anIntArrayArray106[local94] = local12.method6024(local46, Static604.anIntArray707[local94], false, local46, 1.0F);
			}
			this.anInterface19_1 = this.aClass13_Sub3_21.method8305(local46, local44, Static538.anIntArrayArray106);
		}
		return this.anInterface19_1;
	}
}
