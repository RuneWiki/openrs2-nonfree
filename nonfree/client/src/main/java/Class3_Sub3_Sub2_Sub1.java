import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class3_Sub3_Sub2_Sub1 extends Class3_Sub3_Sub2 {

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "I")
	public int anInt3161;

	@OriginalMember(owner = "client!ft", name = "E", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "Lclient!qh;")
	public Class3_Sub11 aClass3_Sub11_1;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method5364() {
		if (super.aBoolean507 || this.aClass3_Sub11_1.anInt3520 < this.aClass3_Sub11_1.aByteArray36.length - this.aByte45) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub11_1.aByteArray36;
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(I)I")
	@Override
	public int method5363() {
		return this.aClass3_Sub11_1 == null ? 0 : this.aClass3_Sub11_1.anInt3520 * 100 / (this.aClass3_Sub11_1.aByteArray36.length - this.aByte45);
	}
}
