import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class2_Sub26_Sub1 extends Class2_Sub26 {

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public int anInt3451;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public int anInt3452;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
	public int anInt3455;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)I")
	@Override
	public int method6657() {
		return 0;
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)I")
	@Override
	public int method6660() {
		return this.anInt3451;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.anInt3455;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)J")
	@Override
	public long method6658() {
		return this.aLong96;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I")
	@Override
	public int method6655() {
		return this.anInt3452;
	}
}
