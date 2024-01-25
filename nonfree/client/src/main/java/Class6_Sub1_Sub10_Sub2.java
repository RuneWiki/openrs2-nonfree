import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class6_Sub1_Sub10_Sub2 extends Class6_Sub1_Sub10 {

	@OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
	public int anInt8642;

	@OriginalMember(owner = "client!uda", name = "F", descriptor = "[B")
	public byte[] aByteArray111;

	@OriginalMember(owner = "client!uda", name = "I", descriptor = "Lclient!vh;")
	public Class331 aClass331_3;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)I")
	@Override
	public int method7036() {
		return super.aBoolean607 ? 0 : 100;
	}

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method7037() {
		if (super.aBoolean607) {
			throw new RuntimeException();
		}
		return this.aByteArray111;
	}
}
