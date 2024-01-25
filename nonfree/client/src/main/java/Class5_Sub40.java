import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class5_Sub40 extends Class5 implements Interface12 {

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
	public int anInt7804;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "J")
	public long aLong231;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	public int anInt7805;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public int anInt7814;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)J")
	@Override
	public long method6717() {
		return this.aLong231;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)C")
	@Override
	public char method6714() {
		return this.aChar6;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
	@Override
	public int method6716() {
		return this.anInt7805;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
	@Override
	public int method6715() {
		return this.anInt7804;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I")
	@Override
	public int method6718() {
		return this.anInt7814;
	}
}
