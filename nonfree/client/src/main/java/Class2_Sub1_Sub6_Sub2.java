import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class2_Sub1_Sub6_Sub2 extends Class2_Sub1_Sub6 {

	@OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
	public int anInt7651;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "Lclient!ce;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!nq", name = "O", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
	@Override
	public int method6761() {
		return super.aBoolean566 ? 0 : 100;
	}

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)[B")
	@Override
	public byte[] method6765() {
		if (super.aBoolean566) {
			throw new RuntimeException();
		}
		return this.aByteArray68;
	}
}
