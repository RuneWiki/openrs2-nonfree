import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class3_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "Lclient!wea;")
	public Class370 aClass370_4;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
	public int anInt9954;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[B")
	public byte[] aByteArray103;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method8168() {
		if (super.aBoolean830) {
			throw new RuntimeException();
		}
		return this.aByteArray103;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)I")
	@Override
	public int method8170() {
		return super.aBoolean830 ? 0 : 100;
	}
}
