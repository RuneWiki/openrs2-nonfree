import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class3_Sub6_Sub2_Sub1 extends Class3_Sub6_Sub2 {

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "Lclient!fca;")
	public Class3_Sub17 aClass3_Sub17_1;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7723() {
		if (super.aBoolean677 || this.aClass3_Sub17_1.lb < this.aClass3_Sub17_1.aByteArray59.length - this.aByte22) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub17_1.aByteArray59;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	@Override
	public int method7721() {
		return this.aClass3_Sub17_1 == null ? 0 : this.aClass3_Sub17_1.lb * 100 / (this.aClass3_Sub17_1.aByteArray59.length - this.aByte22);
	}
}
