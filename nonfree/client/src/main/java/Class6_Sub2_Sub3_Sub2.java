import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class6_Sub2_Sub3_Sub2 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!dia", name = "G", descriptor = "Lclient!rg;")
	public Class6_Sub40 aClass6_Sub40_1;

	@OriginalMember(owner = "client!dia", name = "I", descriptor = "I")
	public int anInt2085;

	@OriginalMember(owner = "client!dia", name = "K", descriptor = "B")
	public byte aByte49;

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)[B")
	@Override
	public byte[] method1736() {
		if (super.aBoolean158 || this.aClass6_Sub40_1.aByteArray113.length - this.aByte49 > this.aClass6_Sub40_1.anInt10169) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub40_1.aByteArray113;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)I")
	@Override
	public int method1735() {
		return this.aClass6_Sub40_1 == null ? 0 : this.aClass6_Sub40_1.anInt10169 * 100 / (this.aClass6_Sub40_1.aByteArray113.length - this.aByte49);
	}
}
