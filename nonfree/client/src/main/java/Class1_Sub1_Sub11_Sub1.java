import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class1_Sub1_Sub11_Sub1 extends Class1_Sub1_Sub11 {

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Lclient!sb;")
	public Class1_Sub14 aClass1_Sub14_4;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!hl", name = "V", descriptor = "B")
	public byte aByte7;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method3719() {
		if (this.aBoolean340 || this.aClass1_Sub14_4.anInt3290 < this.aClass1_Sub14_4.aByteArray34.length - this.aByte7) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub14_4.aByteArray34;
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)I")
	@Override
	public int method3721() {
		return this.aClass1_Sub14_4 == null ? 0 : this.aClass1_Sub14_4.anInt3290 * 100 / (this.aClass1_Sub14_4.aByteArray34.length - this.aByte7);
	}
}
