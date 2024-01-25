import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	public int anInt2722;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
	public int anInt2723;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public int anInt2724;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public int anInt2726;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Z")
	public boolean aBoolean269 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	public boolean method2384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean269) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2722 - this.anInt2724;
		@Pc(16) int local16 = this.anInt2726 - this.anInt2725;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2724 * local10 - this.anInt2725 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2724 - arg0;
			local54 = this.anInt2725 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2723 * this.anInt2723;
		} else if (local42 > local24) {
			local49 = this.anInt2722 - arg0;
			local54 = this.anInt2726 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2723 * this.anInt2723;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2724 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2725 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2723 * this.anInt2723;
		}
	}
}
