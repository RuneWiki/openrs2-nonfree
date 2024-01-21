import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class5_Sub1_Sub39 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
	private int anInt4209 = 4096;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	private int anInt4208 = 0;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(22) int[][] local22 = this.method3191(0, arg0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local7[1];
			@Pc(38) int[] local38 = local7[0];
			@Pc(42) int[] local42 = local22[2];
			@Pc(46) int[] local46 = local7[2];
			for (@Pc(48) int local48 = 0; local48 < Static174.anInt3489; local48++) {
				@Pc(54) int local54 = local26[local48];
				@Pc(58) int local58 = local30[local48];
				@Pc(62) int local62 = local42[local48];
				if (this.anInt4208 > local54) {
					local38[local48] = this.anInt4208;
				} else if (local54 <= this.anInt4209) {
					local38[local48] = local54;
				} else {
					local38[local48] = this.anInt4209;
				}
				if (local58 < this.anInt4208) {
					local34[local48] = this.anInt4208;
				} else if (local58 <= this.anInt4209) {
					local34[local48] = local58;
				} else {
					local34[local48] = this.anInt4209;
				}
				if (this.anInt4208 > local62) {
					local46[local48] = this.anInt4208;
				} else if (this.anInt4209 >= local62) {
					local46[local48] = local62;
				} else {
					local46[local48] = this.anInt4209;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4208 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt4209 = arg0.method3077();
		} else if (arg1 == 2) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(25) int[] local25 = this.method3196(arg0, 0);
			for (@Pc(27) int local27 = 0; local27 < Static174.anInt3489; local27++) {
				@Pc(33) int local33 = local25[local27];
				if (local33 < this.anInt4208) {
					local15[local27] = this.anInt4208;
				} else if (this.anInt4209 >= local33) {
					local15[local27] = local33;
				} else {
					local15[local27] = this.anInt4209;
				}
			}
		}
		return local15;
	}
}
