import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub3_Sub35 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "[I")
	private int[] anIntArray436 = new int[3];

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
	private int anInt5093 = 3216;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
	private int anInt5091 = 4096;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
	private int anInt5100 = 3216;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
	private void method3867() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5100 / 4096.0F));
		this.anIntArray436[0] = (int) (Math.sin((double) ((float) this.anInt5093 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray436[1] = (int) (Math.cos((double) ((float) this.anInt5093 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray436[2] = (int) (Math.sin((double) ((float) this.anInt5100 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray436[1] * this.anIntArray436[1] >> 12;
		@Pc(89) int local89 = this.anIntArray436[2] * this.anIntArray436[2] >> 12;
		@Pc(101) int local101 = this.anIntArray436[0] * this.anIntArray436[0] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local89 + local77 + local101 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray436[0] = (this.anIntArray436[0] << 12) / local114;
			this.anIntArray436[2] = (this.anIntArray436[2] << 12) / local114;
			this.anIntArray436[1] = (this.anIntArray436[1] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5091 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt5093 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt5100 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		this.method3867();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(28) int local28 = Static197.anInt2335 * this.anInt5091 >> 12;
			@Pc(38) int[] local38 = this.method4117(0, arg0 - 1 & Static42.anInt1193);
			@Pc(44) int[] local44 = this.method4117(0, arg0);
			@Pc(54) int[] local54 = this.method4117(0, arg0 + 1 & Static42.anInt1193);
			for (@Pc(56) int local56 = 0; local56 < Static110.anInt2934; local56++) {
				@Pc(71) int local71 = (local54[local56] - local38[local56]) * local28 >> 12;
				@Pc(91) int local91 = local28 * (local44[local56 - 1 & Static2.anInt38] - local44[local56 + 1 & Static2.anInt38]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local71 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				@Pc(139) int local139 = Class1_Sub5.aByteArray20[((local99 + 1) * local99 >> 1) + local95] & 0xFF;
				@Pc(145) int local145 = local139 * 4096 >> 8;
				@Pc(151) int local151 = local71 * local139 >> 8;
				@Pc(157) int local157 = local139 * local91 >> 8;
				@Pc(166) int local166 = this.anIntArray436[0] * local157 >> 12;
				@Pc(175) int local175 = this.anIntArray436[2] * local145 >> 12;
				@Pc(184) int local184 = this.anIntArray436[1] * local151 >> 12;
				local11[local56] = local175 + local184 + local166;
			}
		}
		return local11;
	}
}
