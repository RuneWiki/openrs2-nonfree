import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class4_Sub2_Sub36 extends Class4_Sub2 {

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
	private int anInt10117 = 3216;

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "[I")
	private final int[] anIntArray701 = new int[3];

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
	private int anInt10120 = 3216;

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
	private int anInt10118 = 4096;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(27) int local27 = this.anInt10118 * Static117.anInt2241 >> 12;
			@Pc(37) int[] local37 = this.method8768(0, Static489.anInt7677 & arg0 - 1);
			@Pc(43) int[] local43 = this.method8768(0, arg0);
			@Pc(53) int[] local53 = this.method8768(0, Static489.anInt7677 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static269.anInt4330; local55++) {
				@Pc(69) int local69 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(90) int local90 = (local43[local55 - 1 & Static215.anInt3481] - local43[local55 + 1 & Static215.anInt3481]) * local27 >> 12;
				@Pc(94) int local94 = local90 >> 4;
				@Pc(98) int local98 = local69 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(140) int local140 = Class176.aByteArray46[local94 + (local98 * (local98 + 1) >> 1)] & 0xFF;
				@Pc(146) int local146 = local69 * local140 >> 8;
				@Pc(152) int local152 = local90 * local140 >> 8;
				@Pc(158) int local158 = local140 * 4096 >> 8;
				@Pc(167) int local167 = local146 * this.anIntArray701[1] >> 12;
				@Pc(176) int local176 = this.anIntArray701[0] * local152 >> 12;
				@Pc(185) int local185 = local158 * this.anIntArray701[2] >> 12;
				local11[local55] = local185 + local167 + local176;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(Z)V")
	private void method8575() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt10120 / 4096.0F));
		this.anIntArray701[0] = (int) (Math.sin((double) ((float) this.anInt10117 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray701[1] = (int) (Math.cos((double) ((float) this.anInt10117 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray701[2] = (int) (Math.sin((double) ((float) this.anInt10120 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray701[0] * this.anIntArray701[0] >> 12;
		@Pc(85) int local85 = this.anIntArray701[1] * this.anIntArray701[1] >> 12;
		@Pc(97) int local97 = this.anIntArray701[2] * this.anIntArray701[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local97 + local85 + local69 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray701[2] = (this.anIntArray701[2] << 12) / local110;
			this.anIntArray701[1] = (this.anIntArray701[1] << 12) / local110;
			this.anIntArray701[0] = (this.anIntArray701[0] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt10118 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt10117 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt10120 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		this.method8575();
	}
}
