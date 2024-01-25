import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class3_Sub3_Sub3_Sub1 extends Class3_Sub3_Sub3 {

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "Lclient!bt;")
	public Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "B")
	public byte aByte8;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)I")
	@Override
	public int method2879() {
		return this.aClass3_Sub2_1 == null ? 0 : this.aClass3_Sub2_1.anInt7620 * 100 / (this.aClass3_Sub2_1.aByteArray95.length - this.aByte8);
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method2882() {
		if (super.aBoolean272 || this.aClass3_Sub2_1.anInt7620 < this.aClass3_Sub2_1.aByteArray95.length - this.aByte8) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub2_1.aByteArray95;
	}
}
