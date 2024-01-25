import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class2_Sub32_Sub2 extends Class2_Sub32 {

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
	public int anInt10238;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
	public int anInt10241;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	public int anInt10245;

	@OriginalMember(owner = "client!wt", name = "y", descriptor = "I")
	public int anInt10249;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "J")
	public long aLong285;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)I")
	@Override
	public int method8563() {
		return this.anInt10245;
	}

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)I")
	@Override
	public int method8561() {
		return this.anInt10249;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I")
	@Override
	public int method8557() {
		return this.anInt10238;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)J")
	@Override
	public long method8564() {
		return this.aLong285;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)I")
	@Override
	public int method8558() {
		return this.anInt10241;
	}
}
