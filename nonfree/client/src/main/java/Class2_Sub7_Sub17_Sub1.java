import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class2_Sub7_Sub17_Sub1 extends Class2_Sub7_Sub17 {

	@OriginalMember(owner = "client!sj", name = "P", descriptor = "Lclient!hc;")
	public Class93 aClass93_3;

	@OriginalMember(owner = "client!sj", name = "Q", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
	public int anInt5887;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)[B")
	@Override
	public byte[] method6090() {
		if (super.aBoolean502) {
			throw new RuntimeException();
		}
		return this.aByteArray82;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
	@Override
	public int method6087() {
		return super.aBoolean502 ? 0 : 100;
	}
}
