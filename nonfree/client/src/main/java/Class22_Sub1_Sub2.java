import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class22_Sub1_Sub2 extends Class22_Sub1 {

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!vk;")
	private Class124_Sub3 aClass124_Sub3_2;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private final int anInt6654;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private final int anInt6657;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private final int anInt6658;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private final int anInt6653;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	private final int anInt6656;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	private final int anInt6655;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_39;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!ao;IIIIII)V")
	public Class22_Sub1_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6654 = arg2;
		this.anInt6657 = arg4;
		this.anInt6658 = arg1;
		this.anInt6653 = arg3;
		this.anInt6656 = arg6;
		this.anInt6655 = arg5;
		this.aClass4_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lclient!vk;")
	@Override
	public Class124_Sub3 method5765() {
		if (this.aClass124_Sub3_2 == null) {
			Static329.anIntArray490[5] = this.anInt6656;
			Static329.anIntArray490[0] = this.anInt6658;
			Static329.anIntArray490[3] = this.anInt6657;
			Static329.anIntArray490[1] = this.anInt6654;
			Static329.anIntArray490[2] = this.anInt6653;
			Static329.anIntArray490[4] = this.anInt6655;
			@Pc(44) Interface7 local44 = this.aClass4_Sub1_39.anInterface7_1;
			@Pc(46) boolean local46 = false;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50;
			for (local50 = 0; local50 < 6; local50++) {
				if (!local44.method5780(Static329.anIntArray490[local50])) {
					return null;
				}
				@Pc(71) Class213 local71 = local44.method5778(Static329.anIntArray490[local50]);
				@Pc(78) int local78 = local71.aBoolean609 ? 64 : 128;
				if (local71.aByte74 > 0) {
					local46 = true;
				}
				if (local48 < local78) {
					local48 = local78;
				}
			}
			for (local50 = 0; local50 < 6; local50++) {
				Static329.anIntArrayArray181[local50] = local44.method5777(local48, 1.0F, Static329.anIntArray490[local50], local48, false);
			}
			this.aClass124_Sub3_2 = new Class124_Sub3(this.aClass4_Sub1_39, 6407, local48, local46, Static329.anIntArrayArray181);
		}
		return this.aClass124_Sub3_2;
	}
}
