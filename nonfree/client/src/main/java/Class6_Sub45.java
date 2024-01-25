import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class6_Sub45 extends Class6 implements Interface13 {

	@OriginalMember(owner = "client!to", name = "n", descriptor = "I")
	public int anInt8855;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	public int anInt8856;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	public int anInt8858;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "J")
	public long aLong213;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)I")
	@Override
	public int method7435() {
		return this.anInt8858;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I")
	@Override
	public int method7433() {
		return this.anInt8855;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)I")
	@Override
	public int method7434() {
		return this.anInt8856;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)J")
	@Override
	public long method7431() {
		return this.aLong213;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)C")
	@Override
	public char method7432() {
		return this.aChar4;
	}
}
