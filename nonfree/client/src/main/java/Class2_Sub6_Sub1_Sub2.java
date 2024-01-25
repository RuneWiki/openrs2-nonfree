import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class2_Sub6_Sub1_Sub2 extends Class2_Sub6_Sub1 {

	@OriginalMember(owner = "client!ufa", name = "z", descriptor = "[B")
	public byte[] aByteArray113;

	@OriginalMember(owner = "client!ufa", name = "D", descriptor = "I")
	public int anInt9867;

	@OriginalMember(owner = "client!ufa", name = "E", descriptor = "Lclient!wia;")
	public Class402 aClass402_4;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)I")
	@Override
	public int method8702() {
		return super.aBoolean842 ? 0 : 100;
	}

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method8700() {
		if (super.aBoolean842) {
			throw new RuntimeException();
		}
		return this.aByteArray113;
	}
}
