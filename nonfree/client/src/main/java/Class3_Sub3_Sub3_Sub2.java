import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class3_Sub3_Sub3_Sub2 extends Class3_Sub3_Sub3 {

	@OriginalMember(owner = "client!hu", name = "R", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!hu", name = "U", descriptor = "Lclient!jb;")
	public Class117 aClass117_13;

	@OriginalMember(owner = "client!hu", name = "X", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)I")
	@Override
	public int method2879() {
		return super.aBoolean272 ? 0 : 100;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method2882() {
		if (super.aBoolean272) {
			throw new RuntimeException();
		}
		return this.aByteArray39;
	}
}
