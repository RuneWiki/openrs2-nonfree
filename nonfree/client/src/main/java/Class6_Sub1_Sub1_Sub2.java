import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class6_Sub1_Sub1_Sub2 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "Lclient!ap;")
	public Class14 aClass14_4;

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
	public int anInt7075;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5786() {
		if (super.aBoolean481) {
			throw new RuntimeException();
		}
		return this.aByteArray88;
	}

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "(I)I")
	@Override
	public int method5787() {
		return super.aBoolean481 ? 0 : 100;
	}
}
