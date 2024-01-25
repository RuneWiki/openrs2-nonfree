import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class5_Sub1_Sub4_Sub1 extends Class5_Sub1_Sub4 {

	@OriginalMember(owner = "client!lba", name = "D", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!lba", name = "G", descriptor = "Lclient!dca;")
	public Class75 aClass75_2;

	@OriginalMember(owner = "client!lba", name = "N", descriptor = "I")
	public int anInt5499;

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(Z)I")
	@Override
	public int method7594() {
		return super.aBoolean589 ? 0 : 100;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method7596() {
		if (super.aBoolean589) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}
}
