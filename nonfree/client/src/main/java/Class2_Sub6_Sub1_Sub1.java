import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class2_Sub6_Sub1_Sub1 extends Class2_Sub6_Sub1 {

	@OriginalMember(owner = "client!as", name = "F", descriptor = "Lclient!et;")
	public Class2_Sub20 aClass2_Sub20_2;

	@OriginalMember(owner = "client!as", name = "L", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!as", name = "z", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method8700() {
		if (super.aBoolean842 || this.aClass2_Sub20_2.anInt9723 < this.aClass2_Sub20_2.aByteArray111.length - this.aByte24) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub20_2.aByteArray111;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
	@Override
	public int method8702() {
		return this.aClass2_Sub20_2 == null ? 0 : this.aClass2_Sub20_2.anInt9723 * 100 / (this.aClass2_Sub20_2.aByteArray111.length - this.aByte24);
	}
}
