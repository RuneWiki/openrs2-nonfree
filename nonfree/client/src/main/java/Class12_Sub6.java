import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public int anInt7026;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	public int anInt7028;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	public int anInt7029;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public int anInt7030;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Z")
	public boolean aBoolean576 = false;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)Z")
	public boolean method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean576) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7027 - this.anInt7029;
		@Pc(16) int local16 = this.anInt7028 - this.anInt7026;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7029 * local10 - this.anInt7026 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7029 - arg0;
			local54 = this.anInt7026 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7030 * this.anInt7030;
		} else if (local42 > local24) {
			local49 = this.anInt7027 - arg0;
			local54 = this.anInt7028 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7030 * this.anInt7030;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7029 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7026 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7030 * this.anInt7030;
		}
	}
}
