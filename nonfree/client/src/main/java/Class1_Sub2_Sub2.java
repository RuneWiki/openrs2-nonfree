import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	private void method237() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt423 / 4096));
		this.anIntArray59[0] = (int) (local10 * Math.sin((double) (this.anInt427 / 4096)) * 4096.0D);
		this.anIntArray59[1] = (int) (Math.cos((double) (this.anInt427 / 4096)) * local10 * 4096.0D);
		this.anIntArray59[2] = (int) (Math.sin((double) (this.anInt423 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray59[0] * this.anIntArray59[0] >> 12;
		@Pc(81) int local81 = this.anIntArray59[1] * this.anIntArray59[1] >> 12;
		@Pc(93) int local93 = this.anIntArray59[2] * this.anIntArray59[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local81 + local65 + local93 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray59[1] = (this.anIntArray59[1] << 12) / local106;
			this.anIntArray59[0] = (this.anIntArray59[0] << 12) / local106;
			this.anIntArray59[2] = (this.anIntArray59[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt432 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt427 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt423 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		this.method237();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(31) int[] local31 = this.method3130(0, arg0 - 1 & Static64.anInt1680);
			@Pc(37) int[] local37 = this.method3130(0, arg0);
			@Pc(47) int[] local47 = this.method3130(0, Static64.anInt1680 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static110.anInt2825; local49++) {
				@Pc(63) int local63 = this.anInt432 * (local47[local49] - local31[local49]);
				@Pc(83) int local83 = this.anInt432 * (local37[Static99.anInt2523 & local49 + 1] - local37[local49 - 1 & Static99.anInt2523]);
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((local97 + local103 + 4096) / 4096)) * 4096.0D);
				@Pc(127) int local127;
				@Pc(123) int local123;
				@Pc(131) int local131;
				if (local117 == 0) {
					local131 = 0;
					local123 = 0;
					local127 = 0;
				} else {
					local123 = local63 / local117;
					local127 = local83 / local117;
					local131 = 16777216 / local117;
				}
				local123 = local123 * this.anIntArray59[1] >> 12;
				local131 = local131 * this.anIntArray59[2] >> 12;
				local127 = local127 * this.anIntArray59[0] >> 12;
				local11[local49] = local131 + local123 + local127;
			}
		}
		return local11;
	}
}
