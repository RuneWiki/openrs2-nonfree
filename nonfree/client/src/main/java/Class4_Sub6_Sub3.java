import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class4_Sub6_Sub3 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bn", name = "S", descriptor = "[I")
	private int[] anIntArray45 = new int[3];

	@OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
	private int anInt480 = 3216;

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
	private int anInt485 = 3216;

	@OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
	private int anInt484 = 4096;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		this.method407();
	}

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "(I)V")
	private void method407() {
		@Pc(19) double local19 = Math.cos((double) ((float) this.anInt480 / 4096.0F));
		this.anIntArray45[0] = (int) (local19 * 4096.0D * Math.sin((double) ((float) this.anInt485 / 4096.0F)));
		this.anIntArray45[1] = (int) (local19 * Math.cos((double) ((float) this.anInt485 / 4096.0F)) * 4096.0D);
		this.anIntArray45[2] = (int) (Math.sin((double) ((float) this.anInt480 / 4096.0F)) * 4096.0D);
		@Pc(77) int local77 = this.anIntArray45[0] * this.anIntArray45[0] >> 12;
		@Pc(89) int local89 = this.anIntArray45[2] * this.anIntArray45[2] >> 12;
		@Pc(101) int local101 = this.anIntArray45[1] * this.anIntArray45[1] >> 12;
		@Pc(115) int local115 = (int) (Math.sqrt((double) (local77 + local101 + local89 >> 12)) * 4096.0D);
		if (local115 != 0) {
			this.anIntArray45[1] = (this.anIntArray45[1] << 12) / local115;
			this.anIntArray45[2] = (this.anIntArray45[2] << 12) / local115;
			this.anIntArray45[0] = (this.anIntArray45[0] << 12) / local115;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(31) int local31 = this.anInt484 * Static296.anInt1764 >> 12;
			@Pc(41) int[] local41 = this.method4372(0, arg0 - 1 & Static137.anInt2812);
			@Pc(47) int[] local47 = this.method4372(0, arg0);
			@Pc(57) int[] local57 = this.method4372(0, arg0 + 1 & Static137.anInt2812);
			for (@Pc(59) int local59 = 0; local59 < Static2.anInt19; local59++) {
				@Pc(82) int local82 = local31 * (local47[Static168.anInt3337 & local59 - 1] - local47[local59 + 1 & Static168.anInt3337]) >> 12;
				@Pc(95) int local95 = (local57[local59] - local41[local59]) * local31 >> 12;
				@Pc(99) int local99 = local82 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(119) int local119 = local95 >> 4;
				if (local119 < 0) {
					local119 = -local119;
				}
				if (local119 > 255) {
					local119 = 255;
				}
				@Pc(147) int local147 = Class87.aByteArray33[local99 + (local119 * (local119 + 1) >> 1)] & 0xFF;
				@Pc(153) int local153 = local147 * 4096 >> 8;
				@Pc(162) int local162 = this.anIntArray45[2] * local153 >> 12;
				@Pc(168) int local168 = local95 * local147 >> 8;
				@Pc(177) int local177 = local168 * this.anIntArray45[1] >> 12;
				@Pc(183) int local183 = local82 * local147 >> 8;
				@Pc(192) int local192 = this.anIntArray45[0] * local183 >> 12;
				local20[local59] = local177 + local192 + local162;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt484 = arg0.method1837();
		} else if (arg1 == 1) {
			this.anInt485 = arg0.method1837();
		} else if (arg1 == 2) {
			this.anInt480 = arg0.method1837();
		}
	}
}
