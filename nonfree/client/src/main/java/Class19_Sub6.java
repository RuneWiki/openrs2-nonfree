import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class19_Sub6 extends Class19 {

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
	public int anInt5946;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	public int anInt5947;

	@OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
	public int anInt5948;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
	public int anInt5949;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	public int anInt5950;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "Z")
	public boolean aBoolean477 = false;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Z")
	public boolean method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean477) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5950 - this.anInt5947;
		@Pc(16) int local16 = this.anInt5946 - this.anInt5948;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5947 * local10 - this.anInt5948 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5947 - arg0;
			local54 = this.anInt5948 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5949 * this.anInt5949;
		} else if (local42 > local24) {
			local49 = this.anInt5950 - arg0;
			local54 = this.anInt5946 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5949 * this.anInt5949;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5947 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5948 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5949 * this.anInt5949;
		}
	}
}
