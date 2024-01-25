import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class3_Sub6_Sub35 extends Class3_Sub6 {

	@OriginalMember(owner = "client!us", name = "S", descriptor = "I")
	private int anInt9635 = 32768;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub35() {
		super(3, false);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		Static578.method7854();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(26) int[] local26 = this.method8001(1, arg0);
			@Pc(32) int[] local32 = this.method8001(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static481.anInt8358; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt9635 * local32[local46] >> 12;
				@Pc(75) int local75 = Static392.anIntArray389[local58] * local67 >> 12;
				@Pc(83) int local83 = Static372.anIntArray362[local58] * local67 >> 12;
				@Pc(91) int local91 = Static325.anInt5932 & local46 + (local75 >> 12);
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static527.anInt10285;
				@Pc(105) int[][] local105 = this.method8005(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9635 = arg0.method6811() << 4;
		} else if (arg1 == 1) {
			super.aBoolean720 = arg0.method6814() == 1;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(21) int[] local21 = this.method8001(1, arg0);
			@Pc(27) int[] local27 = this.method8001(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static481.anInt8358; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt9635 >> 12;
				@Pc(56) int local56 = local48 * Static392.anIntArray389[local39] >> 12;
				@Pc(64) int local64 = Static372.anIntArray362[local39] * local48 >> 12;
				@Pc(72) int local72 = Static325.anInt5932 & local29 + (local56 >> 12);
				@Pc(81) int local81 = Static527.anInt10285 & arg0 + (local64 >> 12);
				@Pc(87) int[] local87 = this.method8001(0, local81);
				local11[local29] = local87[local72];
			}
		}
		return local11;
	}
}
