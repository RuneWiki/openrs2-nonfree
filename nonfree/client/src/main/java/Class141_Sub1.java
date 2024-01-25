import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "J")
	public long aLong151;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	public int anInt5362;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!pf;")
	public Class141_Sub1 aClass141_Sub1_1;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public int anInt5366;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)C")
	@Override
	public char method4290() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
	@Override
	public int method4288() {
		return this.anInt5362;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4289() {
		return this.aBoolean389;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	@Override
	public int method4286() {
		return this.anInt5366;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)J")
	@Override
	public long method4292() {
		return this.aLong151;
	}
}
