import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	public int anInt317;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	public int anInt318;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	public boolean method303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean21) {
			return false;
		}
		@Pc(10) int local10 = this.anInt318 - this.anInt317;
		@Pc(16) int local16 = this.anInt316 - this.anInt314;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt317 * local10 - this.anInt314 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt317 - arg0;
			local54 = this.anInt314 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt315 * this.anInt315;
		} else if (local42 > local24) {
			local49 = this.anInt318 - arg0;
			local54 = this.anInt316 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt315 * this.anInt315;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt317 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt314 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt315 * this.anInt315;
		}
	}
}
