import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class5_Sub29 extends Class5 implements Interface24 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	public int anInt5769;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "J")
	public long aLong169;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "I")
	public int anInt5773;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
	public int anInt5774;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)C")
	@Override
	public char method5144() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)J")
	@Override
	public long method5141() {
		return this.aLong169;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)I")
	@Override
	public int method5143() {
		return this.anInt5773;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I")
	@Override
	public int method5140() {
		return this.anInt5769;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)I")
	@Override
	public int method5142() {
		return this.anInt5774;
	}
}
