import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	private int anInt1753 = 32768;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1753 = arg0.method269() << 4;
		} else if (arg1 == 1) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(26) int[] local26 = this.method3265(arg0, 1);
			@Pc(32) int[] local32 = this.method3265(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static135.anInt2897; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt1753 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static36.anIntArray74[local58] >> 12;
				@Pc(83) int local83 = local67 * Static203.anIntArray399[local58] >> 12;
				@Pc(91) int local91 = Static201.anInt3995 & (local83 >> 12) + local46;
				@Pc(99) int local99 = Static207.anInt4078 & (local75 >> 12) + arg0;
				@Pc(107) int[][] local107 = this.method3259(local99, 0);
				local36[local46] = local107[0][local91];
				local40[local46] = local107[1][local91];
				local44[local46] = local107[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(17) int[] local17 = this.method3265(arg0, 1);
			@Pc(23) int[] local23 = this.method3265(arg0, 2);
			for (@Pc(25) int local25 = 0; local25 < Static135.anInt2897; local25++) {
				@Pc(35) int local35 = local17[local25] >> 4 & 0xFF;
				@Pc(44) int local44 = this.anInt1753 * local23[local25] >> 12;
				@Pc(52) int local52 = local44 * Static36.anIntArray74[local35] >> 12;
				@Pc(60) int local60 = local44 * Static203.anIntArray399[local35] >> 12;
				@Pc(68) int local68 = Static201.anInt3995 & (local60 >> 12) + local25;
				@Pc(76) int local76 = arg0 + (local52 >> 12) & Static207.anInt4078;
				@Pc(82) int[] local82 = this.method3265(local76, 0);
				local7[local25] = local82[local68];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		Static50.method997();
	}
}
