import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class1_Sub2_Sub1_Sub1 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!b", name = "R", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "Lclient!lc;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method1408() {
		if (this.aBoolean102) {
			throw new RuntimeException();
		}
		return this.aByteArray4;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)I")
	@Override
	public int method1411() {
		return this.aBoolean102 ? 0 : 100;
	}
}
