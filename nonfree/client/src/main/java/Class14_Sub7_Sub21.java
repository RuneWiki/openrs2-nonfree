import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jw")
public final class Class14_Sub7_Sub21 extends Class14_Sub7 {

	@OriginalMember(owner = "client!jw", name = "U", descriptor = "[I")
	private final int[] anIntArray296 = new int[3];

	@OriginalMember(owner = "client!jw", name = "J", descriptor = "I")
	private int anInt5376 = 3216;

	@OriginalMember(owner = "client!jw", name = "N", descriptor = "I")
	private int anInt5378 = 4096;

	@OriginalMember(owner = "client!jw", name = "S", descriptor = "I")
	private int anInt5384 = 3216;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub21() {
		super(1, true);
	}

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		this.method4896();
	}

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "(I)V")
	private void method4896() {
		@Pc(16) double local16 = Math.cos((double) ((float) this.anInt5376 / 4096.0F));
		this.anIntArray296[0] = (int) (Math.sin((double) ((float) this.anInt5384 / 4096.0F)) * local16 * 4096.0D);
		this.anIntArray296[1] = (int) (Math.cos((double) ((float) this.anInt5384 / 4096.0F)) * local16 * 4096.0D);
		this.anIntArray296[2] = (int) (Math.sin((double) ((float) this.anInt5376 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray296[0] * this.anIntArray296[0] >> 12;
		@Pc(86) int local86 = this.anIntArray296[1] * this.anIntArray296[1] >> 12;
		@Pc(98) int local98 = this.anIntArray296[2] * this.anIntArray296[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local98 + local74 + local86 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray296[1] = (this.anIntArray296[1] << 12) / local111;
			this.anIntArray296[2] = (this.anIntArray296[2] << 12) / local111;
			this.anIntArray296[0] = (this.anIntArray296[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(30) int local30 = this.anInt5378 * Static246.anInt4676 >> 12;
			@Pc(40) int[] local40 = this.method9379(0, Static660.anInt6757 & arg0 - 1);
			@Pc(46) int[] local46 = this.method9379(0, arg0);
			@Pc(56) int[] local56 = this.method9379(0, Static660.anInt6757 & arg0 + 1);
			for (@Pc(58) int local58 = 0; local58 < Static613.anInt10114; local58++) {
				@Pc(72) int local72 = local30 * (local56[local58] - local40[local58]) >> 12;
				@Pc(92) int local92 = (local46[local58 - 1 & Static677.anInt11036] - local46[Static677.anInt11036 & local58 + 1]) * local30 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local72 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(139) int local139 = Class14_Sub7_Sub23.aByteArray67[local96 + ((local100 + 1) * local100 >> 1)] & 0xFF;
				@Pc(145) int local145 = local139 * 4096 >> 8;
				@Pc(151) int local151 = local139 * local72 >> 8;
				@Pc(157) int local157 = local139 * local92 >> 8;
				@Pc(166) int local166 = local151 * this.anIntArray296[1] >> 12;
				@Pc(175) int local175 = local145 * this.anIntArray296[2] >> 12;
				@Pc(184) int local184 = this.anIntArray296[0] * local157 >> 12;
				local19[local58] = local166 + local184 + local175;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5378 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt5384 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt5376 = arg1.method7717(-1978450544);
		}
	}
}
