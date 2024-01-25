import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class72_Sub2 extends Class72 {

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
	public int anInt2129;

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
	public int anInt2130;

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)Z")
	public boolean method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean129) {
			return false;
		}
		@Pc(10) int local10 = this.anInt2132 - this.anInt2130;
		@Pc(16) int local16 = this.anInt2133 - this.anInt2131;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt2130 * local10 - this.anInt2131 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt2130 - arg0;
			local54 = this.anInt2131 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2129 * this.anInt2129;
		} else if (local42 > local24) {
			local49 = this.anInt2132 - arg0;
			local54 = this.anInt2133 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2129 * this.anInt2129;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt2130 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt2131 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt2129 * this.anInt2129;
		}
	}
}
