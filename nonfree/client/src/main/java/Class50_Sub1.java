import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
	public boolean aBoolean95;

	@OriginalMember(owner = "client!da", name = "m", descriptor = "J")
	public long aLong32;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "I")
	public int anInt934;

	@OriginalMember(owner = "client!da", name = "t", descriptor = "I")
	public int anInt937;

	@OriginalMember(owner = "client!da", name = "A", descriptor = "Lclient!da;")
	public Class50_Sub1 aClass50_Sub1_4;

	@OriginalMember(owner = "client!da", name = "C", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1169() {
		return this.aBoolean95;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)C")
	@Override
	public char method1165() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)J")
	@Override
	public long method1161() {
		return this.aLong32;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
	@Override
	public int method1167() {
		return this.anInt937;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I")
	@Override
	public int method1162() {
		return this.anInt934;
	}
}
