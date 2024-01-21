import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
	private int anInt1133 = 4096;

	@OriginalMember(owner = "client!ec", name = "jb", descriptor = "I")
	private int anInt1141 = 3216;

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "[I")
	private final int[] anIntArray95 = new int[3];

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
	private int anInt1140 = 3216;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(28) int local28 = Static59.anInt1436 * this.anInt1133 >> 12;
			@Pc(38) int[] local38 = this.method3580(arg0 - 1 & Static91.anInt2110, 0);
			@Pc(44) int[] local44 = this.method3580(arg0, 0);
			@Pc(54) int[] local54 = this.method3580(Static91.anInt2110 & arg0 + 1, 0);
			for (@Pc(56) int local56 = 0; local56 < Static115.anInt2578; local56++) {
				@Pc(78) int local78 = (local44[local56 - 1 & Static48.anInt1202] - local44[Static48.anInt1202 & local56 + 1]) * local28 >> 12;
				@Pc(82) int local82 = local78 >> 4;
				@Pc(95) int local95 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(99) int local99 = local95 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local82 < 0) {
					local82 = -local82;
				}
				if (local82 > 255) {
					local82 = 255;
				}
				@Pc(135) int local135 = Class1_Sub1_Sub17_Sub1.aByteArray35[((local99 + 1) * local99 >> 1) + local82] & 0xFF;
				@Pc(141) int local141 = local95 * local135 >> 8;
				@Pc(147) int local147 = local135 * 4096 >> 8;
				@Pc(156) int local156 = this.anIntArray95[2] * local147 >> 12;
				@Pc(162) int local162 = local78 * local135 >> 8;
				@Pc(171) int local171 = local162 * this.anIntArray95[0] >> 12;
				@Pc(180) int local180 = local141 * this.anIntArray95[1] >> 12;
				local13[local56] = local156 + local171 + local180;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		this.method822();
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)V")
	private void method822() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1140 / 4096.0F));
		this.anIntArray95[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt1141 / 4096.0F)));
		this.anIntArray95[1] = (int) (Math.cos((double) ((float) this.anInt1141 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray95[2] = (int) (Math.sin((double) ((float) this.anInt1140 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray95[0] * this.anIntArray95[0] >> 12;
		@Pc(89) int local89 = this.anIntArray95[1] * this.anIntArray95[1] >> 12;
		@Pc(101) int local101 = this.anIntArray95[2] * this.anIntArray95[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local101 + local89 + local69 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray95[0] = (this.anIntArray95[0] << 12) / local114;
			this.anIntArray95[1] = (this.anIntArray95[1] << 12) / local114;
			this.anIntArray95[2] = (this.anIntArray95[2] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1133 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt1141 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt1140 = arg0.method2765();
		}
	}
}
