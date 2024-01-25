import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class7_Sub3_Sub24 extends Class7_Sub3 {

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	private int anInt4867 = 3216;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "I")
	private int anInt4866 = 3216;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	private int anInt4865 = 4096;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
	private final int[] anIntArray434 = new int[3];

	static {
		new Class55("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			@Pc(27) int local27 = Static322.anInt5332 * this.anInt4865 >> 12;
			@Pc(37) int[] local37 = this.method5591(0, Static25.anInt366 & arg0 - 1);
			@Pc(43) int[] local43 = this.method5591(0, arg0);
			@Pc(53) int[] local53 = this.method5591(0, arg0 + 1 & Static25.anInt366);
			for (@Pc(55) int local55 = 0; local55 < Static58.anInt1052; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(90) int local90 = (local43[local55 - 1 & Static410.anInt6497] - local43[Static410.anInt6497 & local55 + 1]) * local27 >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(106) int local106 = local70 >> 4;
				if (local106 < 0) {
					local106 = -local106;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				@Pc(137) int local137 = Class7_Sub19.aByteArray30[((local106 + 1) * local106 >> 1) + local94] & 0xFF;
				@Pc(143) int local143 = local137 * 4096 >> 8;
				@Pc(149) int local149 = local90 * local137 >> 8;
				@Pc(155) int local155 = local137 * local70 >> 8;
				@Pc(164) int local164 = local155 * this.anIntArray434[1] >> 12;
				@Pc(173) int local173 = local143 * this.anIntArray434[2] >> 12;
				@Pc(182) int local182 = this.anIntArray434[0] * local149 >> 12;
				local11[local55] = local164 + local182 + local173;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
	@Override
	public void method5593() {
		this.method3869();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt4865 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt4867 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt4866 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	private void method3869() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4866 / 4096.0F));
		this.anIntArray434[0] = (int) (Math.sin((double) ((float) this.anInt4867 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray434[1] = (int) (Math.cos((double) ((float) this.anInt4867 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray434[2] = (int) ((double) 4096 * Math.sin((double) ((float) this.anInt4866 / 4096.0F)));
		@Pc(70) int local70 = this.anIntArray434[0] * this.anIntArray434[0] >> 12;
		@Pc(82) int local82 = this.anIntArray434[1] * this.anIntArray434[1] >> 12;
		@Pc(94) int local94 = this.anIntArray434[2] * this.anIntArray434[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local94 + local70 + local82 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray434[0] = (this.anIntArray434[0] << 12) / local107;
			this.anIntArray434[1] = (this.anIntArray434[1] << 12) / local107;
			this.anIntArray434[2] = (this.anIntArray434[2] << 12) / local107;
		}
	}
}
