import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class2_Sub5_Sub6_Sub2 extends Class2_Sub5_Sub6 {

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!jba", name = "H", descriptor = "Lclient!pk;")
	public Class262 aClass262_1;

	@OriginalMember(owner = "client!jba", name = "M", descriptor = "I")
	public int anInt5027;

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)[B")
	@Override
	public byte[] method4188() {
		if (super.aBoolean400) {
			throw new RuntimeException();
		}
		return this.aByteArray48;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)I")
	@Override
	public int method4186() {
		return super.aBoolean400 ? 0 : 100;
	}
}
