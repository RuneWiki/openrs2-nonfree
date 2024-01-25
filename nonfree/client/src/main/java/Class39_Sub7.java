import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class39_Sub7 extends Class39 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
	public int anInt4793;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
	public int anInt4794;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Z")
	public boolean method3892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean325) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4793 - this.anInt4794;
		@Pc(16) int local16 = this.anInt4795 - this.anInt4797;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4794 * local10 - this.anInt4797 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4794 - arg0;
			local54 = this.anInt4797 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4796 * this.anInt4796;
		} else if (local42 > local24) {
			local49 = this.anInt4793 - arg0;
			local54 = this.anInt4795 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4796 * this.anInt4796;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4794 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4797 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4796 * this.anInt4796;
		}
	}
}
