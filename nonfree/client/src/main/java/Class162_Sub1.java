import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class162_Sub1 extends Class162 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt4552;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "J")
	public long aLong151;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Lclient!pe;")
	public Class162_Sub1 aClass162_Sub1_4;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public int anInt4557;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)J")
	@Override
	public long method4026() {
		return this.aLong151;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4031() {
		return this.aBoolean339;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
	@Override
	public int method4027() {
		return this.anInt4552;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)C")
	@Override
	public char method4033() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I")
	@Override
	public int method4028() {
		return this.anInt4557;
	}
}
