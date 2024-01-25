import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class1_Sub4_Sub37 extends Class1_Sub4 {

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	private int anInt7145 = 3216;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	private int anInt7148 = 3216;

	@OriginalMember(owner = "client!we", name = "P", descriptor = "[I")
	private final int[] anIntArray644 = new int[3];

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
	private int anInt7151 = 4096;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt7151 = arg1.method5362();
		} else if (arg0 == 1) {
			this.anInt7145 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt7148 = arg1.method5362();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		this.method5853();
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "(I)V")
	private void method5853() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt7148 / 4096.0F));
		this.anIntArray644[0] = (int) (local11 * Math.sin((double) ((float) this.anInt7145 / 4096.0F)) * 4096.0D);
		this.anIntArray644[1] = (int) (Math.cos((double) ((float) this.anInt7145 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray644[2] = (int) (Math.sin((double) ((float) this.anInt7148 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray644[0] * this.anIntArray644[0] >> 12;
		@Pc(89) int local89 = this.anIntArray644[1] * this.anIntArray644[1] >> 12;
		@Pc(101) int local101 = this.anIntArray644[2] * this.anIntArray644[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local77 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray644[2] = (this.anIntArray644[2] << 12) / local114;
			this.anIntArray644[1] = (this.anIntArray644[1] << 12) / local114;
			this.anIntArray644[0] = (this.anIntArray644[0] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(27) int local27 = Static278.anInt4895 * this.anInt7151 >> 12;
			@Pc(37) int[] local37 = this.method5958(Static67.anInt1514 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method5958(arg0, 0);
			@Pc(55) int[] local55 = this.method5958(arg0 + 1 & Static67.anInt1514, 0);
			for (@Pc(57) int local57 = 0; local57 < Static66.anInt1511; local57++) {
				@Pc(71) int local71 = local27 * (local55[local57] - local37[local57]) >> 12;
				@Pc(92) int local92 = (local43[local57 - 1 & Static393.anInt6315] - local43[local57 + 1 & Static393.anInt6315]) * local27 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				@Pc(105) int local105 = local71 >> 4;
				if (local105 < 0) {
					local105 = -local105;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local105 > 255) {
					local105 = 255;
				}
				@Pc(139) int local139 = Class225.aByteArray79[(local105 * (local105 + 1) >> 1) + local96] & 0xFF;
				@Pc(145) int local145 = local139 * local92 >> 8;
				@Pc(151) int local151 = local71 * local139 >> 8;
				@Pc(157) int local157 = local139 * 4096 >> 8;
				@Pc(166) int local166 = local145 * this.anIntArray644[0] >> 12;
				@Pc(175) int local175 = local157 * this.anIntArray644[2] >> 12;
				@Pc(184) int local184 = this.anIntArray644[1] * local151 >> 12;
				local11[local57] = local184 + local166 + local175;
			}
		}
		return local11;
	}
}
