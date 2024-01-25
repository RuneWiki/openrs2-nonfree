import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
	public int anInt28;

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "J")
	public long aLong4;

	@OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)I")
	@Override
	public int method7154() {
		return this.anInt29;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
	@Override
	public int method7153() {
		return this.anInt33;
	}

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(B)I")
	@Override
	public int method7157() {
		return this.anInt32;
	}

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)I")
	@Override
	public int method7155() {
		return this.anInt28;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)J")
	@Override
	public long method7152() {
		return this.aLong4;
	}
}
