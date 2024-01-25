import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
	private int anInt527 = 3216;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
	private int anInt528 = 4096;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
	private int anInt529 = 3216;

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "[I")
	private final int[] anIntArray41 = new int[3];

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt528 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt527 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt529 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(28) int local28 = this.anInt528 * Static60.anInt1437 >> 12;
			@Pc(38) int[] local38 = this.method5960(0, Static311.anInt5681 & arg0 - 1);
			@Pc(44) int[] local44 = this.method5960(0, arg0);
			@Pc(54) int[] local54 = this.method5960(0, Static311.anInt5681 & arg0 + 1);
			for (@Pc(56) int local56 = 0; local56 < Static106.anInt2356; local56++) {
				@Pc(71) int local71 = (local54[local56] - local38[local56]) * local28 >> 12;
				@Pc(92) int local92 = (local44[local56 - 1 & Static396.anInt6840] - local44[Static396.anInt6840 & local56 + 1]) * local28 >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local71 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(141) int local141 = Class3_Sub27_Sub1.aByteArray70[local96 + (local100 * (local100 + 1) >> 1)] & 0xFF;
				@Pc(147) int local147 = local141 * 4096 >> 8;
				@Pc(153) int local153 = local71 * local141 >> 8;
				@Pc(159) int local159 = local141 * local92 >> 8;
				@Pc(168) int local168 = this.anIntArray41[0] * local159 >> 12;
				@Pc(177) int local177 = local153 * this.anIntArray41[1] >> 12;
				@Pc(186) int local186 = local147 * this.anIntArray41[2] >> 12;
				local17[local56] = local168 + local177 + local186;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		this.method511();
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(B)V")
	private void method511() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt529 / 4096.0F));
		this.anIntArray41[0] = (int) (Math.sin((double) ((float) this.anInt527 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray41[1] = (int) (Math.cos((double) ((float) this.anInt527 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray41[2] = (int) (Math.sin((double) ((float) this.anInt529 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray41[0] * this.anIntArray41[0] >> 12;
		@Pc(81) int local81 = this.anIntArray41[1] * this.anIntArray41[1] >> 12;
		@Pc(93) int local93 = this.anIntArray41[2] * this.anIntArray41[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray41[0] = (this.anIntArray41[0] << 12) / local112;
			this.anIntArray41[2] = (this.anIntArray41[2] << 12) / local112;
			this.anIntArray41[1] = (this.anIntArray41[1] << 12) / local112;
		}
	}
}
