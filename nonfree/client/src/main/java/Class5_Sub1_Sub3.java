import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
	private int anInt204 = 32768;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub3() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(25) int[] local25 = this.method3196(arg0, 1);
			@Pc(31) int[] local31 = this.method3196(arg0, 2);
			for (@Pc(33) int local33 = 0; local33 < Static174.anInt3489; local33++) {
				@Pc(43) int local43 = local25[local33] >> 4 & 0xFF;
				@Pc(52) int local52 = this.anInt204 * local31[local33] >> 12;
				@Pc(60) int local60 = Static106.anIntArray238[local43] * local52 >> 12;
				@Pc(68) int local68 = local52 * Static94.anIntArray191[local43] >> 12;
				@Pc(76) int local76 = Static189.anInt3753 & (local60 >> 12) + local33;
				@Pc(84) int local84 = Static3.anInt74 & (local68 >> 12) + arg0;
				@Pc(90) int[] local90 = this.method3196(local84, 0);
				local11[local33] = local90[local76];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(28) int[] local28 = this.method3196(arg0, 1);
			@Pc(34) int[] local34 = this.method3196(arg0, 2);
			@Pc(38) int[] local38 = local18[2];
			@Pc(42) int[] local42 = local18[0];
			@Pc(46) int[] local46 = local18[1];
			for (@Pc(48) int local48 = 0; local48 < Static174.anInt3489; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt204 * local34[local48] >> 12;
				@Pc(77) int local77 = Static106.anIntArray238[local60] * local69 >> 12;
				@Pc(85) int local85 = local69 * Static94.anIntArray191[local60] >> 12;
				@Pc(93) int local93 = (local85 >> 12) + arg0 & Static3.anInt74;
				@Pc(102) int local102 = Static189.anInt3753 & local48 + (local77 >> 12);
				@Pc(108) int[][] local108 = this.method3191(0, local93);
				local42[local48] = local108[0][local102];
				local46[local48] = local108[1][local102];
				local38[local48] = local108[2][local102];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		Static64.method1048();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt204 = arg0.method3077() << 4;
		} else if (arg1 == 1) {
			super.aBoolean189 = arg0.method3062() == 1;
		}
	}
}
