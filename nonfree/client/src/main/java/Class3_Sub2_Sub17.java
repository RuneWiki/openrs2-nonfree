import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class3_Sub2_Sub17 extends Class3_Sub2 {

	@OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
	private int anInt2076 = 20;

	@OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
	private int anInt2071 = 0;

	@OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
	private int anInt2075 = 1365;

	@OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
	private int anInt2077 = 0;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			for (@Pc(25) int local25 = 0; local25 < Static190.anInt3865; local25++) {
				@Pc(39) int local39 = this.anInt2071 + (Static133.anIntArray187[local25] << 12) / this.anInt2075;
				@Pc(51) int local51 = this.anInt2077 + (Static34.anIntArray37[arg0] << 12) / this.anInt2075;
				@Pc(55) int local55 = local51;
				@Pc(61) int local61 = local39 * local39 >> 12;
				@Pc(67) int local67 = local51 * local51 >> 12;
				@Pc(71) int local71 = local39;
				@Pc(73) int local73 = 0;
				while (local67 + local61 < 16384 && this.anInt2076 > local73) {
					local55 = local51 + (local55 * local71 >> 12) * 2;
					local73++;
					local71 = local39 + local61 - local67;
					local67 = local55 * local55 >> 12;
					local61 = local71 * local71 >> 12;
				}
				local19[local25] = this.anInt2076 - 1 <= local73 ? 0 : (local73 << 12) / this.anInt2076;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2075 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt2076 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt2071 = arg0.method1270();
		} else if (arg1 == 3) {
			this.anInt2077 = arg0.method1270();
		}
	}
}
