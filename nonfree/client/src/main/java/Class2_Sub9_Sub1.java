import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	public int anInt7413;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "J")
	public long aLong180;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "I")
	public int anInt7414;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "I")
	public int anInt7415;

	@OriginalMember(owner = "client!no", name = "z", descriptor = "I")
	public int anInt7416;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)I")
	@Override
	public int method7081() {
		return this.anInt7415;
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)J")
	@Override
	public long method7083() {
		return this.aLong180;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(I)I")
	@Override
	public int method7082() {
		return this.anInt7413;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(I)I")
	@Override
	public int method7086() {
		return this.anInt7414;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	@Override
	public int method7079() {
		return this.anInt7416;
	}
}
