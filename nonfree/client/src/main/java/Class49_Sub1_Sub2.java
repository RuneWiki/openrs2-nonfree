import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class49_Sub1_Sub2 extends Class49_Sub1 {

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "Lclient!kk;")
	private Class10_Sub3 aClass10_Sub3_2;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "I")
	private final int anInt8827;

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "I")
	private final int anInt8829;

	@OriginalMember(owner = "client!tga", name = "r", descriptor = "I")
	private final int anInt8831;

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
	private final int anInt8828;

	@OriginalMember(owner = "client!tga", name = "t", descriptor = "I")
	private final int anInt8833;

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_40;

	@OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
	private final int anInt8832;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lclient!bi;IIIIII)V")
	public Class49_Sub1_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt8827 = arg2;
		this.anInt8829 = arg3;
		this.anInt8831 = arg4;
		this.anInt8828 = arg1;
		this.anInt8833 = arg6;
		this.aClass13_Sub2_40 = arg0;
		this.anInt8832 = arg5;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Lclient!kk;")
	@Override
	public Class10_Sub3 method7566() {
		if (this.aClass10_Sub3_2 == null) {
			Static445.anIntArray495[3] = this.anInt8831;
			@Pc(23) Interface2 local23 = this.aClass13_Sub2_40.anInterface2_12;
			Static445.anIntArray495[2] = this.anInt8829;
			Static445.anIntArray495[1] = this.anInt8827;
			Static445.anIntArray495[5] = this.anInt8833;
			Static445.anIntArray495[4] = this.anInt8832;
			Static445.anIntArray495[0] = this.anInt8828;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local23.method6026(Static445.anIntArray495[local54])) {
					return null;
				}
				@Pc(72) Class271 local72 = local23.method6027(Static445.anIntArray495[local54]);
				@Pc(79) int local79 = local72.aBoolean516 ? 64 : 128;
				if (local79 > local52) {
					local52 = local79;
				}
				if (local72.aByte96 > 0) {
					local50 = 1;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static513.anIntArrayArray105[local99] = local23.method6024(local52, Static445.anIntArray495[local99], false, local52, 1.0F);
			}
			this.aClass10_Sub3_2 = new Class10_Sub3(this.aClass13_Sub2_40, 6407, local52, local50 != 0, Static513.anIntArrayArray105);
		}
		return this.aClass10_Sub3_2;
	}
}
