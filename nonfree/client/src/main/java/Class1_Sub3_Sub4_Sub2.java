import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class1_Sub3_Sub4_Sub2 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!ol", name = "S", descriptor = "Lclient!qm;")
	public Class1_Sub14 aClass1_Sub14_7;

	@OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
	public int anInt4404;

	@OriginalMember(owner = "client!ol", name = "cb", descriptor = "B")
	public byte aByte16;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method3229() {
		if (this.aBoolean275 || this.aClass1_Sub14_7.anInt3000 < this.aClass1_Sub14_7.aByteArray55.length - this.aByte16) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub14_7.aByteArray55;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)I")
	@Override
	public int method3228() {
		return this.aClass1_Sub14_7 == null ? 0 : this.aClass1_Sub14_7.anInt3000 * 100 / (this.aClass1_Sub14_7.aByteArray55.length - this.aByte16);
	}
}
