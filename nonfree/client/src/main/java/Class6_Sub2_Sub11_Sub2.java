import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class Class6_Sub2_Sub11_Sub2 extends Class6_Sub2_Sub11 {

	@OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
	public int anInt7799;

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!wi", name = "S", descriptor = "Lclient!ek;")
	public Class63 aClass63_6;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6374() {
		if (super.aBoolean491) {
			throw new RuntimeException();
		}
		return this.aByteArray95;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)I")
	@Override
	public int method6376() {
		return super.aBoolean491 ? 0 : 100;
	}
}
