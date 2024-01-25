import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
	public int anInt6269;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
	public int anInt6270;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
	public int anInt6271;

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
	public int anInt6272;

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
	public int anInt6273;

	@OriginalMember(owner = "client!lda", name = "o", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)Z")
	public boolean method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean490) {
			return false;
		}
		@Pc(10) int local10 = this.anInt6270 - this.anInt6271;
		@Pc(16) int local16 = this.anInt6272 - this.anInt6273;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt6271 * local10 - this.anInt6273 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt6271 - arg0;
			local54 = this.anInt6273 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6269 * this.anInt6269;
		} else if (local42 > local24) {
			local49 = this.anInt6270 - arg0;
			local54 = this.anInt6272 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6269 * this.anInt6269;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt6271 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt6273 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt6269 * this.anInt6269;
		}
	}
}
