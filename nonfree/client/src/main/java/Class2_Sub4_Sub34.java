import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class2_Sub4_Sub34 extends Class2_Sub4 {

	@OriginalMember(owner = "client!uh", name = "eb", descriptor = "I")
	private int anInt4083 = 0;

	@OriginalMember(owner = "client!uh", name = "ob", descriptor = "I")
	private int anInt4090 = 4096;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(21) int[] local21 = this.method3129(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static118.anInt2608; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt4083 > local29) {
					local7[local23] = this.anInt4083;
				} else if (local29 > this.anInt4090) {
					local7[local23] = this.anInt4090;
				} else {
					local7[local23] = local29;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[][] local26 = this.method3130(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local26[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static118.anInt2608; local52++) {
				@Pc(58) int local58 = local46[local52];
				@Pc(62) int local62 = local30[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 < this.anInt4083) {
					local38[local52] = this.anInt4083;
				} else if (local62 > this.anInt4090) {
					local38[local52] = this.anInt4090;
				} else {
					local38[local52] = local62;
				}
				if (local58 < this.anInt4083) {
					local42[local52] = this.anInt4083;
				} else if (local58 <= this.anInt4090) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt4090;
				}
				if (local66 < this.anInt4083) {
					local50[local52] = this.anInt4083;
				} else if (local66 <= this.anInt4090) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt4090;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4083 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt4090 = arg1.method1557();
		} else if (arg0 == 2) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}
}
