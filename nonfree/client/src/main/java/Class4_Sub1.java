import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	public int anInt28;

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
	public int anInt30;

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Z")
	public boolean method46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean3) {
			return false;
		}
		@Pc(10) int local10 = this.anInt31 - this.anInt28;
		@Pc(16) int local16 = this.anInt32 - this.anInt29;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt28 * local10 - this.anInt29 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt28 - arg0;
			local54 = this.anInt29 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt30 * this.anInt30;
		} else if (local42 > local24) {
			local49 = this.anInt31 - arg0;
			local54 = this.anInt32 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt30 * this.anInt30;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt28 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt29 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt30 * this.anInt30;
		}
	}
}
