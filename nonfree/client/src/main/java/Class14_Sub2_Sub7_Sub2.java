import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class14_Sub2_Sub7_Sub2 extends Class14_Sub2_Sub7 {

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "B")
	public byte aByte113;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "Lclient!jc;")
	public Class14_Sub21 aClass14_Sub21_9;

	@OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
	public int anInt9194;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method7931() {
		if (super.aBoolean637 || this.aClass14_Sub21_9.aByteArray99.length - this.aByte113 > this.aClass14_Sub21_9.anInt8936) {
			throw new RuntimeException();
		}
		return this.aClass14_Sub21_9.aByteArray99;
	}

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "(I)I")
	@Override
	public int method7928() {
		return this.aClass14_Sub21_9 == null ? 0 : this.aClass14_Sub21_9.anInt8936 * 100 / (this.aClass14_Sub21_9.aByteArray99.length - this.aByte113);
	}
}
