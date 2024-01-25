import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class3_Sub10_Sub1_Sub2 extends Class3_Sub10_Sub1 {

	@OriginalMember(owner = "client!md", name = "u", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public int anInt5913;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!ls;")
	public Class182 aClass182_2;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
	@Override
	public int method4926() {
		return super.aBoolean382 ? 0 : 100;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method4927() {
		if (super.aBoolean382) {
			throw new RuntimeException();
		}
		return this.aByteArray57;
	}
}
