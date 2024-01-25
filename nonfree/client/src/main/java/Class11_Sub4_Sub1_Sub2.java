import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class11_Sub4_Sub1_Sub2 extends Class11_Sub4_Sub1 {

	@OriginalMember(owner = "client!rs", name = "I", descriptor = "Lclient!r;")
	public Class171 aClass171_3;

	@OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)I")
	@Override
	public int method4699() {
		return super.aBoolean359 ? 0 : 100;
	}

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4696() {
		if (super.aBoolean359) {
			throw new RuntimeException();
		}
		return this.aByteArray89;
	}
}
