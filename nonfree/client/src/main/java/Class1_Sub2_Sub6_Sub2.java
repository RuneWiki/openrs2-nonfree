import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class1_Sub2_Sub6_Sub2 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "Lclient!cg;")
	public Class1_Sub11 aClass1_Sub11_5;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "B")
	public byte aByte15;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
	public int anInt4227;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)I")
	@Override
	public int method3362() {
		return this.aClass1_Sub11_5 == null ? 0 : this.aClass1_Sub11_5.anInt3264 * 100 / (this.aClass1_Sub11_5.aByteArray47.length - this.aByte15);
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(B)[B")
	@Override
	public byte[] method3364() {
		if (this.aBoolean325 || this.aClass1_Sub11_5.aByteArray47.length - this.aByte15 > this.aClass1_Sub11_5.anInt3264) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub11_5.aByteArray47;
	}
}
