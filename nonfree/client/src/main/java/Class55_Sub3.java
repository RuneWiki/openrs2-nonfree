import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class55_Sub3 extends Class55 {

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "I")
	public int anInt3934;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	public int anInt3935;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	public int anInt3936;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
	public int anInt3937;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
	public int anInt3938;

	@OriginalMember(owner = "client!ht", name = "k", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)Z")
	public boolean method3387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean304) {
			return false;
		}
		@Pc(10) int local10 = this.anInt3938 - this.anInt3936;
		@Pc(16) int local16 = this.anInt3935 - this.anInt3937;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt3936 * local10 - this.anInt3937 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt3936 - arg0;
			local54 = this.anInt3937 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3934 * this.anInt3934;
		} else if (local42 > local24) {
			local49 = this.anInt3938 - arg0;
			local54 = this.anInt3935 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3934 * this.anInt3934;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt3936 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt3937 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt3934 * this.anInt3934;
		}
	}
}
