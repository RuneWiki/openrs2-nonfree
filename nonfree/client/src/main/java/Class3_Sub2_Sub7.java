import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!gba", name = "A", descriptor = "I")
	private int anInt3434 = 20;

	@OriginalMember(owner = "client!gba", name = "C", descriptor = "I")
	private int anInt3436 = 0;

	@OriginalMember(owner = "client!gba", name = "E", descriptor = "I")
	private int anInt3437 = 1365;

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
	private int anInt3433 = 0;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			for (@Pc(17) int local17 = 0; local17 < Static30.anInt908; local17++) {
				@Pc(32) int local32 = (Static26.anIntArray20[local17] << 12) / this.anInt3437 + this.anInt3436;
				@Pc(44) int local44 = this.anInt3433 + (Static201.anIntArray251[arg0] << 12) / this.anInt3437;
				@Pc(50) int local50 = local32;
				@Pc(52) int local52 = local44;
				@Pc(58) int local58 = local32 * local32 >> 12;
				@Pc(64) int local64 = local44 * local44 >> 12;
				@Pc(66) int local66 = 0;
				while (local64 + local58 < 16384 && local66 < this.anInt3434) {
					local52 = (local52 * local50 >> 12) * 2 + local44;
					local50 = local32 + local58 - local64;
					local58 = local50 * local50 >> 12;
					local66++;
					local64 = local52 * local52 >> 12;
				}
				local11[local17] = local66 >= this.anInt3434 - 1 ? 0 : (local66 << 12) / this.anInt3434;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3437 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt3434 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt3436 = arg0.method4858();
		} else if (arg1 == 3) {
			this.anInt3433 = arg0.method4858();
		}
	}
}
