import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public final class Class6_Sub14 extends Class6 implements Interface8 {

	@OriginalMember(owner = "client!cja", name = "o", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!cja", name = "p", descriptor = "I")
	public int anInt2398;

	@OriginalMember(owner = "client!cja", name = "r", descriptor = "J")
	public long aLong49;

	@OriginalMember(owner = "client!cja", name = "s", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!cja", name = "u", descriptor = "I")
	public int anInt2402;

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "(I)J")
	@Override
	public long method2086() {
		return this.aLong49;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Z)I")
	@Override
	public int method2085() {
		return this.anInt2402;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)I")
	@Override
	public int method2082() {
		return this.anInt2400;
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)I")
	@Override
	public int method2084() {
		return this.anInt2398;
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(I)C")
	@Override
	public char method2083() {
		return this.aChar1;
	}
}
