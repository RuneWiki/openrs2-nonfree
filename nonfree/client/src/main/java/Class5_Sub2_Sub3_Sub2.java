import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class5_Sub2_Sub3_Sub2 extends Class5_Sub2_Sub3 {

	@OriginalMember(owner = "client!si", name = "I", descriptor = "B")
	public byte aByte83;

	@OriginalMember(owner = "client!si", name = "M", descriptor = "Lclient!fh;")
	public Class5_Sub15 aClass5_Sub15_7;

	@OriginalMember(owner = "client!si", name = "N", descriptor = "I")
	public int anInt6103;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method4877() {
		if (super.aBoolean403 || this.aClass5_Sub15_7.anInt7013 < this.aClass5_Sub15_7.aByteArray93.length - this.aByte83) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub15_7.aByteArray93;
	}

	@OriginalMember(owner = "client!si", name = "h", descriptor = "(I)I")
	@Override
	public int method4878() {
		return this.aClass5_Sub15_7 == null ? 0 : this.aClass5_Sub15_7.anInt7013 * 100 / (this.aClass5_Sub15_7.aByteArray93.length - this.aByte83);
	}
}
