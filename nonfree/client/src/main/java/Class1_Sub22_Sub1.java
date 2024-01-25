import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "J")
	public long aLong103;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public int anInt3427;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)I")
	@Override
	public int method2937() {
		return this.anInt3426;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)J")
	@Override
	public long method2938() {
		return this.aLong103;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
	@Override
	public int method2939() {
		return this.anInt3423;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
	@Override
	public int method2936() {
		return this.anInt3427;
	}
}
