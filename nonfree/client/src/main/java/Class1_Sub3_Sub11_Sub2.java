import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class1_Sub3_Sub11_Sub2 extends Class1_Sub3_Sub11 {

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Lclient!io;")
	public Class1_Sub20 aClass1_Sub20_6;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "B")
	public byte aByte121;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	public int anInt9370;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
	@Override
	public int method7746() {
		return this.aClass1_Sub20_6 == null ? 0 : this.aClass1_Sub20_6.anInt5238 * 100 / (this.aClass1_Sub20_6.aByteArray52.length - this.aByte121);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7748() {
		if (super.aBoolean684 || this.aClass1_Sub20_6.aByteArray52.length - this.aByte121 > this.aClass1_Sub20_6.anInt5238) {
			throw new RuntimeException();
		}
		return this.aClass1_Sub20_6.aByteArray52;
	}
}
