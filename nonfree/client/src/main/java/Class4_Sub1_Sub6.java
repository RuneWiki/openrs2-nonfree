import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "[I")
	private final int[] anIntArray41 = new int[3];

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
	private int anInt1109 = 3216;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	private int anInt1106 = 4096;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	private int anInt1110 = 3216;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	private void method1122() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1109 / 4096.0F));
		this.anIntArray41[0] = (int) (Math.sin((double) ((float) this.anInt1110 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray41[1] = (int) (local11 * Math.cos((double) ((float) this.anInt1110 / 4096.0F)) * 4096.0D);
		this.anIntArray41[2] = (int) (Math.sin((double) ((float) this.anInt1109 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray41[0] * this.anIntArray41[0] >> 12;
		@Pc(85) int local85 = this.anIntArray41[1] * this.anIntArray41[1] >> 12;
		@Pc(97) int local97 = this.anIntArray41[2] * this.anIntArray41[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local85 + local73 + local97 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray41[2] = (this.anIntArray41[2] << 12) / local111;
			this.anIntArray41[1] = (this.anIntArray41[1] << 12) / local111;
			this.anIntArray41[0] = (this.anIntArray41[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(22) int local22 = Static349.anInt6735 * this.anInt1106 >> 12;
			@Pc(32) int[] local32 = this.method8392(Static237.anInt4286 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method8392(arg0, 0);
			@Pc(48) int[] local48 = this.method8392(arg0 + 1 & Static237.anInt4286, 0);
			for (@Pc(50) int local50 = 0; local50 < Static376.anInt7260; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(85) int local85 = local22 * (local38[Static569.anInt9982 & local50 - 1] - local38[Static569.anInt9982 & local50 + 1]) >> 12;
				@Pc(89) int local89 = local85 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				@Pc(101) int local101 = local65 >> 4;
				if (local89 > 255) {
					local89 = 255;
				}
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(136) int local136 = Class4_Sub8.aByteArray72[local89 + ((local101 + 1) * local101 >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * 4096 >> 8;
				@Pc(148) int local148 = local136 * local65 >> 8;
				@Pc(154) int local154 = local85 * local136 >> 8;
				@Pc(163) int local163 = this.anIntArray41[0] * local154 >> 12;
				@Pc(172) int local172 = local142 * this.anIntArray41[2] >> 12;
				@Pc(181) int local181 = local148 * this.anIntArray41[1] >> 12;
				local11[local50] = local172 + local181 + local163;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1106 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt1110 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt1109 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		this.method1122();
	}
}
