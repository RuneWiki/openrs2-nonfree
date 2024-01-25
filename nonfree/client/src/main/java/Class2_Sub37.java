import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class2_Sub37 extends Class2 implements Interface21 {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	public int anInt5677;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "J")
	public long aLong157;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public int anInt5683;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
	public int anInt5685;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)I")
	@Override
	public int method5148() {
		return this.anInt5683;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)J")
	@Override
	public long method5147() {
		return this.aLong157;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)C")
	@Override
	public char method5145() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
	@Override
	public int method5149() {
		return this.anInt5685;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
	@Override
	public int method5146() {
		return this.anInt5677;
	}
}
