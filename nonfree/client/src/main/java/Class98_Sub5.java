import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class98_Sub5 extends Class98 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public int anInt7041;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	public int anInt7042;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "I")
	public int anInt7043;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "I")
	public int anInt7044;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	public int anInt7045;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Z")
	public boolean aBoolean491 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)Z")
	public boolean method5878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean491) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7043 - this.anInt7042;
		@Pc(16) int local16 = this.anInt7045 - this.anInt7044;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7042 * local10 - this.anInt7044 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7042 - arg0;
			local54 = this.anInt7044 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7041 * this.anInt7041;
		} else if (local42 > local24) {
			local49 = this.anInt7043 - arg0;
			local54 = this.anInt7045 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7041 * this.anInt7041;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7042 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7044 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7041 * this.anInt7041;
		}
	}
}
