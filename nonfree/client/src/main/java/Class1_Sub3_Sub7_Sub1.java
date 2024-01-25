import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class1_Sub3_Sub7_Sub1 extends Class1_Sub3_Sub7 {

	@OriginalMember(owner = "client!ep", name = "K", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!ep", name = "O", descriptor = "Lclient!wk;")
	public Class271 aClass271_1;

	@OriginalMember(owner = "client!ep", name = "P", descriptor = "I")
	public int anInt1385;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method5942() {
		if (super.aBoolean646) {
			throw new RuntimeException();
		}
		return this.aByteArray16;
	}

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)I")
	@Override
	public int method5947() {
		return super.aBoolean646 ? 0 : 100;
	}
}
