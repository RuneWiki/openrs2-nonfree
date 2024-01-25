import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class1_Sub4_Sub2_Sub2 extends Class1_Sub4_Sub2 {

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
	public int anInt4895;

	@OriginalMember(owner = "client!pg", name = "U", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!pg", name = "W", descriptor = "Lclient!cq;")
	public Class28 aClass28_4;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)I")
	@Override
	public int method4472() {
		return super.aBoolean367 ? 0 : 100;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)[B")
	@Override
	public byte[] method4468() {
		if (super.aBoolean367) {
			throw new RuntimeException();
		}
		return this.aByteArray78;
	}
}
