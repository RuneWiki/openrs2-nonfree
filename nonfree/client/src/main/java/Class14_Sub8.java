import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class14_Sub8 extends Class14 implements Interface17 {

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!be", name = "r", descriptor = "J")
	public long aLong29;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)J")
	@Override
	public long method648() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
	@Override
	public int method646() {
		return this.anInt632;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)I")
	@Override
	public int method649() {
		return this.anInt633;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)C")
	@Override
	public char method650() {
		return this.aChar2;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)I")
	@Override
	public int method647() {
		return this.anInt626;
	}
}
