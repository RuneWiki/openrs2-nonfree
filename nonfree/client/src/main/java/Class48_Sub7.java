import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class48_Sub7 extends Class48 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public int anInt4587;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	public int anInt4588;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	public int anInt4589;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	public int anInt4591;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
	public boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)Z")
	public boolean method4093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean329) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4589 - this.anInt4590;
		@Pc(16) int local16 = this.anInt4587 - this.anInt4591;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4590 * local10 - this.anInt4591 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4590 - arg0;
			local54 = this.anInt4591 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4588 * this.anInt4588;
		} else if (local42 > local24) {
			local49 = this.anInt4589 - arg0;
			local54 = this.anInt4587 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4588 * this.anInt4588;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4590 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4591 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4588 * this.anInt4588;
		}
	}
}
