import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!av", name = "w", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!av", name = "y", descriptor = "J")
	public long aLong19;

	@OriginalMember(owner = "client!av", name = "z", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!av", name = "A", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)I")
	@Override
	public int method1992() {
		return 0;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)J")
	@Override
	public long method1985() {
		return this.aLong19;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)I")
	@Override
	public int method1986() {
		return this.anInt758;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)I")
	@Override
	public int method1982() {
		return this.anInt761;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)I")
	@Override
	public int method1991() {
		return this.anInt760;
	}
}
