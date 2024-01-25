import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class6_Sub5_Sub12_Sub2 extends Class6_Sub5_Sub12 {

	@OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
	public int anInt8553;

	@OriginalMember(owner = "client!rba", name = "F", descriptor = "Lclient!bg;")
	public Class26 aClass26_4;

	@OriginalMember(owner = "client!rba", name = "H", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)I")
	@Override
	public int method7124() {
		return super.aBoolean682 ? 0 : 100;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method7125() {
		if (super.aBoolean682) {
			throw new RuntimeException();
		}
		return this.aByteArray80;
	}
}
