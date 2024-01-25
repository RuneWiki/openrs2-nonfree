import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class3_Sub4_Sub9_Sub1 extends Class3_Sub4_Sub9 {

	@OriginalMember(owner = "client!om", name = "F", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Lclient!lp;")
	public Class209 aClass209_5;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "I")
	public int anInt7475;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method8677() {
		if (super.aBoolean724) {
			throw new RuntimeException();
		}
		return this.aByteArray79;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)I")
	@Override
	public int method8676() {
		return super.aBoolean724 ? 0 : 100;
	}
}
