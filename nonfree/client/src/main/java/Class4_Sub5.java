import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public int anInt7142;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public int anInt7144;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	public int anInt7146;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
	public boolean method6148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean514) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7143 - this.anInt7142;
		@Pc(16) int local16 = this.anInt7145 - this.anInt7144;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7142 * local10 - this.anInt7144 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7142 - arg0;
			local54 = this.anInt7144 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7146 * this.anInt7146;
		} else if (local42 > local24) {
			local49 = this.anInt7143 - arg0;
			local54 = this.anInt7145 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7146 * this.anInt7146;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7142 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7144 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7146 * this.anInt7146;
		}
	}
}
