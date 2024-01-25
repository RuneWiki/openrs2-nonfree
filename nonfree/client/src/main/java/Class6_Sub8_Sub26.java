import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class6_Sub8_Sub26 extends Class6_Sub8 {

	@OriginalMember(owner = "client!oga", name = "E", descriptor = "I")
	private int anInt7293 = 3216;

	@OriginalMember(owner = "client!oga", name = "K", descriptor = "I")
	private int anInt7295 = 3216;

	@OriginalMember(owner = "client!oga", name = "F", descriptor = "I")
	private int anInt7297 = 4096;

	@OriginalMember(owner = "client!oga", name = "D", descriptor = "[I")
	private final int[] anIntArray468 = new int[3];

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7297 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt7293 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt7295 = arg1.method3018();
		}
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
	private void method6507() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt7295 / 4096.0F));
		this.anIntArray468[0] = (int) (Math.sin((double) ((float) this.anInt7293 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray468[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt7293 / 4096.0F)));
		this.anIntArray468[2] = (int) (Math.sin((double) ((float) this.anInt7295 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray468[0] * this.anIntArray468[0] >> 12;
		@Pc(81) int local81 = this.anIntArray468[1] * this.anIntArray468[1] >> 12;
		@Pc(93) int local93 = this.anIntArray468[2] * this.anIntArray468[2] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray468[2] = (this.anIntArray468[2] << 12) / local115;
			this.anIntArray468[0] = (this.anIntArray468[0] << 12) / local115;
			this.anIntArray468[1] = (this.anIntArray468[1] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		this.method6507();
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(22) int local22 = this.anInt7297 * Static126.anInt2533 >> 12;
			@Pc(32) int[] local32 = this.method8930(arg0 - 1 & Static165.anInt3453, 0);
			@Pc(38) int[] local38 = this.method8930(arg0, 0);
			@Pc(48) int[] local48 = this.method8930(arg0 + 1 & Static165.anInt3453, 0);
			for (@Pc(50) int local50 = 0; local50 < Static83.anInt1268; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = local22 * (local38[local50 - 1 & Static333.anInt5727] - local38[local50 + 1 & Static333.anInt5727]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				@Pc(94) int local94 = local65 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				@Pc(133) int local133 = Class272.aByteArray73[((local94 + 1) * local94 >> 1) + local90] & 0xFF;
				@Pc(139) int local139 = local133 * local65 >> 8;
				@Pc(145) int local145 = local133 * 4096 >> 8;
				@Pc(151) int local151 = local86 * local133 >> 8;
				@Pc(160) int local160 = this.anIntArray468[1] * local139 >> 12;
				@Pc(169) int local169 = this.anIntArray468[0] * local151 >> 12;
				@Pc(178) int local178 = this.anIntArray468[2] * local145 >> 12;
				local11[local50] = local178 + local160 + local169;
			}
		}
		return local11;
	}
}
