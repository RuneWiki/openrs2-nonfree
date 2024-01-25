import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class10_Sub1_Sub13_Sub1 extends Class10_Sub1_Sub13 {

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "Lclient!nn;")
	public Class10_Sub8 aClass10_Sub8_12;

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	public int anInt5876;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4709() {
		if (super.aBoolean383 || this.aClass10_Sub8_12.aByteArray44.length - this.aByte66 > this.aClass10_Sub8_12.anInt2989) {
			throw new RuntimeException();
		}
		return this.aClass10_Sub8_12.aByteArray44;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
	@Override
	public int method4708() {
		return this.aClass10_Sub8_12 == null ? 0 : this.aClass10_Sub8_12.anInt2989 * 100 / (this.aClass10_Sub8_12.aByteArray44.length - this.aByte66);
	}
}
