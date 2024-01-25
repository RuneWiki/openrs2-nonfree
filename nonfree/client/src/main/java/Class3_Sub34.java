import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class3_Sub34 extends Class3 implements Interface23 {

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "J")
	public long aLong170;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt6086;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	public int anInt6087;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	public int anInt6090;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
	@Override
	public int method5042() {
		return this.anInt6086;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)J")
	@Override
	public long method5039() {
		return this.aLong170;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)I")
	@Override
	public int method5040() {
		return this.anInt6090;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)C")
	@Override
	public char method5038() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
	@Override
	public int method5041() {
		return this.anInt6087;
	}
}
