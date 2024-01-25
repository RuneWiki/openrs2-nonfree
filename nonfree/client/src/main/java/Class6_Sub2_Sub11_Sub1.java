import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class6_Sub2_Sub11_Sub1 extends Class6_Sub2_Sub11 {

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "Lclient!ec;")
	public Class6_Sub10 aClass6_Sub10_4;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "B")
	public byte aByte53;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)[B")
	@Override
	public byte[] method4802() {
		if (super.aBoolean366 || this.aClass6_Sub10_4.anInt4188 < this.aClass6_Sub10_4.aByteArray67.length - this.aByte53) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub10_4.aByteArray67;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)I")
	@Override
	public int method4804() {
		return this.aClass6_Sub10_4 == null ? 0 : this.aClass6_Sub10_4.anInt4188 * 100 / (this.aClass6_Sub10_4.aByteArray67.length - this.aByte53);
	}
}
