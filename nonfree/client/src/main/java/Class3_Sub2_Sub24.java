import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class3_Sub2_Sub24 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
	private int anInt2991 = 4096;

	@OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
	private int anInt2989 = 3216;

	@OriginalMember(owner = "client!oh", name = "fb", descriptor = "[I")
	private final int[] anIntArray210 = new int[3];

	@OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
	private int anInt2994 = 3216;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(30) int local30 = this.anInt2991 * Static28.anInt579 >> 12;
			@Pc(40) int[] local40 = this.method3328(0, Static170.anInt1101 & arg0 - 1);
			@Pc(46) int[] local46 = this.method3328(0, arg0);
			@Pc(56) int[] local56 = this.method3328(0, arg0 + 1 & Static170.anInt1101);
			for (@Pc(58) int local58 = 0; local58 < Static190.anInt3865; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(93) int local93 = (local46[Static134.anInt2681 & local58 - 1] - local46[Static134.anInt2681 & local58 + 1]) * local30 >> 12;
				@Pc(97) int local97 = local93 >> 4;
				@Pc(101) int local101 = local73 >> 4;
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(140) int local140 = Class34_Sub2_Sub1.aByteArray8[((local101 + 1) * local101 >> 1) + local97] & 0xFF;
				@Pc(146) int local146 = local140 * local93 >> 8;
				@Pc(152) int local152 = local140 * local73 >> 8;
				@Pc(161) int local161 = this.anIntArray210[1] * local152 >> 12;
				@Pc(167) int local167 = local140 * 4096 >> 8;
				@Pc(176) int local176 = local146 * this.anIntArray210[0] >> 12;
				@Pc(185) int local185 = local167 * this.anIntArray210[2] >> 12;
				local19[local58] = local161 + local176 + local185;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2991 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt2994 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt2989 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "(B)V")
	private void method2121() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt2989 / 4096.0F));
		this.anIntArray210[0] = (int) (local7 * Math.sin((double) ((float) this.anInt2994 / 4096.0F)) * 4096.0D);
		this.anIntArray210[1] = (int) (local7 * 4096.0D * Math.cos((double) ((float) this.anInt2994 / 4096.0F)));
		this.anIntArray210[2] = (int) (Math.sin((double) ((float) this.anInt2989 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray210[2] * this.anIntArray210[2] >> 12;
		@Pc(81) int local81 = this.anIntArray210[0] * this.anIntArray210[0] >> 12;
		@Pc(93) int local93 = this.anIntArray210[1] * this.anIntArray210[1] >> 12;
		@Pc(116) int local116 = (int) (Math.sqrt((double) (local81 + local93 + local69 >> 12)) * 4096.0D);
		if (local116 != 0) {
			this.anIntArray210[2] = (this.anIntArray210[2] << 12) / local116;
			this.anIntArray210[0] = (this.anIntArray210[0] << 12) / local116;
			this.anIntArray210[1] = (this.anIntArray210[1] << 12) / local116;
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		this.method2121();
	}
}
