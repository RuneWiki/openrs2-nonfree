import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public int anInt853;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public int anInt854;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public int anInt855;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	public int anInt856;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public int anInt857;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
	public boolean method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean47) {
			return false;
		}
		@Pc(10) int local10 = this.anInt855 - this.anInt854;
		@Pc(16) int local16 = this.anInt857 - this.anInt853;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt854 * local10 - this.anInt853 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt854 - arg0;
			local54 = this.anInt853 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt856 * this.anInt856;
		} else if (local42 > local24) {
			local49 = this.anInt855 - arg0;
			local54 = this.anInt857 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt856 * this.anInt856;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt854 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt853 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt856 * this.anInt856;
		}
	}
}
