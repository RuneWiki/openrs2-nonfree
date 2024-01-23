import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class2_Sub8_Sub2_Sub1 extends Class2_Sub8_Sub2 {

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	public int anInt934;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "Lclient!oe;")
	public Class2_Sub16 aClass2_Sub16_3;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method3254() {
		if (this.aBoolean272 || this.aClass2_Sub16_3.anInt2789 < this.aClass2_Sub16_3.aByteArray17.length - this.aByte2) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub16_3.aByteArray17;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)I")
	@Override
	public int method3255() {
		return this.aClass2_Sub16_3 == null ? 0 : this.aClass2_Sub16_3.anInt2789 * 100 / (this.aClass2_Sub16_3.aByteArray17.length - this.aByte2);
	}
}
