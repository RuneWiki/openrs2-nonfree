import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class60_Sub10 extends Class60 {

	@OriginalMember(owner = "client!wha", name = "o", descriptor = "I")
	public int anInt10338;

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public int anInt10339;

	@OriginalMember(owner = "client!wha", name = "k", descriptor = "I")
	public int anInt10340;

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "I")
	public int anInt10341;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
	public int anInt10342;

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "Z")
	public boolean aBoolean765 = false;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)Z")
	public boolean method8918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean765) {
			return false;
		}
		@Pc(10) int local10 = this.anInt10341 - this.anInt10340;
		@Pc(16) int local16 = this.anInt10342 - this.anInt10338;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt10340 * local10 - this.anInt10338 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt10340 - arg0;
			local54 = this.anInt10338 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10339 * this.anInt10339;
		} else if (local42 > local24) {
			local49 = this.anInt10341 - arg0;
			local54 = this.anInt10342 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10339 * this.anInt10339;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt10340 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt10338 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10339 * this.anInt10339;
		}
	}
}
