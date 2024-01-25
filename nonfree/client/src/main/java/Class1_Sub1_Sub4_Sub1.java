import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class1_Sub1_Sub4_Sub1 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "B")
	public byte aByte43;

	@OriginalMember(owner = "client!fca", name = "y", descriptor = "Lclient!ge;")
	public Class1_Sub6 aClass1_Sub6_3;

	@OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
	public int anInt2568;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)I")
	@Override
	public int method7513() {
		return this.aClass1_Sub6_3 == null ? 0 : this.aClass1_Sub6_3.anInt4555 * 100 / (this.aClass1_Sub6_3.aByteArray66.length - this.aByte43);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7512() {
		if (super.aBoolean639 || this.aClass1_Sub6_3.anInt4555 < this.aClass1_Sub6_3.aByteArray66.length - this.aByte43) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub6_3.aByteArray66;
	}
}
