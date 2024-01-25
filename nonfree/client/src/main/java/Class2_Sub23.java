import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class2_Sub23 extends Class2 implements Interface2 {

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
	public int anInt3513;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "J")
	public long aLong171;

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	public int anInt3518;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)I")
	@Override
	public int method2885() {
		return this.anInt3520;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)C")
	@Override
	public char method2883() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
	@Override
	public int method2882() {
		return this.anInt3518;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)J")
	@Override
	public long method2884() {
		return this.aLong171;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)I")
	@Override
	public int method2881() {
		return this.anInt3513;
	}
}
