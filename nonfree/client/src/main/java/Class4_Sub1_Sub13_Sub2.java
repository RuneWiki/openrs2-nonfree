import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public final class Class4_Sub1_Sub13_Sub2 extends Class4_Sub1_Sub13 {

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
	public int anInt7452;

	@OriginalMember(owner = "client!vg", name = "V", descriptor = "Lclient!wf;")
	public Class269 aClass269_4;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)[B")
	@Override
	public byte[] method5988() {
		if (super.aBoolean542) {
			throw new RuntimeException();
		}
		return this.aByteArray94;
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I")
	@Override
	public int method5989() {
		return super.aBoolean542 ? 0 : 100;
	}
}
