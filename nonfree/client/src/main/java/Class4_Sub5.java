import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
	public int anInt3544;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public int anInt3545;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
	public int anInt3546;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public int anInt3547;

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
	public int anInt3548;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Z")
	public boolean method3036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean227) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3545 - this.anInt3546;
		@Pc(16) int local16 = this.anInt3547 - this.anInt3548;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3546 * local10 - this.anInt3548 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3546 - arg0;
			local54 = this.anInt3548 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3544 * this.anInt3544;
		} else if (local42 > local24) {
			local49 = this.anInt3545 - arg0;
			local54 = this.anInt3547 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3544 * this.anInt3544;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3546 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3548 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3544 * this.anInt3544;
		}
	}
}
