import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
	public int anInt3040;

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public int anInt3042;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public int anInt3044;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Z")
	public boolean aBoolean247 = false;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
	public boolean method2814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean247) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3042 - this.anInt3041;
		@Pc(16) int local16 = this.anInt3044 - this.anInt3043;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3041 * local10 - this.anInt3043 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3041 - arg0;
			local54 = this.anInt3043 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3040 * this.anInt3040;
		} else if (local42 > local24) {
			local49 = this.anInt3042 - arg0;
			local54 = this.anInt3044 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3040 * this.anInt3040;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3041 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3043 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3040 * this.anInt3040;
		}
	}
}
