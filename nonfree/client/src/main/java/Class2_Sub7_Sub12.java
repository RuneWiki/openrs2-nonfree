import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class2_Sub7_Sub12 extends Class2_Sub7 {

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
	private int anInt3110 = 4096;

	@OriginalMember(owner = "client!gw", name = "N", descriptor = "I")
	private int anInt3114 = 3216;

	@OriginalMember(owner = "client!gw", name = "R", descriptor = "[I")
	private final int[] anIntArray353 = new int[3];

	@OriginalMember(owner = "client!gw", name = "K", descriptor = "I")
	private int anInt3111 = 3216;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3110 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt3114 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt3111 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(27) int local27 = this.anInt3110 * Static383.anInt7071 >> 12;
			@Pc(37) int[] local37 = this.method7581(Static126.anInt7690 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method7581(arg0, 0);
			@Pc(53) int[] local53 = this.method7581(arg0 + 1 & Static126.anInt7690, 0);
			for (@Pc(55) int local55 = 0; local55 < Static352.anInt6485; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(90) int local90 = (local43[local55 - 1 & Static38.anInt733] - local43[Static38.anInt733 & local55 + 1]) * local27 >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(103) int local103 = local70 >> 4;
				if (local94 > 255) {
					local94 = 255;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(137) int local137 = Class2_Sub33.aByteArray94[local94 + ((local103 + 1) * local103 >> 1)] & 0xFF;
				@Pc(143) int local143 = local137 * 4096 >> 8;
				@Pc(149) int local149 = local70 * local137 >> 8;
				@Pc(155) int local155 = local137 * local90 >> 8;
				@Pc(164) int local164 = this.anIntArray353[0] * local155 >> 12;
				@Pc(173) int local173 = local143 * this.anIntArray353[2] >> 12;
				@Pc(182) int local182 = local149 * this.anIntArray353[1] >> 12;
				local11[local55] = local173 + local164 + local182;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		this.method2866();
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
	private void method2866() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3111 / 4096.0F));
		this.anIntArray353[0] = (int) (Math.sin((double) ((float) this.anInt3114 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray353[1] = (int) (Math.cos((double) ((float) this.anInt3114 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray353[2] = (int) (Math.sin((double) ((float) this.anInt3111 / 4096.0F)) * 4096.0D);
		@Pc(80) int local80 = this.anIntArray353[0] * this.anIntArray353[0] >> 12;
		@Pc(92) int local92 = this.anIntArray353[1] * this.anIntArray353[1] >> 12;
		@Pc(104) int local104 = this.anIntArray353[2] * this.anIntArray353[2] >> 12;
		@Pc(118) int local118 = (int) (Math.sqrt((double) (local104 + local80 + local92 >> 12)) * 4096.0D);
		if (local118 != 0) {
			this.anIntArray353[1] = (this.anIntArray353[1] << 12) / local118;
			this.anIntArray353[0] = (this.anIntArray353[0] << 12) / local118;
			this.anIntArray353[2] = (this.anIntArray353[2] << 12) / local118;
		}
	}
}
