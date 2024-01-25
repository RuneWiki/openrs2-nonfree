import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class6_Sub12 extends Class6 implements Interface20 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt1728;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "J")
	public long aLong52;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt1733;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt1734;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
	@Override
	public int method1560() {
		return this.anInt1733;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	@Override
	public int method1556() {
		return this.anInt1728;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	@Override
	public int method1558() {
		return this.anInt1734;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)J")
	@Override
	public long method1559() {
		return this.aLong52;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)C")
	@Override
	public char method1557() {
		return this.aChar1;
	}
}
