import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public int anInt4678;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public int anInt4679;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public int anInt4680;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public int anInt4681;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	public int anInt4682;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
	public boolean aBoolean353 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
	public boolean method3788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean353) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4682 - this.anInt4680;
		@Pc(16) int local16 = this.anInt4681 - this.anInt4679;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4680 * local10 - this.anInt4679 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4680 - arg0;
			local54 = this.anInt4679 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4678 * this.anInt4678;
		} else if (local42 > local24) {
			local49 = this.anInt4682 - arg0;
			local54 = this.anInt4681 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4678 * this.anInt4678;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4680 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4679 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4678 * this.anInt4678;
		}
	}
}
