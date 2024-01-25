import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class2_Sub3_Sub5_Sub2 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
	public int anInt6386;

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "Lclient!es;")
	public Class2_Sub15 aClass2_Sub15_4;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "B")
	public byte aByte86;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)I")
	@Override
	public int method5299() {
		return this.aClass2_Sub15_4 == null ? 0 : this.aClass2_Sub15_4.anInt5241 * 100 / (this.aClass2_Sub15_4.aByteArray62.length - this.aByte86);
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method5301() {
		if (super.aBoolean501 || this.aClass2_Sub15_4.aByteArray62.length - this.aByte86 > this.aClass2_Sub15_4.anInt5241) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub15_4.aByteArray62;
	}
}
