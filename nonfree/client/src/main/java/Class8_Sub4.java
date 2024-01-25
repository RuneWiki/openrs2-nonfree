import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public int anInt3261;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt3262;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public int anInt3263;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
	public int anInt3264;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Z")
	public boolean method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean251) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3260 - this.anInt3263;
		@Pc(16) int local16 = this.anInt3262 - this.anInt3264;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3263 * local10 - this.anInt3264 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3263 - arg0;
			local54 = this.anInt3264 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3261 * this.anInt3261;
		} else if (local42 > local24) {
			local49 = this.anInt3260 - arg0;
			local54 = this.anInt3262 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3261 * this.anInt3261;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3263 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3264 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3261 * this.anInt3261;
		}
	}
}
