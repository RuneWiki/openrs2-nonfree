import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class1_Sub2_Sub7_Sub1 extends Class1_Sub2_Sub7 {

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "Lclient!dh;")
	public Class52 aClass52_4;

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
	public int anInt5385;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method5887() {
		if (super.aBoolean481) {
			throw new RuntimeException();
		}
		return this.aByteArray70;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)I")
	@Override
	public int method5889() {
		return super.aBoolean481 ? 0 : 100;
	}
}
