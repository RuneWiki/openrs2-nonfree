import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class6_Sub55 extends Class6 implements Interface17 {

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "J")
	public long aLong343;

	@OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
	public int anInt10378;

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
	public int anInt10386;

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
	public int anInt10387;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)I")
	@Override
	public int method8950() {
		return this.anInt10386;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I")
	@Override
	public int method8949() {
		return this.anInt10378;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)C")
	@Override
	public char method8951() {
		return this.aChar6;
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)I")
	@Override
	public int method8952() {
		return this.anInt10387;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)J")
	@Override
	public long method8953() {
		return this.aLong343;
	}
}
