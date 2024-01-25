import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class3_Sub4_Sub1_Sub2 extends Class3_Sub4_Sub1 {

	@OriginalMember(owner = "client!rp", name = "F", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!rp", name = "G", descriptor = "Lclient!cu;")
	public Class3_Sub7 aClass3_Sub7_4;

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
	public int anInt6029;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method4715() {
		if (super.aBoolean527 || this.aClass3_Sub7_4.anInt3235 < this.aClass3_Sub7_4.aByteArray46.length - this.aByte96) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub7_4.aByteArray46;
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)I")
	@Override
	public int method4713() {
		return this.aClass3_Sub7_4 == null ? 0 : this.aClass3_Sub7_4.anInt3235 * 100 / (this.aClass3_Sub7_4.aByteArray46.length - this.aByte96);
	}
}
