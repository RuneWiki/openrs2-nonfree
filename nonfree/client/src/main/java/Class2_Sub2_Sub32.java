import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub2_Sub32 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
	private int anInt6116 = 32768;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub32() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(28) int[] local28 = this.method5472(arg0, 1);
			@Pc(34) int[] local34 = this.method5472(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static217.anInt3574; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt6116 * local34[local36] >> 12;
				@Pc(63) int local63 = local55 * Static412.anIntArray564[local46] >> 12;
				@Pc(71) int local71 = Static114.anIntArray157[local46] * local55 >> 12;
				@Pc(79) int local79 = Static127.anInt2287 & (local63 >> 12) + local36;
				@Pc(87) int local87 = Static157.anInt2698 & (local71 >> 12) + arg0;
				@Pc(93) int[] local93 = this.method5472(local87, 0);
				local11[local36] = local93[local79];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6116 = arg0.method3555() << 4;
		} else if (arg1 == 1) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		Static51.method703();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(21) int[] local21 = this.method5472(arg0, 1);
			@Pc(27) int[] local27 = this.method5472(arg0, 2);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			for (@Pc(41) int local41 = 0; local41 < Static217.anInt3574; local41++) {
				@Pc(53) int local53 = local21[local41] * 255 >> 12 & 0xFF;
				@Pc(62) int local62 = this.anInt6116 * local27[local41] >> 12;
				@Pc(70) int local70 = local62 * Static412.anIntArray564[local53] >> 12;
				@Pc(78) int local78 = local62 * Static114.anIntArray157[local53] >> 12;
				@Pc(87) int local87 = Static127.anInt2287 & local41 + (local70 >> 12);
				@Pc(96) int local96 = Static157.anInt2698 & arg0 + (local78 >> 12);
				@Pc(102) int[][] local102 = this.method5474(0, local96);
				local31[local41] = local102[0][local87];
				local35[local41] = local102[1][local87];
				local39[local41] = local102[2][local87];
			}
		}
		return local11;
	}
}
