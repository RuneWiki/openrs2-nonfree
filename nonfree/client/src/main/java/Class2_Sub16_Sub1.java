import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "J")
	public long aLong156;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	public int anInt6224;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
	public int anInt6227;

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
	public int anInt6228;

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)J")
	@Override
	public long method6011() {
		return this.aLong156;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I")
	@Override
	public int method6005() {
		return this.anInt6230;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)I")
	@Override
	public int method6008() {
		return this.anInt6228;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
	@Override
	public int method6010() {
		return this.anInt6227;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I")
	@Override
	public int method6004() {
		return this.anInt6224;
	}
}
