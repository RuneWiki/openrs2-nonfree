import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "I")
	public int anInt7890;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	public int anInt7891;

	@OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
	public int anInt7892;

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
	public int anInt7893;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
	public int anInt7894;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Z")
	public boolean aBoolean558 = false;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)Z")
	public boolean method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean558) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7893 - this.anInt7890;
		@Pc(16) int local16 = this.anInt7891 - this.anInt7892;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7890 * local10 - this.anInt7892 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7890 - arg0;
			local54 = this.anInt7892 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7894 * this.anInt7894;
		} else if (local42 > local24) {
			local49 = this.anInt7893 - arg0;
			local54 = this.anInt7891 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7894 * this.anInt7894;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7890 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7892 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7894 * this.anInt7894;
		}
	}
}
