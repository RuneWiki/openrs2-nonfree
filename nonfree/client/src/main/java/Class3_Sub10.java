import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class3_Sub10 extends Class3 implements Interface3 {

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	public int anInt845;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "J")
	public long aLong42;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)J")
	@Override
	public long method667() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I")
	@Override
	public int method665() {
		return this.anInt845;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)C")
	@Override
	public char method668() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
	@Override
	public int method666() {
		return this.anInt847;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)I")
	@Override
	public int method664() {
		return this.anInt846;
	}
}
