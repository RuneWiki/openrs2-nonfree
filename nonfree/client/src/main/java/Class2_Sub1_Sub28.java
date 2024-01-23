import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pk", name = "Q", descriptor = "[I")
	private int[] anIntArray354 = new int[3];

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	private int anInt4308 = 3216;

	@OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
	private int anInt4313 = 3216;

	@OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
	private int anInt4316 = 4096;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V")
	private void method3479() {
		@Pc(17) double local17 = Math.cos((double) ((float) this.anInt4313 / 4096.0F));
		this.anIntArray354[0] = (int) (Math.sin((double) ((float) this.anInt4308 / 4096.0F)) * 4096.0D * local17);
		this.anIntArray354[1] = (int) (Math.cos((double) ((float) this.anInt4308 / 4096.0F)) * local17 * 4096.0D);
		this.anIntArray354[2] = (int) (Math.sin((double) ((float) this.anInt4313 / 4096.0F)) * 4096.0D);
		@Pc(75) int local75 = this.anIntArray354[1] * this.anIntArray354[1] >> 12;
		@Pc(87) int local87 = this.anIntArray354[0] * this.anIntArray354[0] >> 12;
		@Pc(99) int local99 = this.anIntArray354[2] * this.anIntArray354[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local75 + local87 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray354[0] = (this.anIntArray354[0] << 12) / local112;
			this.anIntArray354[2] = (this.anIntArray354[2] << 12) / local112;
			this.anIntArray354[1] = (this.anIntArray354[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		this.method3479();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(23) int local23 = this.anInt4316 * Static31.anInt572 >> 12;
			@Pc(33) int[] local33 = this.method4946(Static39.anInt939 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method4946(arg0, 0);
			@Pc(49) int[] local49 = this.method4946(Static39.anInt939 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static114.anInt1359; local51++) {
				@Pc(71) int local71 = local23 * (local49[local51] - local33[local51]) >> 12;
				@Pc(75) int local75 = local71 >> 4;
				@Pc(95) int local95 = local23 * (local39[Static129.anInt2676 & local51 - 1] - local39[local51 + 1 & Static129.anInt2676]) >> 12;
				@Pc(99) int local99 = local95 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local75 < 0) {
					local75 = -local75;
				}
				if (local75 > 255) {
					local75 = 255;
				}
				@Pc(143) int local143 = Class2_Sub11.aByteArray7[local99 + ((local75 + 1) * local75 >> 1)] & 0xFF;
				@Pc(149) int local149 = local143 * local95 >> 8;
				@Pc(158) int local158 = this.anIntArray354[0] * local149 >> 12;
				@Pc(164) int local164 = local143 * 4096 >> 8;
				@Pc(173) int local173 = local164 * this.anIntArray354[2] >> 12;
				@Pc(179) int local179 = local143 * local71 >> 8;
				@Pc(188) int local188 = local179 * this.anIntArray354[1] >> 12;
				local11[local51] = local173 + local188 + local158;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4316 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt4308 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt4313 = arg0.method4242();
		}
	}
}
