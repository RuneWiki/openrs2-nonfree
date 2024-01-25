import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	public int anInt3059;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public int anInt3060;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	public int anInt3061;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	public int anInt3062;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	public int anInt3063;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
	public boolean aBoolean237 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
	public boolean method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean237) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3061 - this.anInt3059;
		@Pc(16) int local16 = this.anInt3063 - this.anInt3060;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3059 * local10 - this.anInt3060 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3059 - arg0;
			local54 = this.anInt3060 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3062 * this.anInt3062;
		} else if (local42 > local24) {
			local49 = this.anInt3061 - arg0;
			local54 = this.anInt3063 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3062 * this.anInt3062;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3059 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3060 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3062 * this.anInt3062;
		}
	}
}
