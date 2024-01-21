import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "[I")
	private final int[] anIntArray258 = new int[3];

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
	private int anInt2631 = 3216;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	private int anInt2634 = 4096;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
	private int anInt2632 = 3216;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2634 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt2631 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt2632 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(27) int local27 = Static165.anInt3384 * this.anInt2634 >> 12;
			@Pc(37) int[] local37 = this.method3265(arg0 - 1 & Static207.anInt4078, 0);
			@Pc(43) int[] local43 = this.method3265(arg0, 0);
			@Pc(53) int[] local53 = this.method3265(arg0 + 1 & Static207.anInt4078, 0);
			for (@Pc(55) int local55 = 0; local55 < Static135.anInt2897; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = local27 * (local43[Static201.anInt3995 & local55 - 1] - local43[local55 + 1 & Static201.anInt3995]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				@Pc(112) int local112 = local70 >> 4;
				if (local112 < 0) {
					local112 = -local112;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				@Pc(141) int local141 = Class2_Sub1_Sub20.aByteArray33[local95 + ((local112 + 1) * local112 >> 1)] & 0xFF;
				@Pc(147) int local147 = local91 * local141 >> 8;
				@Pc(153) int local153 = local141 * local70 >> 8;
				@Pc(162) int local162 = this.anIntArray258[0] * local147 >> 12;
				@Pc(168) int local168 = local141 * 4096 >> 8;
				@Pc(177) int local177 = local168 * this.anIntArray258[2] >> 12;
				@Pc(186) int local186 = this.anIntArray258[1] * local153 >> 12;
				local16[local55] = local177 + local186 + local162;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	private void method2019() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2632 / 4096.0F));
		this.anIntArray258[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt2631 / 4096.0F)));
		this.anIntArray258[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2631 / 4096.0F)));
		this.anIntArray258[2] = (int) (Math.sin((double) ((float) this.anInt2632 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray258[1] * this.anIntArray258[1] >> 12;
		@Pc(81) int local81 = this.anIntArray258[0] * this.anIntArray258[0] >> 12;
		@Pc(93) int local93 = this.anIntArray258[2] * this.anIntArray258[2] >> 12;
		@Pc(108) int local108 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local108 != 0) {
			this.anIntArray258[0] = (this.anIntArray258[0] << 12) / local108;
			this.anIntArray258[1] = (this.anIntArray258[1] << 12) / local108;
			this.anIntArray258[2] = (this.anIntArray258[2] << 12) / local108;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		this.method2019();
	}
}
