import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!h", name = "s", descriptor = "I")
	public int anInt2714;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "J")
	public long aLong73;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "I")
	public int anInt2716;

	@OriginalMember(owner = "client!h", name = "x", descriptor = "I")
	public int anInt2717;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)I")
	@Override
	public int method2187() {
		return this.anInt2717;
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)I")
	@Override
	public int method2186() {
		return this.anInt2714;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)J")
	@Override
	public long method2188() {
		return this.aLong73;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
	@Override
	public int method2189() {
		return this.anInt2716;
	}
}
