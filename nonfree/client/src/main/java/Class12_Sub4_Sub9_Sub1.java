import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class12_Sub4_Sub9_Sub1 extends Class12_Sub4_Sub9 {

	@OriginalMember(owner = "client!kv", name = "D", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!kv", name = "E", descriptor = "Lclient!oba;")
	public Class224 aClass224_5;

	@OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
	public int anInt5317;

	static {
		new Class88("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method7280() {
		if (super.aBoolean623) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)I")
	@Override
	public int method7281() {
		return super.aBoolean623 ? 0 : 100;
	}
}
