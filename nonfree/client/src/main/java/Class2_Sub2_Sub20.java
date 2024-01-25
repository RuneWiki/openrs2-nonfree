import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
	private int anInt4504 = 1365;

	@OriginalMember(owner = "client!lv", name = "M", descriptor = "I")
	private int anInt4508 = 0;

	@OriginalMember(owner = "client!lv", name = "L", descriptor = "I")
	private int anInt4507 = 0;

	@OriginalMember(owner = "client!lv", name = "R", descriptor = "I")
	private int anInt4510 = 20;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			for (@Pc(23) int local23 = 0; local23 < Static429.anInt6518; local23++) {
				@Pc(37) int local37 = this.anInt4508 + (Static365.anIntArray535[local23] << 12) / this.anInt4504;
				@Pc(49) int local49 = this.anInt4507 + (Static318.anIntArray565[arg0] << 12) / this.anInt4504;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && local71 < this.anInt4510) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local63 + local37 - local69;
					local69 = local57 * local57 >> 12;
					local71++;
					local63 = local55 * local55 >> 12;
				}
				local11[local23] = local71 < this.anInt4510 - 1 ? (local71 << 12) / this.anInt4510 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4504 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt4510 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt4508 = arg0.method5500();
		} else if (arg1 == 3) {
			this.anInt4507 = arg0.method5500();
		}
	}
}
