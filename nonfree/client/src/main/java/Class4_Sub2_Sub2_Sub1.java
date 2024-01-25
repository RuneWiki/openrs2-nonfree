import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class4_Sub2_Sub2_Sub1 extends Class4_Sub2_Sub2 {

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
	public int anInt1600;

	@OriginalMember(owner = "client!dv", name = "C", descriptor = "B")
	public byte aByte23;

	@OriginalMember(owner = "client!dv", name = "E", descriptor = "Lclient!fh;")
	public Class4_Sub9 aClass4_Sub9_3;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method1359() {
		if (super.aBoolean113 || this.aClass4_Sub9_3.aByteArray81.length - this.aByte23 > this.aClass4_Sub9_3.anInt6207) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub9_3.aByteArray81;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)I")
	@Override
	public int method1361() {
		return this.aClass4_Sub9_3 == null ? 0 : this.aClass4_Sub9_3.anInt6207 * 100 / (this.aClass4_Sub9_3.aByteArray81.length - this.aByte23);
	}
}
