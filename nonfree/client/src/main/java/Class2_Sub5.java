import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
	public int anInt3613;

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
	public int anInt3614;

	@OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
	public int anInt3615;

	@OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
	public int anInt3616;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
	public int anInt3617;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)Z")
	public boolean method3182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean303) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3615 - this.anInt3617;
		@Pc(16) int local16 = this.anInt3614 - this.anInt3613;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3617 * local10 - this.anInt3613 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3617 - arg0;
			local54 = this.anInt3613 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3616 * this.anInt3616;
		} else if (local42 > local24) {
			local49 = this.anInt3615 - arg0;
			local54 = this.anInt3614 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3616 * this.anInt3616;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3617 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3613 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3616 * this.anInt3616;
		}
	}
}
