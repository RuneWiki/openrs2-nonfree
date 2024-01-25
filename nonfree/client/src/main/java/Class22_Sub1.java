import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!be;")
	public Class22_Sub1 aClass22_Sub1_4;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "J")
	public long aLong19;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
	public boolean aBoolean29;

	static {
		new Class96(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)C")
	@Override
	public char method366() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method370() {
		return this.aBoolean29;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J")
	@Override
	public long method364() {
		return this.aLong19;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
	@Override
	public int method367() {
		return this.anInt438;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
	@Override
	public int method369() {
		return this.anInt446;
	}
}
