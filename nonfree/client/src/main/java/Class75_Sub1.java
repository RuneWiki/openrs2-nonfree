import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
	public int anInt1800;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
	public int anInt1801;

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "J")
	public long aLong68;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "Lclient!gf;")
	public Class75_Sub1 aClass75_Sub1_1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)J")
	@Override
	public long method1489() {
		return this.aLong68;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)C")
	@Override
	public char method1491() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
	@Override
	public int method1492() {
		return this.anInt1801;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method1486() {
		return this.aBoolean107;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
	@Override
	public int method1490() {
		return this.anInt1800;
	}
}
