import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class3_Sub4_Sub8_Sub2 extends Class3_Sub4_Sub8 {

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Lclient!fd;")
	public Class3_Sub7 aClass3_Sub7_6;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
	public int anInt9302;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	@Override
	public int method7554() {
		return this.aClass3_Sub7_6 == null ? 0 : this.aClass3_Sub7_6.anInt7869 * 100 / (this.aClass3_Sub7_6.aByteArray86.length - this.aByte102);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7551() {
		if (super.aBoolean781 || this.aClass3_Sub7_6.anInt7869 < this.aClass3_Sub7_6.aByteArray86.length - this.aByte102) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub7_6.aByteArray86;
	}
}
