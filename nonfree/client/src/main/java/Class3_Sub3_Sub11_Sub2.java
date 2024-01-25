import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class3_Sub3_Sub11_Sub2 extends Class3_Sub3_Sub11 {

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "Lclient!vc;")
	public Class253 aClass253_4;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "[B")
	public byte[] aByteArray108;

	@OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
	public int anInt6415;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)I")
	@Override
	public int method5282() {
		return super.aBoolean437 ? 0 : 100;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method5280() {
		if (super.aBoolean437) {
			throw new RuntimeException();
		}
		return this.aByteArray108;
	}
}
