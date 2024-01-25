import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class5_Sub9_Sub3_Sub2 extends Class5_Sub9_Sub3 {

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
	public int anInt5418;

	@OriginalMember(owner = "client!rj", name = "H", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "Lclient!bk;")
	public Class5_Sub1 aClass5_Sub1_7;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4725() {
		if (super.aBoolean408 || this.aClass5_Sub1_7.aByteArray18.length - this.aByte56 > this.aClass5_Sub1_7.anInt2029) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub1_7.aByteArray18;
	}

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)I")
	@Override
	public int method4722() {
		return this.aClass5_Sub1_7 == null ? 0 : this.aClass5_Sub1_7.anInt2029 * 100 / (this.aClass5_Sub1_7.aByteArray18.length - this.aByte56);
	}
}
