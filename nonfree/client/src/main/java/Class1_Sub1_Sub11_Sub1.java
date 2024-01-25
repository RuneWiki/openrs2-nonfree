import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class1_Sub1_Sub11_Sub1 extends Class1_Sub1_Sub11 {

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
	public int anInt5062;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!pf", name = "M", descriptor = "Lclient!kn;")
	public Class141 aClass141_4;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
	@Override
	public int method5901() {
		return super.aBoolean649 ? 0 : 100;
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)[B")
	@Override
	public byte[] method5898() {
		if (super.aBoolean649) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}
}
