import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class3_Sub5_Sub2_Sub2 extends Class3_Sub5_Sub2 {

	@OriginalMember(owner = "client!qga", name = "B", descriptor = "I")
	public int anInt7776;

	@OriginalMember(owner = "client!qga", name = "F", descriptor = "Lclient!dt;")
	public Class3_Sub4 aClass3_Sub4_5;

	@OriginalMember(owner = "client!qga", name = "L", descriptor = "B")
	public byte aByte117;

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method6440() {
		if (super.aBoolean541 || this.aClass3_Sub4_5.aByteArray90.length - this.aByte117 > this.aClass3_Sub4_5.anInt9739) {
			throw new RuntimeException();
		}
		return this.aClass3_Sub4_5.aByteArray90;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)I")
	@Override
	public int method6439() {
		return this.aClass3_Sub4_5 == null ? 0 : this.aClass3_Sub4_5.anInt9739 * 100 / (this.aClass3_Sub4_5.aByteArray90.length - this.aByte117);
	}
}
