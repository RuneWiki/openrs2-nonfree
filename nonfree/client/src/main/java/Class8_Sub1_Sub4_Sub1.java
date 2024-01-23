import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class8_Sub1_Sub4_Sub1 extends Class8_Sub1_Sub4 {

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
	public int anInt1225;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "Lclient!aj;")
	public Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!dk", name = "T", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)I")
	@Override
	public int method3007() {
		return this.aClass8_Sub2_1 == null ? 0 : this.aClass8_Sub2_1.anInt2955 * 100 / (this.aClass8_Sub2_1.aByteArray24.length - this.aByte5);
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3013() {
		if (this.aBoolean313 || this.aClass8_Sub2_1.aByteArray24.length - this.aByte5 > this.aClass8_Sub2_1.anInt2955) {
			throw new RuntimeException();
		}
		return this.aClass8_Sub2_1.aByteArray24;
	}
}
