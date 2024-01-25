import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class3_Sub7_Sub17_Sub2 extends Class3_Sub7_Sub17 {

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Lclient!fb;")
	public Class3_Sub4 aClass3_Sub4_7;

	@OriginalMember(owner = "client!qn", name = "K", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
	public int anInt5180;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I")
	@Override
	public int method4375() {
		return this.aClass3_Sub4_7 == null ? 0 : this.aClass3_Sub4_7.anInt4268 * 100 / (this.aClass3_Sub4_7.aByteArray70.length - this.aByte50);
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4374() {
		if (super.aBoolean300 || this.aClass3_Sub4_7.aByteArray70.length - this.aByte50 > this.aClass3_Sub4_7.anInt4268) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub4_7.aByteArray70;
	}
}
