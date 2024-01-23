import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class1_Sub5_Sub3_Sub2 extends Class1_Sub5_Sub3 {

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
	public int anInt4805;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "[B")
	public byte[] aByteArray166;

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "Lclient!qe;")
	public Class141 aClass141_4;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4020() {
		if (this.aBoolean460) {
			throw new RuntimeException();
		}
		return this.aByteArray166;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I")
	@Override
	public int method4019() {
		return this.aBoolean460 ? 0 : 100;
	}
}
