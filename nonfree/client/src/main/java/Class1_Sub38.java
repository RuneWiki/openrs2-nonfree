import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class1_Sub38 extends Class1 implements Interface13 {

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public int anInt5540;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
	public int anInt5542;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "J")
	public long aLong185;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
	public int anInt5547;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	@Override
	public int method4455() {
		return this.anInt5540;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)I")
	@Override
	public int method4457() {
		return this.anInt5547;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)I")
	@Override
	public int method4454() {
		return this.anInt5542;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)C")
	@Override
	public char method4458() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)J")
	@Override
	public long method4456() {
		return this.aLong185;
	}
}
