import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class5_Sub1_Sub4_Sub2 extends Class5_Sub1_Sub4 {

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "Lclient!nf;")
	public Class140 aClass140_3;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
	public int anInt5646;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method5000() {
		if (super.aBoolean467) {
			throw new RuntimeException();
		}
		return this.aByteArray89;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)I")
	@Override
	public int method4997() {
		return super.aBoolean467 ? 0 : 100;
	}
}
