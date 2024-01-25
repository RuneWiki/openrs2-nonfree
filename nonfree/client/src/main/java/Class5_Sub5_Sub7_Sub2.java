import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class5_Sub5_Sub7_Sub2 extends Class5_Sub5_Sub7 {

	@OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
	public int anInt8201;

	@OriginalMember(owner = "client!qp", name = "E", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!qp", name = "H", descriptor = "Lclient!lp;")
	public Class223 aClass223_3;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method7061() {
		if (super.aBoolean613) {
			throw new RuntimeException();
		}
		return this.aByteArray82;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
	@Override
	public int method7065() {
		return super.aBoolean613 ? 0 : 100;
	}
}
