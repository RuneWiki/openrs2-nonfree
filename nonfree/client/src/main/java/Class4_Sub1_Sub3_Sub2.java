import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class4_Sub1_Sub3_Sub2 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
	public int anInt4506;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!mk", name = "M", descriptor = "Lclient!ht;")
	public Class113 aClass113_3;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3403() {
		if (super.aBoolean330) {
			throw new RuntimeException();
		}
		return this.aByteArray44;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I")
	@Override
	public int method3404() {
		return super.aBoolean330 ? 0 : 100;
	}
}
