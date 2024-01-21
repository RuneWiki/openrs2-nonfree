import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
	private int anInt2068;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	private int anInt2067;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "I")
	private int anInt2072;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2067 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt2068 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt2072 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(31) int[][] local31 = this.method3118(arg0, 0);
			@Pc(35) int[] local35 = local31[1];
			@Pc(39) int[] local39 = local31[0];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static110.anInt2825; local57++) {
				@Pc(63) int local63 = local39[local57];
				@Pc(67) int local67 = local43[local57];
				@Pc(71) int local71 = local35[local57];
				if (local67 == local63 && local67 == local71) {
					local47[local57] = this.anInt2067 * local63 >> 12;
					local51[local57] = this.anInt2068 * local67 >> 12;
					local55[local57] = local71 * this.anInt2072 >> 12;
				} else {
					local47[local57] = this.anInt2067;
					local51[local57] = this.anInt2068;
					local55[local57] = this.anInt2072;
				}
			}
		}
		return local21;
	}
}
