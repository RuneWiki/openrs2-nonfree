import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	public int anInt4697;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public int anInt4699;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
	public int anInt4700;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Z")
	public boolean aBoolean391 = false;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)Z")
	public boolean method3906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean391) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4699 - this.anInt4698;
		@Pc(16) int local16 = this.anInt4697 - this.anInt4696;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4698 * local10 - this.anInt4696 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4698 - arg0;
			local54 = this.anInt4696 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4700 * this.anInt4700;
		} else if (local42 > local24) {
			local49 = this.anInt4699 - arg0;
			local54 = this.anInt4697 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4700 * this.anInt4700;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4698 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4696 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4700 * this.anInt4700;
		}
	}
}
