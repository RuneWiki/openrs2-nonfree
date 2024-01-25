import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
	private int anInt295 = 3216;

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
	private int anInt296 = 4096;

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "[I")
	private final int[] anIntArray21 = new int[3];

	@OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
	private int anInt303 = 3216;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(28) int local28 = this.anInt296 * Static432.anInt7643 >> 12;
			@Pc(38) int[] local38 = this.method8001(0, Static527.anInt10285 & arg0 - 1);
			@Pc(44) int[] local44 = this.method8001(0, arg0);
			@Pc(54) int[] local54 = this.method8001(0, arg0 + 1 & Static527.anInt10285);
			for (@Pc(56) int local56 = 0; local56 < Static481.anInt8358; local56++) {
				@Pc(71) int local71 = (local54[local56] - local38[local56]) * local28 >> 12;
				@Pc(92) int local92 = (local44[Static325.anInt5932 & local56 - 1] - local44[local56 + 1 & Static325.anInt5932]) * local28 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local71 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(139) int local139 = Class160.aByteArray117[(local100 * (local100 + 1) >> 1) + local96] & 0xFF;
				@Pc(145) int local145 = local139 * 4096 >> 8;
				@Pc(151) int local151 = local139 * local71 >> 8;
				@Pc(157) int local157 = local92 * local139 >> 8;
				@Pc(166) int local166 = local145 * this.anIntArray21[2] >> 12;
				@Pc(175) int local175 = local151 * this.anIntArray21[1] >> 12;
				@Pc(184) int local184 = this.anIntArray21[0] * local157 >> 12;
				local11[local56] = local184 + local175 + local166;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt296 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt295 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt303 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		this.method294();
	}

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "(I)V")
	private void method294() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt303 / 4096.0F));
		this.anIntArray21[0] = (int) (local11 * Math.sin((double) ((float) this.anInt295 / 4096.0F)) * 4096.0D);
		this.anIntArray21[1] = (int) (Math.cos((double) ((float) this.anInt295 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray21[2] = (int) (Math.sin((double) ((float) this.anInt303 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray21[0] * this.anIntArray21[0] >> 12;
		@Pc(81) int local81 = this.anIntArray21[1] * this.anIntArray21[1] >> 12;
		@Pc(93) int local93 = this.anIntArray21[2] * this.anIntArray21[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray21[2] = (this.anIntArray21[2] << 12) / local111;
			this.anIntArray21[0] = (this.anIntArray21[0] << 12) / local111;
			this.anIntArray21[1] = (this.anIntArray21[1] << 12) / local111;
		}
	}
}
