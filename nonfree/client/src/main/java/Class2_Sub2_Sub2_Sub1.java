import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class2_Sub2_Sub2_Sub1 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
	public int anInt3292;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Lclient!nr;")
	public Class245 aClass245_1;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I")
	@Override
	public int method4254() {
		return super.aBoolean390 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method4255() {
		if (super.aBoolean390) {
			throw new RuntimeException();
		}
		return this.aByteArray44;
	}
}
