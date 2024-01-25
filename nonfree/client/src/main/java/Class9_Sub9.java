import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class9_Sub9 extends Class9 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public int anInt10616;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public int anInt10617;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public int anInt10618;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public int anInt10619;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt10620;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Z")
	public boolean aBoolean719 = false;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z")
	public boolean method9029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean719) {
			return false;
		}
		@Pc(10) int local10 = this.anInt10616 - this.anInt10619;
		@Pc(16) int local16 = this.anInt10617 - this.anInt10618;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt10619 * local10 - this.anInt10618 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt10619 - arg0;
			local54 = this.anInt10618 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10620 * this.anInt10620;
		} else if (local42 > local24) {
			local49 = this.anInt10616 - arg0;
			local54 = this.anInt10617 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10620 * this.anInt10620;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt10619 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt10618 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt10620 * this.anInt10620;
		}
	}
}
