import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class3_Sub7_Sub4_Sub1 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "Lclient!dc;")
	public Class3_Sub9 aClass3_Sub9_3;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "B")
	public byte aByte34;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	@Override
	public int method1502() {
		return this.aClass3_Sub9_3 == null ? 0 : this.aClass3_Sub9_3.anInt6453 * 100 / (this.aClass3_Sub9_3.aByteArray51.length - this.aByte34);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method1504() {
		if (super.aBoolean126 || this.aClass3_Sub9_3.aByteArray51.length - this.aByte34 > this.aClass3_Sub9_3.anInt6453) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub9_3.aByteArray51;
	}
}
