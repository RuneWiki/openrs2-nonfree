import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public final class Class5_Sub2_Sub14_Sub2 extends Class5_Sub2_Sub14 {

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
	public int anInt10279;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "[B")
	public byte[] aByteArray107;

	@OriginalMember(owner = "client!wda", name = "I", descriptor = "Lclient!qia;")
	public Class287 aClass287_3;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method8575() {
		if (super.aBoolean746) {
			throw new RuntimeException();
		}
		return this.aByteArray107;
	}

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)I")
	@Override
	public int method8574() {
		return super.aBoolean746 ? 0 : 100;
	}
}
