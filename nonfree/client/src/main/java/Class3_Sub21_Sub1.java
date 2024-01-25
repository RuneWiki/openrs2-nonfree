import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class3_Sub21_Sub1 extends Class3_Sub21 {

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
	public int anInt3409;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
	public int anInt3412;

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "J")
	public long aLong98;

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
	public int anInt3416;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	public int anInt3419;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(B)I")
	@Override
	public int method5064() {
		return this.anInt3409;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)J")
	@Override
	public long method5061() {
		return this.aLong98;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I")
	@Override
	public int method5060() {
		return this.anInt3416;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)I")
	@Override
	public int method5059() {
		return this.anInt3412;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)I")
	@Override
	public int method5063() {
		return this.anInt3419;
	}
}
