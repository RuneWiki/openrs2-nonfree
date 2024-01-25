import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class10_Sub7 extends Class10 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public int anInt4964;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public int anInt4965;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "I")
	public int anInt4966;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	public int anInt4967;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	public int anInt4968;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z")
	public boolean method4346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean381) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4965 - this.anInt4967;
		@Pc(16) int local16 = this.anInt4966 - this.anInt4964;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4967 * local10 - this.anInt4964 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4967 - arg0;
			local54 = this.anInt4964 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4968 * this.anInt4968;
		} else if (local42 > local24) {
			local49 = this.anInt4965 - arg0;
			local54 = this.anInt4966 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4968 * this.anInt4968;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4967 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4964 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4968 * this.anInt4968;
		}
	}
}
