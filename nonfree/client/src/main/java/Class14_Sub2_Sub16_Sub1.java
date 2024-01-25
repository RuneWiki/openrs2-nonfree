import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class14_Sub2_Sub16_Sub1 extends Class14_Sub2_Sub16 {

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "Lclient!ug;")
	public Class199 aClass199_4;

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "[B")
	public byte[] aByteArray143;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
	public int anInt4823;

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)I")
	@Override
	public int method5610() {
		return super.aBoolean428 ? 0 : 100;
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5613() {
		if (super.aBoolean428) {
			throw new RuntimeException();
		}
		return this.aByteArray143;
	}
}
