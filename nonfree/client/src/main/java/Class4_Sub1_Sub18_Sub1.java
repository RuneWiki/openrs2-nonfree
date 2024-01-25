import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class4_Sub1_Sub18_Sub1 extends Class4_Sub1_Sub18 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Lclient!qk;")
	public Class169 aClass169_2;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	@Override
	public int method4683() {
		return super.aBoolean489 ? 0 : 100;
	}

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4684() {
		if (super.aBoolean489) {
			throw new RuntimeException();
		}
		return this.aByteArray66;
	}
}
