import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class4_Sub2_Sub1_Sub1 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "Lclient!g;")
	public Class55 aClass55_1;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	public int anInt252;

	@OriginalMember(owner = "client!aj", name = "T", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)I")
	@Override
	public int method4498() {
		return this.aBoolean388 ? 0 : 100;
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4495() {
		if (this.aBoolean388) {
			throw new RuntimeException();
		}
		return this.aByteArray2;
	}
}
