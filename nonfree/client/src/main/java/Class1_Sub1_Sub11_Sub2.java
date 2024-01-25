import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class1_Sub1_Sub11_Sub2 extends Class1_Sub1_Sub11 {

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "Lclient!ti;")
	public Class1_Sub14 aClass1_Sub14_7;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
	public int anInt7670;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method5898() {
		if (super.aBoolean649 || this.aClass1_Sub14_7.anInt5695 < this.aClass1_Sub14_7.aByteArray65.length - this.aByte100) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub14_7.aByteArray65;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)I")
	@Override
	public int method5901() {
		return this.aClass1_Sub14_7 == null ? 0 : this.aClass1_Sub14_7.anInt5695 * 100 / (this.aClass1_Sub14_7.aByteArray65.length - this.aByte100);
	}
}
