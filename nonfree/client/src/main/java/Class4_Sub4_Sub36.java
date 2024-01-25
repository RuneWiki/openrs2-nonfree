import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class4_Sub4_Sub36 extends Class4_Sub4 {

	@OriginalMember(owner = "client!tp", name = "R", descriptor = "I")
	private int anInt6248 = 4;

	@OriginalMember(owner = "client!tp", name = "U", descriptor = "I")
	private int anInt6251 = 4;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6251 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt6248 = arg1.method2380();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(25) int local25 = Static124.anInt3576 / this.anInt6251;
			@Pc(30) int local30 = Static331.anInt6571 / this.anInt6248;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method5386(0, Static331.anInt6571 * local36 / local30);
			} else {
				local46 = this.method5386(0, 0);
			}
			for (local36 = 0; local36 < Static124.anInt3576; local36++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local36 % local25;
					local11[local36] = local46[local67 * Static124.anInt3576 / local25];
				} else {
					local11[local36] = local46[0];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(20) int local20 = Static124.anInt3576 / this.anInt6251;
			@Pc(25) int local25 = Static331.anInt6571 / this.anInt6248;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method5384(0, local34 * Static331.anInt6571 / local25);
			} else {
				local44 = this.method5384(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local44[1];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static124.anInt3576; local78++) {
				@Pc(87) int local87;
				if (local20 <= 0) {
					local87 = 0;
				} else {
					@Pc(93) int local93 = local78 % local20;
					local87 = Static124.anInt3576 * local93 / local20;
				}
				local68[local78] = local56[local87];
				local72[local78] = local60[local87];
				local76[local78] = local64[local87];
			}
		}
		return local11;
	}
}
