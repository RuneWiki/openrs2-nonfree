import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class47_Sub2_Sub1 extends Class47_Sub2 {

	@OriginalMember(owner = "client!fja", name = "s", descriptor = "Lclient!vr;")
	private Class161_Sub4 aClass161_Sub4_1;

	@OriginalMember(owner = "client!fja", name = "o", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_9;

	@OriginalMember(owner = "client!fja", name = "t", descriptor = "I")
	private final int anInt2559;

	@OriginalMember(owner = "client!fja", name = "u", descriptor = "I")
	private final int anInt2561;

	@OriginalMember(owner = "client!fja", name = "w", descriptor = "I")
	private final int anInt2560;

	@OriginalMember(owner = "client!fja", name = "n", descriptor = "I")
	private final int anInt2555;

	@OriginalMember(owner = "client!fja", name = "p", descriptor = "I")
	private final int anInt2557;

	@OriginalMember(owner = "client!fja", name = "m", descriptor = "I")
	private final int anInt2563;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!pi;IIIIII)V")
	public Class47_Sub2_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass144_Sub3_9 = arg0;
		this.anInt2559 = arg1;
		this.anInt2561 = arg5;
		this.anInt2560 = arg4;
		this.anInt2555 = arg2;
		this.anInt2557 = arg3;
		this.anInt2563 = arg6;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)Lclient!vr;")
	@Override
	public Class161_Sub4 method8702() {
		if (this.aClass161_Sub4_1 == null) {
			@Pc(17) Interface4 local17 = this.aClass144_Sub3_9.anInterface4_12;
			Static478.anIntArray423[5] = this.anInt2563;
			Static478.anIntArray423[0] = this.anInt2559;
			Static478.anIntArray423[1] = this.anInt2555;
			Static478.anIntArray423[4] = this.anInt2561;
			Static478.anIntArray423[3] = this.anInt2560;
			Static478.anIntArray423[2] = this.anInt2557;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local17.method8974(Static478.anIntArray423[local53])) {
					return null;
				}
				@Pc(76) Class69 local76 = local17.method8975(Static478.anIntArray423[local53]);
				@Pc(84) int local84 = local76.aBoolean113 ? 64 : 128;
				if (local84 > local51) {
					local51 = local84;
				}
				if (local76.aByte21 > 0) {
					local49 = true;
				}
			}
			for (@Pc(109) int local109 = 0; local109 < 6; local109++) {
				Static84.anIntArrayArray11[local109] = local17.method8977(1.0F, Static478.anIntArray423[local109], local51, local51, false);
			}
			this.aClass161_Sub4_1 = new Class161_Sub4(this.aClass144_Sub3_9, 6407, local51, local49, Static84.anIntArrayArray11);
		}
		return this.aClass161_Sub4_1;
	}
}
