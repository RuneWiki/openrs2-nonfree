import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class8_Sub5_Sub13_Sub2 extends Class8_Sub5_Sub13 {

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "Lclient!rfa;")
	public Class291 aClass291_4;

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method7301() {
		if (super.aBoolean624) {
			throw new RuntimeException();
		}
		return this.aByteArray82;
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)I")
	@Override
	public int method7304() {
		return super.aBoolean624 ? 0 : 100;
	}
}
