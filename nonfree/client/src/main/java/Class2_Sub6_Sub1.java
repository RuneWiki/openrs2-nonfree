import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
	public int anInt1084;

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "J")
	public long aLong31;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)I")
	@Override
	public int method772() {
		return this.anInt1083;
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)I")
	@Override
	public int method774() {
		return this.anInt1084;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)J")
	@Override
	public long method770() {
		return this.aLong31;
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)I")
	@Override
	public int method771() {
		return this.anInt1086;
	}
}
