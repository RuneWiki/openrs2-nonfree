import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
	public int anInt5525;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
	public int anInt5526;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
	public int anInt5527;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Z")
	public boolean aBoolean409 = false;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Z")
	public boolean method4848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean409) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5524 - this.anInt5527;
		@Pc(16) int local16 = this.anInt5525 - this.anInt5528;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5527 * local10 - this.anInt5528 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5527 - arg0;
			local54 = this.anInt5528 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5526 * this.anInt5526;
		} else if (local42 > local24) {
			local49 = this.anInt5524 - arg0;
			local54 = this.anInt5525 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5526 * this.anInt5526;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5527 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5528 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5526 * this.anInt5526;
		}
	}
}
