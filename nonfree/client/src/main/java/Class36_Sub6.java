import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class36_Sub6 extends Class36 {

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	public int anInt4059;

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	public int anInt4061;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
	public boolean aBoolean317 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Z")
	public boolean method3633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean317) {
			return false;
		}
		@Pc(10) int local10 = this.anInt4063 - this.anInt4061;
		@Pc(16) int local16 = this.anInt4062 - this.anInt4060;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt4061 * local10 - this.anInt4060 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt4061 - arg0;
			local54 = this.anInt4060 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4059 * this.anInt4059;
		} else if (local42 > local24) {
			local49 = this.anInt4063 - arg0;
			local54 = this.anInt4062 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4059 * this.anInt4059;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt4061 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt4060 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt4059 * this.anInt4059;
		}
	}
}
