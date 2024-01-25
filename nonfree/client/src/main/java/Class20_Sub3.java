import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public int anInt901;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public int anInt902;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public int anInt903;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt904;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public int anInt905;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	public boolean method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean78) {
			return false;
		}
		@Pc(10) int local10 = this.anInt905 - this.anInt904;
		@Pc(16) int local16 = this.anInt902 - this.anInt901;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt904 * local10 - this.anInt901 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt904 - arg0;
			local54 = this.anInt901 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt903 * this.anInt903;
		} else if (local42 > local24) {
			local49 = this.anInt905 - arg0;
			local54 = this.anInt902 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt903 * this.anInt903;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt904 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt901 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt903 * this.anInt903;
		}
	}
}
