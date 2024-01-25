import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class6_Sub4_Sub36 extends Class6_Sub4 {

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt9116 = 3216;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	private int anInt9112 = 4096;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "[I")
	private final int[] anIntArray694 = new int[3];

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	private int anInt9111 = 3216;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	private void method7470() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt9111 / 4096.0F));
		this.anIntArray694[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt9116 / 4096.0F)));
		this.anIntArray694[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt9116 / 4096.0F)));
		this.anIntArray694[2] = (int) (Math.sin((double) ((float) this.anInt9111 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray694[0] * this.anIntArray694[0] >> 12;
		@Pc(81) int local81 = this.anIntArray694[1] * this.anIntArray694[1] >> 12;
		@Pc(101) int local101 = this.anIntArray694[2] * this.anIntArray694[2] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local101 + local69 + local81 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray694[1] = (this.anIntArray694[1] << 12) / local115;
			this.anIntArray694[0] = (this.anIntArray694[0] << 12) / local115;
			this.anIntArray694[2] = (this.anIntArray694[2] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(30) int local30 = this.anInt9112 * Static550.anInt9085 >> 12;
			@Pc(40) int[] local40 = this.method7748(0, arg0 - 1 & Static457.anInt7873);
			@Pc(46) int[] local46 = this.method7748(0, arg0);
			@Pc(56) int[] local56 = this.method7748(0, arg0 + 1 & Static457.anInt7873);
			for (@Pc(58) int local58 = 0; local58 < Static408.anInt7209; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = (local46[Static368.anInt6505 & local58 - 1] - local46[Static368.anInt6505 & local58 + 1]) * local30 >> 12;
				@Pc(98) int local98 = local94 >> 4;
				@Pc(102) int local102 = local73 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(145) int local145 = Class86_Sub2.aByteArray107[local98 + (local102 * (local102 + 1) >> 1)] & 0xFF;
				@Pc(151) int local151 = local145 * 4096 >> 8;
				@Pc(157) int local157 = local94 * local145 >> 8;
				@Pc(163) int local163 = local145 * local73 >> 8;
				@Pc(172) int local172 = this.anIntArray694[2] * local151 >> 12;
				@Pc(181) int local181 = this.anIntArray694[1] * local163 >> 12;
				@Pc(190) int local190 = local157 * this.anIntArray694[0] >> 12;
				local11[local58] = local172 + local181 + local190;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt9112 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt9116 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt9111 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		this.method7470();
	}
}
