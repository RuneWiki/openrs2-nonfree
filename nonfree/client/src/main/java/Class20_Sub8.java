import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class20_Sub8 extends Class20 {

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
	public int anInt7191;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	public int anInt7192;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public int anInt7193;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
	public int anInt7194;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	public int anInt7195;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "Z")
	public boolean aBoolean508 = false;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
	public boolean method5776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean508) {
			return false;
		}
		@Pc(10) int local10 = this.anInt7194 - this.anInt7195;
		@Pc(16) int local16 = this.anInt7192 - this.anInt7191;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt7195 * local10 - this.anInt7191 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt7195 - arg0;
			local54 = this.anInt7191 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7193 * this.anInt7193;
		} else if (local42 > local24) {
			local49 = this.anInt7194 - arg0;
			local54 = this.anInt7192 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7193 * this.anInt7193;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt7195 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt7191 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt7193 * this.anInt7193;
		}
	}
}
