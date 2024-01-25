import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
	public int anInt5443;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public int anInt5444;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
	public int anInt5445;

	@OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public int anInt5447;

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z")
	public boolean method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean396) {
			return false;
		}
		@Pc(10) int local10 = this.anInt5447 - this.anInt5446;
		@Pc(16) int local16 = this.anInt5445 - this.anInt5443;
		@Pc(24) int local24 = local10 * local10 + local16 * local16;
		@Pc(42) int local42 = arg0 * local10 + arg1 * local16 - this.anInt5446 * local10 - this.anInt5443 * local16;
		@Pc(49) int local49;
		@Pc(54) int local54;
		if (local42 <= 0) {
			local49 = this.anInt5446 - arg0;
			local54 = this.anInt5443 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5444 * this.anInt5444;
		} else if (local42 > local24) {
			local49 = this.anInt5447 - arg0;
			local54 = this.anInt5445 - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5444 * this.anInt5444;
		} else {
			local42 = (local42 << 10) / local24;
			local49 = this.anInt5446 + (local10 * local42 >> 10) - arg0;
			local54 = this.anInt5443 + (local16 * local42 >> 10) - arg1;
			return local49 * local49 + local54 * local54 < this.anInt5444 * this.anInt5444;
		}
	}
}
