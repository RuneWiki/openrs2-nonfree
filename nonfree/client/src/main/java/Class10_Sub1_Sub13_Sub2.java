import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class10_Sub1_Sub13_Sub2 extends Class10_Sub1_Sub13 {

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
	public int anInt5925;

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "Lclient!fq;")
	public Class84 aClass84_3;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I")
	@Override
	public int method4708() {
		return super.aBoolean383 ? 0 : 100;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4709() {
		if (super.aBoolean383) {
			throw new RuntimeException();
		}
		return this.aByteArray79;
	}
}
