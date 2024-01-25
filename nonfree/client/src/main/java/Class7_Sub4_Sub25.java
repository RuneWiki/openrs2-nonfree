import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class7_Sub4_Sub25 extends Class7_Sub4 {

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt4312 = 4096;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
	private int anInt4313 = 3216;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "[I")
	private final int[] anIntArray590 = new int[3];

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	private int anInt4319 = 3216;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		this.method3820();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(30) int local30 = this.anInt4312 * Static310.anInt5906 >> 12;
			@Pc(40) int[] local40 = this.method5634(0, arg0 - 1 & Static153.anInt3263);
			@Pc(46) int[] local46 = this.method5634(0, arg0);
			@Pc(56) int[] local56 = this.method5634(0, Static153.anInt3263 & arg0 + 1);
			for (@Pc(58) int local58 = 0; local58 < Static201.anInt4174; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[local58 - 1 & Static110.anInt2508] - local46[local58 + 1 & Static110.anInt2508]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				@Pc(102) int local102 = local73 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(140) int local140 = Class5.aByteArray4[((local102 + 1) * local102 >> 1) + local98] & 0xFF;
				@Pc(146) int local146 = local140 * local73 >> 8;
				@Pc(152) int local152 = local140 * local94 >> 8;
				@Pc(158) int local158 = local140 * 4096 >> 8;
				@Pc(167) int local167 = local152 * this.anIntArray590[0] >> 12;
				@Pc(176) int local176 = local146 * this.anIntArray590[1] >> 12;
				@Pc(185) int local185 = local158 * this.anIntArray590[2] >> 12;
				local19[local58] = local176 + local167 + local185;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	private void method3820() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4313 / 4096.0F));
		this.anIntArray590[0] = (int) (Math.sin((double) ((float) this.anInt4319 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray590[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt4319 / 4096.0F)));
		this.anIntArray590[2] = (int) (Math.sin((double) ((float) this.anInt4313 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray590[0] * this.anIntArray590[0] >> 12;
		@Pc(81) int local81 = this.anIntArray590[1] * this.anIntArray590[1] >> 12;
		@Pc(93) int local93 = this.anIntArray590[2] * this.anIntArray590[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray590[0] = (this.anIntArray590[0] << 12) / local106;
			this.anIntArray590[1] = (this.anIntArray590[1] << 12) / local106;
			this.anIntArray590[2] = (this.anIntArray590[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4312 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt4319 = arg0.method2764();
		} else if (arg1 == 2) {
			this.anInt4313 = arg0.method2764();
		}
	}
}
