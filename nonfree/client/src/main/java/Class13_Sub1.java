import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "Z")
	public boolean aBoolean23 = false;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Z")
	public boolean method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean23) {
			return false;
		}
		@Pc(10) int local10 = this.anInt555 - this.anInt557;
		@Pc(16) int local16 = this.anInt559 - this.anInt556;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt557 * local10 - this.anInt556 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt557 - arg0;
			local54 = this.anInt556 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt558 * this.anInt558;
		} else if (local42 > local24) {
			local49 = this.anInt555 - arg0;
			local54 = this.anInt559 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt558 * this.anInt558;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt557 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt556 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt558 * this.anInt558;
		}
	}
}
