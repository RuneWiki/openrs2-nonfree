import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class6_Sub2_Sub3_Sub1 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!bfa", name = "F", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!bfa", name = "G", descriptor = "Lclient!np;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!bfa", name = "I", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)I")
	@Override
	public int method1735() {
		return super.aBoolean158 ? 0 : 100;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method1736() {
		if (super.aBoolean158) {
			throw new RuntimeException();
		}
		return this.aByteArray12;
	}
}
