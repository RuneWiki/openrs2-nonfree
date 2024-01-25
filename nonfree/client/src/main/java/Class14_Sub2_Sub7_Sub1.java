import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public final class Class14_Sub2_Sub7_Sub1 extends Class14_Sub2_Sub7 {

	@OriginalMember(owner = "client!dda", name = "B", descriptor = "[B")
	public byte[] aByteArray26;

	@OriginalMember(owner = "client!dda", name = "C", descriptor = "Lclient!vw;")
	public Class384 aClass384_1;

	@OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)I")
	@Override
	public int method7928() {
		return super.aBoolean637 ? 0 : 100;
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method7931() {
		if (super.aBoolean637) {
			throw new RuntimeException();
		}
		return this.aByteArray26;
	}
}
