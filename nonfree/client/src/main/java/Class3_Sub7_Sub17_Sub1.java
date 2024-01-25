import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class3_Sub7_Sub17_Sub1 extends Class3_Sub7_Sub17 {

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
	public int anInt4622;

	@OriginalMember(owner = "client!oo", name = "I", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "Lclient!eg;")
	public Class55 aClass55_2;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4374() {
		if (super.aBoolean300) {
			throw new RuntimeException();
		}
		return this.aByteArray73;
	}

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)I")
	@Override
	public int method4375() {
		return super.aBoolean300 ? 0 : 100;
	}
}
