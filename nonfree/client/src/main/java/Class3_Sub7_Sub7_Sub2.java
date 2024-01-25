import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pla")
public final class Class3_Sub7_Sub7_Sub2 extends Class3_Sub7_Sub7 {

	@OriginalMember(owner = "client!pla", name = "x", descriptor = "I")
	public int anInt8036;

	@OriginalMember(owner = "client!pla", name = "z", descriptor = "Lclient!jq;")
	public Class199 aClass199_4;

	@OriginalMember(owner = "client!pla", name = "v", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!pla", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method6874() {
		if (super.aBoolean537) {
			throw new RuntimeException();
		}
		return this.aByteArray81;
	}

	@OriginalMember(owner = "client!pla", name = "e", descriptor = "(B)I")
	@Override
	public int method6875() {
		return super.aBoolean537 ? 0 : 100;
	}
}
