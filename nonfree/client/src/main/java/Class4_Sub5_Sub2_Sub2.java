import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class4_Sub5_Sub2_Sub2 extends Class4_Sub5_Sub2 {

	@OriginalMember(owner = "client!os", name = "E", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!os", name = "F", descriptor = "I")
	public int anInt6912;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "Lclient!tc;")
	public Class343 aClass343_8;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6084() {
		if (super.aBoolean535) {
			throw new RuntimeException();
		}
		return this.aByteArray67;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)I")
	@Override
	public int method6087() {
		return super.aBoolean535 ? 0 : 100;
	}
}
