import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nda", name = "E", descriptor = "I")
	private int anInt5776 = 3216;

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "[I")
	private final int[] anIntArray472 = new int[3];

	@OriginalMember(owner = "client!nda", name = "K", descriptor = "I")
	private int anInt5780 = 3216;

	@OriginalMember(owner = "client!nda", name = "L", descriptor = "I")
	private int anInt5781 = 4096;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5781 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt5780 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt5776 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		this.method4733();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(30) int local30 = this.anInt5781 * Static533.anInt8941 >> 12;
			@Pc(40) int[] local40 = this.method7709(arg0 - 1 & Static171.anInt3020, 0);
			@Pc(46) int[] local46 = this.method7709(arg0, 0);
			@Pc(56) int[] local56 = this.method7709(arg0 + 1 & Static171.anInt3020, 0);
			for (@Pc(58) int local58 = 0; local58 < Static279.anInt4906; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[local58 - 1 & Static216.anInt4134] - local46[local58 + 1 & Static216.anInt4134]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				@Pc(107) int local107 = local73 >> 4;
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(136) int local136 = Class119.aByteArray38[((local107 + 1) * local107 >> 1) + local98] & 0xFF;
				@Pc(142) int local142 = local94 * local136 >> 8;
				@Pc(148) int local148 = local73 * local136 >> 8;
				@Pc(154) int local154 = local136 * 4096 >> 8;
				@Pc(163) int local163 = this.anIntArray472[2] * local154 >> 12;
				@Pc(172) int local172 = this.anIntArray472[1] * local148 >> 12;
				@Pc(181) int local181 = local142 * this.anIntArray472[0] >> 12;
				local11[local58] = local163 + local172 + local181;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "(I)V")
	private void method4733() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5776 / 4096.0F));
		this.anIntArray472[0] = (int) (Math.sin((double) ((float) this.anInt5780 / 4096.0F)) * local11 * (double) 4096);
		this.anIntArray472[1] = (int) (Math.cos((double) ((float) this.anInt5780 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray472[2] = (int) (Math.sin((double) ((float) this.anInt5776 / 4096.0F)) * 4096.0D);
		@Pc(70) int local70 = this.anIntArray472[0] * this.anIntArray472[0] >> 12;
		@Pc(82) int local82 = this.anIntArray472[1] * this.anIntArray472[1] >> 12;
		@Pc(94) int local94 = this.anIntArray472[2] * this.anIntArray472[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local82 + local70 + local94 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray472[2] = (this.anIntArray472[2] << 12) / local107;
			this.anIntArray472[0] = (this.anIntArray472[0] << 12) / local107;
			this.anIntArray472[1] = (this.anIntArray472[1] << 12) / local107;
		}
	}
}
