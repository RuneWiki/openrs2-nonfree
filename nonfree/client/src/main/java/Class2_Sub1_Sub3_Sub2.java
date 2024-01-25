import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
	public int anInt5541;

	@OriginalMember(owner = "client!rn", name = "Q", descriptor = "Lclient!nk;")
	public Class161 aClass161_4;

	@OriginalMember(owner = "client!rn", name = "R", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4856() {
		if (super.aBoolean434) {
			throw new RuntimeException();
		}
		return this.aByteArray89;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)I")
	@Override
	public int method4854() {
		return super.aBoolean434 ? 0 : 100;
	}
}
