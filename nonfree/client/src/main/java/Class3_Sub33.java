import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class3_Sub33 extends Class3 implements Interface16 {

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	public int anInt5989;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
	public int anInt5992;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "J")
	public long aLong170;

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
	public int anInt5997;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)C")
	@Override
	public char method5162() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)J")
	@Override
	public long method5161() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)I")
	@Override
	public int method5160() {
		return this.anInt5989;
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "(B)I")
	@Override
	public int method5164() {
		return this.anInt5992;
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)I")
	@Override
	public int method5163() {
		return this.anInt5997;
	}
}
