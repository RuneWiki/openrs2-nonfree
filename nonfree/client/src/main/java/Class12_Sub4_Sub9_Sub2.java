import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class12_Sub4_Sub9_Sub2 extends Class12_Sub4_Sub9 {

	@OriginalMember(owner = "client!uca", name = "G", descriptor = "I")
	public int anInt8860;

	@OriginalMember(owner = "client!uca", name = "H", descriptor = "Lclient!daa;")
	public Class12_Sub8 aClass12_Sub8_7;

	@OriginalMember(owner = "client!uca", name = "J", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aClass12_Sub8_7 == null ? 0 : this.aClass12_Sub8_7.anInt6217 * 100 / (this.aClass12_Sub8_7.aByteArray82.length - this.aByte96);
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method7280() {
		if (super.aBoolean623 || this.aClass12_Sub8_7.anInt6217 < this.aClass12_Sub8_7.aByteArray82.length - this.aByte96) {
			throw new RuntimeException();
		}
		return this.aClass12_Sub8_7.aByteArray82;
	}
}
