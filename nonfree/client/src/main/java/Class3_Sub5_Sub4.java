import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class3_Sub5_Sub4 extends Class3_Sub5 {

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
	private int anInt738;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		this.method488();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt738 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt734 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt740 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	private void method488() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt740 / 4096.0F));
		this.anIntArray90[0] = (int) (Math.sin((double) ((float) this.anInt734 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray90[1] = (int) (local11 * Math.cos((double) ((float) this.anInt734 / 4096.0F)) * 4096.0D);
		this.anIntArray90[2] = (int) (Math.sin((double) ((float) this.anInt740 / 4096.0F)) * 4096.0D);
		@Pc(76) int local76 = this.anIntArray90[0] * this.anIntArray90[0] >> 12;
		@Pc(88) int local88 = this.anIntArray90[1] * this.anIntArray90[1] >> 12;
		@Pc(100) int local100 = this.anIntArray90[2] * this.anIntArray90[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local76 + local88 + local100 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray90[1] = (this.anIntArray90[1] << 12) / local114;
			this.anIntArray90[2] = (this.anIntArray90[2] << 12) / local114;
			this.anIntArray90[0] = (this.anIntArray90[0] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(30) int local30 = this.anInt738 * Static177.anInt3976 >> 12;
			@Pc(40) int[] local40 = this.method3167(arg0 - 1 & Static23.anInt543, 0);
			@Pc(46) int[] local46 = this.method3167(arg0, 0);
			@Pc(56) int[] local56 = this.method3167(Static23.anInt543 & arg0 + 1, 0);
			for (@Pc(58) int local58 = 0; local58 < Static104.anInt2195; local58++) {
				@Pc(71) int local71 = local30 * (local56[local58] - local40[local58]);
				@Pc(90) int local90 = (local46[Static112.anInt2517 & local58 + 1] - local46[Static112.anInt2517 & local58 - 1]) * local30;
				@Pc(94) int local94 = local90 >> 12;
				@Pc(98) int local98 = local71 >> 12;
				@Pc(104) int local104 = local94 * local94 >> 12;
				@Pc(110) int local110 = local98 * local98 >> 12;
				@Pc(125) int local125 = (int) (Math.sqrt((double) ((float) (local104 + local110 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(142) int local142;
				@Pc(138) int local138;
				if (local125 == 0) {
					local134 = 0;
					local142 = 0;
					local138 = 0;
				} else {
					local134 = local90 / local125;
					local138 = 16777216 / local125;
					local142 = local71 / local125;
				}
				local134 = local134 * this.anIntArray90[0] >> 12;
				local138 = this.anIntArray90[2] * local138 >> 12;
				local142 = local142 * this.anIntArray90[1] >> 12;
				local19[local58] = local134 + local142 + local138;
			}
		}
		return local19;
	}
}
