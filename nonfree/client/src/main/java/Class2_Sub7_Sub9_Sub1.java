import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class2_Sub7_Sub9_Sub1 extends Class2_Sub7_Sub9 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!uj;")
	public Class349 aClass349_3;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	public int anInt6057;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method7965() {
		if (super.aBoolean672) {
			throw new RuntimeException();
		}
		return this.aByteArray58;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	@Override
	public int method7966() {
		return super.aBoolean672 ? 0 : 100;
	}
}
