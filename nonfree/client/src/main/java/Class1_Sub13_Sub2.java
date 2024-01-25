import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class1_Sub13_Sub2 extends Class1_Sub13 {

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "J")
	public long aLong291;

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
	public int anInt6858;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
	public int anInt6859;

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
	public int anInt6860;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I")
	@Override
	public int method5739() {
		return this.anInt6858;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
	@Override
	public int method5740() {
		return 0;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.anInt6859;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)J")
	@Override
	public long method5741() {
		return this.aLong291;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
	@Override
	public int method5737() {
		return this.anInt6860;
	}
}
