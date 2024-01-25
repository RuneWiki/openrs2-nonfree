import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
	private final int[] anIntArray85 = new int[3];

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	private int anInt871 = 3216;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	private int anInt875 = 4096;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	private int anInt874 = 3216;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(29) int local29 = this.anInt875 * Static494.anInt7896 >> 12;
			@Pc(39) int[] local39 = this.method7765(0, arg0 - 1 & Static469.anInt7679);
			@Pc(45) int[] local45 = this.method7765(0, arg0);
			@Pc(57) int[] local57 = this.method7765(0, Static469.anInt7679 & arg0 + 1);
			for (@Pc(59) int local59 = 0; local59 < Static206.anInt4182; local59++) {
				@Pc(74) int local74 = (local57[local59] - local39[local59]) * local29 >> 12;
				@Pc(95) int local95 = (local45[Static439.anInt7283 & local59 - 1] - local45[Static439.anInt7283 & local59 + 1]) * local29 >> 12;
				@Pc(99) int local99 = local95 >> 4;
				@Pc(103) int local103 = local74 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(143) int local143 = Class29.aByteArray8[(local103 * (local103 + 1) >> 1) + local99] & 0xFF;
				@Pc(149) int local149 = local143 * 4096 >> 8;
				@Pc(155) int local155 = local143 * local95 >> 8;
				@Pc(161) int local161 = local74 * local143 >> 8;
				@Pc(170) int local170 = this.anIntArray85[0] * local155 >> 12;
				@Pc(179) int local179 = this.anIntArray85[1] * local161 >> 12;
				@Pc(188) int local188 = this.anIntArray85[2] * local149 >> 12;
				local18[local59] = local188 + local179 + local170;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		this.method658();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt875 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt871 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt874 = arg0.method3109();
		}
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
	private void method658() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt874 / 4096.0F));
		this.anIntArray85[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt871 / 4096.0F)));
		this.anIntArray85[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt871 / 4096.0F)));
		this.anIntArray85[2] = (int) (Math.sin((double) ((float) this.anInt874 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray85[0] * this.anIntArray85[0] >> 12;
		@Pc(81) int local81 = this.anIntArray85[1] * this.anIntArray85[1] >> 12;
		@Pc(101) int local101 = this.anIntArray85[2] * this.anIntArray85[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local81 + local69 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray85[2] = (this.anIntArray85[2] << 12) / local114;
			this.anIntArray85[1] = (this.anIntArray85[1] << 12) / local114;
			this.anIntArray85[0] = (this.anIntArray85[0] << 12) / local114;
		}
	}
}
