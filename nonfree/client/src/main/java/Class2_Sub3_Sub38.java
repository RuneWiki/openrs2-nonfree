import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub3_Sub38 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
	private int anInt4019;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
	private int anInt4021;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(25) int local25 = Static53.anInt1184 / this.anInt4019;
			@Pc(30) int local30 = Static34.anInt889 / this.anInt4021;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method3011(Static34.anInt889 * local36 / local30, 0);
			} else {
				local46 = this.method3011(0, 0);
			}
			for (local36 = 0; local36 < Static53.anInt1184; local36++) {
				if (local25 <= 0) {
					local16[local36] = local46[0];
				} else {
					@Pc(75) int local75 = local36 % local25;
					local16[local36] = local46[local75 * Static53.anInt1184 / local25];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(28) int local28 = Static53.anInt1184 / this.anInt4019;
			@Pc(33) int local33 = Static34.anInt889 / this.anInt4021;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method3017(local39 * Static34.anInt889 / local33, 0);
			} else {
				local49 = this.method3017(0, 0);
			}
			@Pc(61) int[] local61 = local11[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[0];
			@Pc(73) int[] local73 = local11[2];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local49[2];
			for (@Pc(83) int local83 = 0; local83 < Static53.anInt1184; local83++) {
				@Pc(89) int local89;
				if (local28 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local28;
					local89 = local95 * Static53.anInt1184 / local28;
				}
				local61[local83] = local69[local89];
				local77[local83] = local65[local89];
				local73[local83] = local81[local89];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt4019 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt4021 = arg1.method2962();
		}
	}
}
