import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class6_Sub26 extends Class6 implements Interface18 {

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "I")
	public int anInt4773;

	@OriginalMember(owner = "client!iia", name = "o", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "J")
	public long aLong123;

	@OriginalMember(owner = "client!iia", name = "w", descriptor = "I")
	public int anInt4781;

	@OriginalMember(owner = "client!iia", name = "x", descriptor = "I")
	public int anInt4782;

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)I")
	@Override
	public int method4141() {
		return this.anInt4773;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(B)C")
	@Override
	public char method4142() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)I")
	@Override
	public int method4140() {
		return this.anInt4782;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)I")
	@Override
	public int method4138() {
		return this.anInt4781;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(B)J")
	@Override
	public long method4139() {
		return this.aLong123;
	}
}
