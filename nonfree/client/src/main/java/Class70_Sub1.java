import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!ek;")
	public Class70_Sub1 aClass70_Sub1_1;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Z")
	public boolean aBoolean137;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public int anInt1766;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	public int anInt1768;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "J")
	public long aLong49;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method1429() {
		return this.aBoolean137;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)I")
	@Override
	public int method1432() {
		return this.anInt1766;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)C")
	@Override
	public char method1431() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)J")
	@Override
	public long method1435() {
		return this.aLong49;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
	@Override
	public int method1436() {
		return this.anInt1768;
	}
}
