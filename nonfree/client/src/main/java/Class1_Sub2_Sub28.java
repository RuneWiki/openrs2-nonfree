import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
	private int anInt3094;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
	private int anInt3096;

	@OriginalMember(owner = "client!oe", name = "qb", descriptor = "I")
	private int anInt3101;

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
	private int anInt3098;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			for (@Pc(25) int local25 = 0; local25 < Static110.anInt2825; local25++) {
				@Pc(40) int local40 = (Static86.anIntArray294[local25] << 12) / this.anInt3096 + this.anInt3094;
				@Pc(52) int local52 = this.anInt3101 + (Static37.anIntArray125[arg0] << 12) / this.anInt3096;
				@Pc(58) int local58 = local40;
				@Pc(64) int local64 = local40 * local40 >> 12;
				@Pc(66) int local66 = local52;
				@Pc(72) int local72 = local52 * local52 >> 12;
				@Pc(74) int local74;
				for (local74 = 0; local64 + local72 < 16384 && local74 < this.anInt3098; local74++) {
					local66 = (local66 * local58 >> 12) * 2 + local52;
					local58 = local40 + local64 - local72;
					local64 = local58 * local58 >> 12;
					local72 = local66 * local66 >> 12;
				}
				local19[local25] = this.anInt3098 - 1 > local74 ? (local74 << 12) / this.anInt3098 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3096 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt3098 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt3094 = arg0.method878();
		} else if (arg1 == 3) {
			this.anInt3101 = arg0.method878();
		}
	}
}
