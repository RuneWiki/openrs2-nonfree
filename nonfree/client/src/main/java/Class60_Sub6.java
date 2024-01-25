import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class60_Sub6 extends Class60 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public int anInt7806;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	public int anInt7807;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	public int anInt7808;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
	public int anInt7809;

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
	public int anInt7810;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public boolean method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean513) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7809 - this.anInt7808;
		@Pc(16) int local16 = this.anInt7810 - this.anInt7807;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7808 * local10 - this.anInt7807 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7808 - arg0;
			local54 = this.anInt7807 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7806 * this.anInt7806;
		} else if (local42 > local24) {
			local49 = this.anInt7809 - arg0;
			local54 = this.anInt7810 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7806 * this.anInt7806;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7808 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7807 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7806 * this.anInt7806;
		}
	}
}
