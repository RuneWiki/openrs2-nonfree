import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class3_Sub8_Sub39 extends Class3_Sub8 {

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt10718 = 3216;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "[I")
	private final int[] anIntArray584 = new int[3];

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	private int anInt10719 = 4096;

	@OriginalMember(owner = "client!we", name = "O", descriptor = "I")
	private int anInt10721 = 3216;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		this.method8788();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt10719 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt10721 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt10718 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(27) int local27 = this.anInt10719 * Static315.anInt5269 >> 12;
			@Pc(37) int[] local37 = this.method8776(arg0 - 1 & Static635.anInt10496, 0);
			@Pc(43) int[] local43 = this.method8776(arg0, 0);
			@Pc(53) int[] local53 = this.method8776(arg0 + 1 & Static635.anInt10496, 0);
			for (@Pc(55) int local55 = 0; local55 < Static91.anInt1849; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = local27 * (local43[local55 - 1 & Static348.anInt5973] - local43[Static348.anInt5973 & local55 + 1]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(104) int local104 = local70 >> 4;
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(133) int local133 = Class14_Sub26.aByteArray88[((local104 + 1) * local104 >> 1) + local95] & 0xFF;
				@Pc(139) int local139 = local133 * local91 >> 8;
				@Pc(145) int local145 = local70 * local133 >> 8;
				@Pc(151) int local151 = local133 * 4096 >> 8;
				@Pc(160) int local160 = local151 * this.anIntArray584[2] >> 12;
				@Pc(169) int local169 = local139 * this.anIntArray584[0] >> 12;
				@Pc(178) int local178 = this.anIntArray584[1] * local145 >> 12;
				local11[local55] = local169 + local178 + local160;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
	private void method8788() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt10718 / 4096.0F));
		this.anIntArray584[0] = (int) (local11 * Math.sin((double) ((float) this.anInt10721 / 4096.0F)) * 4096.0D);
		this.anIntArray584[1] = (int) (Math.cos((double) ((float) this.anInt10721 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray584[2] = (int) (Math.sin((double) ((float) this.anInt10718 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray584[0] * this.anIntArray584[0] >> 12;
		@Pc(81) int local81 = this.anIntArray584[1] * this.anIntArray584[1] >> 12;
		@Pc(93) int local93 = this.anIntArray584[2] * this.anIntArray584[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray584[1] = (this.anIntArray584[1] << 12) / local111;
			this.anIntArray584[2] = (this.anIntArray584[2] << 12) / local111;
			this.anIntArray584[0] = (this.anIntArray584[0] << 12) / local111;
		}
	}
}
