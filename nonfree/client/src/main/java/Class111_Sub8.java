import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class111_Sub8 extends Class111 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
	public int anInt7282;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	public int anInt7283;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	public int anInt7284;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public int anInt7285;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	public int anInt7286;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "Z")
	public boolean aBoolean631 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)Z")
	public boolean method5889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean631) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7283 - this.anInt7285;
		@Pc(16) int local16 = this.anInt7284 - this.anInt7282;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7285 * local10 - this.anInt7282 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7285 - arg0;
			local54 = this.anInt7282 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7286 * this.anInt7286;
		} else if (local42 > local24) {
			local49 = this.anInt7283 - arg0;
			local54 = this.anInt7284 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7286 * this.anInt7286;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7285 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7282 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7286 * this.anInt7286;
		}
	}
}
