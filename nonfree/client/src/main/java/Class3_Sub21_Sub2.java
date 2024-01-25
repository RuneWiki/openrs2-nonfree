import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class3_Sub21_Sub2 extends Class3_Sub21 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public int anInt5871;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public int anInt5872;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public int anInt5873;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public int anInt5874;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "J")
	public long aLong155;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
	@Override
	public int method5060() {
		return this.anInt5872;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)I")
	@Override
	public int method5063() {
		return this.anInt5871;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	@Override
	public int method5059() {
		return this.anInt5874;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)I")
	@Override
	public int method5064() {
		return this.anInt5873;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)J")
	@Override
	public long method5061() {
		return this.aLong155;
	}
}
