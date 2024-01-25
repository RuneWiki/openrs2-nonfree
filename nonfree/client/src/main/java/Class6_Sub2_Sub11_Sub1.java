import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class6_Sub2_Sub11_Sub1 extends Class6_Sub2_Sub11 {

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "Lclient!ae;")
	public Class6_Sub1 aClass6_Sub1_5;

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
	public int anInt5808;

	static {
		new Class267("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)I")
	@Override
	public int method6376() {
		return this.aClass6_Sub1_5 == null ? 0 : this.aClass6_Sub1_5.anInt7898 * 100 / (this.aClass6_Sub1_5.aByteArray96.length - this.aByte79);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6374() {
		if (super.aBoolean491 || this.aClass6_Sub1_5.anInt7898 < this.aClass6_Sub1_5.aByteArray96.length - this.aByte79) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub1_5.aByteArray96;
	}
}
