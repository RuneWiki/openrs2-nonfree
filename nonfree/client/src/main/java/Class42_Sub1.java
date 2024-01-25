import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	public int anInt1692;

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "Z")
	public boolean aBoolean142;

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
	public int anInt1695;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "Lclient!cs;")
	public Class42_Sub1 aClass42_Sub1_1;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "J")
	public long aLong44;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	@Override
	public int method1202() {
		return this.anInt1695;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)J")
	@Override
	public long method1199() {
		return this.aLong44;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1204() {
		return this.aBoolean142;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(B)C")
	@Override
	public char method1201() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)I")
	@Override
	public int method1203() {
		return this.anInt1692;
	}
}
