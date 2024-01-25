import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	public int anInt6639;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
	public int anInt6640;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	public int anInt6641;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
	public int anInt6642;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
	public int anInt6643;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Z")
	public boolean aBoolean437 = false;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)Z")
	public boolean method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean437) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6643 - this.anInt6640;
		@Pc(16) int local16 = this.anInt6639 - this.anInt6642;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6640 * local10 - this.anInt6642 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6640 - arg0;
			local54 = this.anInt6642 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6641 * this.anInt6641;
		} else if (local42 > local24) {
			local49 = this.anInt6643 - arg0;
			local54 = this.anInt6639 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6641 * this.anInt6641;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6640 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6642 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6641 * this.anInt6641;
		}
	}
}
