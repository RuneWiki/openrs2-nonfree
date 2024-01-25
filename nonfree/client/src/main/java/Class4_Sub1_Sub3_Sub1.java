import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class4_Sub1_Sub3_Sub1 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Lclient!tl;")
	public Class4_Sub30 aClass4_Sub30_1;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "B")
	public byte aByte12;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)I")
	@Override
	public int method3404() {
		return this.aClass4_Sub30_1 == null ? 0 : this.aClass4_Sub30_1.anInt6244 * 100 / (this.aClass4_Sub30_1.aByteArray79.length - this.aByte12);
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method3403() {
		if (super.aBoolean330 || this.aClass4_Sub30_1.anInt6244 < this.aClass4_Sub30_1.aByteArray79.length - this.aByte12) {
			throw new RuntimeException();
		}
		return this.aClass4_Sub30_1.aByteArray79;
	}
}
