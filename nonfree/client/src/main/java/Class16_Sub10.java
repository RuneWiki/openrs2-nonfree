import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class16_Sub10 extends Class16 {

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
	public int anInt10438;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public int anInt10439;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public int anInt10440;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public int anInt10441;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
	public int anInt10442;

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "Z")
	public boolean aBoolean758 = false;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Z")
	public boolean method8876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean758) {
			return false;
		}
		@Pc(10) int local10 = this.anInt10440 - this.anInt10441;
		@Pc(16) int local16 = this.anInt10439 - this.anInt10438;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt10441 * local10 - this.anInt10438 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt10441 - arg0;
			local54 = this.anInt10438 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10442 * this.anInt10442;
		} else if (local42 > local24) {
			local49 = this.anInt10440 - arg0;
			local54 = this.anInt10439 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10442 * this.anInt10442;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt10441 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt10438 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10442 * this.anInt10442;
		}
	}
}
