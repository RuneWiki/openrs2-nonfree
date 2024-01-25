import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class1_Sub4_Sub5_Sub2 extends Class1_Sub4_Sub5 {

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	public int anInt5398;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!bg;")
	public Class1_Sub8 aClass1_Sub8_7;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I")
	@Override
	public int method4677() {
		return this.aClass1_Sub8_7 == null ? 0 : this.aClass1_Sub8_7.anInt5182 * 100 / (this.aClass1_Sub8_7.aByteArray81.length - this.aByte55);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method4679() {
		if (super.aBoolean519 || this.aClass1_Sub8_7.anInt5182 < this.aClass1_Sub8_7.aByteArray81.length - this.aByte55) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub8_7.aByteArray81;
	}
}
