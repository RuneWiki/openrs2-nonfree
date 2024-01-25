import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!es", name = "J", descriptor = "I")
	private int anInt2228 = 8192;

	@OriginalMember(owner = "client!es", name = "N", descriptor = "I")
	private int anInt2232 = 0;

	@OriginalMember(owner = "client!es", name = "H", descriptor = "I")
	private int anInt2226 = 12288;

	@OriginalMember(owner = "client!es", name = "R", descriptor = "I")
	private int anInt2235 = 4096;

	@OriginalMember(owner = "client!es", name = "T", descriptor = "I")
	private int anInt2237 = 0;

	@OriginalMember(owner = "client!es", name = "P", descriptor = "I")
	private int anInt2233 = 2048;

	@OriginalMember(owner = "client!es", name = "S", descriptor = "I")
	private int anInt2236 = 2048;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(BII)Z")
	private boolean method1726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt2226 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static346.anIntArray387[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2226;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2228;
		@Pc(49) int local49 = this.anInt2235 * local42 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2233 = arg0.method2588();
		} else if (arg1 == 1) {
			this.anInt2232 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt2237 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt2236 = arg0.method2588();
		} else if (arg1 == 4) {
			this.anInt2226 = arg0.method2588();
		} else if (arg1 == 5) {
			this.anInt2235 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt2228 = arg0.method2588();
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(III)Z")
	private boolean method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 - arg0) * this.anInt2226 >> 12;
		@Pc(30) int local30 = Static346.anIntArray387[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt2226;
		@Pc(44) int local44 = (local37 << 12) / this.anInt2228;
		@Pc(51) int local51 = local44 * this.anInt2235 >> 12;
		return local51 > arg1 + arg0 && arg1 + arg0 > -local51;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			@Pc(29) int local29 = Static441.anIntArray522[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static406.anInt6694; local31++) {
				@Pc(39) int local39 = Static86.anIntArray125[local31] - 2048;
				@Pc(44) int local44 = this.anInt2233 + local39;
				@Pc(53) int local53 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(67) int local67 = this.anInt2232 + local29;
				@Pc(76) int local76 = local67 >= -2048 ? local67 : local67 + 4096;
				@Pc(85) int local85 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(90) int local90 = this.anInt2237 + local39;
				@Pc(101) int local101 = local90 < -2048 ? local90 + 4096 : local90;
				@Pc(110) int local110 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(115) int local115 = this.anInt2236 + local29;
				@Pc(126) int local126 = local115 < -2048 ? local115 + 4096 : local115;
				@Pc(135) int local135 = local126 > 2048 ? local126 - 4096 : local126;
				local19[local31] = this.method1728(local62, local85) || this.method1726(local110, local135) ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
		Static437.method5734();
	}
}
