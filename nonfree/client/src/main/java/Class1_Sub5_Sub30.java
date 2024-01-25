import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub5_Sub30 extends Class1_Sub5 {

	@OriginalMember(owner = "client!se", name = "O", descriptor = "I")
	private int anInt5653 = 32768;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(26) int[] local26 = this.method5802(1, arg0);
			@Pc(32) int[] local32 = this.method5802(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static75.anInt1566; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt5653 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static13.anIntArray10[local58] >> 12;
				@Pc(83) int local83 = local67 * Static204.anIntArray679[local58] >> 12;
				@Pc(91) int local91 = (local75 >> 12) + local46 & Static239.anInt2816;
				@Pc(100) int local100 = Static42.anInt1137 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method5807(local100, 0);
				local36[local46] = local106[0][local91];
				local40[local46] = local106[1][local91];
				local44[local46] = local106[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5653 = arg0.method5715() << 4;
		} else if (arg1 == 1) {
			super.aBoolean552 = arg0.method5720() == 1;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		Static341.method5649();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(21) int[] local21 = this.method5802(1, arg0);
			@Pc(27) int[] local27 = this.method5802(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static75.anInt1566; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt5653 >> 12;
				@Pc(56) int local56 = local48 * Static13.anIntArray10[local39] >> 12;
				@Pc(64) int local64 = Static204.anIntArray679[local39] * local48 >> 12;
				@Pc(73) int local73 = Static239.anInt2816 & local29 + (local56 >> 12);
				@Pc(81) int local81 = (local64 >> 12) + arg0 & Static42.anInt1137;
				@Pc(87) int[] local87 = this.method5802(0, local81);
				local11[local29] = local87[local73];
			}
		}
		return local11;
	}
}
