import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class2_Sub5_Sub6_Sub1 extends Class2_Sub5_Sub6 {

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
	public int anInt2473;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "Lclient!si;")
	public Class2_Sub23 aClass2_Sub23_4;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method3782() {
		if (super.aBoolean336 || this.aClass2_Sub23_4.aByteArray130.length - this.aByte36 > this.aClass2_Sub23_4.anInt6952) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub23_4.aByteArray130;
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)I")
	@Override
	public int method3780() {
		return this.aClass2_Sub23_4 == null ? 0 : this.aClass2_Sub23_4.anInt6952 * 100 / (this.aClass2_Sub23_4.aByteArray130.length - this.aByte36);
	}
}
