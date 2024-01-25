import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class1_Sub1_Sub4_Sub2 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "Lclient!km;")
	public Class167 aClass167_4;

	@OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
	public int anInt9134;

	@OriginalMember(owner = "client!wq", name = "z", descriptor = "[B")
	public byte[] aByteArray126;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7512() {
		if (super.aBoolean639) {
			throw new RuntimeException();
		}
		return this.aByteArray126;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)I")
	@Override
	public int method7513() {
		return super.aBoolean639 ? 0 : 100;
	}
}
