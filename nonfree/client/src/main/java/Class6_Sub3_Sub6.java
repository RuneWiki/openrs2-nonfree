import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class6_Sub3_Sub6 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
	private int anInt2052 = 4096;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "[I")
	private final int[] anIntArray274 = new int[3];

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
	private int anInt2055 = 3216;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	private int anInt2057 = 3216;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2052 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt2055 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt2057 = arg1.method6006();
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(30) int local30 = Static520.anInt8968 * this.anInt2052 >> 12;
			@Pc(40) int[] local40 = this.method7824(0, Static252.anInt4135 & arg0 - 1);
			@Pc(46) int[] local46 = this.method7824(0, arg0);
			@Pc(56) int[] local56 = this.method7824(0, arg0 + 1 & Static252.anInt4135);
			for (@Pc(58) int local58 = 0; local58 < Static447.anInt8568; local58++) {
				@Pc(73) int local73 = local30 * (local56[local58] - local40[local58]) >> 12;
				@Pc(93) int local93 = local30 * (local46[Static392.anInt6966 & local58 - 1] - local46[local58 + 1 & Static392.anInt6966]) >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(109) int local109 = local73 >> 4;
				if (local97 > 255) {
					local97 = 255;
				}
				if (local109 < 0) {
					local109 = -local109;
				}
				if (local109 > 255) {
					local109 = 255;
				}
				@Pc(140) int local140 = Class121.aByteArray113[(local109 * (local109 + 1) >> 1) + local97] & 0xFF;
				@Pc(146) int local146 = local93 * local140 >> 8;
				@Pc(152) int local152 = local140 * 4096 >> 8;
				@Pc(158) int local158 = local73 * local140 >> 8;
				@Pc(167) int local167 = local152 * this.anIntArray274[2] >> 12;
				@Pc(176) int local176 = this.anIntArray274[0] * local146 >> 12;
				@Pc(185) int local185 = local158 * this.anIntArray274[1] >> 12;
				local11[local58] = local167 + local176 + local185;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
	private void method1780() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2057 / 4096.0F));
		this.anIntArray274[0] = (int) (Math.sin((double) ((float) this.anInt2055 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray274[1] = (int) (local11 * Math.cos((double) ((float) this.anInt2055 / 4096.0F)) * 4096.0D);
		this.anIntArray274[2] = (int) (Math.sin((double) ((float) this.anInt2057 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray274[0] * this.anIntArray274[0] >> 12;
		@Pc(89) int local89 = this.anIntArray274[1] * this.anIntArray274[1] >> 12;
		@Pc(101) int local101 = this.anIntArray274[2] * this.anIntArray274[2] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local101 + local77 + local89 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray274[1] = (this.anIntArray274[1] << 12) / local115;
			this.anIntArray274[0] = (this.anIntArray274[0] << 12) / local115;
			this.anIntArray274[2] = (this.anIntArray274[2] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		this.method1780();
	}
}
