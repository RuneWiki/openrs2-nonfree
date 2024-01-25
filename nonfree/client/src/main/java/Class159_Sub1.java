import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!os", name = "m", descriptor = "I")
	public int anInt4729;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "J")
	public long aLong164;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "Z")
	public boolean aBoolean360;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Lclient!os;")
	public Class159_Sub1 aClass159_Sub1_4;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "I")
	public int anInt4732;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)C")
	@Override
	public char method4340() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4334() {
		return this.aBoolean360;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
	@Override
	public int method4339() {
		return this.anInt4729;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)J")
	@Override
	public long method4335() {
		return this.aLong164;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)I")
	@Override
	public int method4336() {
		return this.anInt4732;
	}
}
