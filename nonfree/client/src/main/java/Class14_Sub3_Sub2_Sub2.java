import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class14_Sub3_Sub2_Sub2 extends Class14_Sub3_Sub2 {

	@OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
	public int anInt6920;

	@OriginalMember(owner = "client!ms", name = "H", descriptor = "Lclient!uaa;")
	public Class345 aClass345_4;

	@OriginalMember(owner = "client!ms", name = "I", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!ms", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method5605() {
		if (super.aBoolean494) {
			throw new RuntimeException();
		}
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "(B)I")
	@Override
	public int method5608() {
		return super.aBoolean494 ? 0 : 100;
	}
}
