import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public final class Class4_Sub7_Sub7_Sub1 extends Class4_Sub7_Sub7 {

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "Lclient!cc;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
	public int anInt5375;

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method7629() {
		if (super.aBoolean642) {
			throw new RuntimeException();
		}
		return this.aByteArray59;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)I")
	@Override
	public int method7630() {
		return super.aBoolean642 ? 0 : 100;
	}
}
