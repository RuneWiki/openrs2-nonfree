import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class1_Sub1_Sub6_Sub2 extends Class1_Sub1_Sub6 {

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "Lclient!ia;")
	public Class1_Sub3 aClass1_Sub3_8;

	@OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
	public int anInt7867;

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "B")
	public byte aByte104;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method6095() {
		if (super.aBoolean512 || this.aClass1_Sub3_8.aByteArray14.length - this.aByte104 > this.aClass1_Sub3_8.anInt1710) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub3_8.aByteArray14;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	@Override
	public int method6098() {
		return this.aClass1_Sub3_8 == null ? 0 : this.aClass1_Sub3_8.anInt1710 * 100 / (this.aClass1_Sub3_8.aByteArray14.length - this.aByte104);
	}
}
