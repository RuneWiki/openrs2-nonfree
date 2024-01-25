import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!ap", name = "B", descriptor = "J")
	public long aLong21;

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)J")
	@Override
	public long method5327() {
		return this.aLong21;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
	@Override
	public int method5326() {
		return this.anInt619;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
	@Override
	public int method5325() {
		return this.anInt618;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)I")
	@Override
	public int method5323() {
		return this.anInt610;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
	@Override
	public int method5324() {
		return this.anInt611;
	}
}
