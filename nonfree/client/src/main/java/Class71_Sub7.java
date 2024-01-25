import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class71_Sub7 extends Class71 {

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public int anInt7740;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
	public int anInt7741;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public int anInt7742;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public int anInt7743;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
	public int anInt7744;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Z")
	public boolean aBoolean566 = false;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
	public boolean method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean566) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7742 - this.anInt7743;
		@Pc(16) int local16 = this.anInt7740 - this.anInt7744;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7743 * local10 - this.anInt7744 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7743 - arg0;
			local54 = this.anInt7744 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7741 * this.anInt7741;
		} else if (local42 > local24) {
			local49 = this.anInt7742 - arg0;
			local54 = this.anInt7740 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7741 * this.anInt7741;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7743 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7744 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7741 * this.anInt7741;
		}
	}
}
