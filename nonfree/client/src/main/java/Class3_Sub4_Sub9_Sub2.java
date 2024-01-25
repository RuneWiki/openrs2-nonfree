import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class3_Sub4_Sub9_Sub2 extends Class3_Sub4_Sub9 {

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "B")
	public byte aByte130;

	@OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
	public int anInt10125;

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "Lclient!sl;")
	public Class3_Sub3 aClass3_Sub3_9;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method8677() {
		if (super.aBoolean724 || this.aClass3_Sub3_9.anInt4736 < this.aClass3_Sub3_9.aByteArray54.length - this.aByte130) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub3_9.aByteArray54;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I")
	@Override
	public int method8676() {
		return this.aClass3_Sub3_9 == null ? 0 : this.aClass3_Sub3_9.anInt4736 * 100 / (this.aClass3_Sub3_9.aByteArray54.length - this.aByte130);
	}
}
