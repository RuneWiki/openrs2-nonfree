import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class3_Sub37 extends Class3 implements Interface18 {

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
	public int anInt6783;

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
	public int anInt6786;

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "J")
	public long aLong184;

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
	public int anInt6787;

	@OriginalMember(owner = "client!nfa", name = "q", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)I")
	@Override
	public int method5673() {
		return this.anInt6783;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)I")
	@Override
	public int method5674() {
		return this.anInt6787;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)I")
	@Override
	public int method5675() {
		return this.anInt6786;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)J")
	@Override
	public long method5672() {
		return this.aLong184;
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)C")
	@Override
	public char method5676() {
		return this.aChar2;
	}
}
