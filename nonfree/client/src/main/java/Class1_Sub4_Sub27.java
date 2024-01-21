import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub4_Sub27 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "Z")
	private boolean aBoolean177;

	@OriginalMember(owner = "client!sb", name = "sb", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(36) int[][] local36 = this.method3217(0, this.aBoolean178 ? Static125.anInt3628 - arg0 : arg0);
			@Pc(40) int[] local40 = local36[2];
			@Pc(44) int[] local44 = local19[0];
			@Pc(48) int[] local48 = local36[0];
			@Pc(52) int[] local52 = local36[1];
			@Pc(56) int[] local56 = local19[1];
			@Pc(60) int[] local60 = local19[2];
			@Pc(65) int local65;
			if (this.aBoolean177) {
				for (local65 = 0; local65 < Static73.anInt1888; local65++) {
					local44[local65] = local48[Static35.anInt672 - local65];
					local56[local65] = local52[Static35.anInt672 - local65];
					local60[local65] = local40[Static35.anInt672 - local65];
				}
			} else {
				for (local65 = 0; local65 < Static73.anInt1888; local65++) {
					local44[local65] = local48[local65];
					local56[local65] = local52[local65];
					local60[local65] = local40[local65];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean177 = arg0.method544() == 1;
		} else if (arg1 == 1) {
			this.aBoolean178 = arg0.method544() == 1;
		} else if (arg1 == 2) {
			super.aBoolean210 = arg0.method544() == 1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(35) int[] local35 = this.method3215(this.aBoolean178 ? Static125.anInt3628 - arg0 : arg0, 0);
			if (this.aBoolean177) {
				for (@Pc(48) int local48 = 0; local48 < Static73.anInt1888; local48++) {
					local17[local48] = local35[Static35.anInt672 - local48];
				}
			} else {
				Static185.method2281(local35, 0, local17, 0, Static73.anInt1888);
			}
		}
		return local17;
	}
}
