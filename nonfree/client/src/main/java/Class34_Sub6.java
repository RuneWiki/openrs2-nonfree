import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class34_Sub6 extends Class34 {

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
	public int anInt4988;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
	public int anInt4989;

	@OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
	public int anInt4990;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	public int anInt4991;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public int anInt4992;

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "Z")
	public boolean aBoolean332 = false;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Z")
	public boolean method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean332) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4990 - this.anInt4989;
		@Pc(16) int local16 = this.anInt4991 - this.anInt4988;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4989 * local10 - this.anInt4988 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4989 - arg0;
			local54 = this.anInt4988 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4992 * this.anInt4992;
		} else if (local42 > local24) {
			local49 = this.anInt4990 - arg0;
			local54 = this.anInt4991 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4992 * this.anInt4992;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4989 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4988 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4992 * this.anInt4992;
		}
	}
}
