import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class5_Sub49 extends Class5 implements Interface16 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "J")
	public long aLong251;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public int anInt8835;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public int anInt8837;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	public int anInt8841;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
	@Override
	public int method7499() {
		return this.anInt8837;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)I")
	@Override
	public int method7503() {
		return this.anInt8835;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)I")
	@Override
	public int method7500() {
		return this.anInt8841;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)J")
	@Override
	public long method7502() {
		return this.aLong251;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)C")
	@Override
	public char method7501() {
		return this.aChar5;
	}
}
