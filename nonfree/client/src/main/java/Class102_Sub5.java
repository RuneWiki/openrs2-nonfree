import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class102_Sub5 extends Class102 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
	public int anInt7448;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	public int anInt7449;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	public int anInt7450;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
	public int anInt7451;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
	public int anInt7452;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Z")
	public boolean aBoolean515 = false;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z")
	public boolean method6173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean515) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7452 - this.anInt7450;
		@Pc(16) int local16 = this.anInt7448 - this.anInt7449;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7450 * local10 - this.anInt7449 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7450 - arg0;
			local54 = this.anInt7449 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7451 * this.anInt7451;
		} else if (local42 > local24) {
			local49 = this.anInt7452 - arg0;
			local54 = this.anInt7448 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7451 * this.anInt7451;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7450 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7449 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7451 * this.anInt7451;
		}
	}
}
