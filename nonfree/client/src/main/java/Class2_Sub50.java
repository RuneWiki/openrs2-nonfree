import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public final class Class2_Sub50 extends Class2 implements Interface24 {

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
	public int anInt9071;

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "J")
	public long aLong257;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
	public int anInt9072;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
	public int anInt9073;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)I")
	@Override
	public int method7254() {
		return this.anInt9071;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)J")
	@Override
	public long method7250() {
		return this.aLong257;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7253() {
		return this.anInt9073;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)I")
	@Override
	public int method7252() {
		return this.anInt9072;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)C")
	@Override
	public char method7251() {
		return this.aChar5;
	}
}
