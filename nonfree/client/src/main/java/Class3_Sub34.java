import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class3_Sub34 extends Class3 implements Interface21 {

	@OriginalMember(owner = "client!nea", name = "s", descriptor = "I")
	public int anInt6342;

	@OriginalMember(owner = "client!nea", name = "A", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!nea", name = "B", descriptor = "I")
	public int anInt6349;

	@OriginalMember(owner = "client!nea", name = "E", descriptor = "J")
	public long aLong169;

	@OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
	public int anInt6352;

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)C")
	@Override
	public char method5125() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I")
	@Override
	public int method5124() {
		return this.anInt6349;
	}

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "(I)J")
	@Override
	public long method5128() {
		return this.aLong169;
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(I)I")
	@Override
	public int method5127() {
		return this.anInt6342;
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)I")
	@Override
	public int method5126() {
		return this.anInt6352;
	}
}
