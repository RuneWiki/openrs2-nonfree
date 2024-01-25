import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class5_Sub3_Sub11_Sub1 extends Class5_Sub3_Sub11 {

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!mc;")
	public Class5_Sub41 aClass5_Sub41_2;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "B")
	public byte aByte87;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method6567() {
		if (super.aBoolean664 || this.aClass5_Sub41_2.anInt9230 < this.aClass5_Sub41_2.aByteArray93.length - this.aByte87) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub41_2.aByteArray93;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
	@Override
	public int method6565() {
		return this.aClass5_Sub41_2 == null ? 0 : this.aClass5_Sub41_2.anInt9230 * 100 / (this.aClass5_Sub41_2.aByteArray93.length - this.aByte87);
	}
}
