import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class2_Sub26_Sub2 extends Class2_Sub26 {

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
	public int anInt7943;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
	public int anInt7944;

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
	public int anInt7945;

	@OriginalMember(owner = "client!sda", name = "p", descriptor = "J")
	public long aLong193;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
	public int anInt7946;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)I")
	@Override
	public int method6657() {
		return this.anInt7945;
	}

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "(I)I")
	@Override
	public int method6660() {
		return this.anInt7943;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)I")
	@Override
	public int method6655() {
		return this.anInt7944;
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J")
	@Override
	public long method6658() {
		return this.aLong193;
	}

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.anInt7946;
	}
}
