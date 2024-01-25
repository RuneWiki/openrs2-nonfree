import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	public int anInt2082;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public int anInt2083;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	public int anInt2084;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public int anInt2085;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Z")
	public boolean method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean124) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2083 - this.anInt2082;
		@Pc(16) int local16 = this.anInt2084 - this.anInt2086;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2082 * local10 - this.anInt2086 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2082 - arg0;
			local54 = this.anInt2086 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2085 * this.anInt2085;
		} else if (local42 > local24) {
			local49 = this.anInt2083 - arg0;
			local54 = this.anInt2084 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2085 * this.anInt2085;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2082 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2086 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2085 * this.anInt2085;
		}
	}
}
