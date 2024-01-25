import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class5_Sub5_Sub8_Sub2 extends Class5_Sub5_Sub8 {

	@OriginalMember(owner = "client!vea", name = "C", descriptor = "[I")
	public static final int[] anIntArray563 = new int[4096];

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!vea", name = "A", descriptor = "Lclient!ofa;")
	public Class5_Sub22 aClass5_Sub22_16;

	@OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
	public int anInt9921;

	static {
		for (@Pc(19) int local19 = 0; local19 < 4096; local19++) {
			anIntArray563[local19] = Static51.method898(local19);
		}
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)[B")
	@Override
	public byte[] method8529() {
		if (super.aBoolean706 || this.aClass5_Sub22_16.anInt6629 < this.aClass5_Sub22_16.aByteArray71.length - this.aByte129) {
			throw new RuntimeException();
		}
		return this.aClass5_Sub22_16.aByteArray71;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)I")
	@Override
	public int method8531() {
		return this.aClass5_Sub22_16 == null ? 0 : this.aClass5_Sub22_16.anInt6629 * 100 / (this.aClass5_Sub22_16.aByteArray71.length - this.aByte129);
	}
}
