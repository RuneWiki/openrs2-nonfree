import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public final class Class6_Sub39_Sub2 extends Class6_Sub39 {

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	public int anInt9608;

	@OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
	public int anInt9609;

	@OriginalMember(owner = "client!wea", name = "s", descriptor = "J")
	public long aLong245;

	@OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
	public int anInt9610;

	@OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
	public int anInt9611;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I")
	@Override
	public int method8014() {
		return this.anInt9610;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I")
	@Override
	public int method8012() {
		return this.anInt9609;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)I")
	@Override
	public int method8018() {
		return this.anInt9611;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)I")
	@Override
	public int method8017() {
		return this.anInt9608;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)J")
	@Override
	public long method8016() {
		return this.aLong245;
	}
}
