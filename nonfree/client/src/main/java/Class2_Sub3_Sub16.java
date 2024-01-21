import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!m", name = "qb", descriptor = "I")
	private int anInt2496;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!m", name = "ob", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!m", name = "mb", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2489 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt2496 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt2493 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(29) int[] local29 = this.method2901(0, arg0 - 1 & Static1.anInt2959);
			@Pc(35) int[] local35 = this.method2901(0, arg0);
			@Pc(47) int[] local47 = this.method2901(0, arg0 + 1 & Static1.anInt2959);
			for (@Pc(49) int local49 = 0; local49 < Static54.anInt1423; local49++) {
				@Pc(63) int local63 = this.anInt2489 * (local47[local49] - local29[local49]);
				@Pc(83) int local83 = (local35[local49 + 1 & Static73.anInt1916] - local35[Static73.anInt1916 & local49 - 1]) * this.anInt2489;
				@Pc(87) int local87 = local63 >> 12;
				@Pc(93) int local93 = local87 * local87 >> 12;
				@Pc(97) int local97 = local83 >> 12;
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((local103 + local93 + 4096) / 4096)) * 4096.0D);
				@Pc(124) int local124;
				@Pc(126) int local126;
				@Pc(128) int local128;
				if (local117 == 0) {
					local124 = 0;
					local126 = 0;
					local128 = 0;
				} else {
					local124 = local83 / local117;
					local126 = local63 / local117;
					local128 = 16777216 / local117;
				}
				local126 = this.anIntArray230[1] * local126 >> 12;
				local124 = this.anIntArray230[0] * local124 >> 12;
				local128 = this.anIntArray230[2] * local128 >> 12;
				local15[local49] = local126 + local124 + local128;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		this.method1765();
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(Z)V")
	private void method1765() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt2493 / 4096));
		this.anIntArray230[0] = (int) (Math.sin((double) (this.anInt2496 / 4096)) * 4096.0D * local10);
		this.anIntArray230[1] = (int) (local10 * 4096.0D * Math.cos((double) (this.anInt2496 / 4096)));
		this.anIntArray230[2] = (int) (Math.sin((double) (this.anInt2493 / 4096)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray230[1] * this.anIntArray230[1] >> 12;
		@Pc(81) int local81 = this.anIntArray230[0] * this.anIntArray230[0] >> 12;
		@Pc(93) int local93 = this.anIntArray230[2] * this.anIntArray230[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray230[0] = (this.anIntArray230[0] << 12) / local106;
			this.anIntArray230[1] = (this.anIntArray230[1] << 12) / local106;
			this.anIntArray230[2] = (this.anIntArray230[2] << 12) / local106;
		}
	}
}
