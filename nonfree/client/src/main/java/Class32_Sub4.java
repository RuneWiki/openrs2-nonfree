import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class32_Sub4 extends Class32 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public int anInt4659;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	public int anInt4661;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public int anInt4663;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Z")
	public boolean aBoolean353 = false;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public boolean method4290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean353) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4663 - this.anInt4660;
		@Pc(16) int local16 = this.anInt4661 - this.anInt4662;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4660 * local10 - this.anInt4662 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4660 - arg0;
			local54 = this.anInt4662 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4659 * this.anInt4659;
		} else if (local42 > local24) {
			local49 = this.anInt4663 - arg0;
			local54 = this.anInt4661 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4659 * this.anInt4659;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4660 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4662 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4659 * this.anInt4659;
		}
	}
}
