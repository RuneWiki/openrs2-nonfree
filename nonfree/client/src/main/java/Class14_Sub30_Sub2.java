import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class14_Sub30_Sub2 extends Class14_Sub30 {

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "J")
	public long aLong273;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
	public int anInt10297;

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
	public int anInt10298;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
	public int anInt10301;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
	public int anInt10304;

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I")
	@Override
	public int method8572() {
		return this.anInt10297;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)I")
	@Override
	public int method8571() {
		return this.anInt10301;
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)J")
	@Override
	public long method8577() {
		return this.aLong273;
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)I")
	@Override
	public int method8578() {
		return this.anInt10304;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)I")
	@Override
	public int method8576() {
		return this.anInt10298;
	}
}
