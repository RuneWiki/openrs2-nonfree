import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class3_Sub7_Sub2_Sub1 extends Class3_Sub7_Sub2 {

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "[B")
	public byte[] aByteArray25;

	@OriginalMember(owner = "client!dl", name = "L", descriptor = "Lclient!rg;")
	public Class204 aClass204_1;

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "I")
	public int anInt1337;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I")
	@Override
	public int method4474() {
		return super.aBoolean387 ? 0 : 100;
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method4473() {
		if (super.aBoolean387) {
			throw new RuntimeException();
		}
		return this.aByteArray25;
	}
}
