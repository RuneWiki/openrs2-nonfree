import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class2_Sub2_Sub12_Sub1 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!li", name = "E", descriptor = "I")
	public int anInt4284;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!li", name = "N", descriptor = "Lclient!md;")
	public Class2_Sub20 aClass2_Sub20_4;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method4775() {
		if (super.aBoolean526 || this.aClass2_Sub20_4.aByteArray136.length - this.aByte50 > this.aClass2_Sub20_4.anInt4608) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub20_4.aByteArray136;
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(B)I")
	@Override
	public int method4777() {
		return this.aClass2_Sub20_4 == null ? 0 : this.aClass2_Sub20_4.anInt4608 * 100 / (this.aClass2_Sub20_4.aByteArray136.length - this.aByte50);
	}
}
