import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class1_Sub2_Sub10_Sub1 extends Class1_Sub2_Sub10 {

	@OriginalMember(owner = "client!mn", name = "K", descriptor = "Lclient!v;")
	public Class203 aClass203_6;

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
	public int anInt3912;

	@OriginalMember(owner = "client!mn", name = "P", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(B)I")
	@Override
	public int method4949() {
		return super.aBoolean471 ? 0 : 100;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4947() {
		if (super.aBoolean471) {
			throw new RuntimeException();
		}
		return this.aByteArray45;
	}
}
