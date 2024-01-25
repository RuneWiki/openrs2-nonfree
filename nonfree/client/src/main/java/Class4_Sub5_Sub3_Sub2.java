import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class4_Sub5_Sub3_Sub2 extends Class4_Sub5_Sub3 {

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	public int anInt3163;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!vp;")
	public Class345 aClass345_1;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method2841() {
		if (super.aBoolean279) {
			throw new RuntimeException();
		}
		return this.aByteArray31;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I")
	@Override
	public int method2840() {
		return super.aBoolean279 ? 0 : 100;
	}
}
