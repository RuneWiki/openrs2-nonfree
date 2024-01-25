import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class45_Sub2_Sub1 extends Class45_Sub2 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "Lclient!sk;")
	private Class73_Sub4 aClass73_Sub4_1;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	private final int anInt6822;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private final int anInt6821;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	private final int anInt6825;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	private final int anInt6824;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	private final int anInt6820;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	private final int anInt6823;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_28;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!uq;IIIIII)V")
	public Class45_Sub2_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6822 = arg5;
		this.anInt6821 = arg1;
		this.anInt6825 = arg4;
		this.anInt6824 = arg6;
		this.anInt6820 = arg2;
		this.anInt6823 = arg3;
		this.aClass122_Sub3_28 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lclient!sk;")
	@Override
	public Class73_Sub4 method6134() {
		if (this.aClass73_Sub4_1 == null) {
			Static538.anIntArray838[0] = this.anInt6821;
			@Pc(23) Interface8 local23 = this.aClass122_Sub3_28.anInterface8_14;
			Static538.anIntArray838[3] = this.anInt6825;
			Static538.anIntArray838[2] = this.anInt6823;
			Static538.anIntArray838[5] = this.anInt6824;
			Static538.anIntArray838[1] = this.anInt6820;
			Static538.anIntArray838[4] = this.anInt6822;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local23.method879(Static538.anIntArray838[local54])) {
					return null;
				}
				@Pc(72) Class220 local72 = local23.method878(Static538.anIntArray838[local54]);
				@Pc(79) int local79 = local72.aBoolean451 ? 64 : 128;
				if (local72.aByte83 > 0) {
					local50 = 1;
				}
				if (local52 < local79) {
					local52 = local79;
				}
			}
			for (@Pc(101) int local101 = 0; local101 < 6; local101++) {
				Static391.anIntArrayArray92[local101] = local23.method876(Static538.anIntArray838[local101], false, local52, 1.0F, local52);
			}
			this.aClass73_Sub4_1 = new Class73_Sub4(this.aClass122_Sub3_28, 6407, local52, local50 != 0, Static391.anIntArrayArray92);
		}
		return this.aClass73_Sub4_1;
	}
}
