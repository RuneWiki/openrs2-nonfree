import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class41_Sub4 extends Class41 {

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
	public int anInt4531;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
	public int anInt4533;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
	public int anInt4534;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)Z")
	public boolean method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean334) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4534 - this.anInt4531;
		@Pc(16) int local16 = this.anInt4535 - this.anInt4533;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4531 * local10 - this.anInt4533 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4531 - arg0;
			local54 = this.anInt4533 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4532 * this.anInt4532;
		} else if (local42 > local24) {
			local49 = this.anInt4534 - arg0;
			local54 = this.anInt4535 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4532 * this.anInt4532;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4531 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4533 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4532 * this.anInt4532;
		}
	}
}
