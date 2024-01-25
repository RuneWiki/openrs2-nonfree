import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
	public int anInt3111;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
	public int anInt3112;

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
	public int anInt3113;

	@OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
	public int anInt3114;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
	public int anInt3115;

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)Z")
	public boolean method2891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean234) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3113 - this.anInt3114;
		@Pc(16) int local16 = this.anInt3115 - this.anInt3111;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3114 * local10 - this.anInt3111 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3114 - arg0;
			local54 = this.anInt3111 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3112 * this.anInt3112;
		} else if (local42 > local24) {
			local49 = this.anInt3113 - arg0;
			local54 = this.anInt3115 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3112 * this.anInt3112;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3114 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3111 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3112 * this.anInt3112;
		}
	}
}
