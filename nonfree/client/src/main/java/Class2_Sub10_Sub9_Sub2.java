import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class2_Sub10_Sub9_Sub2 extends Class2_Sub10_Sub9 {

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
	public int anInt4817;

	@OriginalMember(owner = "client!qg", name = "S", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!qg", name = "T", descriptor = "Lclient!q;")
	public Class197 aClass197_2;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method4243() {
		if (super.aBoolean362) {
			throw new RuntimeException();
		}
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)I")
	@Override
	public int method4241() {
		return super.aBoolean362 ? 0 : 100;
	}
}
