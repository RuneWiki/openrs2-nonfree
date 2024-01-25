import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class5_Sub4_Sub12_Sub2 extends Class5_Sub4_Sub12 {

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "Lclient!mi;")
	public Class229 aClass229_2;

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
	public int anInt4406;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method4030() {
		if (super.aBoolean358) {
			throw new RuntimeException();
		}
		return this.aByteArray38;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
	@Override
	public int method4029() {
		return super.aBoolean358 ? 0 : 100;
	}
}
