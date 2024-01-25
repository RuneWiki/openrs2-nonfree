import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
	private int anInt5123 = 8192;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
	private int anInt5122 = 2048;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
	private int anInt5127 = 4096;

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
	private int anInt5131 = 0;

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
	private int anInt5132 = 12288;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
	private int anInt5125 = 0;

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
	private int anInt5134 = 2048;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5134 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt5125 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt5131 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt5122 = arg1.method2161();
		} else if (arg0 == 4) {
			this.anInt5132 = arg1.method2161();
		} else if (arg0 == 5) {
			this.anInt5127 = arg1.method2161();
		} else if (arg0 == 6) {
			this.anInt5123 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		Static113.method2407();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int local26 = Static60.anIntArray122[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static85.anInt1910; local28++) {
				@Pc(36) int local36 = Static273.anIntArray414[local28] - 2048;
				@Pc(41) int local41 = this.anInt5134 + local36;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(59) int local59 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(65) int local65 = local26 + this.anInt5125;
				@Pc(76) int local76 = local65 >= -2048 ? local65 : local65 + 4096;
				@Pc(87) int local87 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(92) int local92 = this.anInt5131 + local36;
				@Pc(101) int local101 = local92 < -2048 ? local92 + 4096 : local92;
				@Pc(112) int local112 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(117) int local117 = this.anInt5122 + local26;
				@Pc(128) int local128 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(139) int local139 = local128 <= 2048 ? local128 : local128 - 4096;
				local16[local28] = this.method4733(local87, local59) || this.method4731(local112, local139) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(III)Z")
	private boolean method4731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt5132 * (arg0 + arg1) >> 12;
		@Pc(22) int local22 = Static6.anIntArray22[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt5132;
		@Pc(36) int local36 = (local29 << 12) / this.anInt5123;
		@Pc(43) int local43 = local36 * this.anInt5127 >> 12;
		return local43 > arg1 - arg0 && -local43 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(III)Z")
	private boolean method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt5132 * (arg0 - arg1) >> 12;
		@Pc(22) int local22 = Static6.anIntArray22[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt5132;
		@Pc(36) int local36 = (local29 << 12) / this.anInt5123;
		@Pc(49) int local49 = this.anInt5127 * local36 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg1 + arg0;
	}
}
