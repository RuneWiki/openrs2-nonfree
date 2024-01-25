import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	private int anInt2133 = 0;

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	private int anInt2139 = 20;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private int anInt2135 = 0;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	private int anInt2141 = 1365;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2141 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt2139 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt2135 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt2133 = arg0.method3056();
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			for (@Pc(22) int local22 = 0; local22 < Static236.anInt4609; local22++) {
				@Pc(37) int local37 = (Static201.anIntArray324[local22] << 12) / this.anInt2141 + this.anInt2135;
				@Pc(49) int local49 = this.anInt2133 + (Static305.anIntArray416[arg0] << 12) / this.anInt2141;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local63 + local69 < 16384 && local71 < this.anInt2139) {
					local57 = local49 + (local57 * local55 >> 12) * 2;
					local55 = local63 + local37 - local69;
					local71++;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local16[local22] = local71 < this.anInt2139 - 1 ? (local71 << 12) / this.anInt2139 : 0;
			}
		}
		return local16;
	}
}
