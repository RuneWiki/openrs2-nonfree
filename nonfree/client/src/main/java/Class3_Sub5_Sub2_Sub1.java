import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class3_Sub5_Sub2_Sub1 extends Class3_Sub5_Sub2 {

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "Lclient!naa;")
	public Class241 aClass241_1;

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I")
	@Override
	public int method6439() {
		return super.aBoolean541 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method6440() {
		if (super.aBoolean541) {
			throw new RuntimeException();
		}
		return this.aByteArray7;
	}
}
