import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class2_Sub3_Sub14_Sub1 extends Class2_Sub3_Sub14 {

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "Lclient!wm;")
	public Class2_Sub26 aClass2_Sub26_8;

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
	public int anInt3083;

	@OriginalMember(owner = "client!lb", name = "ab", descriptor = "B")
	public byte aByte14;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)I")
	@Override
	public int method3057() {
		return this.aClass2_Sub26_8 == null ? 0 : this.aClass2_Sub26_8.anInt5328 * 100 / (this.aClass2_Sub26_8.aByteArray72.length - this.aByte14);
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)[B")
	@Override
	public byte[] method3053() {
		if (this.aBoolean320 || this.aClass2_Sub26_8.aByteArray72.length - this.aByte14 > this.aClass2_Sub26_8.anInt5328) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub26_8.aByteArray72;
	}
}
