import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class3_Sub37 extends Class3 implements Interface26 {

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	public int anInt5668;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
	public int anInt5671;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "J")
	public long aLong195;

	@OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
	public int anInt5674;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.anInt5671;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)J")
	@Override
	public long method5025() {
		return this.aLong195;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)I")
	@Override
	public int method5023() {
		return this.anInt5668;
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(I)I")
	@Override
	public int method5022() {
		return this.anInt5674;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)C")
	@Override
	public char method5026() {
		return this.aChar2;
	}
}
