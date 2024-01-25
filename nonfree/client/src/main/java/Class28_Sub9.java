import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class28_Sub9 extends Class28 {

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	public int anInt10430;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
	public int anInt10431;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
	public int anInt10432;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public int anInt10433;

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
	public int anInt10434;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Z")
	public boolean aBoolean890 = false;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)Z")
	public boolean method8666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean890) {
			return false;
		}
		@Pc(10) int local10 = this.anInt10432 - this.anInt10431;
		@Pc(16) int local16 = this.anInt10430 - this.anInt10433;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt10431 * local10 - this.anInt10433 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt10431 - arg0;
			local54 = this.anInt10433 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10434 * this.anInt10434;
		} else if (local42 > local24) {
			local49 = this.anInt10432 - arg0;
			local54 = this.anInt10430 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10434 * this.anInt10434;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt10431 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt10433 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10434 * this.anInt10434;
		}
	}
}
