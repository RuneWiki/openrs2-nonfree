import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z")
	public boolean method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean51) {
			return false;
		}
		@Pc(10) int local10 = this.anInt451 - this.anInt449;
		@Pc(16) int local16 = this.anInt450 - this.anInt447;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt449 * local10 - this.anInt447 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt449 - arg0;
			local54 = this.anInt447 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt448 * this.anInt448;
		} else if (local42 > local24) {
			local49 = this.anInt451 - arg0;
			local54 = this.anInt450 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt448 * this.anInt448;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt449 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt447 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt448 * this.anInt448;
		}
	}
}
