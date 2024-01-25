import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class2_Sub57 extends Class2 implements Interface21 {

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "J")
	public long aLong349;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt10947;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public int anInt10949;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public int anInt10950;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)C")
	@Override
	public char method9558() {
		return this.aChar7;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)I")
	@Override
	public int method9557() {
		return this.anInt10949;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)I")
	@Override
	public int method9556() {
		return this.anInt10950;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)I")
	@Override
	public int method9554() {
		return this.anInt10947;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)J")
	@Override
	public long method9555() {
		return this.aLong349;
	}
}
