import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class2_Sub32_Sub1 extends Class2_Sub32 {

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public int anInt6434;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
	public int anInt6435;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "J")
	public long aLong183;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	public int anInt6437;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)I")
	@Override
	public int method8561() {
		return this.anInt6437;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I")
	@Override
	public int method8558() {
		return this.anInt6434;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)I")
	@Override
	public int method8563() {
		return this.anInt6435;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)J")
	@Override
	public long method8564() {
		return this.aLong183;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
	@Override
	public int method8557() {
		return this.anInt6436;
	}
}
