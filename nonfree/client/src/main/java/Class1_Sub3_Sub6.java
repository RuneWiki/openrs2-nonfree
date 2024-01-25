import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
	private int anInt779 = 32768;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		Static52.method1027();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(23) int[] local23 = this.method7128(1, arg0);
			@Pc(29) int[] local29 = this.method7128(2, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static452.anInt7734; local31++) {
				@Pc(41) int local41 = local23[local31] >> 4 & 0xFF;
				@Pc(50) int local50 = this.anInt779 * local29[local31] >> 12;
				@Pc(58) int local58 = local50 * Static274.anIntArray525[local41] >> 12;
				@Pc(66) int local66 = local50 * Static90.anIntArray186[local41] >> 12;
				@Pc(75) int local75 = local31 + (local58 >> 12) & Static80.anInt1453;
				@Pc(83) int local83 = Static323.anInt5914 & (local66 >> 12) + arg0;
				@Pc(89) int[] local89 = this.method7128(0, local83);
				local13[local31] = local89[local75];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(27) int[] local27 = this.method7128(1, arg0);
			@Pc(33) int[] local33 = this.method7128(2, arg0);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			for (@Pc(47) int local47 = 0; local47 < Static452.anInt7734; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = this.anInt779 * local33[local47] >> 12;
				@Pc(76) int local76 = Static274.anIntArray525[local59] * local68 >> 12;
				@Pc(84) int local84 = local68 * Static90.anIntArray186[local59] >> 12;
				@Pc(92) int local92 = (local76 >> 12) + local47 & Static80.anInt1453;
				@Pc(100) int local100 = (local84 >> 12) + arg0 & Static323.anInt5914;
				@Pc(106) int[][] local106 = this.method7130(local100, 0);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt779 = arg0.method3967() << 4;
		} else if (arg1 == 1) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}
}
