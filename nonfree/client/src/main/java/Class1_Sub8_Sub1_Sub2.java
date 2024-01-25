import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class1_Sub8_Sub1_Sub2 extends Class1_Sub8_Sub1 {

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	public int anInt7351;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!ac;")
	public Class1_Sub3 aClass1_Sub3_5;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5914() {
		if (super.aBoolean563 || this.aClass1_Sub3_5.anInt9802 < this.aClass1_Sub3_5.aByteArray104.length - this.aByte99) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub3_5.aByteArray104;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	@Override
	public int method5911() {
		return this.aClass1_Sub3_5 == null ? 0 : this.aClass1_Sub3_5.anInt9802 * 100 / (this.aClass1_Sub3_5.aByteArray104.length - this.aByte99);
	}
}
