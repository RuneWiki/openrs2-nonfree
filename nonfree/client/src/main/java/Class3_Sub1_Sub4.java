import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!am", name = "J", descriptor = "I")
	private int anInt475 = 4096;

	@OriginalMember(owner = "client!am", name = "O", descriptor = "I")
	private int anInt477 = 3216;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "[I")
	private final int[] anIntArray9 = new int[3];

	@OriginalMember(owner = "client!am", name = "R", descriptor = "I")
	private int anInt479 = 3216;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt475 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt477 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt479 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		this.method464();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(27) int local27 = this.anInt475 * Static425.anInt8248 >> 12;
			@Pc(37) int[] local37 = this.method8362(arg0 - 1 & Static483.anInt9026, 0);
			@Pc(43) int[] local43 = this.method8362(arg0, 0);
			@Pc(53) int[] local53 = this.method8362(Static483.anInt9026 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2935; local55++) {
				@Pc(69) int local69 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(89) int local89 = local27 * (local43[local55 - 1 & Static251.anInt5425] - local43[local55 + 1 & Static251.anInt5425]) >> 12;
				@Pc(93) int local93 = local89 >> 4;
				if (local93 < 0) {
					local93 = -local93;
				}
				@Pc(105) int local105 = local69 >> 4;
				if (local105 < 0) {
					local105 = -local105;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				if (local105 > 255) {
					local105 = 255;
				}
				@Pc(136) int local136 = Class3_Sub46.aByteArray110[(local105 * (local105 + 1) >> 1) + local93] & 0xFF;
				@Pc(142) int local142 = local136 * local89 >> 8;
				@Pc(148) int local148 = local136 * 4096 >> 8;
				@Pc(154) int local154 = local69 * local136 >> 8;
				@Pc(163) int local163 = local154 * this.anIntArray9[1] >> 12;
				@Pc(172) int local172 = local142 * this.anIntArray9[0] >> 12;
				@Pc(181) int local181 = this.anIntArray9[2] * local148 >> 12;
				local16[local55] = local181 + local163 + local172;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V")
	private void method464() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt479 / 4096.0F));
		this.anIntArray9[0] = (int) (Math.sin((double) ((float) this.anInt477 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray9[1] = (int) (Math.cos((double) ((float) this.anInt477 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray9[2] = (int) (Math.sin((double) ((float) this.anInt479 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray9[0] * this.anIntArray9[0] >> 12;
		@Pc(81) int local81 = this.anIntArray9[1] * this.anIntArray9[1] >> 12;
		@Pc(93) int local93 = this.anIntArray9[2] * this.anIntArray9[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray9[1] = (this.anIntArray9[1] << 12) / local107;
			this.anIntArray9[2] = (this.anIntArray9[2] << 12) / local107;
			this.anIntArray9[0] = (this.anIntArray9[0] << 12) / local107;
		}
	}
}
