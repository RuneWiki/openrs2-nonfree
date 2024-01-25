import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class4_Sub22_Sub2 extends Class4_Sub22 {

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "J")
	public long aLong265;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	public int anInt8850;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	public int anInt8852;

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "I")
	public int anInt8855;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)I")
	@Override
	public int method7272() {
		return this.anInt8855;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)I")
	@Override
	public int method7271() {
		return this.anInt8852;
	}

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)J")
	@Override
	public long method7273() {
		return this.aLong265;
	}

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)I")
	@Override
	public int method7270() {
		return this.anInt8850;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I")
	@Override
	public int method7269() {
		return 0;
	}
}
