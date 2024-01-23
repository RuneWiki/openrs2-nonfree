import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
	private int anInt2340 = 3216;

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
	private int anInt2349 = 4096;

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "[I")
	private int[] anIntArray405 = new int[3];

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
	private int anInt2345 = 3216;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(28) int local28 = this.anInt2349 * Static114.anInt2558 >> 12;
			@Pc(38) int[] local38 = this.method3955(0, arg0 - 1 & Static156.anInt3604);
			@Pc(44) int[] local44 = this.method3955(0, arg0);
			@Pc(54) int[] local54 = this.method3955(0, arg0 + 1 & Static156.anInt3604);
			for (@Pc(56) int local56 = 0; local56 < Static54.anInt953; local56++) {
				@Pc(71) int local71 = (local54[local56] - local38[local56]) * local28 >> 12;
				@Pc(75) int local75 = local71 >> 4;
				@Pc(95) int local95 = local28 * (local44[Static74.anInt1601 & local56 - 1] - local44[local56 + 1 & Static74.anInt1601]) >> 12;
				if (local75 < 0) {
					local75 = -local75;
				}
				if (local75 > 255) {
					local75 = 255;
				}
				@Pc(114) int local114 = local95 >> 4;
				if (local114 < 0) {
					local114 = -local114;
				}
				if (local114 > 255) {
					local114 = 255;
				}
				@Pc(144) int local144 = Class104.aByteArray53[local114 + (local75 * (local75 + 1) >> 1)] & 0xFF;
				@Pc(150) int local150 = local144 * 4096 >> 8;
				@Pc(156) int local156 = local144 * local95 >> 8;
				@Pc(162) int local162 = local71 * local144 >> 8;
				@Pc(171) int local171 = local150 * this.anIntArray405[2] >> 12;
				@Pc(180) int local180 = this.anIntArray405[1] * local162 >> 12;
				@Pc(189) int local189 = this.anIntArray405[0] * local156 >> 12;
				local17[local56] = local189 + local180 + local171;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		this.method1850();
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	private void method1850() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2345 / 4096.0F));
		this.anIntArray405[0] = (int) (Math.sin((double) ((float) this.anInt2340 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray405[1] = (int) (Math.cos((double) ((float) this.anInt2340 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray405[2] = (int) (Math.sin((double) ((float) this.anInt2345 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray405[1] * this.anIntArray405[1] >> 12;
		@Pc(89) int local89 = this.anIntArray405[2] * this.anIntArray405[2] >> 12;
		@Pc(101) int local101 = this.anIntArray405[0] * this.anIntArray405[0] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local89 + local77 + local101 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray405[2] = (this.anIntArray405[2] << 12) / local114;
			this.anIntArray405[0] = (this.anIntArray405[0] << 12) / local114;
			this.anIntArray405[1] = (this.anIntArray405[1] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2349 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt2340 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt2345 = arg0.method2095();
		}
	}
}
