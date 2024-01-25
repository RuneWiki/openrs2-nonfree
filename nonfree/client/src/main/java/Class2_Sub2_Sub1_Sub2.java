import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class2_Sub2_Sub1_Sub2 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!is", name = "J", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!is", name = "L", descriptor = "Lclient!hca;")
	public Class135 aClass135_3;

	@OriginalMember(owner = "client!is", name = "N", descriptor = "I")
	public int anInt3974;

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(B)I")
	@Override
	public int method3399() {
		return super.aBoolean283 ? 0 : 100;
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method3401() {
		if (super.aBoolean283) {
			throw new RuntimeException();
		}
		return this.aByteArray45;
	}
}
