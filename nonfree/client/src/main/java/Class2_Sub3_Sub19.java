import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ju", name = "S", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ju", name = "V", descriptor = "I")
	private int anInt3297 = 4096;

	@OriginalMember(owner = "client!ju", name = "fb", descriptor = "[I")
	private final int[] anIntArray201 = new int[3];

	@OriginalMember(owner = "client!ju", name = "cb", descriptor = "I")
	private int anInt3304 = 3216;

	@OriginalMember(owner = "client!ju", name = "eb", descriptor = "I")
	private int anInt3306 = 3216;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V", line = 466)
	public Class2_Sub3_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V", line = 78)
	private void method3287() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt3306 / 4096.0F));
		this.anIntArray201[0] = (int) (local19 * 4096.0D * Math.sin((double) ((float) this.anInt3304 / 4096.0F)));
		this.anIntArray201[1] = (int) (Math.cos((double) ((float) this.anInt3304 / 4096.0F)) * 4096.0D * local19);
		this.anIntArray201[2] = (int) (Math.sin((double) ((float) this.anInt3306 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray201[0] * this.anIntArray201[0] >> 12;
		@Pc(89) int local89 = this.anIntArray201[1] * this.anIntArray201[1] >> 12;
		@Pc(101) int local101 = this.anIntArray201[2] * this.anIntArray201[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray201[0] = (this.anIntArray201[0] << 12) / local114;
			this.anIntArray201[1] = (this.anIntArray201[1] << 12) / local114;
			this.anIntArray201[2] = (this.anIntArray201[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V", line = 109)
	@Override
	public void method6481() {
		this.method3287();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)[I", line = 236)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(22) int local22 = Static276.anInt5641 * this.anInt3297 >> 12;
			@Pc(32) int[] local32 = this.method6474(0, arg0 - 1 & Static139.anInt2715);
			@Pc(38) int[] local38 = this.method6474(0, arg0);
			@Pc(48) int[] local48 = this.method6474(0, arg0 + 1 & Static139.anInt2715);
			for (@Pc(50) int local50 = 0; local50 < Static211.anInt4031; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = (local38[local50 - 1 & Static69.anInt1719] - local38[local50 + 1 & Static69.anInt1719]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(102) int local102 = local65 >> 4;
				if (local102 < 0) {
					local102 = -local102;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local102 > 255) {
					local102 = 255;
				}
				@Pc(135) int local135 = Class148.aByteArray39[((local102 + 1) * local102 >> 1) + local90] & 0xFF;
				@Pc(141) int local141 = local135 * local86 >> 8;
				@Pc(147) int local147 = local135 * 4096 >> 8;
				@Pc(153) int local153 = local65 * local135 >> 8;
				@Pc(162) int local162 = this.anIntArray201[2] * local147 >> 12;
				@Pc(171) int local171 = this.anIntArray201[1] * local153 >> 12;
				@Pc(180) int local180 = local141 * this.anIntArray201[0] >> 12;
				local11[local50] = local180 + local171 + local162;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!bt;I)V", line = 414)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3297 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt3304 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt3306 = arg1.method4830();
		}
	}
}
