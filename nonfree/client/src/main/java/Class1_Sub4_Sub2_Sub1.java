import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class1_Sub4_Sub2_Sub1 extends Class1_Sub4_Sub2 {

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "client!bl", name = "Z", descriptor = "Lclient!at;")
	public Class1_Sub7 aClass1_Sub7_1;

	@OriginalMember(owner = "client!bl", name = "cb", descriptor = "B")
	public byte aByte8;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)[B")
	@Override
	public byte[] method4468() {
		if (super.aBoolean367 || this.aClass1_Sub7_1.aByteArray41.length - this.aByte8 > this.aClass1_Sub7_1.anInt2219) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub7_1.aByteArray41;
	}

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)I")
	@Override
	public int method4472() {
		return this.aClass1_Sub7_1 == null ? 0 : this.aClass1_Sub7_1.anInt2219 * 100 / (this.aClass1_Sub7_1.aByteArray41.length - this.aByte8);
	}
}
