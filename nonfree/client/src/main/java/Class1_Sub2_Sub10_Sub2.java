import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class1_Sub2_Sub10_Sub2 extends Class1_Sub2_Sub10 {

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "B")
	public byte aByte69;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
	public int anInt5676;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "Lclient!nj;")
	public Class1_Sub21 aClass1_Sub21_7;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4947() {
		if (super.aBoolean471 || this.aClass1_Sub21_7.aByteArray82.length - this.aByte69 > this.aClass1_Sub21_7.anInt6611) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub21_7.aByteArray82;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)I")
	@Override
	public int method4949() {
		return this.aClass1_Sub21_7 == null ? 0 : this.aClass1_Sub21_7.anInt6611 * 100 / (this.aClass1_Sub21_7.aByteArray82.length - this.aByte69);
	}
}
