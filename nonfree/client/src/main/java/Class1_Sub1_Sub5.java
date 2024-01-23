import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "[I")
	private int[] anIntArray40 = new int[3];

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
	private int anInt454 = 3216;

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
	private int anInt456 = 4096;

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
	private int anInt455 = 3216;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt456 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt455 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt454 = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(30) int local30 = this.anInt456 * Static297.anInt5893 >> 12;
			@Pc(40) int[] local40 = this.method4450(0, Static9.anInt244 & arg0 - 1);
			@Pc(46) int[] local46 = this.method4450(0, arg0);
			@Pc(56) int[] local56 = this.method4450(0, Static9.anInt244 & arg0 + 1);
			for (@Pc(58) int local58 = 0; local58 < Static131.anInt2513; local58++) {
				@Pc(74) int local74 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(78) int local78 = local74 >> 4;
				if (local78 < 0) {
					local78 = -local78;
				}
				if (local78 > 255) {
					local78 = 255;
				}
				@Pc(113) int local113 = (local46[local58 - 1 & Static11.anInt321] - local46[Static11.anInt321 & local58 + 1]) * local30 >> 12;
				@Pc(117) int local117 = local113 >> 4;
				if (local117 < 0) {
					local117 = -local117;
				}
				if (local117 > 255) {
					local117 = 255;
				}
				@Pc(143) int local143 = Class42.aByteArray16[local117 + ((local78 + 1) * local78 >> 1)] & 0xFF;
				@Pc(149) int local149 = local113 * local143 >> 8;
				@Pc(155) int local155 = local143 * 4096 >> 8;
				@Pc(161) int local161 = local143 * local74 >> 8;
				@Pc(170) int local170 = local155 * this.anIntArray40[2] >> 12;
				@Pc(179) int local179 = local161 * this.anIntArray40[1] >> 12;
				@Pc(188) int local188 = local149 * this.anIntArray40[0] >> 12;
				local18[local58] = local170 + local188 + local179;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
	private void method354() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt454 / 4096.0F));
		this.anIntArray40[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt455 / 4096.0F)));
		this.anIntArray40[1] = (int) (local11 * Math.cos((double) ((float) this.anInt455 / 4096.0F)) * 4096.0D);
		this.anIntArray40[2] = (int) (Math.sin((double) ((float) this.anInt454 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray40[0] * this.anIntArray40[0] >> 12;
		@Pc(89) int local89 = this.anIntArray40[1] * this.anIntArray40[1] >> 12;
		@Pc(101) int local101 = this.anIntArray40[2] * this.anIntArray40[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local89 + local69 + local101 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray40[2] = (this.anIntArray40[2] << 12) / local114;
			this.anIntArray40[1] = (this.anIntArray40[1] << 12) / local114;
			this.anIntArray40[0] = (this.anIntArray40[0] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
	@Override
	public void method4454() {
		this.method354();
	}
}
