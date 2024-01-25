import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class3_Sub1_Sub3_Sub1 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public int anInt6711;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "B")
	public byte aByte89;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Lclient!tn;")
	public Class3_Sub15 aClass3_Sub15_6;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(B)I")
	@Override
	public int method8170() {
		return this.aClass3_Sub15_6 == null ? 0 : this.aClass3_Sub15_6.anInt10282 * 100 / (this.aClass3_Sub15_6.aByteArray106.length - this.aByte89);
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method8168() {
		if (super.aBoolean830 || this.aClass3_Sub15_6.anInt10282 < this.aClass3_Sub15_6.aByteArray106.length - this.aByte89) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub15_6.aByteArray106;
	}
}
