import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class1_Sub5_Sub3_Sub1 extends Class1_Sub5_Sub3 {

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
	public int anInt3500;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "Lclient!fh;")
	public Class1_Sub13 aClass1_Sub13_6;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4020() {
		if (this.aBoolean460 || this.aClass1_Sub13_6.anInt2018 < this.aClass1_Sub13_6.aByteArray63.length - this.aByte11) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub13_6.aByteArray63;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
	@Override
	public int method4019() {
		return this.aClass1_Sub13_6 == null ? 0 : this.aClass1_Sub13_6.anInt2018 * 100 / (this.aClass1_Sub13_6.aByteArray63.length - this.aByte11);
	}
}
