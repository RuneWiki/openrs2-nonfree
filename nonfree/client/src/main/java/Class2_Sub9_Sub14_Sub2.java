import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class2_Sub9_Sub14_Sub2 extends Class2_Sub9_Sub14 {

	@OriginalMember(owner = "client!u", name = "S", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "I")
	public int anInt6305;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "Lclient!uj;")
	public Class204 aClass204_4;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5297() {
		if (super.aBoolean557) {
			throw new RuntimeException();
		}
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(I)I")
	@Override
	public int method5298() {
		return super.aBoolean557 ? 0 : 100;
	}
}
