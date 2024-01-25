import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class4_Sub4_Sub31 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
	private int anInt5704 = 32768;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(29) int[] local29 = this.method5386(1, arg0);
			@Pc(35) int[] local35 = this.method5386(2, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			for (@Pc(49) int local49 = 0; local49 < Static124.anInt3576; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt5704 >> 12;
				@Pc(78) int local78 = local70 * Static238.anIntArray411[local61] >> 12;
				@Pc(86) int local86 = local70 * Static258.anIntArray442[local61] >> 12;
				@Pc(94) int local94 = (local78 >> 12) + local49 & Static350.anInt6802;
				@Pc(103) int local103 = arg0 + (local86 >> 12) & Static59.anInt1278;
				@Pc(109) int[][] local109 = this.method5384(0, local103);
				local39[local49] = local109[0][local94];
				local43[local49] = local109[1][local94];
				local47[local49] = local109[2][local94];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(29) int[] local29 = this.method5386(1, arg0);
			@Pc(35) int[] local35 = this.method5386(2, arg0);
			for (@Pc(37) int local37 = 0; local37 < Static124.anInt3576; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = local35[local37] * this.anInt5704 >> 12;
				@Pc(64) int local64 = local56 * Static238.anIntArray411[local47] >> 12;
				@Pc(72) int local72 = Static258.anIntArray442[local47] * local56 >> 12;
				@Pc(80) int local80 = (local64 >> 12) + local37 & Static350.anInt6802;
				@Pc(88) int local88 = Static59.anInt1278 & (local72 >> 12) + arg0;
				@Pc(94) int[] local94 = this.method5386(0, local88);
				local11[local37] = local94[local80];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5704 = arg1.method2404() << 4;
		} else if (arg0 == 1) {
			super.aBoolean563 = arg1.method2380() == 1;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		Static317.method5269();
	}
}
