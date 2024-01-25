import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class1_Sub33 extends Class1 implements Interface22 {

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public int anInt5468;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "J")
	public long aLong180;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int anInt5471;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public int anInt5473;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	@Override
	public int method4450() {
		return this.anInt5468;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I")
	@Override
	public int method4451() {
		return this.anInt5473;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
	@Override
	public int method4449() {
		return this.anInt5471;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)J")
	@Override
	public long method4452() {
		return this.aLong180;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)C")
	@Override
	public char method4453() {
		return this.aChar3;
	}
}
