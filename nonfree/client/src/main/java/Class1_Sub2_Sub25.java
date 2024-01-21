import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
	private int anInt2569;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	private int anInt2562;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)Z")
	private boolean method1708() {
		if (this.anIntArray320 != null) {
			return true;
		} else if (this.anInt2562 >= 0) {
			@Pc(29) int local29 = Static135.anInterface1_2.method110(this.anInt2562) ? 64 : 128;
			this.anIntArray320 = Static135.anInterface1_2.method108(this.anInt2562);
			this.anInt2569 = local29;
			this.anInt2559 = local29;
			return this.anIntArray320 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2562 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193 && this.method1708()) {
			@Pc(40) int local40 = this.anInt2559 * (this.anInt2569 == Static102.anInt2580 ? arg0 : arg0 * this.anInt2569 / Static102.anInt2580);
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt2559 == Static110.anInt2825) {
				for (local62 = 0; local62 < Static110.anInt2825; local62++) {
					local71 = this.anIntArray320[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local48[local62] = local71 >> 4 & 0xFF0;
					local44[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static110.anInt2825; local62++) {
					local71 = this.anInt2559 * local62 / Static110.anInt2825;
					@Pc(78) int local78 = this.anIntArray320[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local48[local62] = local78 >> 4 & 0xFF0;
					local44[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	@Override
	public int method3122() {
		return this.anInt2562;
	}
}
