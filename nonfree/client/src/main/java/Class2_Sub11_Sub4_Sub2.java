import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class2_Sub11_Sub4_Sub2 extends Class2_Sub11_Sub4 {

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public int anInt4902;

	@OriginalMember(owner = "client!qb", name = "Y", descriptor = "Lclient!dg;")
	public Class2_Sub10 aClass2_Sub10_5;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "B")
	public byte aByte41;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)I")
	@Override
	public int method4518() {
		return this.aClass2_Sub10_5 == null ? 0 : this.aClass2_Sub10_5.anInt4807 * 100 / (this.aClass2_Sub10_5.aByteArray57.length - this.aByte41);
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method4520() {
		if (super.aBoolean446 || this.aClass2_Sub10_5.aByteArray57.length - this.aByte41 > this.aClass2_Sub10_5.anInt4807) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub10_5.aByteArray57;
	}
}
