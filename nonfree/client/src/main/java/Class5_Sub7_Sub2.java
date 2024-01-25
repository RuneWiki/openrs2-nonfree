import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class5_Sub7_Sub2 extends Class5_Sub7 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public int anInt10471;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "J")
	public long aLong299;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt10476;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt10478;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public int anInt10479;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	@Override
	public int method8702() {
		return this.anInt10479;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
	@Override
	public int method8704() {
		return this.anInt10478;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	@Override
	public int method8703() {
		return this.anInt10471;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)J")
	@Override
	public long method8707() {
		return this.aLong299;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
	@Override
	public int method8705() {
		return this.anInt10476;
	}
}
