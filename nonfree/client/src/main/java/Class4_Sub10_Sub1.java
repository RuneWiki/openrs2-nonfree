import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class4_Sub10_Sub1 extends Class4_Sub10 {

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
	public int anInt2221;

	@OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
	public int anInt2223;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "J")
	public long aLong46;

	@OriginalMember(owner = "client!ev", name = "E", descriptor = "I")
	public int anInt2230;

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(I)I")
	@Override
	public int method1652() {
		return this.anInt2223;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(B)I")
	@Override
	public int method1653() {
		return this.anInt2221;
	}

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)J")
	@Override
	public long method1649() {
		return this.aLong46;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)I")
	@Override
	public int method1648() {
		return this.anInt2230;
	}
}
