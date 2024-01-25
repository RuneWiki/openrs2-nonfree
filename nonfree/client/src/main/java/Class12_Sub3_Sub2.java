import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class12_Sub3_Sub2 extends Class12_Sub3 {

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
	public int anInt7518;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	public int anInt7519;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	public int anInt7520;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "J")
	public long aLong191;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
	public int anInt7521;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	@Override
	public int method6276() {
		return this.anInt7521;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
	@Override
	public int method6274() {
		return this.anInt7519;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)J")
	@Override
	public long method6280() {
		return this.aLong191;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
	@Override
	public int method6275() {
		return this.anInt7520;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
	@Override
	public int method6279() {
		return this.anInt7518;
	}
}
