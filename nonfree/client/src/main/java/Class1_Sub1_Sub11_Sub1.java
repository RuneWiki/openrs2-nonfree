import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class1_Sub1_Sub11_Sub1 extends Class1_Sub1_Sub11 {

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public int anInt5498;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "Lclient!cw;")
	public Class51 aClass51_3;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)I")
	@Override
	public int method6986() {
		return super.aBoolean562 ? 0 : 100;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6987() {
		if (super.aBoolean562) {
			throw new RuntimeException();
		}
		return this.aByteArray73;
	}
}
