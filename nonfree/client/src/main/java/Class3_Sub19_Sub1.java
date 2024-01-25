import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	public int anInt3832;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
	public int anInt3833;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	public int anInt3834;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "J")
	public long aLong97;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
	public int anInt3835;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
	@Override
	public int method4956() {
		return this.anInt3832;
	}

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "(I)I")
	@Override
	public int method4962() {
		return this.anInt3833;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)J")
	@Override
	public long method4958() {
		return this.aLong97;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I")
	@Override
	public int method4957() {
		return this.anInt3834;
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)I")
	@Override
	public int method4961() {
		return this.anInt3835;
	}
}
