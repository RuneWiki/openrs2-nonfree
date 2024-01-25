import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	public int anInt2108;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
	public int anInt2109;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
	public int anInt2110;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	public int anInt2111;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)Z")
	public boolean method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean196) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2110 - this.anInt2108;
		@Pc(16) int local16 = this.anInt2109 - this.anInt2112;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2108 * local10 - this.anInt2112 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2108 - arg0;
			local54 = this.anInt2112 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2111 * this.anInt2111;
		} else if (local42 > local24) {
			local49 = this.anInt2110 - arg0;
			local54 = this.anInt2109 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2111 * this.anInt2111;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2108 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2112 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2111 * this.anInt2111;
		}
	}
}
