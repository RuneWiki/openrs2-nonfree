import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class3_Sub6_Sub18 extends Class3_Sub6 {

	@OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
	private int anInt4453 = 32768;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub18() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		Static195.method3275();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4453 = arg0.method5198() << 4;
		} else if (arg1 == 1) {
			super.aBoolean729 = arg0.method5175() == 1;
		}
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(21) int[] local21 = this.method7769(arg0, 1);
			@Pc(27) int[] local27 = this.method7769(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static521.anInt8383; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt4453 >> 12;
				@Pc(56) int local56 = local48 * Static411.anIntArray438[local39] >> 12;
				@Pc(64) int local64 = Static52.anIntArray41[local39] * local48 >> 12;
				@Pc(72) int local72 = Static296.anInt5049 & (local56 >> 12) + local29;
				@Pc(80) int local80 = (local64 >> 12) + arg0 & Static68.anInt1579;
				@Pc(86) int[] local86 = this.method7769(local80, 0);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(27) int[] local27 = this.method7769(arg0, 1);
			@Pc(33) int[] local33 = this.method7769(arg0, 2);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static521.anInt8383; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt4453 >> 12;
				@Pc(76) int local76 = local68 * Static411.anIntArray438[local59] >> 12;
				@Pc(84) int local84 = local68 * Static52.anIntArray41[local59] >> 12;
				@Pc(92) int local92 = Static296.anInt5049 & local47 + (local76 >> 12);
				@Pc(100) int local100 = (local84 >> 12) + arg0 & Static68.anInt1579;
				@Pc(106) int[][] local106 = this.method7773(0, local100);
				local37[local47] = local106[0][local92];
				local41[local47] = local106[1][local92];
				local45[local47] = local106[2][local92];
			}
		}
		return local11;
	}
}
