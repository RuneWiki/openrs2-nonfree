import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class41_Sub8 extends Class41 {

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
	public int anInt8512;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
	public int anInt8513;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "I")
	public int anInt8514;

	@OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
	public int anInt8515;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
	public int anInt8516;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "Z")
	public boolean aBoolean658 = false;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(II)Z")
	public boolean method7088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean658) {
			return false;
		}
		@Pc(10) int local10 = this.anInt8512 - this.anInt8513;
		@Pc(16) int local16 = this.anInt8514 - this.anInt8516;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt8513 * local10 - this.anInt8516 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt8513 - arg0;
			local54 = this.anInt8516 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8515 * this.anInt8515;
		} else if (local42 > local24) {
			local49 = this.anInt8512 - arg0;
			local54 = this.anInt8514 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8515 * this.anInt8515;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt8513 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt8516 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt8515 * this.anInt8515;
		}
	}
}
