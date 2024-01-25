import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class3_Sub6_Sub2_Sub2 extends Class3_Sub6_Sub2 {

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
	public int anInt9099;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "Lclient!rt;")
	public Class313 aClass313_3;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	@Override
	public int method7721() {
		return super.aBoolean677 ? 0 : 100;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[B")
	@Override
	public byte[] method7723() {
		if (super.aBoolean677) {
			throw new RuntimeException();
		}
		return this.aByteArray101;
	}
}
