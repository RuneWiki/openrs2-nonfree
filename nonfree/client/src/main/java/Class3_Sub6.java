import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class3_Sub6 extends Class3 implements Interface3 {

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "J")
	public long aLong18;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "C")
	public char aChar1;

	static {
		new Class111("", 73);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)I")
	@Override
	public int method419() {
		return this.anInt396;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)C")
	@Override
	public char method417() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	@Override
	public int method415() {
		return this.anInt392;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)J")
	@Override
	public long method416() {
		return this.aLong18;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
	@Override
	public int method418() {
		return this.anInt389;
	}
}
