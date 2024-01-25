import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public final class Class6_Sub2_Sub1_Sub2 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
	public int anInt3301;

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "Lclient!nha;")
	public Class251 aClass251_1;

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "(I)I")
	@Override
	public int method3115() {
		return super.aBoolean259 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method3112() {
		if (super.aBoolean259) {
			throw new RuntimeException();
		}
		return this.aByteArray21;
	}
}
