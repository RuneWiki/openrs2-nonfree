import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public final class Class14_Sub3_Sub2_Sub1 extends Class14_Sub3_Sub2 {

	@OriginalMember(owner = "client!kka", name = "D", descriptor = "I")
	public int anInt5370;

	@OriginalMember(owner = "client!kka", name = "E", descriptor = "B")
	public byte aByte87;

	@OriginalMember(owner = "client!kka", name = "G", descriptor = "Lclient!so;")
	public Class14_Sub29 aClass14_Sub29_6;

	@OriginalMember(owner = "client!kka", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method5605() {
		if (super.aBoolean494 || this.aClass14_Sub29_6.aByteArray84.length - this.aByte87 > this.aClass14_Sub29_6.anInt7264) {
			throw new RuntimeException();
		}
		return this.aClass14_Sub29_6.aByteArray84;
	}

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "(B)I")
	@Override
	public int method5608() {
		return this.aClass14_Sub29_6 == null ? 0 : this.aClass14_Sub29_6.anInt7264 * 100 / (this.aClass14_Sub29_6.aByteArray84.length - this.aByte87);
	}
}
