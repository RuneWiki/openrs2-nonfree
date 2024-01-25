import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class5_Sub29 extends Class5 implements Interface23 {

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "J")
	public long aLong149;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
	public int anInt5155;

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
	public int anInt5161;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public int anInt5162;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)C")
	@Override
	public char method4634() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)J")
	@Override
	public long method4636() {
		return this.aLong149;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	@Override
	public int method4635() {
		return this.anInt5162;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	@Override
	public int method4633() {
		return this.anInt5161;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	@Override
	public int method4632() {
		return this.anInt5155;
	}
}
