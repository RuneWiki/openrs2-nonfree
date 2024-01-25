import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class5_Sub2_Sub2_Sub2 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	public int anInt3897;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "B")
	public byte aByte42;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "Lclient!co;")
	public Class5_Sub3 aClass5_Sub3_10;

	static {
		new Class40(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	@Override
	public int method3371() {
		return this.aClass5_Sub3_10 == null ? 0 : this.aClass5_Sub3_10.anInt4960 * 100 / (this.aClass5_Sub3_10.aByteArray66.length - this.aByte42);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3373() {
		if (super.aBoolean234 || this.aClass5_Sub3_10.aByteArray66.length - this.aByte42 > this.aClass5_Sub3_10.anInt4960) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub3_10.aByteArray66;
	}
}
