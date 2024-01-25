import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class4_Sub6_Sub6_Sub2 extends Class4_Sub6_Sub6 {

	@OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
	public int anInt8820;

	@OriginalMember(owner = "client!rn", name = "K", descriptor = "Lclient!vm;")
	public Class346 aClass346_5;

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I")
	@Override
	public int method6779() {
		return super.aBoolean619 ? 0 : 100;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method6777() {
		if (super.aBoolean619) {
			throw new RuntimeException();
		}
		return this.aByteArray85;
	}
}
