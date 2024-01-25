import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class5_Sub2_Sub14_Sub1 extends Class5_Sub2_Sub14 {

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!rv;")
	public Class5_Sub15 aClass5_Sub15_9;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public int anInt9172;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "B")
	public byte aByte120;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass5_Sub15_9 == null ? 0 : this.aClass5_Sub15_9.anInt4144 * 100 / (this.aClass5_Sub15_9.aByteArray45.length - this.aByte120);
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method8575() {
		if (super.aBoolean746 || this.aClass5_Sub15_9.aByteArray45.length - this.aByte120 > this.aClass5_Sub15_9.anInt4144) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub15_9.aByteArray45;
	}
}
