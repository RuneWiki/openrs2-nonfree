import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class1_Sub48 extends Class1 implements Interface2 {

	@OriginalMember(owner = "client!un", name = "j", descriptor = "J")
	public long aLong224;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "I")
	public int anInt8397;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	public int anInt8400;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public int anInt8401;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)C")
	@Override
	public char method7096() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)I")
	@Override
	public int method7100() {
		return this.anInt8401;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)J")
	@Override
	public long method7097() {
		return this.aLong224;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)I")
	@Override
	public int method7099() {
		return this.anInt8400;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)I")
	@Override
	public int method7098() {
		return this.anInt8397;
	}
}
