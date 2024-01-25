import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class2_Sub5_Sub6_Sub2 extends Class2_Sub5_Sub6 {

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	public int anInt4702;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "Lclient!va;")
	public Class248 aClass248_4;

	@OriginalMember(owner = "client!mo", name = "U", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)I")
	@Override
	public int method3780() {
		return super.aBoolean336 ? 0 : 100;
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method3782() {
		if (super.aBoolean336) {
			throw new RuntimeException();
		}
		return this.aByteArray95;
	}
}
