import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class36_Sub8 extends Class36 {

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public int anInt6561;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public int anInt6562;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public int anInt6563;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public int anInt6564;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public int anInt6565;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Z")
	public boolean aBoolean534 = false;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
	public boolean method5132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean534) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6564 - this.anInt6562;
		@Pc(16) int local16 = this.anInt6563 - this.anInt6561;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6562 * local10 - this.anInt6561 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6562 - arg0;
			local54 = this.anInt6561 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6565 * this.anInt6565;
		} else if (local42 > local24) {
			local49 = this.anInt6564 - arg0;
			local54 = this.anInt6563 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6565 * this.anInt6565;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6562 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6561 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6565 * this.anInt6565;
		}
	}
}
