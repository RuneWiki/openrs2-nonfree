import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class6_Sub11 extends Class6 implements Interface16 {

	@OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
	public int anInt1180;

	@OriginalMember(owner = "client!cs", name = "k", descriptor = "J")
	public long aLong40;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
	public int anInt1184;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
	public int anInt1185;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I")
	@Override
	public int method944() {
		return this.anInt1185;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)C")
	@Override
	public char method947() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	@Override
	public int method946() {
		return this.anInt1184;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	@Override
	public int method945() {
		return this.anInt1180;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)J")
	@Override
	public long method943() {
		return this.aLong40;
	}
}
