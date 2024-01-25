import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class141_Sub1_Sub1 extends Class141_Sub1 {

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "Lclient!pda;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "Lclient!rl;")
	private final Class82_Sub3 aClass82_Sub3_20;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	private final int anInt8412;

	@OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
	private final int anInt8407;

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	private final int anInt8409;

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
	private final int anInt8410;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
	private final int anInt8408;

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
	private final int anInt8413;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!rl;IIIIII)V")
	public Class141_Sub1_Sub1(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass82_Sub3_20 = arg0;
		this.anInt8412 = arg3;
		this.anInt8407 = arg2;
		this.anInt8409 = arg5;
		this.anInt8410 = arg4;
		this.anInt8408 = arg6;
		this.anInt8413 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Lclient!pda;")
	@Override
	public Interface18 method7245() {
		if (this.anInterface18_1 == null) {
			Static544.anIntArray572[3] = this.anInt8410;
			@Pc(22) Interface5 local22 = this.aClass82_Sub3_20.anInterface5_9;
			Static544.anIntArray572[0] = this.anInt8413;
			Static544.anIntArray572[2] = this.anInt8412;
			Static544.anIntArray572[5] = this.anInt8408;
			Static544.anIntArray572[1] = this.anInt8407;
			Static544.anIntArray572[4] = this.anInt8409;
			@Pc(49) boolean local49 = false;
			@Pc(51) int local51 = 0;
			for (@Pc(53) int local53 = 0; local53 < 6; local53++) {
				if (!local22.method4130(Static544.anIntArray572[local53])) {
					return null;
				}
				@Pc(75) Class355 local75 = local22.method4129(Static544.anIntArray572[local53]);
				@Pc(82) int local82 = local75.aBoolean741 ? 64 : 128;
				if (local75.aByte123 > 0) {
					local49 = true;
				}
				if (local51 < local82) {
					local51 = local82;
				}
			}
			for (@Pc(105) int local105 = 0; local105 < 6; local105++) {
				Static477.anIntArrayArray50[local105] = local22.method4127(Static544.anIntArray572[local105], 1.0F, local51, local51, false);
			}
			this.anInterface18_1 = this.aClass82_Sub3_20.method5003(local51, Static477.anIntArrayArray50, local49);
		}
		return this.anInterface18_1;
	}
}
