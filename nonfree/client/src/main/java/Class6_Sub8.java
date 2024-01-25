import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class6_Sub8 extends Class6 implements Interface8 {

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	public int anInt1013;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "J")
	public long aLong29;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	public int anInt1017;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public int anInt1018;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)C")
	@Override
	public char method1040() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
	@Override
	public int method1038() {
		return this.anInt1013;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)J")
	@Override
	public long method1042() {
		return this.aLong29;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I")
	@Override
	public int method1039() {
		return this.anInt1017;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)I")
	@Override
	public int method1041() {
		return this.anInt1018;
	}
}
