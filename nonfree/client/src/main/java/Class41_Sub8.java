import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class41_Sub8 extends Class41 {

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public int anInt7134;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
	public int anInt7135;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	public int anInt7136;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public int anInt7137;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public int anInt7138;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Z")
	public boolean aBoolean441 = false;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)Z")
	public boolean method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean441) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7138 - this.anInt7135;
		@Pc(16) int local16 = this.anInt7136 - this.anInt7134;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7135 * local10 - this.anInt7134 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7135 - arg0;
			local54 = this.anInt7134 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7137 * this.anInt7137;
		} else if (local42 > local24) {
			local49 = this.anInt7138 - arg0;
			local54 = this.anInt7136 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7137 * this.anInt7137;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7135 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7134 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7137 * this.anInt7137;
		}
	}
}
