import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class3_Sub11_Sub2_Sub1 extends Class3_Sub11_Sub2 {

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ci", name = "L", descriptor = "Lclient!tk;")
	public Class337 aClass337_3;

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
	public int anInt1388;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method2889() {
		if (super.aBoolean237) {
			throw new RuntimeException();
		}
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)I")
	@Override
	public int method2891() {
		return super.aBoolean237 ? 0 : 100;
	}
}
