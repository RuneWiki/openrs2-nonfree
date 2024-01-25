import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class3_Sub7_Sub2_Sub2 extends Class3_Sub7_Sub2 {

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "Lclient!rp;")
	public Class3_Sub5 aClass3_Sub5_8;

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "B")
	public byte aByte66;

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
	public int anInt4967;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method4473() {
		if (super.aBoolean387 || this.aClass3_Sub5_8.anInt3121 < this.aClass3_Sub5_8.aByteArray42.length - this.aByte66) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub5_8.aByteArray42;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
	@Override
	public int method4474() {
		return this.aClass3_Sub5_8 == null ? 0 : this.aClass3_Sub5_8.anInt3121 * 100 / (this.aClass3_Sub5_8.aByteArray42.length - this.aByte66);
	}
}
