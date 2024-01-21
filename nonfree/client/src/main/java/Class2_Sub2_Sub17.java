import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
	private int anInt2554 = 4;

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
	private int anInt2556 = 4;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(28) int local28 = Static106.anInt3045 / this.anInt2556;
			@Pc(33) int local33 = Static57.anInt1795 / this.anInt2554;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method3557(Static57.anInt1795 * local39 / local33, 0);
			} else {
				local49 = this.method3557(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local15[0];
			@Pc(73) int[] local73 = local49[2];
			@Pc(77) int[] local77 = local15[1];
			@Pc(81) int[] local81 = local15[2];
			for (@Pc(83) int local83 = 0; local83 < Static106.anInt3045; local83++) {
				@Pc(89) int local89;
				if (local28 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local28;
					local89 = local95 * Static106.anInt3045 / local28;
				}
				local69[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local73[local89];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(25) int local25 = Static106.anInt3045 / this.anInt2556;
			@Pc(30) int local30 = Static57.anInt1795 / this.anInt2554;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method3569(local36 * Static57.anInt1795 / local30, 0);
			} else {
				local46 = this.method3569(0, 0);
			}
			for (local36 = 0; local36 < Static106.anInt3045; local36++) {
				if (local25 > 0) {
					@Pc(64) int local64 = local36 % local25;
					local16[local36] = local46[Static106.anInt3045 * local64 / local25];
				} else {
					local16[local36] = local46[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2556 = arg1.method218();
		} else if (arg0 == 1) {
			this.anInt2554 = arg1.method218();
		}
	}
}
