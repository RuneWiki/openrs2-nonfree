import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class12_Sub5 extends Class12 {

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
	public int anInt3504;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
	public int anInt3505;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	public int anInt3506;

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	public int anInt3507;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
	public int anInt3508;

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)Z")
	public boolean method3067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean256) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3507 - this.anInt3506;
		@Pc(16) int local16 = this.anInt3508 - this.anInt3505;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3506 * local10 - this.anInt3505 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3506 - arg0;
			local54 = this.anInt3505 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3504 * this.anInt3504;
		} else if (local42 > local24) {
			local49 = this.anInt3507 - arg0;
			local54 = this.anInt3508 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3504 * this.anInt3504;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3506 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3505 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3504 * this.anInt3504;
		}
	}
}
