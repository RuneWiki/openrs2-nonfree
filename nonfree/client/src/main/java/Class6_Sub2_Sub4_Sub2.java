import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class6_Sub2_Sub4_Sub2 extends Class6_Sub2_Sub4 {

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "Lclient!ji;")
	public Class6_Sub21 aClass6_Sub21_5;

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
	public int anInt5711;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)[B")
	@Override
	public byte[] method4908() {
		if (super.aBoolean400 || this.aClass6_Sub21_5.anInt7338 < this.aClass6_Sub21_5.aByteArray93.length - this.aByte48) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub21_5.aByteArray93;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
	@Override
	public int method4909() {
		return this.aClass6_Sub21_5 == null ? 0 : this.aClass6_Sub21_5.anInt7338 * 100 / (this.aClass6_Sub21_5.aByteArray93.length - this.aByte48);
	}
}
