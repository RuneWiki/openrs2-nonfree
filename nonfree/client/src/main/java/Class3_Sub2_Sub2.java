import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "[I")
	private final int[] anIntArray14 = new int[3];

	@OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
	private int anInt186 = 3216;

	@OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
	private int anInt188 = 4096;

	@OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
	private int anInt192 = 3216;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(30) int local30 = Static90.anInt2314 * this.anInt188 >> 12;
			@Pc(40) int[] local40 = this.method8340(Static46.anInt1029 & arg0 - 1, 0);
			@Pc(46) int[] local46 = this.method8340(arg0, 0);
			@Pc(56) int[] local56 = this.method8340(Static46.anInt1029 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static164.anInt8839; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[Static52.anInt1120 & local58 - 1] - local46[local58 + 1 & Static52.anInt1120]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				@Pc(110) int local110 = local73 >> 4;
				if (local110 < 0) {
					local110 = -local110;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local110 > 255) {
					local110 = 255;
				}
				@Pc(146) int local146 = Class3_Sub2_Sub24.aByteArray73[((local110 + 1) * local110 >> 1) + local98] & 0xFF;
				@Pc(152) int local152 = local94 * local146 >> 8;
				@Pc(158) int local158 = local146 * 4096 >> 8;
				@Pc(164) int local164 = local146 * local73 >> 8;
				@Pc(173) int local173 = this.anIntArray14[0] * local152 >> 12;
				@Pc(182) int local182 = this.anIntArray14[2] * local158 >> 12;
				@Pc(191) int local191 = local164 * this.anIntArray14[1] >> 12;
				local11[local58] = local182 + local173 + local191;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
	private void method255() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt192 / 4096.0F));
		this.anIntArray14[0] = (int) ((double) 4096 * Math.sin((double) ((float) this.anInt186 / 4096.0F)) * local11);
		this.anIntArray14[1] = (int) (Math.cos((double) ((float) this.anInt186 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray14[2] = (int) (Math.sin((double) ((float) this.anInt192 / 4096.0F)) * 4096.0D);
		@Pc(70) int local70 = this.anIntArray14[0] * this.anIntArray14[0] >> 12;
		@Pc(82) int local82 = this.anIntArray14[1] * this.anIntArray14[1] >> 12;
		@Pc(94) int local94 = this.anIntArray14[2] * this.anIntArray14[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local70 + local82 + local94 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray14[2] = (this.anIntArray14[2] << 12) / local107;
			this.anIntArray14[0] = (this.anIntArray14[0] << 12) / local107;
			this.anIntArray14[1] = (this.anIntArray14[1] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		this.method255();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt188 = arg1.method8414();
		} else if (arg0 == 1) {
			this.anInt186 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt192 = arg1.method8414();
		}
	}
}
