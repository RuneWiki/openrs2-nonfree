import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class6_Sub5_Sub34 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
	private int anInt7373 = 32768;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(21) int[] local21 = this.method6543(1, arg0);
			@Pc(27) int[] local27 = this.method6543(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static240.anInt4386; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt7373 >> 12;
				@Pc(56) int local56 = Static227.anIntArray295[local39] * local48 >> 12;
				@Pc(64) int local64 = Static159.anIntArray388[local39] * local48 >> 12;
				@Pc(72) int local72 = local29 + (local56 >> 12) & Static408.anInt7338;
				@Pc(80) int local80 = Static52.anInt1464 & (local64 >> 12) + arg0;
				@Pc(88) int[] local88 = this.method6543(0, local80);
				local11[local29] = local88[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt7373 = arg1.method6485() << 4;
		} else if (arg0 == 1) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(26) int[] local26 = this.method6543(1, arg0);
			@Pc(32) int[] local32 = this.method6543(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static240.anInt4386; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt7373 >> 12;
				@Pc(75) int local75 = Static227.anIntArray295[local58] * local67 >> 12;
				@Pc(83) int local83 = local67 * Static159.anIntArray388[local58] >> 12;
				@Pc(91) int local91 = Static408.anInt7338 & (local75 >> 12) + local46;
				@Pc(100) int local100 = Static52.anInt1464 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method6544(local100, 0);
				local36[local46] = local106[0][local91];
				local40[local46] = local106[1][local91];
				local44[local46] = local106[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		Static344.method5292();
	}
}
