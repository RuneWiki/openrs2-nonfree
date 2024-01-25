import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class4_Sub2_Sub2_Sub2 extends Class4_Sub2_Sub2 {

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "Lclient!ht;")
	public Class117 aClass117_1;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
	public int anInt1667;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1359() {
		if (super.aBoolean113) {
			throw new RuntimeException();
		}
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)I")
	@Override
	public int method1361() {
		return super.aBoolean113 ? 0 : 100;
	}
}
