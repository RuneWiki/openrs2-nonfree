import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class4_Sub3_Sub1_Sub2 extends Class4_Sub3_Sub1 {

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
	public int anInt5385;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "B")
	public byte aByte22;

	@OriginalMember(owner = "client!ul", name = "R", descriptor = "Lclient!fd;")
	public Class4_Sub10 aClass4_Sub10_10;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I")
	@Override
	public int method4391() {
		return this.aClass4_Sub10_10 == null ? 0 : this.aClass4_Sub10_10.anInt5713 * 100 / (this.aClass4_Sub10_10.aByteArray71.length - this.aByte22);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method4389() {
		if (this.aBoolean365 || this.aClass4_Sub10_10.aByteArray71.length - this.aByte22 > this.aClass4_Sub10_10.anInt5713) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub10_10.aByteArray71;
	}
}
