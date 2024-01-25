import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!eea", name = "j", descriptor = "I")
	public int anInt2465;

	@OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
	public int anInt2466;

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)Z")
	public boolean method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean206) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2463 - this.anInt2467;
		@Pc(16) int local16 = this.anInt2465 - this.anInt2464;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2467 * local10 - this.anInt2464 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2467 - arg0;
			local54 = this.anInt2464 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2466 * this.anInt2466;
		} else if (local42 > local24) {
			local49 = this.anInt2463 - arg0;
			local54 = this.anInt2465 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2466 * this.anInt2466;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2467 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2464 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2466 * this.anInt2466;
		}
	}
}
