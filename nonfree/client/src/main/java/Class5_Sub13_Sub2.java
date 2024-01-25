import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class5_Sub13_Sub2 extends Class5_Sub13 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
	public int anInt6084;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	public int anInt6088;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "J")
	public long aLong149;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
	public int anInt6091;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public int anInt6093;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I")
	@Override
	public int method5401() {
		return this.anInt6088;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I")
	@Override
	public int method5403() {
		return this.anInt6084;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	@Override
	public int method5399() {
		return this.anInt6093;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
	@Override
	public int method5400() {
		return this.anInt6091;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)J")
	@Override
	public long method5402() {
		return this.aLong149;
	}
}
