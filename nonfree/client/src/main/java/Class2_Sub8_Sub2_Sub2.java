import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class2_Sub8_Sub2_Sub2 extends Class2_Sub8_Sub2 {

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	public int anInt3961;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "Lclient!ma;")
	public Class108 aClass108_3;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)I")
	@Override
	public int method3255() {
		return this.aBoolean272 ? 0 : 100;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method3254() {
		if (this.aBoolean272) {
			throw new RuntimeException();
		}
		return this.aByteArray42;
	}
}
