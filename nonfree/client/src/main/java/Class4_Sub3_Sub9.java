import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class4_Sub3_Sub9 extends Class4_Sub3 {

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
	private int anInt2374 = 20;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
	private int anInt2373 = 0;

	@OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
	private int anInt2378 = 0;

	@OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
	private int anInt2375 = 1365;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			for (@Pc(26) int local26 = 0; local26 < Static304.anInt5637; local26++) {
				@Pc(40) int local40 = (Static231.anIntArray368[local26] << 12) / this.anInt2375 + this.anInt2373;
				@Pc(53) int local53 = (Static376.anIntArray531[arg0] << 12) / this.anInt2375 + this.anInt2378;
				@Pc(59) int local59 = local40;
				@Pc(61) int local61 = local53;
				@Pc(67) int local67 = local40 * local40 >> 12;
				@Pc(73) int local73 = local53 * local53 >> 12;
				@Pc(75) int local75;
				for (local75 = 0; local67 + local73 < 16384 && this.anInt2374 > local75; local75++) {
					local61 = (local61 * local59 >> 12) * 2 + local53;
					local59 = local67 + local40 - local73;
					local67 = local59 * local59 >> 12;
					local73 = local61 * local61 >> 12;
				}
				local20[local26] = local75 >= this.anInt2374 - 1 ? 0 : (local75 << 12) / this.anInt2374;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2375 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt2374 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt2373 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt2378 = arg1.method4560();
		}
	}
}
