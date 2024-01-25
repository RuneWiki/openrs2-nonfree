import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class3_Sub7_Sub1_Sub2 extends Class3_Sub7_Sub1 {

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "B")
	public byte aByte64;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "Lclient!np;")
	public Class3_Sub11 aClass3_Sub11_4;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
	public int anInt6343;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method5380() {
		if (super.aBoolean458 || this.aClass3_Sub11_4.anInt6128 < this.aClass3_Sub11_4.aByteArray62.length - this.aByte64) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub11_4.aByteArray62;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)I")
	@Override
	public int method5382() {
		return this.aClass3_Sub11_4 == null ? 0 : this.aClass3_Sub11_4.anInt6128 * 100 / (this.aClass3_Sub11_4.aByteArray62.length - this.aByte64);
	}
}
