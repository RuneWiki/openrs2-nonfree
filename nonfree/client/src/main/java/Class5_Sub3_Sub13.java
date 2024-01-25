import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class5_Sub3_Sub13 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hr", name = "S", descriptor = "I")
	private int anInt2447 = 4;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
	private int anInt2446 = 4;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(20) int local20 = Static7.anInt129 / this.anInt2446;
			@Pc(25) int local25 = Static227.anInt4557 / this.anInt2447;
			@Pc(33) int[][] local33;
			if (local25 <= 0) {
				local33 = this.method6023(0, 0);
			} else {
				@Pc(39) int local39 = arg0 % local25;
				local33 = this.method6023(0, local39 * Static227.anInt4557 / local25);
			}
			@Pc(53) int[] local53 = local33[0];
			@Pc(57) int[] local57 = local33[1];
			@Pc(61) int[] local61 = local33[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[1];
			@Pc(73) int[] local73 = local11[2];
			for (@Pc(75) int local75 = 0; local75 < Static7.anInt129; local75++) {
				@Pc(84) int local84;
				if (local20 <= 0) {
					local84 = 0;
				} else {
					@Pc(90) int local90 = local75 % local20;
					local84 = Static7.anInt129 * local90 / local20;
				}
				local65[local75] = local53[local84];
				local69[local75] = local57[local84];
				local73[local75] = local61[local84];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2446 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt2447 = arg0.method5115();
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(20) int local20 = Static7.anInt129 / this.anInt2446;
			@Pc(25) int local25 = Static227.anInt4557 / this.anInt2447;
			@Pc(33) int[] local33;
			@Pc(39) int local39;
			if (local25 <= 0) {
				local33 = this.method6020(0, 0);
			} else {
				local39 = arg0 % local25;
				local33 = this.method6020(0, Static227.anInt4557 * local39 / local25);
			}
			for (local39 = 0; local39 < Static7.anInt129; local39++) {
				if (local20 > 0) {
					@Pc(62) int local62 = local39 % local20;
					local11[local39] = local33[Static7.anInt129 * local62 / local20];
				} else {
					local11[local39] = local33[0];
				}
			}
		}
		return local11;
	}
}
