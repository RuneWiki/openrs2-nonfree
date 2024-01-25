import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class21_Sub7 extends Class21 {

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	public int anInt4883;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "I")
	public int anInt4884;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public int anInt4885;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "I")
	public int anInt4887;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Z")
	public boolean aBoolean341 = false;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Z")
	public boolean method3753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean341) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4884 - this.anInt4887;
		@Pc(16) int local16 = this.anInt4883 - this.anInt4885;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4887 * local10 - this.anInt4885 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4887 - arg0;
			local54 = this.anInt4885 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4886 * this.anInt4886;
		} else if (local42 > local24) {
			local49 = this.anInt4884 - arg0;
			local54 = this.anInt4883 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4886 * this.anInt4886;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4887 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4885 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4886 * this.anInt4886;
		}
	}
}
