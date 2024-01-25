import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class2_Sub9_Sub2 extends Class2_Sub9 {

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public int anInt8365;

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
	public int anInt8368;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "J")
	public long aLong205;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	public int anInt8370;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public int anInt8373;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)I")
	@Override
	public int method7081() {
		return this.anInt8370;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
	@Override
	public int method7082() {
		return this.anInt8368;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
	@Override
	public int method7079() {
		return this.anInt8373;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)J")
	@Override
	public long method7083() {
		return this.aLong205;
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)I")
	@Override
	public int method7086() {
		return this.anInt8365;
	}
}
