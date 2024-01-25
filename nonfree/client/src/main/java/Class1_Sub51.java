import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class1_Sub51 extends Class1 implements Interface12 {

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
	public int anInt9045;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "J")
	public long aLong387;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	public int anInt9050;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
	public int anInt9051;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)C")
	@Override
	public char method7436() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	@Override
	public int method7437() {
		return this.anInt9051;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
	@Override
	public int method7435() {
		return this.anInt9045;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
	@Override
	public long method7434() {
		return this.aLong387;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)I")
	@Override
	public int method7438() {
		return this.anInt9050;
	}
}
