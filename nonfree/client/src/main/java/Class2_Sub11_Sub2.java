import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
	public int anInt5506;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
	public int anInt5507;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "J")
	public long aLong266;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
	public int anInt5508;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)I")
	@Override
	public int method4365() {
		return this.anInt5507;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)J")
	@Override
	public long method4367() {
		return this.aLong266;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)I")
	@Override
	public int method4364() {
		return this.anInt5506;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I")
	@Override
	public int method4368() {
		return this.anInt5508;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
	@Override
	public int method4366() {
		return this.anInt5505;
	}
}
