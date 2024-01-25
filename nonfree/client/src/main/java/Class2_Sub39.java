import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class2_Sub39 extends Class2 implements Interface20 {

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
	public int anInt8211;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
	public int anInt8212;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "J")
	public long aLong218;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
	public int anInt8217;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)I")
	@Override
	public int method7058() {
		return this.anInt8212;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)C")
	@Override
	public char method7056() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)I")
	@Override
	public int method7059() {
		return this.anInt8211;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)I")
	@Override
	public int method7060() {
		return this.anInt8217;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)J")
	@Override
	public long method7057() {
		return this.aLong218;
	}
}
