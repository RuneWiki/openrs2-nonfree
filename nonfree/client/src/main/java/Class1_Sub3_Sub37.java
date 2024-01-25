import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
	private int anInt6376 = 3216;

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
	private int anInt6377 = 4096;

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "[I")
	private final int[] anIntArray513 = new int[3];

	@OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
	private int anInt6379 = 3216;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(30) int local30 = Static86.anInt2150 * this.anInt6377 >> 12;
			@Pc(40) int[] local40 = this.method5532(0, Static49.anInt1526 & arg0 - 1);
			@Pc(46) int[] local46 = this.method5532(0, arg0);
			@Pc(56) int[] local56 = this.method5532(0, Static49.anInt1526 & arg0 + 1);
			for (@Pc(58) int local58 = 0; local58 < Static153.anInt3378; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = (local46[local58 - 1 & Static250.anInt5127] - local46[local58 + 1 & Static250.anInt5127]) * local30 >> 12;
				@Pc(98) int local98 = local94 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				@Pc(110) int local110 = local73 >> 4;
				if (local98 > 255) {
					local98 = 255;
				}
				if (local110 < 0) {
					local110 = -local110;
				}
				if (local110 > 255) {
					local110 = 255;
				}
				@Pc(146) int local146 = Class1_Sub3_Sub15.aByteArray50[local98 + (local110 * (local110 + 1) >> 1)] & 0xFF;
				@Pc(152) int local152 = local146 * local73 >> 8;
				@Pc(158) int local158 = local146 * 4096 >> 8;
				@Pc(164) int local164 = local94 * local146 >> 8;
				@Pc(173) int local173 = local164 * this.anIntArray513[0] >> 12;
				@Pc(182) int local182 = this.anIntArray513[2] * local158 >> 12;
				@Pc(191) int local191 = local152 * this.anIntArray513[1] >> 12;
				local19[local58] = local182 + local173 + local191;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6377 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt6376 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt6379 = arg1.method4556();
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
	private void method5387() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6379 / 4096.0F));
		this.anIntArray513[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt6376 / 4096.0F)));
		this.anIntArray513[1] = (int) (Math.cos((double) ((float) this.anInt6376 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray513[2] = (int) (Math.sin((double) ((float) this.anInt6379 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray513[0] * this.anIntArray513[0] >> 12;
		@Pc(89) int local89 = this.anIntArray513[1] * this.anIntArray513[1] >> 12;
		@Pc(101) int local101 = this.anIntArray513[2] * this.anIntArray513[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray513[1] = (this.anIntArray513[1] << 12) / local114;
			this.anIntArray513[2] = (this.anIntArray513[2] << 12) / local114;
			this.anIntArray513[0] = (this.anIntArray513[0] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		this.method5387();
	}
}
