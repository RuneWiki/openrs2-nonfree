import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class3_Sub9_Sub35 extends Class3_Sub9 {

	@OriginalMember(owner = "client!sda", name = "F", descriptor = "I")
	private int anInt8949 = 32768;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub35() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		Static609.method8656();
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(21) int[] local21 = this.method9162(arg0, 1);
			@Pc(27) int[] local27 = this.method9162(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1251; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt8949 * local27[local29] >> 12;
				@Pc(56) int local56 = local48 * Static144.anIntArray235[local39] >> 12;
				@Pc(64) int local64 = local48 * Static608.anIntArray846[local39] >> 12;
				@Pc(73) int local73 = Static302.anInt5067 & local29 + (local56 >> 12);
				@Pc(81) int local81 = Static636.anInt10126 & (local64 >> 12) + arg0;
				@Pc(87) int[] local87 = this.method9162(local81, 0);
				local11[local29] = local87[local73];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(26) int[] local26 = this.method9162(arg0, 1);
			@Pc(32) int[] local32 = this.method9162(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static62.anInt1251; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt8949 * local32[local46] >> 12;
				@Pc(75) int local75 = Static144.anIntArray235[local58] * local67 >> 12;
				@Pc(83) int local83 = local67 * Static608.anIntArray846[local58] >> 12;
				@Pc(91) int local91 = local46 + (local75 >> 12) & Static302.anInt5067;
				@Pc(99) int local99 = Static636.anInt10126 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method9167(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8949 = arg0.method8593() << 4;
		} else if (arg1 == 1) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}
}
