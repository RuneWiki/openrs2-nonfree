import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public final class Class5_Sub1_Sub4_Sub1 extends Class5_Sub1_Sub4 {

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!rg;")
	public Class5_Sub12 aClass5_Sub12_3;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "B")
	public byte aByte26;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "I")
	public int anInt4108;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method5000() {
		if (super.aBoolean467 || this.aClass5_Sub12_3.anInt5731 < this.aClass5_Sub12_3.aByteArray90.length - this.aByte26) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub12_3.aByteArray90;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)I")
	@Override
	public int method4997() {
		return this.aClass5_Sub12_3 == null ? 0 : this.aClass5_Sub12_3.anInt5731 * 100 / (this.aClass5_Sub12_3.aByteArray90.length - this.aByte26);
	}
}
