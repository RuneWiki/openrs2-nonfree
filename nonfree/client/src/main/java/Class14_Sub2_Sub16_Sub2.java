import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class14_Sub2_Sub16_Sub2 extends Class14_Sub2_Sub16 {

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "B")
	public byte aByte67;

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "Lclient!jg;")
	public Class14_Sub4 aClass14_Sub4_8;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	public int anInt6277;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5613() {
		if (super.aBoolean428 || this.aClass14_Sub4_8.aByteArray74.length - this.aByte67 > this.aClass14_Sub4_8.anInt2637) {
			throw new RuntimeException();
		}
		return this.aClass14_Sub4_8.aByteArray74;
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)I")
	@Override
	public int method5610() {
		return this.aClass14_Sub4_8 == null ? 0 : this.aClass14_Sub4_8.anInt2637 * 100 / (this.aClass14_Sub4_8.aByteArray74.length - this.aByte67);
	}
}
