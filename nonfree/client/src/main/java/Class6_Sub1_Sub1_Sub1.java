import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class6_Sub1_Sub1_Sub1 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Lclient!ha;")
	public Class6_Sub15 aClass6_Sub15_1;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)[B")
	@Override
	public byte[] method5786() {
		if (super.aBoolean481 || this.aClass6_Sub15_1.anInt3487 < this.aClass6_Sub15_1.aByteArray51.length - this.aByte1) {
			throw new RuntimeException();
		}
		return this.aClass6_Sub15_1.aByteArray51;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)I")
	@Override
	public int method5787() {
		return this.aClass6_Sub15_1 == null ? 0 : this.aClass6_Sub15_1.anInt3487 * 100 / (this.aClass6_Sub15_1.aByteArray51.length - this.aByte1);
	}
}
