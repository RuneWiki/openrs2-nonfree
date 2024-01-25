import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class2_Sub3_Sub5_Sub1 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "Lclient!lf;")
	public Class207 aClass207_2;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
	public int anInt4966;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method5301() {
		if (super.aBoolean501) {
			throw new RuntimeException();
		}
		return this.aByteArray58;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I")
	@Override
	public int method5299() {
		return super.aBoolean501 ? 0 : 100;
	}
}
