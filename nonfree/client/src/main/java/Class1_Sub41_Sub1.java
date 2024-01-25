import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class1_Sub41_Sub1 extends Class1_Sub41 {

	@OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
	public int anInt8885;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
	public int anInt8886;

	@OriginalMember(owner = "client!vw", name = "r", descriptor = "J")
	public long aLong232;

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
	public int anInt8889;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)I")
	@Override
	public int method7866() {
		return this.anInt8885;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)J")
	@Override
	public long method7871() {
		return this.aLong232;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(Z)I")
	@Override
	public int method7873() {
		return 0;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)I")
	@Override
	public int method7870() {
		return this.anInt8886;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)I")
	@Override
	public int method7875() {
		return this.anInt8889;
	}
}
