import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class5_Sub9_Sub3_Sub1 extends Class5_Sub9_Sub3 {

	@OriginalMember(owner = "client!ds", name = "N", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
	public int anInt1551;

	@OriginalMember(owner = "client!ds", name = "R", descriptor = "Lclient!wq;")
	public Class219 aClass219_1;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4725() {
		if (super.aBoolean408) {
			throw new RuntimeException();
		}
		return this.aByteArray16;
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)I")
	@Override
	public int method4722() {
		return super.aBoolean408 ? 0 : 100;
	}
}
