import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class1_Sub6_Sub10_Sub2 extends Class1_Sub6_Sub10 {

	@OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
	public int anInt6426;

	@OriginalMember(owner = "client!wt", name = "J", descriptor = "Lclient!ce;")
	public Class38 aClass38_4;

	@OriginalMember(owner = "client!wt", name = "K", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5582() {
		if (super.aBoolean595) {
			throw new RuntimeException();
		}
		return this.aByteArray98;
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)I")
	@Override
	public int method5581() {
		return super.aBoolean595 ? 0 : 100;
	}
}
