import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class17_Sub6 extends Class17 {

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	public int anInt5052;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt5053;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public int anInt5054;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public int anInt5055;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public int anInt5056;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Z")
	public boolean aBoolean424 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Z")
	public boolean method4180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean424) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5055 - this.anInt5053;
		@Pc(16) int local16 = this.anInt5052 - this.anInt5054;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5053 * local10 - this.anInt5054 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5053 - arg0;
			local54 = this.anInt5054 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5056 * this.anInt5056;
		} else if (local42 > local24) {
			local49 = this.anInt5055 - arg0;
			local54 = this.anInt5052 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5056 * this.anInt5056;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5053 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5054 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5056 * this.anInt5056;
		}
	}
}
