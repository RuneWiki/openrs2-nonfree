import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class12_Sub44 extends Class12 implements Interface1 {

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "J")
	public long aLong202;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
	public int anInt8031;

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!rs", name = "u", descriptor = "I")
	public int anInt8035;

	@OriginalMember(owner = "client!rs", name = "z", descriptor = "I")
	public int anInt8038;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)I")
	@Override
	public int method6641() {
		return this.anInt8031;
	}

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)J")
	@Override
	public long method6640() {
		return this.aLong202;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)I")
	@Override
	public int method6638() {
		return this.anInt8035;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)C")
	@Override
	public char method6642() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)I")
	@Override
	public int method6639() {
		return this.anInt8038;
	}
}
