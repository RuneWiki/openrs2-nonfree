import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class1_Sub2_Sub6_Sub1 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!dm", name = "C", descriptor = "Lclient!es;")
	public Class90 aClass90_3;

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
	public int anInt1974;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)[B")
	@Override
	public byte[] method6032() {
		if (super.aBoolean497) {
			throw new RuntimeException();
		}
		return this.aByteArray17;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)I")
	@Override
	public int method6033() {
		return super.aBoolean497 ? 0 : 100;
	}
}
