import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class3_Sub33_Sub1 extends Class3_Sub33 {

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
	public int anInt5744;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "client!ts", name = "D", descriptor = "J")
	public long aLong209;

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
	@Override
	public int method5158() {
		return this.anInt5744;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	public int method5157() {
		return this.anInt5747;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(Z)I")
	@Override
	public int method5156() {
		return this.anInt5745;
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(Z)J")
	@Override
	public long method5162() {
		return this.aLong209;
	}
}
