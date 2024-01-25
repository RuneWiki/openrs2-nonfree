import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class88_Sub8 extends Class88 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public int anInt7384;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public int anInt7385;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public int anInt7386;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
	public int anInt7387;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public int anInt7388;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "Z")
	public boolean aBoolean496 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Z")
	public boolean method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean496) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7385 - this.anInt7384;
		@Pc(16) int local16 = this.anInt7388 - this.anInt7387;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7384 * local10 - this.anInt7387 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7384 - arg0;
			local54 = this.anInt7387 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7386 * this.anInt7386;
		} else if (local42 > local24) {
			local49 = this.anInt7385 - arg0;
			local54 = this.anInt7388 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7386 * this.anInt7386;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7384 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7387 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7386 * this.anInt7386;
		}
	}
}
