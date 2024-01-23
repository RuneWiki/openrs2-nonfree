import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class8_Sub1_Sub4_Sub2 extends Class8_Sub1_Sub4 {

	@OriginalMember(owner = "client!on", name = "N", descriptor = "I")
	public int anInt3875;

	@OriginalMember(owner = "client!on", name = "O", descriptor = "Lclient!pm;")
	public Class133 aClass133_3;

	@OriginalMember(owner = "client!on", name = "P", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3013() {
		if (this.aBoolean313) {
			throw new RuntimeException();
		}
		return this.aByteArray33;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)I")
	@Override
	public int method3007() {
		return this.aBoolean313 ? 0 : 100;
	}
}
