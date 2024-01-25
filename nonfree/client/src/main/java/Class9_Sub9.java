import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class9_Sub9 extends Class9 {

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public int anInt7169;

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
	public int anInt7170;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	public int anInt7171;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public int anInt7172;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
	public int anInt7173;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Z")
	public boolean aBoolean567 = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Z")
	public boolean method6092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean567) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7170 - this.anInt7169;
		@Pc(16) int local16 = this.anInt7171 - this.anInt7173;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7169 * local10 - this.anInt7173 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7169 - arg0;
			local54 = this.anInt7173 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7172 * this.anInt7172;
		} else if (local42 > local24) {
			local49 = this.anInt7170 - arg0;
			local54 = this.anInt7171 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7172 * this.anInt7172;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7169 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7173 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7172 * this.anInt7172;
		}
	}
}
