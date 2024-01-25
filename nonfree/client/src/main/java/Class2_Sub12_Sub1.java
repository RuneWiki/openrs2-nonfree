import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
	public int anInt5393;

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
	public int anInt5394;

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "J")
	public long aLong148;

	@OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
	public int anInt5395;

	@OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
	public int anInt5396;

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(B)J")
	@Override
	public long method7242() {
		return this.aLong148;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)I")
	@Override
	public int method7241() {
		return this.anInt5394;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)I")
	@Override
	public int method7238() {
		return this.anInt5396;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)I")
	@Override
	public int method7237() {
		return this.anInt5393;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)I")
	@Override
	public int method7236() {
		return this.anInt5395;
	}
}
