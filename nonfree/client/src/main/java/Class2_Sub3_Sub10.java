import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub3_Sub10 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	private int anInt973;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		Static157.method2659();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt973 = arg1.method2933() << 4;
		} else if (arg0 == 1) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(21) int[] local21 = this.method3011(arg0, 1);
			@Pc(27) int[] local27 = this.method3011(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static53.anInt1184; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt973 >> 12;
				@Pc(56) int local56 = local48 * Static111.anIntArray222[local39] >> 12;
				@Pc(64) int local64 = Static96.anIntArray205[local39] * local48 >> 12;
				@Pc(72) int local72 = Static27.anInt588 & (local64 >> 12) + local29;
				@Pc(80) int local80 = Static134.anInt2915 & (local56 >> 12) + arg0;
				@Pc(86) int[] local86 = this.method3011(local80, 0);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method3011(arg0, 1);
			@Pc(32) int[] local32 = this.method3011(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static53.anInt1184; local46++) {
				@Pc(57) int local57 = local32[local46] * this.anInt973 >> 12;
				@Pc(67) int local67 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(75) int local75 = local57 * Static96.anIntArray205[local67] >> 12;
				@Pc(84) int local84 = local46 + (local75 >> 12) & Static27.anInt588;
				@Pc(92) int local92 = local57 * Static111.anIntArray222[local67] >> 12;
				@Pc(100) int local100 = (local92 >> 12) + arg0 & Static134.anInt2915;
				@Pc(106) int[][] local106 = this.method3017(local100, 0);
				local36[local46] = local106[0][local84];
				local40[local46] = local106[1][local84];
				local44[local46] = local106[2][local84];
			}
		}
		return local16;
	}
}
