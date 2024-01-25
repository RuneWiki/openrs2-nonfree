import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!he", name = "z", descriptor = "I")
	private int anInt3732 = 32768;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(3, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(26) int[] local26 = this.method7836(arg0, 1);
			@Pc(32) int[] local32 = this.method7836(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static501.anInt8748; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt3732 * local32[local34] >> 12;
				@Pc(61) int local61 = local53 * Static133.anIntArray110[local44] >> 12;
				@Pc(69) int local69 = Static482.anIntArray516[local44] * local53 >> 12;
				@Pc(77) int local77 = Static326.anInt4973 & local34 + (local61 >> 12);
				@Pc(85) int local85 = Static98.anInt1743 & (local69 >> 12) + arg0;
				@Pc(91) int[] local91 = this.method7836(local85, 0);
				local16[local34] = local91[local77];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(26) int[] local26 = this.method7836(arg0, 1);
			@Pc(32) int[] local32 = this.method7836(arg0, 2);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static501.anInt8748; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt3732 >> 12;
				@Pc(75) int local75 = local67 * Static133.anIntArray110[local58] >> 12;
				@Pc(83) int local83 = local67 * Static482.anIntArray516[local58] >> 12;
				@Pc(91) int local91 = Static326.anInt4973 & local46 + (local75 >> 12);
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static98.anInt1743;
				@Pc(105) int[][] local105 = this.method7833(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		Static263.method3803();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3732 = arg1.method7945() << 4;
		} else if (arg0 == 1) {
			super.aBoolean711 = arg1.method7974() == 1;
		}
	}
}
