import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class4_Sub5_Sub3_Sub1 extends Class4_Sub5_Sub3 {

	@OriginalMember(owner = "client!cga", name = "B", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!cga", name = "D", descriptor = "Lclient!un;")
	public Class4_Sub11 aClass4_Sub11_1;

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
	public int anInt1036;

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method2841() {
		if (super.aBoolean279 || this.aClass4_Sub11_1.aByteArray68.length - this.aByte12 > this.aClass4_Sub11_1.anInt5831) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub11_1.aByteArray68;
	}

	@OriginalMember(owner = "client!cga", name = "e", descriptor = "(I)I")
	@Override
	public int method2840() {
		return this.aClass4_Sub11_1 == null ? 0 : this.aClass4_Sub11_1.anInt5831 * 100 / (this.aClass4_Sub11_1.aByteArray68.length - this.aByte12);
	}
}
