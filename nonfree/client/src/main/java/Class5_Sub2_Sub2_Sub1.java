import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class5_Sub2_Sub2_Sub1 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "Lclient!gg;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!bq", name = "I", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I")
	@Override
	public int method3371() {
		return super.aBoolean234 ? 0 : 100;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3373() {
		if (super.aBoolean234) {
			throw new RuntimeException();
		}
		return this.aByteArray23;
	}
}
