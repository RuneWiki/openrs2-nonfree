import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
	public int anInt8324;

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "J")
	public long aLong221;

	@OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
	public int anInt8325;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
	public int anInt8326;

	@OriginalMember(owner = "client!sba", name = "u", descriptor = "I")
	public int anInt8327;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "(I)I")
	@Override
	public int method7154() {
		return this.anInt8326;
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(B)I")
	@Override
	public int method7157() {
		return this.anInt8324;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)I")
	@Override
	public int method7153() {
		return this.anInt8327;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)J")
	@Override
	public long method7152() {
		return this.aLong221;
	}

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "(I)I")
	@Override
	public int method7155() {
		return this.anInt8325;
	}
}
