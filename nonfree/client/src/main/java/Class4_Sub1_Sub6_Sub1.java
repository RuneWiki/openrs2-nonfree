import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class4_Sub1_Sub6_Sub1 extends Class4_Sub1_Sub6 {

	@OriginalMember(owner = "client!je", name = "I", descriptor = "Lclient!iv;")
	public Class4_Sub12 aClass4_Sub12_4;

	@OriginalMember(owner = "client!je", name = "J", descriptor = "I")
	public int anInt3510;

	@OriginalMember(owner = "client!je", name = "L", descriptor = "B")
	public byte aByte24;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)I")
	@Override
	public int method3342() {
		return this.aClass4_Sub12_4 == null ? 0 : this.aClass4_Sub12_4.anInt2997 * 100 / (this.aClass4_Sub12_4.aByteArray36.length - this.aByte24);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method3343() {
		if (super.aBoolean381 || this.aClass4_Sub12_4.anInt2997 < this.aClass4_Sub12_4.aByteArray36.length - this.aByte24) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub12_4.aByteArray36;
	}
}
