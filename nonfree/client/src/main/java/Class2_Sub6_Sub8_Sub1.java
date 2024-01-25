import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public final class Class2_Sub6_Sub8_Sub1 extends Class2_Sub6_Sub8 {

	@OriginalMember(owner = "client!mba", name = "G", descriptor = "B")
	public byte aByte105;

	@OriginalMember(owner = "client!mba", name = "L", descriptor = "Lclient!cea;")
	public Class2_Sub11 aClass2_Sub11_2;

	@OriginalMember(owner = "client!mba", name = "O", descriptor = "I")
	public int anInt6836;

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method7144() {
		if (super.aBoolean601 || this.aClass2_Sub11_2.anInt10066 < this.aClass2_Sub11_2.aByteArray128.length - this.aByte105) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub11_2.aByteArray128;
	}

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(I)I")
	@Override
	public int method7142() {
		return this.aClass2_Sub11_2 == null ? 0 : this.aClass2_Sub11_2.anInt10066 * 100 / (this.aClass2_Sub11_2.aByteArray128.length - this.aByte105);
	}
}
