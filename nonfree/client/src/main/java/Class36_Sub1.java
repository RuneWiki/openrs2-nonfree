import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!ca;")
	public Class36_Sub1 aClass36_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "J")
	public long aLong21;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method579() {
		return this.aBoolean44;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)C")
	@Override
	public char method577() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)I")
	@Override
	public int method576() {
		return this.anInt691;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)J")
	@Override
	public long method578() {
		return this.aLong21;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)I")
	@Override
	public int method573() {
		return this.anInt689;
	}
}
