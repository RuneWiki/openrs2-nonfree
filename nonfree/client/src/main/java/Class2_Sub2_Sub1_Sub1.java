import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!vj;")
	public Class2_Sub22 aClass2_Sub22_1;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)I")
	@Override
	public int method3399() {
		return this.aClass2_Sub22_1 == null ? 0 : this.aClass2_Sub22_1.anInt10247 * 100 / (this.aClass2_Sub22_1.aByteArray115.length - this.aByte1);
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method3401() {
		if (super.aBoolean283 || this.aClass2_Sub22_1.aByteArray115.length - this.aByte1 > this.aClass2_Sub22_1.anInt10247) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub22_1.aByteArray115;
	}
}
