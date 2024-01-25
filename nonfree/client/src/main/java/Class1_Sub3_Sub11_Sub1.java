import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class1_Sub3_Sub11_Sub1 extends Class1_Sub3_Sub11 {

	@OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
	public int anInt5943;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "Lclient!cr;")
	public Class57 aClass57_3;

	@OriginalMember(owner = "client!mq", name = "N", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7748() {
		if (super.aBoolean684) {
			throw new RuntimeException();
		}
		return this.aByteArray65;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
	@Override
	public int method7746() {
		return super.aBoolean684 ? 0 : 100;
	}
}
