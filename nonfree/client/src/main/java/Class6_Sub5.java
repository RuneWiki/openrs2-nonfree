import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt4180;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt4181;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public int anInt4182;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt4183;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public int anInt4184;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public boolean method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean358) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4180 - this.anInt4182;
		@Pc(16) int local16 = this.anInt4181 - this.anInt4183;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4182 * local10 - this.anInt4183 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4182 - arg0;
			local54 = this.anInt4183 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4184 * this.anInt4184;
		} else if (local42 > local24) {
			local49 = this.anInt4180 - arg0;
			local54 = this.anInt4181 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4184 * this.anInt4184;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4182 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4183 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4184 * this.anInt4184;
		}
	}
}
