import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class11_Sub4_Sub1_Sub1 extends Class11_Sub4_Sub1 {

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
	public int anInt371;

	@OriginalMember(owner = "client!bg", name = "O", descriptor = "Lclient!kh;")
	public Class11_Sub25 aClass11_Sub25_1;

	@OriginalMember(owner = "client!bg", name = "Q", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4696() {
		if (super.aBoolean359 || this.aClass11_Sub25_1.aByteArray93.length - this.aByte2 > this.aClass11_Sub25_1.anInt6076) {
			throw new RuntimeException();
		}
		return this.aClass11_Sub25_1.aByteArray93;
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)I")
	@Override
	public int method4699() {
		return this.aClass11_Sub25_1 == null ? 0 : this.aClass11_Sub25_1.anInt6076 * 100 / (this.aClass11_Sub25_1.aByteArray93.length - this.aByte2);
	}
}
