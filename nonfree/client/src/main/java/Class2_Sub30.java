import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class2_Sub30 extends Class2 implements Interface16 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "J")
	public long aLong168;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public int anInt5663;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "I")
	public int anInt5668;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	public int anInt5673;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I")
	@Override
	public int method4736() {
		return this.anInt5663;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)C")
	@Override
	public char method4737() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)J")
	@Override
	public long method4738() {
		return this.aLong168;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)I")
	@Override
	public int method4739() {
		return this.anInt5673;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	@Override
	public int method4735() {
		return this.anInt5668;
	}
}
