import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class1_Sub6_Sub10_Sub1 extends Class1_Sub6_Sub10 {

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
	public int anInt3823;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "Lclient!re;")
	public Class1_Sub33 aClass1_Sub33_6;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aClass1_Sub33_6 == null ? 0 : this.aClass1_Sub33_6.lb * 100 / (this.aClass1_Sub33_6.aByteArray86.length - this.aByte53);
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5582() {
		if (super.aBoolean595 || this.aClass1_Sub33_6.aByteArray86.length - this.aByte53 > this.aClass1_Sub33_6.lb) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub33_6.aByteArray86;
	}
}
