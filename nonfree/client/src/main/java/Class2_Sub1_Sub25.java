import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	private int anInt3598 = 4096;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
	private int anInt3601 = 3216;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	private int anInt3603 = 3216;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "[I")
	private int[] anIntArray357 = new int[3];

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(29) int local29 = this.anInt3598 * Static28.anInt627 >> 12;
			@Pc(39) int[] local39 = this.method4601(Static107.anInt2459 & arg0 - 1, 0);
			@Pc(47) int[] local47 = this.method4601(arg0, 0);
			@Pc(57) int[] local57 = this.method4601(arg0 + 1 & Static107.anInt2459, 0);
			for (@Pc(59) int local59 = 0; local59 < Static281.anInt5558; local59++) {
				@Pc(79) int local79 = (local57[local59] - local39[local59]) * local29 >> 12;
				@Pc(99) int local99 = (local47[local59 - 1 & Static226.anInt6054] - local47[local59 + 1 & Static226.anInt6054]) * local29 >> 12;
				@Pc(103) int local103 = local79 >> 4;
				@Pc(107) int local107 = local99 >> 4;
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				if (local107 < 0) {
					local107 = -local107;
				}
				if (local107 > 255) {
					local107 = 255;
				}
				@Pc(151) int local151 = Class2_Sub1_Sub36.aByteArray50[((local103 + 1) * local103 >> 1) + local107] & 0xFF;
				@Pc(157) int local157 = local151 * 4096 >> 8;
				@Pc(166) int local166 = local157 * this.anIntArray357[2] >> 12;
				@Pc(172) int local172 = local151 * local79 >> 8;
				@Pc(181) int local181 = local172 * this.anIntArray357[1] >> 12;
				@Pc(187) int local187 = local151 * local99 >> 8;
				@Pc(196) int local196 = this.anIntArray357[0] * local187 >> 12;
				local9[local59] = local196 + local181 + local166;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		this.method2973();
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V")
	private void method2973() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3601 / 4096.0F));
		this.anIntArray357[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt3603 / 4096.0F)));
		this.anIntArray357[1] = (int) (Math.cos((double) ((float) this.anInt3603 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray357[2] = (int) (Math.sin((double) ((float) this.anInt3601 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray357[0] * this.anIntArray357[0] >> 12;
		@Pc(81) int local81 = this.anIntArray357[1] * this.anIntArray357[1] >> 12;
		@Pc(93) int local93 = this.anIntArray357[2] * this.anIntArray357[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray357[1] = (this.anIntArray357[1] << 12) / local106;
			this.anIntArray357[0] = (this.anIntArray357[0] << 12) / local106;
			this.anIntArray357[2] = (this.anIntArray357[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3598 = arg0.method2130();
		} else if (arg1 == 1) {
			this.anInt3603 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt3601 = arg0.method2130();
		}
	}
}
