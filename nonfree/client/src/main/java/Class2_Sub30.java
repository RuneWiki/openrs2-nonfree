import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class2_Sub30 extends Class2 implements Interface2 {

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public int anInt6061;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public int anInt6063;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	public int anInt6066;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "J")
	public long aLong151;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)C")
	@Override
	public char method5044() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
	@Override
	public int method5042() {
		return this.anInt6066;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
	@Override
	public long method5041() {
		return this.aLong151;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
	@Override
	public int method5040() {
		return this.anInt6063;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	@Override
	public int method5043() {
		return this.anInt6061;
	}
}
